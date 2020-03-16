package Attedence;

import Input.LecturerInput;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

public class CreateLecturerForm extends javax.swing.JFrame {

    private static final long serialVersionUID = 1L;

    public CreateLecturerForm() {
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
        lecturerno = new javax.swing.JTextField();
        firstname = new javax.swing.JTextField();
        lastname = new javax.swing.JTextField();
        address = new javax.swing.JTextField();
        mobileno = new javax.swing.JTextField();
        course = new javax.swing.JComboBox<>();
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
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(21, 88, 68));
        jLabel1.setText("Lecturer No.");

        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(21, 88, 68));
        jLabel2.setText("First Name");

        jLabel3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(21, 88, 68));
        jLabel3.setText("Last Name");

        jLabel4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(21, 88, 68));
        jLabel4.setText("Address");

        jLabel5.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(21, 88, 68));
        jLabel5.setText("Mobile No");

        jLabel6.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(21, 88, 68));
        jLabel6.setText("Course");

        lecturerno.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N

        firstname.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N

        lastname.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N

        address.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N

        mobileno.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N

        course.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        course.setForeground(new java.awt.Color(21, 88, 68));
        course.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "B.Sc IT", "BBA", "BBM", "BCA" }));

        btncreate.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btncreate.setForeground(new java.awt.Color(21, 88, 68));
        btncreate.setText("Create");
        btncreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncreateActionPerformed(evt);
            }
        });

        btnremove.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnremove.setForeground(new java.awt.Color(21, 88, 68));
        btnremove.setText("Remove");
        btnremove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnremoveActionPerformed(evt);
            }
        });

        btnupdate.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnupdate.setForeground(new java.awt.Color(21, 88, 68));
        btnupdate.setText("Update");
        btnupdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnupdateActionPerformed(evt);
            }
        });

        btnclear.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnclear.setForeground(new java.awt.Color(21, 88, 68));
        btnclear.setText("Clear");
        btnclear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnclearActionPerformed(evt);
            }
        });

        btnlogout.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnlogout.setForeground(new java.awt.Color(21, 88, 68));
        btnlogout.setText("LogOut");
        btnlogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlogoutActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 80));
        jLabel11.setText("Create Lecturer's Account");

        btnback.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnback.setForeground(new java.awt.Color(21, 88, 68));
        btnback.setText("Back");
        btnback.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbackActionPerformed(evt);
            }
        });

        viewcreatedstudent.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        viewcreatedstudent.setForeground(new java.awt.Color(21, 88, 68));
        viewcreatedstudent.setText("View ");
        viewcreatedstudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewcreatedstudentActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(21, 88, 68));
        jLabel12.setText("UserName");

        jLabel13.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(21, 88, 68));
        jLabel13.setText("Password");

        txtuname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtunameActionPerformed(evt);
            }
        });

        txtpassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtpasswordActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButton3.setForeground(new java.awt.Color(21, 88, 68));
        jButton3.setText("Search");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addComponent(jLabel11))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel2)
                                .addComponent(jLabel3)
                                .addComponent(jLabel4)
                                .addComponent(jLabel5)
                                .addComponent(jLabel6))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel13)
                                    .addComponent(jLabel12))
                                .addGap(47, 47, 47)))
                        .addGap(64, 64, 64)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(address)
                            .addComponent(lastname)
                            .addComponent(firstname)
                            .addComponent(mobileno)
                            .addComponent(course, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lecturerno, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                            .addComponent(txtuname)
                            .addComponent(txtpassword))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnlogout, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnremove, javax.swing.GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE)
                    .addComponent(btnclear, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnupdate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btncreate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(viewcreatedstudent, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnback, javax.swing.GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lecturerno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(firstname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lastname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jButton3))
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(btnremove, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(address, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(mobileno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(viewcreatedstudent)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(course, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(btncreate))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(txtuname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnupdate))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnclear)
                    .addComponent(txtpassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnback)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnlogout)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void btnlogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlogoutActionPerformed
        this.setVisible(false);
        Loginwel l = new Loginwel();
        l.setVisible(true); 
    }//GEN-LAST:event_btnlogoutActionPerformed

    @SuppressWarnings("deprecation")
    private void btncreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncreateActionPerformed
        if( !lecturerno.getText().trim().equals("")&&  !firstname.getText().trim().equals("") 
                 && !lastname.getText().trim().equals("") && !address.getText().trim().equals("")
                 && !mobileno.getText().trim().equals("") && !course.getSelectedItem().toString().trim().equals("") 
                 && !txtuname.getText().trim().equals("") 
                 && !txtpassword.getText().trim().equals("")){
           if((Pattern.matches("^[0-9]+$",lecturerno.getText()))
                   && (Pattern.matches("^[a-zA-Z]+$",firstname.getText())) 
                   && (Pattern.matches("^[a-zA-Z]+$",lastname.getText()))
                   && (Pattern.matches("^[a-zA-Z]+$",address.getText())) 
                   && (Pattern.matches("^[0-9]+$",mobileno.getText())) 
                   && (Pattern.matches("^[a-zA-Z0-9\\s]+$",txtuname.getText()))
                   && (Pattern.matches("^[a-zA-Z0-9\\s]+$",txtpassword.getText())))
           {
                 LecturerInput li = new LecturerInput();
       li.Add(lecturerno.getText(),firstname.getText(), lastname.getText(), address.getText(), mobileno.getText(),course.getSelectedItem().toString(),txtuname.getText(),txtpassword.getText()); 
       JOptionPane.showMessageDialog(null,"Create Lecturer Account Sucessfully"); 
        lecturerno.setText("");
        firstname.setText("");
        lastname.setText("");
        address.setText("");
        mobileno.setText("");
        course.setSelectedItem("");
        txtuname.setText("");
        txtpassword.setText("");
              
           }else{
     JOptionPane.showMessageDialog(null,"Invalid Input"); 
      }
      }
               else{
                   JOptionPane.showMessageDialog(null,"Field Are Required");
               }
    }//GEN-LAST:event_btncreateActionPerformed

    @SuppressWarnings("deprecation")
    private void btnupdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnupdateActionPerformed
         if( !lecturerno.getText().trim().equals("")&&  !firstname.getText().trim().equals("") 
                 && !lastname.getText().trim().equals("") && !address.getText().trim().equals("")
                 && !mobileno.getText().trim().equals("") && !course.getSelectedItem().toString().trim().equals("") 
                 && !txtuname.getText().trim().equals("") 
                 && !txtpassword.getText().trim().equals("")){
          if((Pattern.matches("^[0-9]+$",lecturerno.getText()))
                   && (Pattern.matches("^[a-zA-Z]+$",firstname.getText())) 
                   && (Pattern.matches("^[a-zA-Z]+$",lastname.getText()))
                   && (Pattern.matches("^[a-zA-Z]+$",address.getText())) 
                   && (Pattern.matches("^[0-9]+$",mobileno.getText())) 
                   && (Pattern.matches("^[a-zA-Z0-9\\s]+$",txtuname.getText()))
                   && (Pattern.matches("^[a-zA-Z0-9\\s]+$",txtpassword.getText())))
           {
                    LecturerInput li = new LecturerInput();
       li.update(lecturerno.getText(),firstname.getText(), lastname.getText(), address.getText(), mobileno.getText(),course.getSelectedItem().toString(),txtuname.getText(),txtpassword.getText());   
       JOptionPane.showMessageDialog(null,"Lecturer Account successfully Updated");
        lecturerno.setText("");
        firstname.setText("");
        lastname.setText("");
        address.setText("");
        mobileno.setText("");
        course.setSelectedItem("");
        txtuname.setText("");
        txtpassword.setText("");
               
           }   
        else{
      JOptionPane.showMessageDialog(null,"Invalid Input");
    }//GEN-LAST:event_btnupdateActionPerformed
         }else{
          JOptionPane.showMessageDialog(null,"Field are Required");   
         }
    }
    private void btnremoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnremoveActionPerformed
       
            LecturerInput li = new LecturerInput();
        try {
            li.deleteLecturer(lecturerno.getText());
        } catch (IOException ex) {
            Logger.getLogger(CreateLecturerForm.class.getName()).log(Level.SEVERE, null, ex);
        }
            JOptionPane.showMessageDialog(null, "Lecturer deleted succesfully");
        lecturerno.setText("");
        firstname.setText("");
        lastname.setText("");
        address.setText("");
        mobileno.setText("");
        course.setSelectedItem("");
        txtuname.setText("");
        txtpassword.setText("");
        
    }//GEN-LAST:event_btnremoveActionPerformed

    private void btnclearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnclearActionPerformed
        lecturerno.setText("");
        firstname.setText("");
        lastname.setText("");
        address.setText("");
        mobileno.setText("");
        course.setSelectedItem("");
        txtuname.setText("");
        txtpassword.setText("");
    }//GEN-LAST:event_btnclearActionPerformed

    private void btnbackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbackActionPerformed
        this.setVisible(false);
        Lecturer l = new Lecturer();
        l.setVisible(true); 
    }//GEN-LAST:event_btnbackActionPerformed

    private void viewcreatedstudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewcreatedstudentActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        ViewListofLecturer vlof=new ViewListofLecturer();
        vlof.setVisible(true);
    }//GEN-LAST:event_viewcreatedstudentActionPerformed

    private void txtunameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtunameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtunameActionPerformed

    private void txtpasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtpasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtpasswordActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        LecturerSearch ls=new LecturerSearch();
        ls.setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed
    
  

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
            new CreateLecturerForm().setVisible(true);
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
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField lastname;
    private javax.swing.JTextField lecturerno;
    private javax.swing.JTextField mobileno;
    private javax.swing.JPasswordField txtpassword;
    private javax.swing.JTextField txtuname;
    private javax.swing.JButton viewcreatedstudent;
    // End of variables declaration//GEN-END:variables
}
