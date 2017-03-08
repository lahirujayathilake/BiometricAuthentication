package biometricauthentication;

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.text.DecimalFormat;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JComponent;
import javax.swing.JOptionPane;
import javax.swing.border.LineBorder;

/**
 *
 * @author Lahiru
 */
public class AuthenticationUi extends javax.swing.JFrame {

    JComponent[] coms = new JComponent[10];
    public AuthenticationUi() {
        initComponents();
        fileSelect.setVisible(false);

        Color[] colors = {Color.BLACK, Color.BLUE, Color.CYAN, Color.DARK_GRAY, Color.GREEN,
            Color.MAGENTA, Color.ORANGE, Color.PINK, Color.RED, Color.YELLOW};

        for (int i = 0; i < 10; i++) {
            JComponent com = new DraggableComponent();
            com.setBorder(new LineBorder(Color.white));
            com.setSize(20, 20);
            com.setBackground(colors[i]);
            com.setLocation(i + 20 * i, 0);
            coms[i] = com;
            this.add(com, 10);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fileSelect = new javax.swing.JFileChooser();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        TbtnSelectImage = new javax.swing.JToggleButton();
        lblHand = new javax.swing.JLabel();
        BtnInsert = new javax.swing.JButton();
        BtnValidate = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(900, 600));
        getContentPane().setLayout(null);

        fileSelect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fileSelectActionPerformed(evt);
            }
        });
        getContentPane().add(fileSelect);
        fileSelect.setBounds(470, 40, 470, 360);

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("L1");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 22, 20, 16);

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("L2");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(20, 22, 20, 16);

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("R1");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(44, 22, 20, 16);

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("R2");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(64, 22, 20, 16);

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("M1");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(84, 22, 20, 16);

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("M2");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(106, 22, 20, 16);

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("I1");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(126, 22, 20, 16);

        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("I2");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(146, 22, 20, 16);

        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("T1");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(169, 22, 20, 16);
        getContentPane().add(jSeparator1);
        jSeparator1.setBounds(20, 40, 900, 12);

        jSeparator2.setForeground(new java.awt.Color(102, 102, 102));
        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);
        getContentPane().add(jSeparator2);
        jSeparator2.setBounds(470, 60, 10, 520);

        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("T2");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(189, 22, 20, 16);

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/hand.png"))); // NOI18N
        getContentPane().add(jLabel12);
        jLabel12.setBounds(510, 60, 408, 513);

        TbtnSelectImage.setText("Select Image");
        TbtnSelectImage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TbtnSelectImageActionPerformed(evt);
            }
        });
        getContentPane().add(TbtnSelectImage);
        TbtnSelectImage.setBounds(520, 10, 123, 29);

        lblHand.setMaximumSize(new java.awt.Dimension(408, 513));
        lblHand.setMinimumSize(new java.awt.Dimension(408, 513));
        lblHand.setPreferredSize(new java.awt.Dimension(408, 513));
        getContentPane().add(lblHand);
        lblHand.setBounds(20, 60, 410, 500);

        BtnInsert.setText("Insert");
        BtnInsert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnInsertActionPerformed(evt);
            }
        });
        getContentPane().add(BtnInsert);
        BtnInsert.setBounds(280, 10, 80, 29);

        BtnValidate.setText("Validate");
        BtnValidate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnValidateActionPerformed(evt);
            }
        });
        getContentPane().add(BtnValidate);
        BtnValidate.setBounds(380, 10, 94, 29);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TbtnSelectImageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TbtnSelectImageActionPerformed
        if (TbtnSelectImage.isSelected() == true) {
            fileSelect.setVisible(true);
        } else {
            fileSelect.setVisible(false);
        }
    }//GEN-LAST:event_TbtnSelectImageActionPerformed

    private void fileSelectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fileSelectActionPerformed

        File file = fileSelect.getSelectedFile();
        if (file != null) {

            try {
                BufferedImage image = ImageIO.read(file);
                BufferedImage resizedImage = ResizeImage.resize(image, 408, 513);
                lblHand.setIcon(new ImageIcon(resizedImage));
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }//GEN-LAST:event_fileSelectActionPerformed

    private void BtnInsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnInsertActionPerformed
        Hand hand = getHand();
        if (hand == null) return;
        boolean b = new HandHandler().insertHand(hand);
        if(b) JOptionPane.showMessageDialog(this, "Insertion Succesfull!","Succesfull", 
                JOptionPane.INFORMATION_MESSAGE);
        else JOptionPane.showMessageDialog(this, "Error when inserting the hand","Error",
                JOptionPane.ERROR_MESSAGE);

    }//GEN-LAST:event_BtnInsertActionPerformed

    private void BtnValidateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnValidateActionPerformed
        Hand hand = getHand();
        if (hand == null) return;
        boolean b = SecurityHandler.checkForMatch(hand);
        if(b){
            JOptionPane.showMessageDialog(this, "Permission Granted", "Succesfull",
                    JOptionPane.INFORMATION_MESSAGE);
        }else{
            JOptionPane.showMessageDialog(this, "No matched hand is found!","Invalid",
                    JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_BtnValidateActionPerformed

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
            java.util.logging.Logger.getLogger(AuthenticationUi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AuthenticationUi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AuthenticationUi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AuthenticationUi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AuthenticationUi().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnInsert;
    private javax.swing.JButton BtnValidate;
    private javax.swing.JToggleButton TbtnSelectImage;
    private javax.swing.JFileChooser fileSelect;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lblHand;
    // End of variables declaration//GEN-END:variables

    private Hand getHand(){
        double[] fingerlen =  new double[5];
        DecimalFormat numberFormat = new DecimalFormat("#.00");
        for(int i = 0 ; i < 5; i++){
            fingerlen[i] = Math.sqrt(Math.pow((coms[i].getX()-coms[i+1].getX()), 2) 
                + Math.pow((coms[i].getY()-coms[i+1].getY()), 2));
        }
        // if there is no finger measurement
        if(fingerlen[0] == 0) return null;
        
        // make the little finger to be unit 1 and the rest of the fingers to be
        // product of the little finger
        double lf = fingerlen[0];
        for(int i = 0; i<5 ; i++){
            fingerlen[i] = fingerlen[i]/lf;
            fingerlen[i] = Double.parseDouble(numberFormat.format(fingerlen[i]));
        }
        return new Hand(fingerlen[0], fingerlen[1], fingerlen[2], fingerlen[3], fingerlen[4]);
    }
}
