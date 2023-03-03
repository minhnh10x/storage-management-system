/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.stoman.ui;

import java.awt.*;
import javax.swing.*;
import javax.swing.GroupLayout;
import javax.swing.LayoutStyle;
import javax.swing.border.*;
import com.formdev.flatlaf.FlatIntelliJLaf;
import com.stoman.dao.NhanVienDAO;
import com.stoman.utils.Auth;
import com.stoman.utils.MsgBox;
import com.stoman.utils.XPassword;
import java.awt.Color;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author MinhNH
 */
public class DoiMatKhauJDialog extends javax.swing.JDialog {

    /**
     * Creates new form DoiMatKhauJDialog
     */
    public DoiMatKhauJDialog(java.awt.Frame parent, boolean modal) {
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
        pnlDoiMatKhau = new JPanel();
        lblMatKhauCu = new JLabel();
        txtMatKhauCu = new JPasswordField();
        lblMatKhauMoi = new JLabel();
        txtMatKhauMoi = new JPasswordField();
        lblXacNhanMK = new JLabel();
        txtXacNhanMK = new JPasswordField();
        pnlChucNang = new JPanel();
        btnDongY = new JButton();
        btnThoat = new JButton();

        //======== this ========
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("StoMan - \u0110\u1ed5i m\u1eadt kh\u1ea9u");
        setResizable(false);
        var contentPane = getContentPane();
        contentPane.setLayout(new BorderLayout());

        //======== pnlDoiMatKhau ========
        {

            //---- lblMatKhauCu ----
            lblMatKhauCu.setText("M\u1eadt kh\u1ea9u hi\u1ec7n t\u1ea1i");

            //---- txtMatKhauCu ----
            txtMatKhauCu.setBackground(new Color(0, 0, 0, 0));
            txtMatKhauCu.setBorder(new MatteBorder(0, 0, 1, 0, new Color(0x999999)));
            txtMatKhauCu.setPreferredSize(new Dimension(64, 22));

            //---- lblMatKhauMoi ----
            lblMatKhauMoi.setText("M\u1eadt kh\u1ea9u m\u1edbi");

            //---- txtMatKhauMoi ----
            txtMatKhauMoi.setBackground(new Color(0, 0, 0, 0));
            txtMatKhauMoi.setBorder(new MatteBorder(0, 0, 1, 0, new Color(0x999999)));
            txtMatKhauMoi.setPreferredSize(new Dimension(64, 22));

            //---- lblXacNhanMK ----
            lblXacNhanMK.setText("X\u00e1c nh\u1eadn m\u1eadt kh\u1ea9u m\u1edbi");

            //---- txtXacNhanMK ----
            txtXacNhanMK.setBackground(new Color(0, 0, 0, 0));
            txtXacNhanMK.setBorder(new MatteBorder(0, 0, 1, 0, new Color(0x999999)));
            txtXacNhanMK.setPreferredSize(new Dimension(64, 22));
            txtXacNhanMK.addActionListener(e -> txtXacNhanMKActionPerformed(e));

            //======== pnlChucNang ========
            {
                pnlChucNang.setLayout(new GridLayout());

                //---- btnDongY ----
                btnDongY.setBackground(new Color(0xccffcc));
                btnDongY.setIcon(new ImageIcon(getClass().getResource("/com/stoman/icons/checked.png")));
                btnDongY.setText("\u0110\u1ed3ng \u00fd");
                btnDongY.addActionListener(e -> btnDongYActionPerformed(e));
                pnlChucNang.add(btnDongY);

                //---- btnThoat ----
                btnThoat.setBackground(new Color(0xff9999));
                btnThoat.setIcon(new ImageIcon(getClass().getResource("/com/stoman/icons/cancel.png")));
                btnThoat.setText("Tho\u00e1t");
                btnThoat.addActionListener(e -> btnThoatActionPerformed(e));
                pnlChucNang.add(btnThoat);
            }

            GroupLayout pnlDoiMatKhauLayout = new GroupLayout(pnlDoiMatKhau);
            pnlDoiMatKhau.setLayout(pnlDoiMatKhauLayout);
            pnlDoiMatKhauLayout.setHorizontalGroup(
                pnlDoiMatKhauLayout.createParallelGroup()
                    .addGroup(pnlDoiMatKhauLayout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(pnlDoiMatKhauLayout.createParallelGroup()
                            .addComponent(pnlChucNang, GroupLayout.DEFAULT_SIZE, 257, Short.MAX_VALUE)
                            .addComponent(txtMatKhauMoi, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtXacNhanMK, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtMatKhauCu, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblMatKhauCu)
                            .addComponent(lblMatKhauMoi)
                            .addComponent(lblXacNhanMK))
                        .addGap(15, 15, 15))
            );
            pnlDoiMatKhauLayout.setVerticalGroup(
                pnlDoiMatKhauLayout.createParallelGroup()
                    .addGroup(pnlDoiMatKhauLayout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(lblMatKhauCu)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtMatKhauCu, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15)
                        .addComponent(lblMatKhauMoi)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtMatKhauMoi, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15)
                        .addComponent(lblXacNhanMK)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtXacNhanMK, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(pnlChucNang, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15))
            );
        }
        contentPane.add(pnlDoiMatKhau, BorderLayout.CENTER);
        pack();
        setLocationRelativeTo(getOwner());
    }// </editor-fold>//GEN-END:initComponents

    private void btnThoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThoatActionPerformed
        // TODO add your handling code here:
        this.close();
    }//GEN-LAST:event_btnThoatActionPerformed

    private void btnDongYActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDongYActionPerformed
        // TODO add your handling code here:
        this.changePassWord();
    }//GEN-LAST:event_btnDongYActionPerformed

    private void txtXacNhanMKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtXacNhanMKActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtXacNhanMKActionPerformed

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
            javax.swing.UIManager.setLookAndFeel(new FlatIntelliJLaf());
        } catch (UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DoiMatKhauJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                DoiMatKhauJDialog dialog = new DoiMatKhauJDialog(new javax.swing.JFrame(), true);
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
    private JPanel pnlDoiMatKhau;
    private JLabel lblMatKhauCu;
    private JPasswordField txtMatKhauCu;
    private JLabel lblMatKhauMoi;
    private JPasswordField txtMatKhauMoi;
    private JLabel lblXacNhanMK;
    private JPasswordField txtXacNhanMK;
    private JPanel pnlChucNang;
    private JButton btnDongY;
    private JButton btnThoat;
    // End of variables declaration//GEN-END:variables

    private void init() {
        this.setLocationRelativeTo(null);
    }

    NhanVienDAO dao = new NhanVienDAO();

    //Code phương thức đổi mật khẩu.
    private void changePassWord() {
        if (isValidated()) {
            byte[] muoi = XPassword.getSalt();
            
            Auth.user.setMuoi(muoi);
            Auth.user.setMatKhau(XPassword.getHashMD5(txtMatKhauMoi.getPassword(), muoi));

            dao.update(Auth.user);
            MsgBox.alert(this, "Đổi mật khẩu thành công!");
            this.dispose();
        }
    }

    private void close() {
        this.dispose();
    }

    private boolean isValidated() {
        if (txtMatKhauCu.getPassword().length == 0) {
            MsgBox.alert(this, "Chưa nhập mật khẩu hiện tại!");
            txtMatKhauCu.requestFocus();
            return false;
        }
        
        if (txtMatKhauMoi.getPassword().length == 0) {
            MsgBox.alert(this, "Chưa nhập mật khẩu mới!");
            txtMatKhauMoi.requestFocus();
            return false;
        }
        if (txtMatKhauMoi.getPassword().length < 8) {
            MsgBox.alert(this, "Mật khẩu không được ngắn hơn 8 ký tự!");
            txtMatKhauMoi.requestFocus();
            return false;
        }
        if (txtXacNhanMK.getPassword().length == 0) {
            MsgBox.alert(this, "Chưa nhập mật khẩu xác nhận!");
            txtMatKhauMoi.requestFocus();
            return false;
        }
        if (!XPassword.isValidated(txtMatKhauCu.getPassword(),
                Auth.user.getMatKhau(), Auth.user.getMuoi())) {
            MsgBox.alert(this, "Mật khẩu không đúng!");
            txtMatKhauCu.setText("");
            txtMatKhauCu.requestFocus();
            return false;
        }
        if (XPassword.isValidated(txtMatKhauMoi.getPassword(),
                Auth.user.getMatKhau(), Auth.user.getMuoi())) {
            MsgBox.alert(this, "Mật khẩu mới không được trùng với mật khẩu cũ!");
            txtMatKhauCu.requestFocus();
            return false;
        }
        String matKhauMoi = new String(txtMatKhauMoi.getPassword());
        String xacNhanMKMoi = new String(txtXacNhanMK.getPassword());
        if (!matKhauMoi.equals(xacNhanMKMoi)) {
            MsgBox.alert(this, "Xác nhận mật khẩu không đúng!");
            txtXacNhanMK.requestFocus();
            return false;
        }
        return true;

    }
}
