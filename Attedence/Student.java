package Attedence;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author udays
 */
public class Student extends javax.swing.JFrame {

    private static final long serialVersionUID = 1L;

    /**
     * Creates new form Student
     */
    public Student() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        studentmanagement = new javax.swing.JButton();
        markattendence = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        btnexit = new javax.swing.JButton();
        btnlogout = new javax.swing.JButton();
        viewexistsstudent = new javax.swing.JButton();
        viewattendence = new javax.swing.JButton();
        viewnotification = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        studentmanagement.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        studentmanagement.setForeground(new java.awt.Color(21, 88, 68));
        studentmanagement.setText(" Student Management ");
        studentmanagement.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                studentmanagementActionPerformed(evt);
            }
        });

        markattendence.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        markattendence.setForeground(new java.awt.Color(21, 88, 68));
        markattendence.setText("Mark  Attendence");
        markattendence.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                markattendenceActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 80));
        jLabel1.setText("Student Control Panel");

        btnBack.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnBack.setForeground(new java.awt.Color(21, 88, 68));
        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        btnexit.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnexit.setForeground(new java.awt.Color(21, 88, 68));
        btnexit.setText("Exit");
        btnexit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnexitActionPerformed(evt);
            }
        });

        btnlogout.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnlogout.setForeground(new java.awt.Color(21, 88, 68));
        btnlogout.setText("Logout");
        btnlogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlogoutActionPerformed(evt);
            }
        });

        viewexistsstudent.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        viewexistsstudent.setForeground(new java.awt.Color(21, 88, 68));
        viewexistsstudent.setText("View Exists Student");
        viewexistsstudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewexistsstudentActionPerformed(evt);
            }
        });

        viewattendence.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        viewattendence.setForeground(new java.awt.Color(21, 88, 68));
        viewattendence.setText("View Attendence");
        viewattendence.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewattendenceActionPerformed(evt);
            }
        });

        viewnotification.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        viewnotification.setForeground(new java.awt.Color(21, 88, 68));
        viewnotification.setText("View Notification");
        viewnotification.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewnotificationActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(21, 88, 68));
        jButton1.setText("View Late Student Attendence Notice");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnlogout)
                    .addComponent(btnBack, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnexit, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGroup(layout.createSequentialGroup()
                .addGap(77, 77, 77)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(studentmanagement, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(viewexistsstudent, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(viewattendence, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(markattendence, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(viewnotification, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(0, 181, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(88, 88, 88)
                        .addComponent(btnlogout)
                        .addGap(18, 18, 18)
                        .addComponent(btnBack)
                        .addGap(8, 8, 8)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnexit)
                            .addComponent(markattendence)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(studentmanagement)
                        .addGap(18, 18, 18)
                        .addComponent(viewexistsstudent)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(viewattendence)))
                .addGap(18, 18, 18)
                .addComponent(viewnotification)
                .addGap(27, 27, 27)
                .addComponent(jButton1)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void studentmanagementActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_studentmanagementActionPerformed
        this.setVisible(false);
        CreateStudentForm s = new CreateStudentForm();
        s.setVisible(true);
    }//GEN-LAST:event_studentmanagementActionPerformed

    private void markattendenceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_markattendenceActionPerformed
        this.setVisible(false);
       AttandanceDetails ad=new AttandanceDetails();
       ad.setVisible(true);
    }//GEN-LAST:event_markattendenceActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        Loginwel lw=new Loginwel();
        lw.setVisible(true);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnexitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnexitActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_btnexitActionPerformed

    private void btnlogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlogoutActionPerformed
        this.setVisible(false);
        Loginwel l = new Loginwel();
        l.setVisible(true);
    }//GEN-LAST:event_btnlogoutActionPerformed

    private void viewexistsstudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewexistsstudentActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        ViewListofStudent vlos=new ViewListofStudent();
        vlos.setVisible(true);
    }//GEN-LAST:event_viewexistsstudentActionPerformed

    private void viewattendenceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewattendenceActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        ViewAttendence va=new ViewAttendence();
        va.setVisible(true);
    }//GEN-LAST:event_viewattendenceActionPerformed

    private void viewnotificationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewnotificationActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
     ViewnotificationAdmin vna=new ViewnotificationAdmin();
     vna.setVisible(true);
    }//GEN-LAST:event_viewnotificationActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        LateViewAttendence lva= new LateViewAttendence();
        lva.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Student.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Student.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Student.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Student.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Student().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnexit;
    private javax.swing.JButton btnlogout;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton markattendence;
    private javax.swing.JButton studentmanagement;
    private javax.swing.JButton viewattendence;
    private javax.swing.JButton viewexistsstudent;
    private javax.swing.JButton viewnotification;
    // End of variables declaration//GEN-END:variables
}
