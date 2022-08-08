/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ventanas;


public class Ventana_Dos extends javax.swing.JFrame {

    
    public Ventana_Dos() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btn_Consulta = new javax.swing.JButton();
        btn_AddUser = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_Consulta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/image_LibrarySystem.png"))); // NOI18N
        btn_Consulta.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btn_Consulta.setContentAreaFilled(false);
        btn_Consulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ConsultaActionPerformed(evt);
            }
        });
        getContentPane().add(btn_Consulta, new org.netbeans.lib.awtextra.AbsoluteConstraints(93, 86, 138, 112));

        btn_AddUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/image_AddUser.png"))); // NOI18N
        btn_AddUser.setContentAreaFilled(false);
        btn_AddUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_AddUserActionPerformed(evt);
            }
        });
        getContentPane().add(btn_AddUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(411, 86, 134, -1));

        jLabel1.setFont(new java.awt.Font("Algerian", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Bibloteca de Alejandria");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(192, 34, -1, -1));

        jLabel2.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Consulta/Registro");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(108, 204, -1, -1));

        jLabel3.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Agregar usuario");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(429, 204, -1, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/image_Background2.jpg"))); // NOI18N
        jLabel5.setText("jLabel5");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 640, 290));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_ConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ConsultaActionPerformed
        dispose();
        new Ventana_Tres().setVisible(true);
    }//GEN-LAST:event_btn_ConsultaActionPerformed

    private void btn_AddUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_AddUserActionPerformed
        dispose();
        new Ventana_Cuatro().setVisible(true);
    }//GEN-LAST:event_btn_AddUserActionPerformed

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
            java.util.logging.Logger.getLogger(Ventana_Dos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventana_Dos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventana_Dos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventana_Dos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana_Dos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_AddUser;
    private javax.swing.JButton btn_Consulta;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    // End of variables declaration//GEN-END:variables
}
