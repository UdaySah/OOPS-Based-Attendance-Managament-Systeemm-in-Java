package Attedence;

import Input.StudentInput;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

public class CreateStudentForm extends javax.swing.JFrame {

    private static final long serialVersionUID = 1L;

    public CreateStudentForm() {
        initComponents();       
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        registrationno = new javax.swing.JTextField();
        firstname = new javax.swing.JTextField();
        lastname = new javax.swing.JTextField();
        address = new javax.swing.JTextField();
        mobileno = new javax.swing.JTextField();
        gudiencename = new javax.swing.JTextField();
        gudiencemobileno = new javax.swing.JTextField();
        course = new javax.swing.JComboBox<>();
        semester = new javax.swing.JComboBox<>();
        intakecode = new javax.swing.JComboBox<>();
        btncreate = new javax.swing.JButton();
        btnremove = new javax.swing.JButton();
        btnupdate = new javax.swing.JButton();
        btnclear = new javax.swing.JButton();
        btnlogout = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        btnback = new javax.swing.JButton();
        viewcreatedstudent = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txtuname = new javax.swing.JTextField();
        txtpassword = new javax.swing.JPasswordField();
        viewattendence = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(21, 88, 68));
        jLabel1.setText("Registration No.");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 57, -1, -1));

        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(21, 88, 68));
        jLabel2.setText("First Name");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 91, -1, -1));

        jLabel3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(21, 88, 68));
        jLabel3.setText("Last Name");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 129, -1, -1));

        jLabel4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(21, 88, 68));
        jLabel4.setText("Address");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 163, -1, -1));

        jLabel5.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(21, 88, 68));
        jLabel5.setText("Mobile No");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 205, -1, -1));

        jLabel6.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(21, 88, 68));
        jLabel6.setText("Course");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 241, -1, -1));

        jLabel7.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(21, 88, 68));
        jLabel7.setText("Semester");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 277, -1, -1));

        jLabel8.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(21, 88, 68));
        jLabel8.setText("Intake Code");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 313, -1, -1));

        jLabel9.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(21, 88, 68));
        jLabel9.setText("Gudience  Name");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(33, 356, -1, -1));

        jLabel10.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(21, 88, 68));
        jLabel10.setText("Gudience Phone No.");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(33, 399, -1, -1));

        registrationno.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        getContentPane().add(registrationno, new org.netbeans.lib.awtextra.AbsoluteConstraints(212, 51, 150, -1));

        firstname.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        getContentPane().add(firstname, new org.netbeans.lib.awtextra.AbsoluteConstraints(212, 85, 150, -1));

        lastname.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        getContentPane().add(lastname, new org.netbeans.lib.awtextra.AbsoluteConstraints(212, 123, 150, -1));

        address.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        getContentPane().add(address, new org.netbeans.lib.awtextra.AbsoluteConstraints(212, 160, 150, -1));

        mobileno.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        getContentPane().add(mobileno, new org.netbeans.lib.awtextra.AbsoluteConstraints(212, 202, 150, -1));

        gudiencename.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        getContentPane().add(gudiencename, new org.netbeans.lib.awtextra.AbsoluteConstraints(212, 353, 150, -1));

        gudiencemobileno.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        getContentPane().add(gudiencemobileno, new org.netbeans.lib.awtextra.AbsoluteConstraints(212, 396, 150, -1));

        course.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        course.setForeground(new java.awt.Color(21, 88, 68));
        course.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "B.Sc IT", "BBA", "BBM", "BCA" }));
        getContentPane().add(course, new org.netbeans.lib.awtextra.AbsoluteConstraints(212, 238, 150, -1));

        semester.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        semester.setForeground(new java.awt.Color(21, 88, 68));
        semester.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sem 1", "Sem 2", "Sem 3", "Sem 4", "Sem 5", "Sem 6" }));
        getContentPane().add(semester, new org.netbeans.lib.awtextra.AbsoluteConstraints(212, 274, 150, -1));

        intakecode.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        intakecode.setForeground(new java.awt.Color(21, 88, 68));
        intakecode.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "NP1F1609IT", "NP1F1609BM", "NP1F1609CA", "NP1F1609BB" }));
        getContentPane().add(intakecode, new org.netbeans.lib.awtextra.AbsoluteConstraints(212, 310, 150, -1));

        btncreate.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btncreate.setForeground(new java.awt.Color(21, 88, 68));
        btncreate.setText("Create");
        btncreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncreateActionPerformed(evt);
            }
        });
        getContentPane().add(btncreate, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 309, 151, -1));

        btnremove.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnremove.setForeground(new java.awt.Color(21, 88, 68));
        btnremove.setText("Remove");
        btnremove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnremoveActionPerformed(evt);
            }
        });
        getContentPane().add(btnremove, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 273, 151, -1));

        btnupdate.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnupdate.setForeground(new java.awt.Color(21, 88, 68));
        btnupdate.setText("Update");
        btnupdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnupdateActionPerformed(evt);
            }
        });
        getContentPane().add(btnupdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 352, 151, -1));

        btnclear.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnclear.setForeground(new java.awt.Color(21, 88, 68));
        btnclear.setText("Clear");
        btnclear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnclearActionPerformed(evt);
            }
        });
        getContentPane().add(btnclear, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 395, 151, -1));

        btnlogout.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnlogout.setForeground(new java.awt.Color(21, 88, 68));
        btnlogout.setText("LogOut");
        btnlogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlogoutActionPerformed(evt);
            }
        });
        getContentPane().add(btnlogout, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 481, 151, -1));

        jLabel11.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 80));
        jLabel11.setText("Create Student's Account");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(97, 11, -1, -1));

        btnback.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnback.setForeground(new java.awt.Color(21, 88, 68));
        btnback.setText("Back");
        btnback.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbackActionPerformed(evt);
            }
        });
        getContentPane().add(btnback, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 438, 151, -1));

        viewcreatedstudent.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        viewcreatedstudent.setForeground(new java.awt.Color(21, 88, 68));
        viewcreatedstudent.setText("View  Details");
        viewcreatedstudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewcreatedstudentActionPerformed(evt);
            }
        });
        getContentPane().add(viewcreatedstudent, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 237, 151, -1));

        jLabel12.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(21, 88, 68));
        jLabel12.setText("UserName");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(33, 442, -1, -1));

        jLabel13.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(21, 88, 68));
        jLabel13.setText("Password");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(33, 485, -1, -1));

        txtuname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtunameActionPerformed(evt);
            }
        });
        getContentPane().add(txtuname, new org.netbeans.lib.awtextra.AbsoluteConstraints(212, 441, 150, -1));

        txtpassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtpasswordActionPerformed(evt);
            }
        });
        getContentPane().add(txtpassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(212, 484, 150, -1));

        viewattendence.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        viewattendence.setForeground(new java.awt.Color(21, 88, 68));
        viewattendence.setText("View Attendence");
        viewattendence.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewattendenceActionPerformed(evt);
            }
        });
        getContentPane().add(viewattendence, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 201, -1, -1));

        jButton1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(21, 88, 68));
        jButton1.setText("Search");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 170, 150, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void btnlogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlogoutActionPerformed
        this.setVisible(false);
        Loginwel l = new Loginwel();
        l.setVisible(true); 
    }//GEN-LAST:event_btnlogoutActionPerformed

    @SuppressWarnings("deprecation")
    private void btncreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncreateActionPerformed
          
      if( !registrationno.getText().trim().equals("") &&!firstname.getText().trim().equals("")
         && !lastname.getText().trim().equals("") && !address.getText().trim().equals("") 
         && !mobileno.getText().trim().equals("") && !course.getSelectedItem().toString().trim().equals("")
              && !semester.getSelectedItem().toString().trim().equals("") && !intakecode.getSelectedItem().toString().trim().equals("")
              && !gudiencename.getText().trim().equals("") && !gudiencemobileno.getText().trim().equals("")
              && !txtuname.getText().trim().equals("") && !txtpassword.getText().trim().equals("")){
         if((Pattern.matches("^[0-9]+",registrationno.getText()))
                   && (Pattern.matches("^[a-zA-Z\\s]*$",firstname.getText())) 
                   && (Pattern.matches("^[a-zA-Z\\s]*$",lastname.getText()))
                   && (Pattern.matches("^[a-zA-Z\\s]*$",address.getText())) 
                   && (Pattern.matches("^[0-9]+",mobileno.getText())) 
                   && (Pattern.matches("^[a-zA-Z\\s]*$",gudiencename.getText()))
                   && (Pattern.matches("^[0-9]+",gudiencemobileno.getText()))
                   && (Pattern.matches("^[a-zA-Z0-9\\s]+",txtuname.getText()))
                   && (Pattern.matches("^[a-zA-Z0-9\\s]+",txtpassword.getText())))
           {
                StudentInput s = new StudentInput();
       s.Add(registrationno.getText(),firstname.getText(), lastname.getText(), address.getText(), mobileno.getText(),course.getSelectedItem().toString(),
           semester.getSelectedItem().toString(),intakecode.getSelectedItem().toString(), gudiencename.getText(), gudiencemobileno.getText(),txtuname.getText(),txtpassword.getText());
       JOptionPane.showMessageDialog(null,"Sucessfuly Student Account Created");
        registrationno.setText("");
        firstname.setText("");
        lastname.setText("");
        address.setText("");
        mobileno.setText("");
        gudiencemobileno.setText("");
        gudiencename.setText("");
        course.setSelectedItem("");
        semester.setSelectedItem("");
        intakecode.setSelectedItem("");
        txtuname.setText("");
        txtpassword.setText("");
        
           }   
        else{  
      JOptionPane.showMessageDialog(null,"Invalid Input");
      }
      }
      else{
          JOptionPane.showMessageDialog(null,"Field are  Required");
      }
          
    }//GEN-LAST:event_btncreateActionPerformed

    @SuppressWarnings("deprecation")
    private void btnupdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnupdateActionPerformed
          if( !registrationno.getText().trim().equals("") &&!firstname.getText().trim().equals("")
         && !lastname.getText().trim().equals("") && !address.getText().trim().equals("") 
         && !mobileno.getText().trim().equals("") && !course.getSelectedItem().toString().trim().equals("")
              && !semester.getSelectedItem().toString().trim().equals("") && !intakecode.getSelectedItem().toString().trim().equals("")
              && !gudiencename.getText().trim().equals("") && !gudiencemobileno.getText().trim().equals("")
              && !txtuname.getText().trim().equals("") && !txtpassword.getText().trim().equals("")){
         if((Pattern.matches("^[0-9]+",registrationno.getText()))
                   && (Pattern.matches("^[a-zA-Z\\s]*$",firstname.getText())) 
                   && (Pattern.matches("^[a-zA-Z\\s]*$",lastname.getText()))
                   && (Pattern.matches("^[a-zA-Z\\s]*$",address.getText())) 
                   && (Pattern.matches("^[0-9]+",mobileno.getText())) 
                   && (Pattern.matches("^[a-zA-Z\\s]*$",gudiencename.getText()))
                   && (Pattern.matches("^[0-9]+",gudiencemobileno.getText()))
                   && (Pattern.matches("^[a-zA-Z0-9\\s]+",txtuname.getText()))
                   && (Pattern.matches("^[a-zA-Z0-9\\s]+",txtpassword.getText())))
           {
               StudentInput s = new StudentInput();
       s.Update(registrationno.getText(),firstname.getText(), lastname.getText(), address.getText(), mobileno.getText(),course.getSelectedItem().toString(),
           semester.getSelectedItem().toString(),intakecode.getSelectedItem().toString(), gudiencename.getText(), gudiencemobileno.getText(),txtuname.getText(),txtpassword.getText());  
         JOptionPane.showMessageDialog(null,"Student Account Successfully Updated");
         registrationno.setText("");
        firstname.setText("");
        lastname.setText("");
        address.setText("");
        mobileno.setText("");
        gudiencemobileno.setText("");
        gudiencename.setText("");
        course.setSelectedItem("");
        semester.setSelectedItem("");
        intakecode.setSelectedItem("");
        txtuname.setText("");
        txtpassword.setText("");
              
           }   
        else{   
           JOptionPane.showMessageDialog(null,"Invalid Input"); 
         }         
         }
          else{
              JOptionPane.showMessageDialog(null,"Field are  Required");
          }
    }//GEN-LAST:event_btnupdateActionPerformed

    private void btnremoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnremoveActionPerformed
    StudentInput s = new StudentInput();
        try {
            s.deleteStudent(registrationno.getText());
            JOptionPane.showMessageDialog(null, "Student Account Deleted succesfully");
        registrationno.setText("");
        firstname.setText("");
        lastname.setText("");
        address.setText("");
        mobileno.setText("");
        gudiencemobileno.setText("");
        gudiencename.setText("");
        course.setSelectedItem("");
        semester.setSelectedItem("");
        intakecode.setSelectedItem("");
        txtuname.setText("");
        txtpassword.setText("");
        } catch (IOException ex) {
            Logger.getLogger(CreateStudentForm.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_btnremoveActionPerformed

    private void btnclearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnclearActionPerformed
        registrationno.setText("");
        firstname.setText("");
        lastname.setText("");
        address.setText("");
        mobileno.setText("");
        gudiencemobileno.setText("");
        gudiencename.setText("");
        course.setSelectedItem("");
        semester.setSelectedItem("");
        intakecode.setSelectedItem("");
        txtuname.setText("");
        txtpassword.setText("");
    }//GEN-LAST:event_btnclearActionPerformed

    private void btnbackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbackActionPerformed
        this.setVisible(false);
        Student s = new Student();
        s.setVisible(true); 
    }//GEN-LAST:event_btnbackActionPerformed

    private void viewcreatedstudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewcreatedstudentActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        ViewListofStudent vlof=new ViewListofStudent();
        vlof.setVisible(true);
    }//GEN-LAST:event_viewcreatedstudentActionPerformed

    private void txtunameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtunameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtunameActionPerformed

    private void txtpasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtpasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtpasswordActionPerformed

    private void viewattendenceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewattendenceActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        ViewAttendence va=new ViewAttendence();
        va.setVisible(true);
    }//GEN-LAST:event_viewattendenceActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        StudentSearch ss = null;
        try {
            ss = new StudentSearch();
        } catch (IOException ex) {
            Logger.getLogger(CreateStudentForm.class.getName()).log(Level.SEVERE, null, ex);
        }
        ss.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed
  
    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CreateStudentForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new CreateStudentForm().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField address;
    private javax.swing.JButton btnback;
    private javax.swing.JButton btnclear;
    private javax.swing.JButton btncreate;
    private javax.swing.JButton btnlogout;
    private javax.swing.JButton btnremove;
    private javax.swing.JButton btnupdate;
    private javax.swing.JComboBox<String> course;
    private javax.swing.JTextField firstname;
    private javax.swing.JTextField gudiencemobileno;
    private javax.swing.JTextField gudiencename;
    private javax.swing.JComboBox<String> intakecode;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField lastname;
    private javax.swing.JTextField mobileno;
    private javax.swing.JTextField registrationno;
    private javax.swing.JComboBox<String> semester;
    private javax.swing.JPasswordField txtpassword;
    private javax.swing.JTextField txtuname;
    private javax.swing.JButton viewattendence;
    private javax.swing.JButton viewcreatedstudent;
    // End of variables declaration//GEN-END:variables
}
