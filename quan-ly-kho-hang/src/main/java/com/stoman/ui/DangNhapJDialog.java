/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.stoman.ui;

import com.stoman.dao.NhanVienDAO;
import com.stoman.entity.NhanVien;
import com.stoman.utils.Auth;
import com.stoman.utils.DragPanel;
import com.stoman.utils.MsgBox;
import com.stoman.utils.XImages;
import com.stoman.utils.XPassword;
import java.awt.Color;
import javax.swing.ImageIcon;

/**
 *
 * @author MinhNH
 */
public class DangNhapJDialog extends javax.swing.JDialog {

    /**
     * Creates new form DangNhapJDialog
     */
    public DangNhapJDialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        this.setUndecorated(true);
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

        lblDangNhap = new javax.swing.JLabel();
        lblGioiThieu = new javax.swing.JLabel();
        lblTenDangNhap = new javax.swing.JLabel();
        lblMatKhau = new javax.swing.JLabel();
        txtTenNV = new javax.swing.JTextField();
        txtMatKhau = new javax.swing.JPasswordField();
        btnThoat = new javax.swing.JButton();
        btnDangNhap = new javax.swing.JButton();
        lblThoat = new javax.swing.JLabel();
        pnlDangNhap = new javax.swing.JPanel();
        pnlMotion = new DragPanel(this);
        lblBackground = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("StoMan - Đăng nhập");
        setAlwaysOnTop(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblDangNhap.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        lblDangNhap.setForeground(new java.awt.Color(255, 255, 255));
        lblDangNhap.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblDangNhap.setText("ĐĂNG NHẬP");
        getContentPane().add(lblDangNhap, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 130, -1));

