/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.stoman.ui;

/**
 *
 * @author MinIT
 */
public class GioiThieuJDialog extends javax.swing.JDialog {

    /**
     * Creates new form GioiThieuJDialog2
     */
    public GioiThieuJDialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlGioiThieu = new javax.swing.JPanel();
        txtGioiThieu = new javax.swing.JTextPane();
        pnlLogo = new javax.swing.JPanel();
        lblLogo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setAlwaysOnTop(true);
        setMinimumSize(new java.awt.Dimension(519, 540));
        setUndecorated(true);

        pnlGioiThieu.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 2, 2, 2, new java.awt.Color(153, 153, 153)));
        pnlGioiThieu.setMinimumSize(new java.awt.Dimension(514, 176));
        pnlGioiThieu.setLayout(new java.awt.BorderLayout());

        txtGioiThieu.setEditable(false);
        txtGioiThieu.setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 5, 10, 5));
        txtGioiThieu.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtGioiThieu.setText("StoMan là phần mềm quản lý kho hàng hiệu quả cho các doanh nghiệp, nâng cao công tác quản lý hàng tồn kho và cân bằng giữa các giai đoạn sản xuất - dự trữ - tiêu thụ. \n\nHệ thống quản lý kho hàng giúp giảm tải các nhân viên hành chính liên quan đến việc thống kê và đạt được kết quả tốt hơn trong các hoạt động của công ty.\n\nYêu cầu về môi trường:\n1. Hệ điều hành bất kỳ\n2. JDK 1.8 trở lên\n3. SQL Server 2008 trở lên");
        txtGioiThieu.setPreferredSize(new java.awt.Dimension(512, 175));
        txtGioiThieu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtGioiThieuMouseClicked(evt);
            }
        });
        pnlGioiThieu.add(txtGioiThieu, java.awt.BorderLayout.CENTER);

        getContentPane().add(pnlGioiThieu, java.awt.BorderLayout.CENTER);

        pnlLogo.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 0, 2, new java.awt.Color(153, 153, 153)));
        pnlLogo.setLayout(new java.awt.GridLayout(1, 0));

        lblLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/stoman/images/gioi-thieu.gif"))); // NOI18N
        lblLogo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblLogoMouseClicked(evt);
            }
        });
        pnlLogo.add(lblLogo);

        getContentPane().add(pnlLogo, java.awt.BorderLayout.PAGE_START);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtGioiThieuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtGioiThieuMouseClicked
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_txtGioiThieuMouseClicked

    private void lblLogoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLogoMouseClicked
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_lblLogoMouseClicked

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
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GioiThieuJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GioiThieuJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GioiThieuJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GioiThieuJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                GioiThieuJDialog dialog = new GioiThieuJDialog(new javax.swing.JFrame(), true);
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
    private javax.swing.JPanel pnlGioiThieu;
    private javax.swing.JPanel pnlLogo;
    private javax.swing.JTextPane txtGioiThieu;
    // End of variables declaration//GEN-END:variables
}
