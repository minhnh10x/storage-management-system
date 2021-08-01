/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.stoman.ui;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JComponent;
import javax.swing.JProgressBar;
import javax.swing.Painter;
import javax.swing.Timer;
import javax.swing.UIDefaults;
import javax.swing.UIManager;
import javax.swing.plaf.ColorUIResource;
import javax.swing.plaf.nimbus.AbstractRegionPainter;

/**
 *
 * @author MinIT
 */
public class ChaoJDialog extends javax.swing.JDialog {

    /**
     * Creates new form ChaoJDialog
     */
    public ChaoJDialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        init();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlBorder = new javax.swing.JPanel();
        lblLogo = new javax.swing.JLabel();
        progressBar = new javax.swing.JProgressBar();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setAlwaysOnTop(true);
        setUndecorated(true);

        pnlBorder.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        pnlBorder.setLayout(new java.awt.BorderLayout());

        lblLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/stoman/images/chao.gif"))); // NOI18N
        pnlBorder.add(lblLogo, java.awt.BorderLayout.CENTER);

        progressBar.setMaximum(1000);
        progressBar.setMaximumSize(new java.awt.Dimension(32767, 17));
        progressBar.setMinimumSize(new java.awt.Dimension(10, 17));
        progressBar.setPreferredSize(new java.awt.Dimension(146, 17));
        progressBar.setStringPainted(true);
        pnlBorder.add(progressBar, java.awt.BorderLayout.SOUTH);

        getContentPane().add(pnlBorder, java.awt.BorderLayout.PAGE_START);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    javax.swing.UIManager.put("nimbusOrange", new ColorUIResource(new Color(37, 156, 82)));
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ChaoJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ChaoJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ChaoJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ChaoJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ChaoJDialog dialog = new ChaoJDialog(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lblLogo;
    private javax.swing.JPanel pnlBorder;
    private javax.swing.JProgressBar progressBar;
    // End of variables declaration//GEN-END:variables

    private void init() {        
        Painter painter = new MyPainter(new Color(0,120,215));
        
        UIDefaults defaults = new UIDefaults();
        defaults.put("ProgressBar[Enabled].foregroundPainter", painter);
        defaults.put("ProgressBar[Enabled+Finished].foregroundPainter", painter);
        
        progressBar.putClientProperty("Nimbus.Overrides.InheritDefaults", Boolean.TRUE);
        progressBar.putClientProperty("Nimbus.Overrides", defaults);
        
        setLocationRelativeTo(null);
        new Timer(15, new ActionListener() {
            
            @Override
            public void actionPerformed(ActionEvent e) {
                int value = progressBar.getValue();
                if (value < 1000) {
                    progressBar.setValue(value + 8);
                } else {
                    ChaoJDialog.this.dispose();
                }
            }
        }).start();
    }
}

class MyPainter extends AbstractRegionPainter {

    private Color fillColor;
    public MyPainter(Color color) {
        // as a slight visual improvement, make the color transparent
        // to at least see the background gradient
        // the default progressBarPainter does it as well (plus a bit more)
        fillColor = new Color(
                color.getRed(), color.getGreen(), color.getBlue(), 156);
    }

    @Override
    protected void doPaint(Graphics2D g, JComponent c, int width,
            int height, Object[] extendedCacheKeys) {
        g.setColor(fillColor);
        g.fillRect(0, 0, width, height);
    }

    @Override
    protected PaintContext getPaintContext() {
        return null;
    }

}
