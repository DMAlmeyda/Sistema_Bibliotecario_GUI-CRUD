
package ventanas;

import clases.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
public class Ventana_Cuatro extends javax.swing.JFrame {

   
    public Ventana_Cuatro() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txt_user = new javax.swing.JTextField();
        txt_password = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btn_Agregar = new javax.swing.JButton();
        btn_Volver = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(txt_user, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 117, 83, -1));
        getContentPane().add(txt_password, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 178, 83, -1));

        jLabel1.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel1.setText("USUARIO");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 120, -1, -1));

        jLabel2.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel2.setText("CONTRASEÑA");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 180, -1, -1));

        jLabel3.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        jLabel3.setText("Agregar nuevo usuario");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(102, 27, -1, -1));

        btn_Agregar.setText("Agregar");
        btn_Agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_AgregarActionPerformed(evt);
            }
        });
        getContentPane().add(btn_Agregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 245, -1, -1));

        btn_Volver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Arrow.png"))); // NOI18N
        btn_Volver.setContentAreaFilled(false);
        btn_Volver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_VolverActionPerformed(evt);
            }
        });
        getContentPane().add(btn_Volver, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 80, 70));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/image_Background.jpeg"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 390, 350));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_VolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_VolverActionPerformed
        dispose();
        new Ventana_Dos().setVisible(true);
    }//GEN-LAST:event_btn_VolverActionPerformed

    private void btn_AgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_AgregarActionPerformed
        String user = txt_user.getText().trim();
        String pass = txt_password.getText().trim();
        if(!user.equals("") && !pass.equals("")){
            try{
                Connection cn = Conexion.conectar();
                PreparedStatement pst = cn.prepareStatement("insert into usuarios values(?,?,?)");
                pst.setString(1, "0");
                pst.setString(2, user);
                pst.setString(3, pass);
                pst.executeUpdate();
                
                txt_user.setText("");
                txt_password.setText("");
                JOptionPane.showMessageDialog(null, "Registro exitoso");
            }catch(Exception e){
                 System.out.println(e);
                 JOptionPane.showMessageDialog(null, "Error al comunicarse con el servidor");
            }
        }else{
            JOptionPane.showMessageDialog(null, "Verifique que ambos espacios esten rellenos");
        }
    }//GEN-LAST:event_btn_AgregarActionPerformed

   
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
            java.util.logging.Logger.getLogger(Ventana_Cuatro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventana_Cuatro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventana_Cuatro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventana_Cuatro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana_Cuatro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Agregar;
    private javax.swing.JButton btn_Volver;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField txt_password;
    private javax.swing.JTextField txt_user;
    // End of variables declaration//GEN-END:variables
}
