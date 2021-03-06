/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banda;

import java.io.InputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.HashMap;
import java.util.Map;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.view.JasperViewer;
import sun.print.PSStreamPrintJob;

/**
 *
 * @author Thilina
 */
public class Course extends javax.swing.JFrame {

    DBConnection db = new DBConnection();
    Connection conn = null;
    ResultSet rs = null;
    PreparedStatement pst = null;
    int row = -1;

  
    public Course() {
        initComponents();

        conn = db.ConnectDB();
        clear();
        loadData();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        lhead = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        pnlCourse = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtid = new javax.swing.JTextField();
        txtname = new javax.swing.JTextField();
        txtcoursefee = new javax.swing.JTextField();
        btnSave = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblData = new javax.swing.JTable();
        btnDel = new javax.swing.JButton();
        btnUpd = new javax.swing.JButton();
        btnSrc = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtduration = new javax.swing.JTextField();
        txtlecturer = new javax.swing.JTextField();
        txtfaculty = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Course");
        getContentPane().setLayout(new java.awt.CardLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 102, 0));
        jPanel2.setForeground(new java.awt.Color(51, 51, 255));

        lhead.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lhead.setText("Student Information Management System");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(128, 128, 128)
                .addComponent(lhead, javax.swing.GroupLayout.PREFERRED_SIZE, 559, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(33, Short.MAX_VALUE)
                .addComponent(lhead, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(162, 0, 769, -1));

        jPanel3.setBackground(new java.awt.Color(0, 0, 255));
        jPanel3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(51, 51, 255));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/0.jpg"))); // NOI18N
        jLabel5.setText("jLabel5");
        jPanel4.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 160, 100));

        jPanel3.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 160, 100));

        jButton1.setBackground(new java.awt.Color(51, 51, 255));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setText("Back");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 460, 130, 60));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 530));

        pnlCourse.setAlignmentY(100.0F);
        pnlCourse.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Course ID");
        pnlCourse.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, -1));

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Name");
        pnlCourse.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, -1, -1));

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Course Fee");
        pnlCourse.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, -1, -1));

        txtid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtidActionPerformed(evt);
            }
        });
        pnlCourse.add(txtid, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 10, 150, 30));

        txtname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnameActionPerformed(evt);
            }
        });
        pnlCourse.add(txtname, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 50, 150, -1));
        pnlCourse.add(txtcoursefee, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 80, 150, -1));

        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });
        pnlCourse.add(btnSave, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 190, -1, -1));

        tblData.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Course Id", "Name", "Course Fee", "Duration", "Faculty"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblData.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblDataMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblData);

        pnlCourse.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, 740, 190));

        btnDel.setText("Delete");
        btnDel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDelActionPerformed(evt);
            }
        });
        pnlCourse.add(btnDel, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 190, -1, -1));

        btnUpd.setText("Update");
        btnUpd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdActionPerformed(evt);
            }
        });
        pnlCourse.add(btnUpd, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 190, -1, -1));

        btnSrc.setText("Search");
        btnSrc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSrcActionPerformed(evt);
            }
        });
        pnlCourse.add(btnSrc, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 10, -1, -1));

        jButton3.setText("Get All");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        pnlCourse.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 190, -1, -1));

        jButton4.setText("Get Report");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        pnlCourse.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 190, -1, -1));

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Duration");
        pnlCourse.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, -1, -1));

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Faculty");
        pnlCourse.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, -1, -1));

        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Hosting Lecturer ");
        pnlCourse.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, -1, -1));

        txtduration.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtdurationActionPerformed(evt);
            }
        });
        pnlCourse.add(txtduration, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 120, 150, -1));

        txtlecturer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtlecturerActionPerformed(evt);
            }
        });
        pnlCourse.add(txtlecturer, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 190, 150, -1));
        pnlCourse.add(txtfaculty, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 150, 150, -1));

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/education1.png"))); // NOI18N
        pnlCourse.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 770, 430));

        jPanel1.add(pnlCourse, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 98, 769, -1));

        getContentPane().add(jPanel1, "card2");

        setSize(new java.awt.Dimension(952, 569));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        try {

            String id = txtid.getText();
            String name = txtname.getText();
            String coursefee = txtcoursefee.getText();
            String duration =txtduration.getText();
            String faculty =txtfaculty.getText();

            if (!id.equals("") && !name.equals("") && !coursefee.equals("") && !duration.equals("") &&!faculty.equals("")) 
            {

                String sql = "insert into course (id, name, coursefee,duration,faculty) values(?,?,?,?,?)";
                pst = conn.prepareStatement(sql);
                pst.setString(1, id);
                pst.setString(2, name);
                pst.setString(3, coursefee);
                pst.setString(4, duration);
                pst.setString(5, faculty);
                
                
                int result = pst.executeUpdate();
                System.out.println(result);
                if (result == 1) {
                    JOptionPane.showMessageDialog(this, "Data Saved!");
                    loadData();
                    clear();
                }

            } else {
                JOptionPane.showMessageDialog(this, "Fill required fields");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnSrcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSrcActionPerformed
        try {

            String src = txtid.getText();

            txtname.setText(null);
            txtcoursefee.setText(null);
            txtduration.setText(null);
            txtfaculty.setText(null);

            String sql = "select * from course where id=?";
            pst = conn.prepareStatement(sql);
            pst.setString(1, src);
            ResultSet rs = pst.executeQuery();

            if (rs.next()) {
                txtname.setText(rs.getString("name"));
                txtcoursefee.setText(rs.getString("coursefee"));
                txtduration.setText(rs.getString("duration"));
                txtfaculty.setText(rs.getString("faculty"));
                
            } else {
                JOptionPane.showMessageDialog(this, "No result");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnSrcActionPerformed

    private void btnDelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDelActionPerformed
        try {

            String src = txtid.getText();
            String sql = "delete from course where id=?";
            pst = conn.prepareStatement(sql);
            pst.setString(1, src);

            int result = pst.executeUpdate();
            System.out.println(result);
            if (result == 1) {

                JOptionPane.showMessageDialog(this, "Deleted");
                clear();
                loadData();
            } else {
                ///
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnDelActionPerformed

    private void btnUpdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdActionPerformed
        try {
            String id = txtid.getText();
            String name = txtname.getText();
            String coursefee = txtcoursefee.getText();
            String duration =txtduration.getText();
            String faculty =txtfaculty.getText();

            if (!id.equals("") && !name.equals("") && !coursefee.equals("") && !duration.equals("") &&!faculty.equals("")) {

                String sql = "update  course  set  name=?, coursefee=?, duration=?, faculty=? where id=?";
                pst = conn.prepareStatement(sql);

                pst.setString(1, name);
                pst.setString(2, coursefee);
                pst.setString(3, duration);
                pst.setString(4, faculty);
                pst.setString(5, id);

                int result = pst.executeUpdate();
                System.out.println(result);
                if (result == 1) {
                    JOptionPane.showMessageDialog(this, "Data Updated!");
                    loadData();
                    clear();
                }

            } else {
                JOptionPane.showMessageDialog(this, "Fill required fields");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnUpdActionPerformed

    private void tblDataMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblDataMouseClicked

        row = tblData.getSelectedRow();
        DefaultTableModel dtm = (DefaultTableModel) tblData.getModel();
        if (row > -1) {

            txtid.setText(dtm.getValueAt(row, 0).toString());
            txtname.setText(dtm.getValueAt(row, 1).toString());
            txtcoursefee.setText(dtm.getValueAt(row, 2) + "");
            txtduration.setText((dtm.getValueAt(row, 3)).toString());
            txtfaculty.setText((dtm.getValueAt(row, 4)).toString());
        }

     //   String gender = "";
       // if (jRadioButton2.isSelected()) {
        //    JOptionPane.showMessageDialog(this, "Female");
          //  gender = "Female";
        //}
    }//GEN-LAST:event_tblDataMouseClicked

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

        try {
            InputStream is = this.getClass().getClassLoader().getResourceAsStream(".//reports/All.jasper");

            //JasperReport jr = JasperCompileManager.compileReport(is); // all.jrxml use 
            JasperPrint jp = JasperFillManager.fillReport(is, null, conn);

            JasperViewer.viewReport(jp, false);
        } catch (Exception e) {
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        try {
            InputStream is = this.getClass().getClassLoader().getResourceAsStream(".//reports//one.jasper");

            //JasperReport jr = JasperCompileManager.compileReport(is); // one.jrxml use 
            Map<String, Object> params = new HashMap();
            params.put("courseID", txtid.getText());

            JasperPrint jp = JasperFillManager.fillReport(is, params, conn);

            JasperViewer.viewReport(jp, false);
        } catch (Exception e) {
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void txtidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtidActionPerformed

    private void txtnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnameActionPerformed

    private void txtdurationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtdurationActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtdurationActionPerformed

    private void txtlecturerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtlecturerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtlecturerActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String uname= jButton1.getText();
        new Menu(uname).setVisible(true);
        new Course().setVisible(false);
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1MouseClicked

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
            java.util.logging.Logger.getLogger(Course.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Course.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Course.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Course.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Course().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDel;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnSrc;
    private javax.swing.JButton btnUpd;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lhead;
    private javax.swing.JPanel pnlCourse;
    private javax.swing.JTable tblData;
    private javax.swing.JTextField txtcoursefee;
    private javax.swing.JTextField txtduration;
    private javax.swing.JTextField txtfaculty;
    private javax.swing.JTextField txtid;
    private javax.swing.JTextField txtlecturer;
    private javax.swing.JTextField txtname;
    // End of variables declaration//GEN-END:variables

    private void loadData() {

        try {

            DefaultTableModel dtm = (DefaultTableModel) tblData.getModel();

            dtm.setRowCount(0);

            String sql = "SELECT * FROM course ";
            pst = conn.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();

            while (rs.next()) {
                Vector v = new Vector();

                v.add(rs.getString("id"));
                v.add(rs.getString("name"));
                v.add(rs.getString("coursefee"));
                v.add(rs.getString("duration"));
                v.add(rs.getString("faculty"));
                v.add(rs.getString("lecturer"));

                dtm.addRow(v);

            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void clear() {

        txtid.setText(null);
        txtname.setText(null);
        txtcoursefee.setText(null);
        txtduration.setText(null);
        txtfaculty.setText(null);
        txtlecturer.setText(null);
        
    }

}