        lblGioiThieu.setFont(new java.awt.Font("Tahoma", 2, 13)); // NOI18N
        lblGioiThieu.setForeground(new java.awt.Color(255, 255, 255));
        lblGioiThieu.setText("Hệ thống quản lý kho hàng StoMan");
        getContentPane().add(lblGioiThieu, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, 210, -1));

        lblTenDangNhap.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lblTenDangNhap.setForeground(new java.awt.Color(204, 255, 255));
        lblTenDangNhap.setText("Tên tài khoản");
        getContentPane().add(lblTenDangNhap, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, -1, -1));

        lblMatKhau.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lblMatKhau.setForeground(new java.awt.Color(204, 255, 255));
        lblMatKhau.setText("Mật khẩu");
        getContentPane().add(lblMatKhau, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, -1, -1));

        txtTenNV.setBackground(new java.awt.Color(0, 0, 0, 0));
        txtTenNV.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        txtTenNV.setForeground(new java.awt.Color(255, 255, 255));
        txtTenNV.setText("trungtv");
        txtTenNV.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(204, 204, 204)));
        txtTenNV.setCaretColor(new java.awt.Color(255, 255, 255));
        txtTenNV.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtTenNV.setOpaque(false);
        getContentPane().add(txtTenNV, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, 280, -1));

        txtMatKhau.setBackground(new java.awt.Color(0, 0, 0, 0));
        txtMatKhau.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        txtMatKhau.setForeground(new java.awt.Color(255, 255, 255));
        txtMatKhau.setText("12345");
        txtMatKhau.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(204, 204, 204)));
        txtMatKhau.setCaretColor(new java.awt.Color(255, 255, 255));
        txtMatKhau.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtMatKhau.setOpaque(false);
        getContentPane().add(txtMatKhau, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 220, 280, -1));

        btnThoat.setBackground(new java.awt.Color(255, 153, 153));
        btnThoat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/stoman/icons/cancel.png"))); // NOI18N
        btnThoat.setText("Thoát");
        btnThoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThoatActionPerformed(evt);
            }
        });
        getContentPane().add(btnThoat, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 300, 150, -1));

        btnDangNhap.setBackground(new java.awt.Color(153, 204, 255));
        btnDangNhap.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/stoman/icons/login-24.png"))); // NOI18N
        btnDangNhap.setText("Đăng nhập");
        btnDangNhap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDangNhapActionPerformed(evt);
            }
        });
        getContentPane().add(btnDangNhap, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 300, 150, -1));

        lblThoat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/stoman/icons/cancel-32(2).png"))); // NOI18N
        lblThoat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblThoatMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblThoatMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblThoatMouseExited(evt);
            }
        });
        getContentPane().add(lblThoat, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 10, 30, 30));

        pnlDangNhap.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        pnlDangNhap.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(pnlDangNhap, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 380, 370));

        pnlMotion.setOpaque(false);
        pnlMotion.setLayout(new java.awt.BorderLayout());

        lblBackground.setForeground(new java.awt.Color(255, 255, 255));
        lblBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/stoman/images/background-login.png"))); // NOI18N
        lblBackground.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        pnlMotion.add(lblBackground, java.awt.BorderLayout.CENTER);

        getContentPane().add(pnlMotion, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 380, 370));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnDangNhapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDangNhapActionPerformed
        // TODO add your handling code here:
        login();
    }//GEN-LAST:event_btnDangNhapActionPerformed

    private void lblThoatMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblThoatMouseClicked
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_lblThoatMouseClicked

    private void lblThoatMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblThoatMouseExited
        // TODO add your handling code here:
        lblThoat.setIcon(new ImageIcon(getClass().getResource("/com/stoman/icons/cancel-32(2).png")));
    }//GEN-LAST:event_lblThoatMouseExited

    private void lblThoatMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblThoatMouseEntered
        // TODO add your handling code here:
        lblThoat.setIcon(new ImageIcon(getClass().getResource("/com/stoman/icons/cancel-32.png")));
    }//GEN-LAST:event_lblThoatMouseEntered

    private void btnThoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThoatActionPerformed
        // TODO add your handling code here:
        this.exit();
    }//GEN-LAST:event_btnThoatActionPerformed

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
            java.util.logging.Logger.getLogger(DangNhapJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DangNhapJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DangNhapJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DangNhapJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                DangNhapJDialog dialog = new DangNhapJDialog(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton btnDangNhap;
    private javax.swing.JButton btnThoat;
    private javax.swing.JLabel lblBackground;
    private javax.swing.JLabel lblDangNhap;
    private javax.swing.JLabel lblGioiThieu;
    private javax.swing.JLabel lblMatKhau;
    private javax.swing.JLabel lblTenDangNhap;
    private javax.swing.JLabel lblThoat;
    private javax.swing.JPanel pnlDangNhap;
    private javax.swing.JPanel pnlMotion;
    private javax.swing.JPasswordField txtMatKhau;
    private javax.swing.JTextField txtTenNV;
    // End of variables declaration//GEN-END:variables

    private void init() {
        this.setLocationRelativeTo(null);
        pnlDangNhap.setBackground(new Color(0, 0, 0, 120));
        lblBackground.setIcon(XImages.getImageScale(new ImageIcon(
                getClass().getResource("/com/stoman/images/background-login.png")),
                this.getWidth(),
                this.getHeight())
        );
    }

    NhanVienDAO dao = new NhanVienDAO();

    //  Đăng nhập và lưu thông tin tài khoản.
    private void login() {
        if (!isValidated()) {
            return;
        }
        try {
            String maNV = txtTenNV.getText();
            String matKhau = new String(txtMatKhau.getPassword());
            NhanVien nv = dao.selectByID(maNV);

            if (nv == null) {
                MsgBox.alert(this, "Tên đăng nhập không đúng");
                txtTenNV.requestFocus();
                return;
            }

            if (!XPassword.isValidated(matKhau, nv.getMatKhau(), nv.getMuoi())) {
                MsgBox.alert(this, "Mật khẩu không đúng.");
                txtMatKhau.requestFocus();
                return;
            }

            Auth.user = nv;
            this.dispose();
        } catch (Exception e) {
            MsgBox.alert(this, "Không thể đăng nhập!");
            e.printStackTrace();
        }
    }

    // Thoát chương trình
    private void exit() {
        if (MsgBox.confirm(this, "Bạn có muốn thoát phần mềm?")) {
            System.exit(0);
        }
    }

    // Xác thực dữ liệu nhập vào form
    private boolean isValidated() {
        if (txtTenNV.getText().length() == 0) {
            MsgBox.alert(this, "Chưa nhập tên đăng nhập!");
            txtTenNV.requestFocus();
            return false;
        }
        if (txtMatKhau.getPassword().length == 0) {
            MsgBox.alert(this, "Chưa nhập mật khẩu!");
            txtMatKhau.requestFocus();
            return false;
        }
        return true;

    }

}
