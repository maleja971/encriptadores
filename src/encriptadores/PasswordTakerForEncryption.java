package encriptadores;

import core.EncryptorAndDecryptor;
import java.awt.Toolkit;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.File;
import java.util.Arrays;
import javax.swing.JFrame;
import javax.swing.JOptionPane;


public class PasswordTakerForEncryption extends javax.swing.JFrame
{
    private File[] listOfFilesAndFolders;
    public PasswordTakerForEncryption(File[] listOfFilesAndFolders)
    {
        this.listOfFilesAndFolders = listOfFilesAndFolders;
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try
        {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels())
            {
                if ("Nimbus".equals(info.getName()))
                {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex)
        {
            java.util.logging.Logger.getLogger(ToBeEncryptedOrDecrypted.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(ToBeEncryptedOrDecrypted.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(ToBeEncryptedOrDecrypted.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(ToBeEncryptedOrDecrypted.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        /* Create and display the form */
        initComponents();
        setResizable(false);
        eightCharInstructionLabel.setVisible(false);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        getRootPane().setDefaultButton(proceedButton);
        
        addWindowListener( new WindowAdapter()
        {
            public void windowClosing(WindowEvent e)
            {
                JFrame frame = (JFrame)e.getSource();
                Toolkit.getDefaultToolkit().beep();
                int result = JOptionPane.showConfirmDialog(frame, "Are you sure you want to exit the application?", "Exit Application", JOptionPane.YES_NO_OPTION);

                if (result == JOptionPane.YES_OPTION)
                    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            }
        });
    }
    
    boolean verifyPasswords()
    {
        char password1[]=passwordField1.getPassword();
        char password2[]=passwordField2.getPassword();
        if(password1.length<8)
        {
            eightCharInstructionLabel.setText("For security reasons you must enter password of atleast 8 characters");
            eightCharInstructionLabel.setVisible(true);
            return false;
        }
        if(password1.length>7)
        {
            eightCharInstructionLabel.setVisible(false);
            if(password1.length==password2.length)
            {
                eightCharInstructionLabel.setVisible(false);
                if(Arrays.equals(password1, password2))
                {
                    return true;
                }

            }
            eightCharInstructionLabel.setText("Both the passwords differ!");
            eightCharInstructionLabel.setVisible(true);
        }
        
        return false;
        
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
        suggestionLabel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        passwordField1 = new javax.swing.JPasswordField();
        jLabel2 = new javax.swing.JLabel();
        passwordField2 = new javax.swing.JPasswordField();
        eightCharInstructionLabel = new javax.swing.JLabel();
        proceedButton = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(4, 36, 52));

        suggestionLabel.setFont(new java.awt.Font("Source Code Pro Semibold", 1, 16)); // NOI18N
        suggestionLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        suggestionLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/logo1-removebg-preview.png"))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText(" Ingrese una contraseña:");

        passwordField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                passwordField1KeyReleased(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText(" Vuelva a ingresar la contraseña:");

        passwordField2.setToolTipText("");
        passwordField2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                passwordField2KeyReleased(evt);
            }
        });

        eightCharInstructionLabel.setForeground(new java.awt.Color(255, 0, 0));
        eightCharInstructionLabel.setText(" Por razones de seguridad, debe ingresar la contraseña de al menos 8 caracteres");
        eightCharInstructionLabel.setFocusable(false);

        proceedButton.setBackground(new java.awt.Color(0, 0, 0));
        proceedButton.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        proceedButton.setText("Encriptar");
        proceedButton.setEnabled(false);
        proceedButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                proceedButtonActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("El software NO almacena sus contraseñas");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(170, 170, 170)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(passwordField2, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(passwordField1, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(114, 114, 114)
                        .addComponent(suggestionLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 427, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(129, 129, 129)
                        .addComponent(eightCharInstructionLabel))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(248, 248, 248)
                        .addComponent(proceedButton, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(178, 178, 178)
                        .addComponent(jLabel3)))
                .addContainerGap(123, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(suggestionLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 136, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(passwordField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(passwordField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(eightCharInstructionLabel)
                .addGap(18, 18, 18)
                .addComponent(proceedButton, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addComponent(jLabel3)
                .addGap(29, 29, 29))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void passwordField2KeyReleased(java.awt.event.KeyEvent evt)//GEN-FIRST:event_passwordField2KeyReleased
    {//GEN-HEADEREND:event_passwordField2KeyReleased
        if(verifyPasswords())
        {
            proceedButton.setEnabled(true);
        }
        else
        {
            proceedButton.setEnabled(false);
        }
    }//GEN-LAST:event_passwordField2KeyReleased

    private void passwordField1KeyReleased(java.awt.event.KeyEvent evt)//GEN-FIRST:event_passwordField1KeyReleased
    {//GEN-HEADEREND:event_passwordField1KeyReleased
        if(verifyPasswords())
        {
            proceedButton.setEnabled(true);
        }
        else
        {
            proceedButton.setEnabled(false);
        }
    }//GEN-LAST:event_passwordField1KeyReleased

    private void proceedButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_proceedButtonActionPerformed
    {//GEN-HEADEREND:event_proceedButtonActionPerformed
        setVisible(false);
        dispose();
        
        new EncryptorAndDecryptor(listOfFilesAndFolders, "encrypt", new String(passwordField1.getPassword())).execute();
        
    }//GEN-LAST:event_proceedButtonActionPerformed

    /**
     * @param args the command line arguments
     */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel eightCharInstructionLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField passwordField1;
    private javax.swing.JPasswordField passwordField2;
    private javax.swing.JButton proceedButton;
    private javax.swing.JLabel suggestionLabel;
    // End of variables declaration//GEN-END:variables
}
