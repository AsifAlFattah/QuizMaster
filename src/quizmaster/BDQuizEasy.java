/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package quizmaster;

import java.awt.Color;
import java.awt.Component;
import java.io.File;
import java.io.IOException;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.ButtonGroup;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.UIManager;
import javax.swing.text.html.HTML;
/**
 *
 * @author asif
 */
public class BDQuizEasy extends javax.swing.JFrame {

    /**
     * Creates new form BDQuizEasy
     */
        //Createing Button Group
    ButtonGroup bg = new ButtonGroup();
    
    //Questions
    String[] QuesOfBDEasy = {"When did Bangladesh gain its independence from Pakistan?","What was the duration of the Bangladesh Liberation War?","Who was the first Prime Minister of Bangladesh?","What is the national anthem of Bangladesh?","What is the capital city of Bangladesh?","What is the official language of Bangladesh?","What is the currency of Bangladesh?","What is the national flower of Bangladesh?","Which sport is the most popular in Bangladesh?","Which is the largest mangrove forest in the world, located in Bangladesh?"};
    
    //Options
    String[][] options = { 
{"25th March 1971","26th March 1971","27th March 1971","28th March 1971","26th March 1971"},
{"9 months","1 year","2 year","3 year","9 months"},
{"Sheikh Hasina","Sheikh Mujibur Rahman","Khaleda Zia","Tajuddin Ahmad","Tajuddin Ahmad"},
{"Amar Sonar Bangla","Jana Gana Mana","Vande Mataram","Qaumi Taranah","Amar Sonar Bangla"},
{"Dhaka","Chittagong","Rajshahi","Khulna","Dhaka"},
{"Bengali","English","Hindi","Urdu","Bengali"},
{"Taka"," Rupee","Dollar","Yen","Taka"},
{"Water Lily","Lotus","Rose","Sunflower","Water Lily"},
{"Cricket","Footbal","Kabaddi","Hockey","Cricket"},
{"Sundarbans","Bhitarkanika Mangroves","Everglades","Borneo Rainforest","Sundarbans"} };


    int index = 0;
    int score = 0;
    int qNo = 1;
    
    public BDQuizEasy() {
        initComponents();
        
        //Adding Radio Buttons to ButtonGroup
        bg.add(jRadioButtonOpt1);
        bg.add(jRadioButtonOpt2);
        bg.add(jRadioButtonOpt3);
        bg.add(jRadioButtonOpt4);
        
        jButtonNextActionPerformed(null);
    }

    //Get selected item
    public void getSelectedOpt(JRadioButton rbtn){
        
        
        //Check Answer
        if(index<10){
        
            if(rbtn.getText().equals(options[index-1][4])){
                score++;
            }
        }
        System.out.println(score);
        rbtn.setForeground(Color.green);
        //index++;
        enableRButtons(false);
    }
    //Enable and Disable buttons
    public void enableRButtons(boolean y_or_n){
    
        jRadioButtonOpt1.setEnabled(y_or_n);
        jRadioButtonOpt2.setEnabled(y_or_n);
        jRadioButtonOpt3.setEnabled(y_or_n);
        jRadioButtonOpt4.setEnabled(y_or_n);
        
        
    
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelQuestion = new javax.swing.JLabel();
        jRadioButtonOpt1 = new javax.swing.JRadioButton();
        jRadioButtonOpt2 = new javax.swing.JRadioButton();
        jRadioButtonOpt3 = new javax.swing.JRadioButton();
        jRadioButtonOpt4 = new javax.swing.JRadioButton();
        jButtonBackToHome = new javax.swing.JButton();
        jButtonNext = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelQuestion.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabelQuestion.setForeground(new java.awt.Color(255, 255, 255));
        jLabelQuestion.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabelQuestion.setText("Question?");
        getContentPane().add(jLabelQuestion, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 740, 140));

