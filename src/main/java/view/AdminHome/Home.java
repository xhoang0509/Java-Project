/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view.AdminHome;

import com.mycompany.quanlydangkymonhoc.connectDB.connectDataBase;
import java.awt.Dimension;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import models.NhomMon;
import utilis.CenterScreen;
import utilis.Global;
import utilis.Logout;
import utilis.ProtectScreen;
import view.AdminKhoa.KhoaScreen;
import view.AdminQLGV.QLGVScreen;
import view.AdminQLMH.QLMHScreen;
import view.AdminQLSV.QLSVScreen;
import view.Login.Login;
import view.Schedule.ScheduleScreen;

/**
 *
 * @author XuanHoang
 */
public class Home extends javax.swing.JFrame {
    
    ArrayList<NhomMon> dsNhomMon = new ArrayList<NhomMon>();
    int dongchon = -1;

    /**
     * Creates new form Home
     */
    public Home() {
        initComponents();
        LoadHomeScreen();
    }
    
    public void LoadHomeScreen() {
        PreparedStatement st;
        ResultSet rs;
        
        String sql = "SELECT * FROM admin WHERE id = ?";
        try {
            st = connectDataBase.getConnection().prepareStatement(sql);
            st.setString(1, Global.idLogin + "");
            rs = st.executeQuery();
            
            if (rs.next()) {
                lbNameAdminLogin.setText(rs.getString("name"));
                lbEmailAdminLogin.setText(rs.getString("email"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jPopupMenu1 = new javax.swing.JPopupMenu();
        jPopupMenu2 = new javax.swing.JPopupMenu();
        jMenuItem5 = new javax.swing.JMenuItem();
        jCheckBoxMenuItem1 = new javax.swing.JCheckBoxMenuItem();
        jCheckBoxMenuItem2 = new javax.swing.JCheckBoxMenuItem();
        jCheckBoxMenuItem3 = new javax.swing.JCheckBoxMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jCheckBoxMenuItem4 = new javax.swing.JCheckBoxMenuItem();
        jFrame1 = new javax.swing.JFrame();
        jPanel1 = new javax.swing.JPanel();
        btnGiaoVien = new javax.swing.JButton();
        btnQLSV = new javax.swing.JButton();
        btnQLMH = new javax.swing.JButton();
        btnQLKhoa = new javax.swing.JButton();
        btnLogout = new javax.swing.JButton();
        btnQLMH1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        btnClose = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        lbNameLogin = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lbNameAdminLogin = new javax.swing.JLabel();
        lbNameLogin2 = new javax.swing.JLabel();
        lbEmailAdminLogin = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        jMenu1.setText("jMenu1");

        jMenu2.setText("jMenu2");

        jMenuItem1.setText("jMenuItem1");

        jMenuItem2.setText("jMenuItem2");

        jMenu3.setText("jMenu3");

        jMenuItem3.setText("jMenuItem3");

        jMenuItem4.setText("jMenuItem4");

        jMenuItem5.setText("jMenuItem5");

        jCheckBoxMenuItem1.setSelected(true);
        jCheckBoxMenuItem1.setText("jCheckBoxMenuItem1");

        jCheckBoxMenuItem2.setSelected(true);
        jCheckBoxMenuItem2.setText("jCheckBoxMenuItem2");

        jCheckBoxMenuItem3.setSelected(true);
        jCheckBoxMenuItem3.setText("jCheckBoxMenuItem3");

        jMenuItem6.setText("jMenuItem6");

        jCheckBoxMenuItem4.setSelected(true);
        jCheckBoxMenuItem4.setText("jCheckBoxMenuItem4");

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(800, 600));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        btnGiaoVien.setText("Quản lý giáo viên");
        btnGiaoVien.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnGiaoVien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGiaoVienActionPerformed(evt);
            }
        });

        btnQLSV.setText("Quản lý sinh viên");
        btnQLSV.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnQLSV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQLSVActionPerformed(evt);
            }
        });

        btnQLMH.setText("Quản lý môn học");
        btnQLMH.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnQLMH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQLMHActionPerformed(evt);
            }
        });

        btnQLKhoa.setText("Quản lý khoa");
        btnQLKhoa.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnQLKhoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQLKhoaActionPerformed(evt);
            }
        });

        btnLogout.setText("Đăng xuất");
        btnLogout.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });

        btnQLMH1.setText("Tạo thời khóa biểu");
        btnQLMH1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnQLMH1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQLMH1ActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 70, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 117, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnQLMH1, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
                    .addComponent(btnLogout, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnQLKhoa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnQLMH, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnGiaoVien, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnQLSV, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(12, 12, 12))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addComponent(btnQLSV, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnGiaoVien, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnQLMH, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnQLMH1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnQLKhoa, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(182, Short.MAX_VALUE))
        );

        btnClose.setText("Đóng");
        btnClose.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCloseActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 10)); // NOI18N
        jLabel2.setText("Phần mềm quản lý đăng kí tín chỉ - 2022 | © copyright");

        lbNameLogin.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lbNameLogin.setText("Emai: ");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 255));
        jLabel4.setText("TRANG QUẢN TRỊ HỆ THỐNG");

        lbNameAdminLogin.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lbNameAdminLogin.setText("xxxx");

        lbNameLogin2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lbNameLogin2.setText("Tên:");

        lbEmailAdminLogin.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lbEmailAdminLogin.setText("xxxx");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/AdminHome/images/computer-icons-home-page-favicon-website-png-favpng-AERnWJireKVXw5iuftuANf4dA.jpg"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(11, 11, 11)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel1)
                                        .addGap(43, 43, 43)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lbNameLogin2)
                                            .addComponent(lbNameLogin))
                                        .addGap(44, 44, 44)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(lbEmailAdminLogin, javax.swing.GroupLayout.DEFAULT_SIZE, 279, Short.MAX_VALUE)
                                            .addComponent(lbNameAdminLogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
                        .addGap(130, 130, 130))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnClose)
                        .addGap(91, 91, 91))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(95, 95, 95)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbNameAdminLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbNameLogin2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbNameLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbEmailAdminLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(250, 250, 250)
                .addComponent(btnClose)
                .addGap(48, 48, 48)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGiaoVienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGiaoVienActionPerformed
        // TODO add your handling code here:
        this.dispose();
        QLGVScreen gVScreen = new QLGVScreen();
        gVScreen = (QLGVScreen) CenterScreen.centerWindow(gVScreen);
        gVScreen.show();
        gVScreen.setTitle("Quản lý giáo viên");
    }//GEN-LAST:event_btnGiaoVienActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        lbNameLogin.setText(Global.nameLogin);
    }//GEN-LAST:event_formWindowOpened

    private void btnCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCloseActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_btnCloseActionPerformed

    private void btnQLSVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQLSVActionPerformed
        // TODO add your handling code here:
        this.dispose();
        QLSVScreen lSVScreen = new QLSVScreen();
        lSVScreen.setVisible(true);
        lSVScreen = (QLSVScreen) CenterScreen.centerWindow(lSVScreen);
        lSVScreen.setTitle("Quản lý sinh viên");
    }//GEN-LAST:event_btnQLSVActionPerformed

    private void btnQLMHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQLMHActionPerformed
        // TODO add your handling code here:
        QLMHScreen qLMHScreen = new QLMHScreen();
        qLMHScreen.setVisible(true);
        qLMHScreen = (QLMHScreen) CenterScreen.centerWindow(qLMHScreen);
        qLMHScreen.setTitle("Quản lý môn học");
    }//GEN-LAST:event_btnQLMHActionPerformed

    private void btnQLKhoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQLKhoaActionPerformed
        // TODO add your handling code here:
        this.dispose();
        KhoaScreen khoaScreen = new KhoaScreen();
        khoaScreen = (KhoaScreen) CenterScreen.centerWindow(khoaScreen);
        khoaScreen.show();
        khoaScreen.setTitle("Quản lý khoa");

    }//GEN-LAST:event_btnQLKhoaActionPerformed

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
        // TODO add your handling code here:
        Logout.execute(this);
    }//GEN-LAST:event_btnLogoutActionPerformed

    private void btnQLMH1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQLMH1ActionPerformed
        // TODO add your handling code here:
        this.dispose();
        ScheduleScreen scheduleScreen = new ScheduleScreen();
        scheduleScreen = (ScheduleScreen) CenterScreen.centerWindow(scheduleScreen);
        scheduleScreen.show();
        scheduleScreen.setTitle("Tạo TKB cho môn học");
    }//GEN-LAST:event_btnQLMH1ActionPerformed

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
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Home homeScreen = new Home();
                homeScreen = (Home) ProtectScreen.protectScreen(homeScreen);
                homeScreen.setVisible(true);
                homeScreen.setTitle("Trang chủ");
                homeScreen.setPreferredSize(new Dimension(800, 600));
                homeScreen = (Home) CenterScreen.centerWindow(homeScreen);
                homeScreen.setResizable(false);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClose;
    private javax.swing.JButton btnGiaoVien;
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton btnQLKhoa;
    private javax.swing.JButton btnQLMH;
    private javax.swing.JButton btnQLMH1;
    private javax.swing.JButton btnQLSV;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem2;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem3;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem4;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JPopupMenu jPopupMenu2;
    private javax.swing.JLabel lbEmailAdminLogin;
    private javax.swing.JLabel lbNameAdminLogin;
    private javax.swing.JLabel lbNameLogin;
    private javax.swing.JLabel lbNameLogin2;
    // End of variables declaration//GEN-END:variables

}
