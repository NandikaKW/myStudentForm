/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package studentform.View;

import Dto.Student.dto;
import studentform.Controller.StudentController;

/**
 *
 * @author nandikakaweesha
 */
public class Student extends javax.swing.JFrame {

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

        jLabel1 = new javax.swing.JLabel();
        studentId = new javax.swing.JLabel();
        name = new javax.swing.JLabel();
        email = new javax.swing.JLabel();
        course = new javax.swing.JLabel();
        idtxt = new javax.swing.JTextField();
        nametxt = new javax.swing.JTextField();
        emailtxt = new javax.swing.JTextField();
        coursetxt = new javax.swing.JTextField();
        savebtn = new javax.swing.JButton();
        updatebtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Liberation Sans", 3, 24)); // NOI18N
        jLabel1.setText("Student Form ");

        studentId.setText("StudentID:");

        name.setText("Name :");

        email.setText("Email:");

        course.setText("Course:");

        idtxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idtxtActionPerformed(evt);
            }
        });

        emailtxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailtxtActionPerformed(evt);
            }
        });

        savebtn.setText("Save");
        savebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                savebtnActionPerformed(evt);
            }
        });

        updatebtn.setText("Update ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(savebtn)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(studentId)
                                    .addComponent(name)
                                    .addComponent(email)
                                    .addComponent(course))
                                .addGap(50, 50, 50)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(idtxt)
                                    .addComponent(nametxt)
                                    .addComponent(emailtxt, javax.swing.GroupLayout.DEFAULT_SIZE, 237, Short.MAX_VALUE)
                                    .addComponent(coursetxt))))
                        .addGap(45, 45, 45)
                        .addComponent(updatebtn))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(219, 219, 219)
                        .addComponent(jLabel1)))
                .addContainerGap(149, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(studentId)
                    .addComponent(idtxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(name)
                    .addComponent(nametxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(email)
                    .addComponent(emailtxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(course)
                    .addComponent(coursetxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(savebtn)
                    .addComponent(updatebtn))
                .addContainerGap(237, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void idtxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idtxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idtxtActionPerformed

    private void emailtxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailtxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailtxtActionPerformed

    private void savebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_savebtnActionPerformed
        String studentID = idtxt.getText();
        String name = nametxt.getText();
        String email = emailtxt.getText();
        String course = coursetxt.getText();

        // Save these values or perform any necessary actions
        System.out.println("Student Saved: " + name);
    }
    private void updatebtnActionPerformed(java.awt.event.ActionEvent evt) {
        // Get data from text fields
        String studentIDStr = idtxt.getText();
        String name = nametxt.getText();
        String email = emailtxt.getText();
        String course = coursetxt.getText();

        try {
            int studentID = Integer.parseInt(studentIDStr); // Convert to int
            dto studentDTO = new dto(studentID, name, email, course);

            // Update student in the database
            boolean isUpdated = StudentController.updateStudent(studentDTO);

            if (isUpdated) {
                System.out.println("Student Updated Successfully");
            } else {
                System.out.println("Failed to Update Student");
            }
        } catch (NumberFormatException e) {
            System.out.println("Invalid Student ID");
        }
    }//GEN-LAST:event_savebtnActionPerformed

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
    private javax.swing.JLabel course;
    private javax.swing.JTextField coursetxt;
    private javax.swing.JLabel email;
    private javax.swing.JTextField emailtxt;
    private javax.swing.JTextField idtxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel name;
    private javax.swing.JTextField nametxt;
    private javax.swing.JButton savebtn;
    private javax.swing.JLabel studentId;
    private javax.swing.JButton updatebtn;

    public void setStudentID(int studentID) {
    }

    public void setEmail(String email) {
    }

    public void setCourse(String course) {
    }
    public void setName(String name) {
    }


}