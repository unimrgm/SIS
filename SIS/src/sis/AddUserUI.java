/*
 * Copyright (c) 2017, fahim
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 * * Redistributions of source code must retain the above copyright notice, this
 *   list of conditions and the following disclaimer.
 * * Redistributions in binary form must reproduce the above copyright notice,
 *   this list of conditions and the following disclaimer in the documentation
 *   and/or other materials provided with the distribution.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS"
 * AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE
 * IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE
 * ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT HOLDER OR CONTRIBUTORS BE
 * LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR
 * CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF
 * SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS
 * INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN
 * CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE)
 * ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE
 * POSSIBILITY OF SUCH DAMAGE.
 */
package sis;

import java.awt.Image;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author fahim
 */
public class AddUserUI extends javax.swing.JFrame {
    String PathPanel;
    private String path;

    /**
     * Creates new form AddUserUI
     */
    public AddUserUI() {
        initComponents();
        this.setSize(920, 640);
        this.setLocationRelativeTo(null);
        setResizable(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        HomeButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        IDfld = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        Name = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        Age = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        sex = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        blood = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        Mobile = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        Imgfld = new javax.swing.JLabel();
        browse = new javax.swing.JButton();
        Adduser = new javax.swing.JButton();
        pathpanel = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        HomeButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sis/home.png"))); // NOI18N
        HomeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HomeButtonActionPerformed(evt);
            }
        });
        getContentPane().add(HomeButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 10, 90, -1));

        jLabel2.setBackground(new java.awt.Color(51, 0, 51));
        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 255));
        jLabel2.setText("ID:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, 60, -1));
        getContentPane().add(IDfld, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 210, 110, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 0, 255));
        jLabel3.setText("Name: ");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 210, -1, 20));
        getContentPane().add(Name, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 210, 200, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 204, 51));
        jLabel4.setText("Age:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 210, 60, 20));
        getContentPane().add(Age, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 210, 130, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 0, 255));
        jLabel5.setText("Sex:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, -1, -1));

        sex.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "male", "female", "other" }));
        getContentPane().add(sex, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 290, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 0, 255));
        jLabel6.setText("Blood Group:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 290, -1, -1));

        blood.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "O +", "O -", "A +", "A -", "B +", "B -", "AB +", "AB -" }));
        getContentPane().add(blood, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 290, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 0, 255));
        jLabel7.setText("Mob. no:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 290, -1, -1));
        getContentPane().add(Mobile, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 290, 220, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(51, 0, 255));
        jLabel8.setText("Image:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 370, -1, -1));

        Imgfld.setText("            No Image");
        getContentPane().add(Imgfld, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 330, 150, 150));

        browse.setText("Browse");
        browse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                browseActionPerformed(evt);
            }
        });
        getContentPane().add(browse, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 370, -1, -1));

        Adduser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sis/addbut.png"))); // NOI18N
        Adduser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AdduserActionPerformed(evt);
            }
        });
        getContentPane().add(Adduser, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 370, 100, 100));
        getContentPane().add(pathpanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 370, 190, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sis/books.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, -10, 970, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void HomeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HomeButtonActionPerformed
        // TODO add your handling code here:
        DashBoard de=new DashBoard();
        de.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_HomeButtonActionPerformed

    private void browseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_browseActionPerformed
        // TODO add your handling code here:
        JFileChooser chose = new JFileChooser();
        String path;
         chose.setCurrentDirectory(new File(System.getProperty("user.home")));
         FileNameExtensionFilter filter = new FileNameExtensionFilter("*.IMAGE", "jpg","gif","png");
        chose.addChoosableFileFilter(filter);
        int result=chose.showSaveDialog(null);
        if(result==JFileChooser.APPROVE_OPTION){
            File selectedFile=chose.getSelectedFile();
            path=selectedFile.getAbsolutePath();
            ImageIcon img=new ImageIcon(path);
            Imgfld.setIcon(ResizeImage(path));
            pathpanel.setText(path);
            this.path=path;
        }
        else if(result == JFileChooser.CANCEL_OPTION){
             JOptionPane.showMessageDialog(pathpanel, "No data!");
         }
        
    }//GEN-LAST:event_browseActionPerformed

    private void AdduserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AdduserActionPerformed
        try {
            String FullName,Sex,Blood,Image,DataBaseName,Insertion;
            int ID,Age,Mobile;
            ID=Integer.parseInt(IDfld.getText());
            FullName=Name.getText();
            Sex=sex.getSelectedItem().toString();
            //JOptionPane.showMessageDialog(pathpanel, Sex);
            Age=Integer.parseInt(this.Age.getText());
            Blood=blood.getSelectedItem().toString();
            Mobile=Integer.parseInt(this.Mobile.getText());
            DataBaseName = ReadFilefromtext.readFile("DBNAME.txt");
            String select="select * from "+DataBaseName+".persons";
            Image=path;
            
            Insertion="INSERT INTO `persons` (`ID`, `FullName`, `Age`, `Sex`, `Blood`, `MobileNumber`,`Image`) VALUES (?,?,?,?,?,?,?); ";
           
            //String pic="INSERT INTO `persons` (`Image`) VALUES (?);";
            try {
                //Statement st=DBcon.connect(DataBaseName).createStatement();
                InputStream inputStream = new FileInputStream(new File(Image));
                File file = new File(path);
                PreparedStatement ps=DBcon.connect(DataBaseName).prepareStatement(Insertion);
                ps.setInt(1, ID);
                ps.setString(2, FullName);
                ps.setInt(3, Age);
                ps.setString(4, Sex);
                ps.setString(5, Blood);
                ps.setInt(6, Mobile);
                ps.setBinaryStream(7, inputStream, (int) file.length());
                ps.executeUpdate();
                
                
            } catch (Exception e) {
                JOptionPane.showMessageDialog(pathpanel,e);
            }
            
        } catch (IOException ex) {
            Logger.getLogger(AddUserUI.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }//GEN-LAST:event_AdduserActionPerformed

     public ImageIcon ResizeImage(String imgPath){
        ImageIcon MyImage = new ImageIcon(imgPath);
        Image img = MyImage.getImage();
        Image newImage = img.getScaledInstance(Imgfld.getWidth(), Imgfld.getHeight(),Image.SCALE_SMOOTH);
        ImageIcon image = new ImageIcon(newImage);
        return image;
    }
    /**
     * @param args the command line arguments
     * 
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
            java.util.logging.Logger.getLogger(AddUserUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddUserUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddUserUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddUserUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddUserUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Adduser;
    private javax.swing.JTextField Age;
    private javax.swing.JButton HomeButton;
    private javax.swing.JTextField IDfld;
    private javax.swing.JLabel Imgfld;
    private javax.swing.JTextField Mobile;
    private javax.swing.JTextField Name;
    private javax.swing.JComboBox<String> blood;
    private javax.swing.JButton browse;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField pathpanel;
    private javax.swing.JComboBox<String> sex;
    // End of variables declaration//GEN-END:variables
}
