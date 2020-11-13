
package encriptadores;


import java.awt.Toolkit;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JProgressBar;
import javax.swing.JTextArea;

/**
 *
 * @author Arlene
 */

public class EncryptorAndDecryptorProgress extends javax.swing.JFrame
{
    private String encryptOrDecrypt;
    private boolean completedTask;

    public void setCompletedTask(boolean completedTask)
    {
        this.completedTask = completedTask;
    }
    
    public EncryptorAndDecryptorProgress(String encryptOrDecrypt)
    {
        this.encryptOrDecrypt=encryptOrDecrypt;
        
        
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
            java.util.logging.Logger.getLogger(EncryptorAndDecryptorProgress.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(EncryptorAndDecryptorProgress.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(EncryptorAndDecryptorProgress.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(EncryptorAndDecryptorProgress.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        
        /* Create and display the form */
        
        initComponents();
        setResizable(false);
        progressOfFilesTextField.setEditable(false);
        oKButton.setVisible(false);
        setLocationRelativeTo(null);
        
        setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        addWindowListener( new WindowAdapter()
        {
            public void windowClosing(WindowEvent e)
            {
                JFrame frame = (JFrame)e.getSource();
                int result;
                if(completedTask)
                {
                    Toolkit.getDefaultToolkit().beep();
                    result = JOptionPane.showConfirmDialog(frame, "¿Seguro que quieres salir de la aplicación?", "Salir de la Aplicación", JOptionPane.YES_NO_OPTION);
                    if (result == JOptionPane.YES_OPTION)
                    {
                        
                        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                    }
                    
                }
                else if(encryptOrDecrypt.equals("encrypt"))
                {
                    Toolkit.getDefaultToolkit().beep();
                    result = JOptionPane.showConfirmDialog(frame, "El cifrado está en progreso. "+"¿Seguro que quieres salir de la aplicación?", "Salir de Aplicación", JOptionPane.YES_NO_OPTION);
                    if (result == JOptionPane.YES_OPTION)
                    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                }
                
                else if (encryptOrDecrypt.equals("decrypt"))
                {
                    Toolkit.getDefaultToolkit().beep();
                     result = JOptionPane.showConfirmDialog(frame, "El descifrado está en progreso. "+"¿Seguro que quieres salir de la aplicación?", "Salir de Aplicación", JOptionPane.YES_NO_OPTION);
                     if (result == JOptionPane.YES_OPTION)
                     frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                }
                
            }
        });
        if(encryptOrDecrypt.equalsIgnoreCase("encrypt"))
        {
            heading.setText("Encriptando:");
        }
        else if(encryptOrDecrypt.equalsIgnoreCase("decrypt"))
        {
            heading.setText("Desemcriptando:");
        }
        getRootPane().setDefaultButton(oKButton);
        this.setVisible(true);
        
        
    }

    public JButton getoKButton()
    {
        return oKButton;
    }

    public JProgressBar getProgressBar()
    {
        return progressBar;
    }

    public JTextArea getProgressOfFilesTextField()
    {
        return progressOfFilesTextField;
    }

    public JLabel getProgressPercentLabel()
    {
        return progressPercentLabel;
    }
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        heading = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        progressOfFilesTextField = new javax.swing.JTextArea();
        progressBar = new javax.swing.JProgressBar();
        oKButton = new javax.swing.JButton();
        progressPercentLabel = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(4, 36, 52));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        heading.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(heading, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 16, -1, -1));

        jPanel1.setBackground(new java.awt.Color(4, 36, 52));
        jPanel1.setLayout(null);

        progressOfFilesTextField.setColumns(20);
        progressOfFilesTextField.setRows(5);
        progressOfFilesTextField.setToolTipText("OK");
        jScrollPane1.setViewportView(progressOfFilesTextField);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(30, 140, 606, 223);
        jPanel1.add(progressBar);
        progressBar.setBounds(30, 370, 606, 26);

        oKButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        oKButton.setText("OK");
        oKButton.setToolTipText("OK");
        oKButton.setEnabled(false);
        oKButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                oKButtonActionPerformed(evt);
            }
        });
        jPanel1.add(oKButton);
        oKButton.setBounds(250, 420, 171, 31);

        progressPercentLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        progressPercentLabel.setForeground(new java.awt.Color(255, 255, 255));
        progressPercentLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        progressPercentLabel.setText("0%");
        jPanel1.add(progressPercentLabel);
        progressPercentLabel.setBounds(540, 400, 96, 17);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/encriptadores/miniLogo.png"))); // NOI18N
        jPanel1.add(jLabel2);
        jLabel2.setBounds(200, 0, 250, 120);

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 670, 480));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void oKButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_oKButtonActionPerformed
    {//GEN-HEADEREND:event_oKButtonActionPerformed
        new Main().setVisible(true);
        setVisible(false);
        dispose();
    }//GEN-LAST:event_oKButtonActionPerformed
    
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel heading;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton oKButton;
    private javax.swing.JProgressBar progressBar;
    private javax.swing.JTextArea progressOfFilesTextField;
    private javax.swing.JLabel progressPercentLabel;
    // End of variables declaration//GEN-END:variables

}