        jRadioButtonOpt1.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jRadioButtonOpt1.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButtonOpt1.setText("jRadioButton1");
        jRadioButtonOpt1.setBorderPainted(true);
        jRadioButtonOpt1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jRadioButtonOpt1.setPreferredSize(new java.awt.Dimension(180, 30));
        jRadioButtonOpt1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonOpt1ActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioButtonOpt1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 180, 290, 40));

        jRadioButtonOpt2.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jRadioButtonOpt2.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButtonOpt2.setText("jRadioButton2");
        jRadioButtonOpt2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonOpt2ActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioButtonOpt2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 220, 290, 50));

        jRadioButtonOpt3.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jRadioButtonOpt3.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButtonOpt3.setText("jRadioButton3");
        jRadioButtonOpt3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonOpt3ActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioButtonOpt3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 280, 290, 30));

        jRadioButtonOpt4.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jRadioButtonOpt4.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButtonOpt4.setText("jRadioButton4");
        jRadioButtonOpt4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonOpt4ActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioButtonOpt4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 330, 290, 30));

        jButtonBackToHome.setFont(new java.awt.Font("Algerian", 1, 24)); // NOI18N
        jButtonBackToHome.setText("back  to  home");
        jButtonBackToHome.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonBackToHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBackToHomeActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonBackToHome, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 340, 220, 40));

        jButtonNext.setFont(new java.awt.Font("Algerian", 1, 24)); // NOI18N
        jButtonNext.setText("NEXT");
        jButtonNext.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNextActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonNext, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 400, 220, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/quizmaster/QuestionBG.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 500));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jRadioButtonOpt1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonOpt1ActionPerformed
        index++;
        getSelectedOpt(jRadioButtonOpt1);

        //Sound
        try {
            AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File("src\\quizmaster\\select.wav").getAbsoluteFile());
            Clip clip = AudioSystem.getClip();
            clip.open(audioInputStream);
            clip.start();
        } catch (IOException | LineUnavailableException | UnsupportedAudioFileException ex) {
            System.out.println("Error playing sound file: " + ex.getMessage());
        }

    }//GEN-LAST:event_jRadioButtonOpt1ActionPerformed

    private void jRadioButtonOpt2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonOpt2ActionPerformed
        index++;
        getSelectedOpt(jRadioButtonOpt2);

        //Sound
        try {
            AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File("src\\quizmaster\\select.wav").getAbsoluteFile());
            Clip clip = AudioSystem.getClip();
            clip.open(audioInputStream);
            clip.start();
        } catch (IOException | LineUnavailableException | UnsupportedAudioFileException ex) {
            System.out.println("Error playing sound file: " + ex.getMessage());
        }

    }//GEN-LAST:event_jRadioButtonOpt2ActionPerformed

    private void jRadioButtonOpt3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonOpt3ActionPerformed
        index++;
        getSelectedOpt(jRadioButtonOpt3);

        //Sound
        try {
            AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File("src\\quizmaster\\select.wav").getAbsoluteFile());
            Clip clip = AudioSystem.getClip();
            clip.open(audioInputStream);
            clip.start();
        } catch (IOException | LineUnavailableException | UnsupportedAudioFileException ex) {
            System.out.println("Error playing sound file: " + ex.getMessage());
        }

    }//GEN-LAST:event_jRadioButtonOpt3ActionPerformed

    private void jRadioButtonOpt4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonOpt4ActionPerformed
        index++;
        getSelectedOpt(jRadioButtonOpt4);

        //Sound
        try {
            AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File("src\\quizmaster\\select.wav").getAbsoluteFile());
            Clip clip = AudioSystem.getClip();
            clip.open(audioInputStream);
            clip.start();
        } catch (IOException | LineUnavailableException | UnsupportedAudioFileException ex) {
            System.out.println("Error playing sound file: " + ex.getMessage());
        }

    }//GEN-LAST:event_jRadioButtonOpt4ActionPerformed

    private void jButtonBackToHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBackToHomeActionPerformed

        dispose();
        HomePage home = new HomePage();
        home.setVisible(true);

        //Sound
        try {
            AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File("src\\quizmaster\\click.wav").getAbsoluteFile());
            Clip clip = AudioSystem.getClip();
            clip.open(audioInputStream);
            clip.start();
        } catch (IOException | LineUnavailableException | UnsupportedAudioFileException ex) {
            System.out.println("Error playing sound file: " + ex.getMessage());
        }

    }//GEN-LAST:event_jButtonBackToHomeActionPerformed

    private void jButtonNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNextActionPerformed
        if(index==10){
            jButtonNext.setText("Your Score");
        }
        if(jButtonNext.getText().equals("Your Score")){

            jLabelQuestion.setHorizontalAlignment(JLabel.CENTER);
            jLabelQuestion.setText("Your Score: \n" +score);

            jButtonNext.setText("Back to Home");

            jRadioButtonOpt1.setVisible(false);
            jRadioButtonOpt2.setVisible(false);
            jRadioButtonOpt3.setVisible(false);
            jRadioButtonOpt4.setVisible(false);
        }

        if(jButtonNext.getText().equals("Back to Home")){
            jButtonNext.setVisible(false);
            jButtonBackToHome.setVisible(true);
        }else{
            jButtonBackToHome.setVisible(false);
        }

        if(index==QuesOfBDEasy.length){
            enableRButtons(false);

        }
        else{

            try{

                //Enable Radio Buttons
                enableRButtons(true);

                //Set Questions and Options
                jLabelQuestion.setText("<HTML>" + qNo + ". " + QuesOfBDEasy[index] + "<HTML>");

                jLabelQuestion.setOpaque(false);
                jLabelQuestion.setFocusable(false);

                jRadioButtonOpt1.setText(options[index][0]);
                jRadioButtonOpt2.setText(options[index][1]);
                jRadioButtonOpt3.setText(options[index][2]);
                jRadioButtonOpt4.setText(options[index][3]);

                //Increase the index

                qNo++;
            }catch(Exception e){

                System.out.println(e);
            }

        }
        //Clear the Radio Button Selection
        bg.clearSelection();

        jRadioButtonOpt1.setForeground(Color.white);
        jRadioButtonOpt2.setForeground(Color.white);
        jRadioButtonOpt3.setForeground(Color.white);
        jRadioButtonOpt4.setForeground(Color.white);

        //Sound
        if(index>0){

            try {
                AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File("src\\quizmaster\\click.wav").getAbsoluteFile());
                Clip clip = AudioSystem.getClip();
                clip.open(audioInputStream);
                clip.start();
            } catch (IOException | LineUnavailableException | UnsupportedAudioFileException ex) {
                System.out.println("Error playing sound file: " + ex.getMessage());
            }

        }
    }//GEN-LAST:event_jButtonNextActionPerformed

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
            java.util.logging.Logger.getLogger(BDQuizEasy.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BDQuizEasy.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BDQuizEasy.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BDQuizEasy.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BDQuizEasy().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonBackToHome;
    private javax.swing.JButton jButtonNext;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelQuestion;
    private javax.swing.JRadioButton jRadioButtonOpt1;
    private javax.swing.JRadioButton jRadioButtonOpt2;
    private javax.swing.JRadioButton jRadioButtonOpt3;
    private javax.swing.JRadioButton jRadioButtonOpt4;
    // End of variables declaration//GEN-END:variables
}
