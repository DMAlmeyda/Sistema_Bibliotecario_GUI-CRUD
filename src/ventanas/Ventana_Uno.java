
package ventanas;
import clases.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Ventana_Uno extends javax.swing.JFrame {
    public static String user = "";
    public static String pass = "";
    public Ventana_Uno() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txt_User = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        pass_Con = new javax.swing.JPasswordField();
        btn_Inicio = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Algerian", 2, 24)); // NOI18N
        jLabel1.setText("Biblioteca de Alejandria");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 26, -1, -1));

        jLabel3.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        jLabel3.setText("USUARIO");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 215, 91, -1));
        getContentPane().add(txt_User, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 249, 136, -1));

        jLabel4.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        jLabel4.setText("CONTRASEÑA");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 291, 136, -1));
        getContentPane().add(pass_Con, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 331, 136, -1));

        btn_Inicio.setText("INICIAR");
        btn_Inicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_InicioActionPerformed(evt);
            }
        });
        getContentPane().add(btn_Inicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(111, 392, 84, 47));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/image_Login.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(118, 76, -1, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/image_Background.jpeg"))); // NOI18N
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 340, 490));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_InicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_InicioActionPerformed
          user = txt_User.getText().trim();
          pass = pass_Con.getText().trim();
          ResultSet rs = null;
        if(!user.equals("") && !pass.equals("")){
           
            try {
                Connection cn = Conexion.conectar();
                PreparedStatement pst = cn.prepareStatement("select Usuario, Pass from usuarios where Usuario ='"+user+"' and Pass='"+pass+"'");
                rs = pst.executeQuery();
                if(rs.next()){
                    System.out.println("LLEGA");
                    dispose();
                    new Ventana_Dos().setVisible(true);
                }else{
                    JOptionPane.showMessageDialog(null, "No se encuentra registrado");
                }
            } catch (SQLException e) {
                System.out.println(e);
                JOptionPane.showMessageDialog(null, "Error al comunicarse con el servidor");

            }
        }else{
             JOptionPane.showMessageDialog(null, "Verifique que todos los espacios esten rellenos");
        }
    }//GEN-LAST:event_btn_InicioActionPerformed

   
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
            java.util.logging.Logger.getLogger(Ventana_Uno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventana_Uno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventana_Uno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventana_Uno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana_Uno().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Inicio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPasswordField pass_Con;
    private javax.swing.JTextField txt_User;
    // End of variables declaration//GEN-END:variables
}
