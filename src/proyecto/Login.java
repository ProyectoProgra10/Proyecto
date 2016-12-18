/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto;

/**
 *
 * @author Jorge A. Santos
 */
public class Login extends javax.swing.JFrame {
    
    
    /**
     * Creates new form Login
     */
    public Login() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        txtContra = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(0, -45));
        setMinimumSize(new java.awt.Dimension(216, 287));
        setUndecorated(true);
        setType(java.awt.Window.Type.POPUP);
        getContentPane().setLayout(null);

        jButton1.setBackground(new java.awt.Color(230, 217, 17));
        jButton1.setFont(new java.awt.Font("Tempus Sans ITC", 3, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 0, 51));
        jButton1.setText("Inicio");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(0, 240, 100, 30);

        jButton2.setBackground(new java.awt.Color(230, 217, 17));
        jButton2.setFont(new java.awt.Font("Tempus Sans ITC", 3, 12)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 0, 51));
        jButton2.setText("Next");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(110, 240, 90, 30);

        jLabel2.setFont(new java.awt.Font("Tempus Sans ITC", 3, 13)); // NOI18N
        jLabel2.setText("Usuario: ");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(10, 140, 60, 17);

        jLabel3.setFont(new java.awt.Font("Tempus Sans ITC", 3, 13)); // NOI18N
        jLabel3.setText("Contraseña: ");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(0, 190, 80, 18);

        txtUsuario.setFont(new java.awt.Font("Tempus Sans ITC", 1, 12)); // NOI18N
        txtUsuario.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(txtUsuario);
        txtUsuario.setBounds(80, 140, 130, 30);

        txtContra.setFont(new java.awt.Font("Tempus Sans ITC", 1, 12)); // NOI18N
        txtContra.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(txtContra);
        txtContra.setBounds(80, 190, 130, 30);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/1.1.1.png"))); // NOI18N
        getContentPane().add(jLabel4);
        jLabel4.setBounds(60, 30, 80, 80);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/1.3.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 225, 295);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        new MenuInicial().setVisible(true);
        
          //m.btnLogin.setVisible(true);
          //m.btnCrear.setVisible(true);
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        Player py = new Player();
        String us = txtUsuario.getText();
        String ps = txtContra.getText();
        if(py.look(us, ps)){
            new MenuPrincipal().setVisible(true);
            new MenuInicial().setVisible(false);
            this.dispose();
        }
        
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPasswordField txtContra;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
