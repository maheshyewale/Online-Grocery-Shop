/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package online.grosery.shop;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author DELL
 */
public class registration extends javax.swing.JFrame {

    /**
     * Creates new form registration
     */
    public registration() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        name = new javax.swing.JTextField();
        subject = new javax.swing.JTextField();
        yr = new javax.swing.JTextField();
        sem = new javax.swing.JTextField();
        password = new javax.swing.JPasswordField();
        submit = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        l_name = new javax.swing.JLabel();
        l_subject = new javax.swing.JLabel();
        l_year = new javax.swing.JLabel();
        l_sem = new javax.swing.JLabel();
        l_pass = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 51, 255));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 255, 255));
        jLabel1.setText("Customer Name");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(20, 110, 150, 22);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 255, 255));
        jLabel2.setText("Mobile Number");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(20, 160, 140, 22);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 255, 255));
        jLabel3.setText("Pincode");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(20, 220, 100, 22);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 255, 255));
        jLabel4.setText("Address");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(20, 270, 90, 22);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 255, 255));
        jLabel5.setText("Password");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(10, 320, 110, 22);

        name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameActionPerformed(evt);
            }
        });
        name.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                nameKeyReleased(evt);
            }
        });
        jPanel1.add(name);
        name.setBounds(180, 110, 165, 22);

        subject.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subjectActionPerformed(evt);
            }
        });
        subject.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                subjectKeyReleased(evt);
            }
        });
        jPanel1.add(subject);
        subject.setBounds(180, 160, 165, 22);

        yr.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                yrKeyReleased(evt);
            }
        });
        jPanel1.add(yr);
        yr.setBounds(180, 220, 165, 22);

        sem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                semActionPerformed(evt);
            }
        });
        sem.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                semKeyReleased(evt);
            }
        });
        jPanel1.add(sem);
        sem.setBounds(180, 270, 170, 22);

        password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordActionPerformed(evt);
            }
        });
        password.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                passwordKeyReleased(evt);
            }
        });
        jPanel1.add(password);
        password.setBounds(180, 320, 170, 22);

        submit.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        submit.setText("Submit");
        submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitActionPerformed(evt);
            }
        });
        jPanel1.add(submit);
        submit.setBounds(150, 390, 130, 40);

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jButton1.setText("Cancel");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(300, 390, 140, 40);

        jLabel7.setBackground(new java.awt.Color(255, 0, 255));
        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(204, 0, 204));
        jLabel7.setText("Registration Page");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(190, 50, 250, 29);

        l_name.setForeground(new java.awt.Color(255, 0, 0));
        jPanel1.add(l_name);
        l_name.setBounds(360, 110, 210, 30);

        l_subject.setForeground(new java.awt.Color(255, 0, 51));
        jPanel1.add(l_subject);
        l_subject.setBounds(360, 160, 230, 30);

        l_year.setForeground(new java.awt.Color(255, 0, 51));
        jPanel1.add(l_year);
        l_year.setBounds(370, 210, 230, 30);

        l_sem.setForeground(new java.awt.Color(255, 0, 51));
        jPanel1.add(l_sem);
        l_sem.setBounds(370, 260, 220, 30);

        l_pass.setBackground(new java.awt.Color(255, 51, 51));
        l_pass.setForeground(new java.awt.Color(255, 0, 51));
        jPanel1.add(l_pass);
        l_pass.setBounds(380, 320, 230, 30);

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 255, 255));
        jLabel10.setText("Password");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(10, 320, 110, 22);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(153, 0, 153));
        jLabel8.setText("Fresh Grosery  Shop");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(180, 10, 239, 29);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/online/grosery/shop/log3.jpg"))); // NOI18N
        jLabel6.setText("jLabel6");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(0, 0, 650, 490);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 649, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 486, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameActionPerformed

    private void nameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nameKeyReleased
        // TODO add your handling code here:
        l_name.setText("");
    }//GEN-LAST:event_nameKeyReleased

    private void subjectKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_subjectKeyReleased
        // TODO add your handling code here:
        l_subject.setText("");
    }//GEN-LAST:event_subjectKeyReleased

    private void yrKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_yrKeyReleased
        // TODO add your handling code here:
        l_year.setText("");
    }//GEN-LAST:event_yrKeyReleased

    private void semActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_semActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_semActionPerformed

    private void semKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_semKeyReleased
        // TODO add your handling code here:
        l_sem.setText("");
    }//GEN-LAST:event_semKeyReleased

    private void passwordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordActionPerformed

    private void passwordKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_passwordKeyReleased
        // TODO add your handling code here:
        l_pass.setText("");
        
    }//GEN-LAST:event_passwordKeyReleased

    private void submitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitActionPerformed

        if(name.getText().trim().isEmpty()&& subject.getText().trim().isEmpty() && yr.getText().trim().isEmpty()&& sem.getText().trim().isEmpty()&& password.getText().trim().isEmpty())
        {
            l_name.setText("Please enter Customer name");
            l_pass.setText("Please enter password");
            l_subject.setText("Please enter Mobile NO.");
            l_year.setText("Please enter Pincode");
            l_sem.setText("Please enter Address");
        }
        else if(name.getText().trim().isEmpty())
        {
            name.setText("Please enter Customer name");
        }
        else if(subject.getText().trim().isEmpty())
        {
            l_subject.setText("Please enter Mobile NO.");
        }
        else if(yr.getText().trim().isEmpty())
        {
            l_year.setText("Please enter Pincode");
        }
        else if(sem.getText().trim().isEmpty())
        {
            l_sem.setText("Please enter Address");
        }
        else if(password.getText().trim().isEmpty())
        {
            l_pass.setText("Please enter password");
        }
        else
        {
            try{
                //step1 l  oad the driver class
                Class.forName("com.mysql.jdbc.Driver");

                //step2 create  the connection object
                Connection con=DriverManager.getConnection(
                    "jdbc:mysql://localhost/groseryshop","root","");

                //step3 create the statement object
                String sql ="INSERT INTO `registration`(`Customer Name`, `Mobile Number`, `Pincode`, `Address`, `Password`) VALUES (?,?,?,?,?)";
                PreparedStatement pstmt =con.prepareStatement(sql);
                pstmt.setString(1,name.getText());
                pstmt.setString(2,subject.getText());
                pstmt.setString(3,yr.getText());
                pstmt.setString(4,sem.getText());
                pstmt.setString(5,password.getText());

                pstmt.executeUpdate();
                JOptionPane.showMessageDialog(null,"Data Inserted Successfully");

                //step5 close the connection object
                con.close();

            }catch(ClassNotFoundException | SQLException | HeadlessException e){ JOptionPane.showMessageDialog(null,"");;}

        }

        // TODO add your handling code here:
    }//GEN-LAST:event_submitActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        new login().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void subjectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subjectActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_subjectActionPerformed

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
            java.util.logging.Logger.getLogger(registration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(registration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(registration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(registration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new registration().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel l_name;
    private javax.swing.JLabel l_pass;
    private javax.swing.JLabel l_sem;
    private javax.swing.JLabel l_subject;
    private javax.swing.JLabel l_year;
    private javax.swing.JTextField name;
    private javax.swing.JPasswordField password;
    private javax.swing.JTextField sem;
    private javax.swing.JTextField subject;
    private javax.swing.JButton submit;
    private javax.swing.JTextField yr;
    // End of variables declaration//GEN-END:variables
}
