package ventanas;

import javax.swing.JOptionPane;
import clases.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.awt.HeadlessException;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class Ventana_Tres extends javax.swing.JFrame {

    public Ventana_Tres() {
        initComponents();
        Mostrar();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btn_registro = new javax.swing.JButton();
        btn_modificar = new javax.swing.JButton();
        btn_eliminar = new javax.swing.JButton();
        btn_limpiar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txt_titulo = new javax.swing.JTextField();
        txt_Genero = new javax.swing.JTextField();
        txt_Precio = new javax.swing.JTextField();
        txt_Cantidad = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txt_ID = new javax.swing.JTextField();
        btn_volver = new javax.swing.JButton();
        btn_Buscar = new javax.swing.JButton();
        txt_buscar = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        btn_PDF = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID", "Titulo", "Genero", "Precio", "Unidades"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 306, 552, 171));

        btn_registro.setText("Registrar");
        btn_registro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_registroActionPerformed(evt);
            }
        });
        getContentPane().add(btn_registro, new org.netbeans.lib.awtextra.AbsoluteConstraints(59, 256, -1, -1));

        btn_modificar.setText("Modificar");
        btn_modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_modificarActionPerformed(evt);
            }
        });
        getContentPane().add(btn_modificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(188, 256, -1, -1));

        btn_eliminar.setText("Eliminar");
        btn_eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_eliminarActionPerformed(evt);
            }
        });
        getContentPane().add(btn_eliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(327, 256, -1, -1));

        btn_limpiar.setText("Limpiar");
        btn_limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_limpiarActionPerformed(evt);
            }
        });
        getContentPane().add(btn_limpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(456, 256, -1, -1));

        jLabel1.setForeground(new java.awt.Color(242, 247, 229));
        jLabel1.setText("Titulo del libro");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 170, -1, -1));

        jLabel2.setForeground(new java.awt.Color(255, 250, 247));
        jLabel2.setText("Genero");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(101, 127, -1, -1));

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Precio x/u");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(85, 159, -1, -1));

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Cantidad L/u");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(72, 195, -1, -1));
        getContentPane().add(txt_titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(171, 83, 109, -1));
        getContentPane().add(txt_Genero, new org.netbeans.lib.awtextra.AbsoluteConstraints(171, 119, 109, -1));
        getContentPane().add(txt_Precio, new org.netbeans.lib.awtextra.AbsoluteConstraints(171, 155, 109, -1));
        getContentPane().add(txt_Cantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(171, 191, 109, -1));

        jLabel5.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Sistema de gestion de libros");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(171, 21, -1, -1));

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("ID");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 50, -1, -1));

        txt_ID.setEnabled(false);
        getContentPane().add(txt_ID, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 50, 110, -1));

        btn_volver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Arrow.png"))); // NOI18N
        btn_volver.setContentAreaFilled(false);
        btn_volver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_volverActionPerformed(evt);
            }
        });
        getContentPane().add(btn_volver, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 80, 50));

        btn_Buscar.setText("Buscar");
        btn_Buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_BuscarActionPerformed(evt);
            }
        });
        getContentPane().add(btn_Buscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 190, -1, -1));
        getContentPane().add(txt_buscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 200, 100, -1));

        jLabel8.setForeground(new java.awt.Color(242, 247, 229));
        jLabel8.setText("Titulo");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(111, 87, -1, -1));

        btn_PDF.setText("Generar PDF");
        btn_PDF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_PDFActionPerformed(evt);
            }
        });
        getContentPane().add(btn_PDF, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 110, -1, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/image_Background3.jpg"))); // NOI18N
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 570, 490));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_volverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_volverActionPerformed
        dispose();
        new Ventana_Dos().setVisible(true);
    }//GEN-LAST:event_btn_volverActionPerformed

    private void btn_registroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_registroActionPerformed
        String titulo = txt_titulo.getText();
        String genero = txt_Genero.getText();
        String precio = txt_Precio.getText();
        String cantidad = txt_Cantidad.getText();

        if (!titulo.equals("") && !genero.equals("") && !precio.equals("") && !cantidad.equals("")) {
            try {
                Connection cn = Conexion.conectar();
                PreparedStatement pst = cn.prepareStatement("insert into libros values(?,?,?,?,?)");
                pst.setString(1, "0");
                pst.setString(2, titulo);
                pst.setString(3, genero);
                pst.setString(4, precio);
                pst.setString(5, cantidad);
                pst.executeUpdate();
                JOptionPane.showMessageDialog(null, "Registro exitoso");
                txt_titulo.setText("");
                txt_Genero.setText("");
                txt_Precio.setText("");
                txt_Cantidad.setText("");
                Mostrar();
            } catch (Exception e) {
                System.out.println(e);
                JOptionPane.showMessageDialog(null, "Error, no se pudo establecer la conexion");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Verifique que todos los campos esten rellenos");
        }
    }//GEN-LAST:event_btn_registroActionPerformed

    private void btn_limpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_limpiarActionPerformed
        txt_ID.setText("");
        txt_titulo.setText("");
        txt_Genero.setText("");
        txt_Precio.setText("");
        txt_Cantidad.setText("");
        txt_buscar.setText("");
    }//GEN-LAST:event_btn_limpiarActionPerformed

    private void btn_modificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_modificarActionPerformed
        String ID = txt_ID.getText();
        String titulo = txt_titulo.getText();
        String genero = txt_Genero.getText();
        String precio = txt_Precio.getText();
        String cantidad = txt_Cantidad.getText();
        if (!titulo.equals("") && !genero.equals("") && !precio.equals("") && !cantidad.equals("")) {
            try {
                Connection cn = Conexion.conectar();
                PreparedStatement pst = cn.prepareStatement("update libros set Titulo = ?, Genero = ?, Precio = ?,Cantidad = ? Where ID = " + ID);
                pst.setString(1, titulo);
                pst.setString(2, genero);
                pst.setString(3, precio);
                pst.setString(4, cantidad);
                pst.executeUpdate();
                JOptionPane.showMessageDialog(null, "Modificacion exitosa");
                txt_titulo.setText("");
                txt_Genero.setText("");
                txt_Precio.setText("");
                txt_Cantidad.setText("");
                Mostrar();
            } catch (SQLException ex) {
                System.out.println(ex);
                JOptionPane.showMessageDialog(null, "Error al comunicarse con la base de datos");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Verifique que todos los campos esten rellenos");
        }
    }//GEN-LAST:event_btn_modificarActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        String tb1_ID = model.getValueAt(jTable1.getSelectedRow(), 0).toString();
        String tb1_Titulo = model.getValueAt(jTable1.getSelectedRow(), 1).toString();
        String tb1_Genero = model.getValueAt(jTable1.getSelectedRow(), 2).toString();
        String tb1_Precio = model.getValueAt(jTable1.getSelectedRow(), 3).toString();
        String tb1_Cantidad = model.getValueAt(jTable1.getSelectedRow(), 4).toString();

        txt_ID.setText(tb1_ID);
        txt_titulo.setText(tb1_Titulo);
        txt_Genero.setText(tb1_Genero);
        txt_Precio.setText(tb1_Precio);
        txt_Cantidad.setText(tb1_Cantidad);
    }//GEN-LAST:event_jTable1MouseClicked

    private void btn_eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_eliminarActionPerformed
        String ID = txt_ID.getText();
        String titulo = txt_titulo.getText();
        String genero = txt_Genero.getText();
        String precio = txt_Precio.getText();
        String cantidad = txt_Cantidad.getText();
        if (!titulo.equals("") && !genero.equals("") && !precio.equals("") && !cantidad.equals("")) {
            try {
                Connection cn = Conexion.conectar();
                PreparedStatement pst = cn.prepareStatement("Delete FROM libros Where ID = ?");
                pst.setString(1, ID);
                pst.execute();
                JOptionPane.showMessageDialog(null, "Producto Eliminado");
                txt_ID.setText("");
                txt_titulo.setText("");
                txt_Genero.setText("");
                txt_Precio.setText("");
                txt_Cantidad.setText("");
                Mostrar();
            } catch (Exception e) {
                System.out.println(e);
                JOptionPane.showMessageDialog(null, "Error al comunicarse con la base de datos");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Verifique que todos los campos esten rellenos");
        }
    }//GEN-LAST:event_btn_eliminarActionPerformed

    private void btn_BuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_BuscarActionPerformed
        String buscar = txt_buscar.getText();
        if (!buscar.equals("")) {
            try {
                Connection cn = Conexion.conectar();
                PreparedStatement pst = cn.prepareStatement("select * from libros where Titulo = ?");
                pst.setString(1, buscar);
                ResultSet rs = pst.executeQuery();
                if (rs.next()) {
                    txt_ID.setText(rs.getString("ID"));
                    txt_titulo.setText(rs.getString("Titulo"));
                    txt_Genero.setText(rs.getString("Genero"));
                    txt_Precio.setText(rs.getString("Precio"));
                    txt_Cantidad.setText(rs.getString("Cantidad"));
                } else {
                    JOptionPane.showMessageDialog(null, "El libro solicitado no esta en el inventario");
                }
            } catch (Exception e) {
                System.out.println(e);
                JOptionPane.showMessageDialog(null, "Error al comunicarse con la base de datos");
            }
        } else {
            JOptionPane.showMessageDialog(null, "El campo esta vacio");
        }
    }//GEN-LAST:event_btn_BuscarActionPerformed

    private void btn_PDFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_PDFActionPerformed
        Document documento = new Document();
        try {
            String ruta = System.getProperty("user.home");
            PdfWriter.getInstance(documento, new FileOutputStream(ruta + "/Desktop/Lista de libros.pdf"));
            documento.open();
            PdfPTable tabla = new PdfPTable(5);
            tabla.addCell("ID");
            tabla.addCell("Titulo");
            tabla.addCell("Genero");
            tabla.addCell("Precio");
            tabla.addCell("Cantidad");
            try {
                Connection cn = Conexion.conectar();
                PreparedStatement pst = cn.prepareStatement("select * from libros");
                ResultSet rs = pst.executeQuery();
                if (rs.next()) {
                    do {
                        tabla.addCell(rs.getString(1));
                        tabla.addCell(rs.getString(2));
                        tabla.addCell(rs.getString(3));
                        tabla.addCell(rs.getString(4));
                        tabla.addCell(rs.getString(5));
                    } while (rs.next());
                    documento.add(tabla);
                }
            } catch (DocumentException | SQLException e) {
                System.out.println(e);
                JOptionPane.showMessageDialog(null, "Error al comunicarse con la base de datos");
            }
            documento.close();
            JOptionPane.showMessageDialog(null, "Listado creado");
        } catch (DocumentException | HeadlessException | FileNotFoundException e) {
            System.out.println(e);
            JOptionPane.showMessageDialog(null, "Error al crear el pdf");
        }
    }//GEN-LAST:event_btn_PDFActionPerformed
    public void Mostrar() {
        try {
            DefaultTableModel model = new DefaultTableModel();
            Connection cn = Conexion.conectar();
            PreparedStatement pst = cn.prepareStatement(
                    "select ID, Titulo, Genero,Precio,Cantidad from libros");

            ResultSet rs = pst.executeQuery();

            jTable1.setModel(model);
            jScrollPane1.setViewportView(jTable1);

            model.addColumn("ID");
            model.addColumn("Titulo");
            model.addColumn("Genero");
            model.addColumn("Precio");
            model.addColumn("Unidades");

            while (rs.next()) {
                Object[] fila = new Object[5];

                for (int i = 0; i < 5; i++) {
                    fila[i] = rs.getObject(i + 1);

                }
                model.addRow(fila);
            }

            cn.close();

        } catch (SQLException e) {
            System.err.println("Error al llenar tabla." + e);
            JOptionPane.showMessageDialog(null, "Error al mostrar información, ¡Contacte al administrador!");
        }
    }

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
            java.util.logging.Logger.getLogger(Ventana_Tres.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventana_Tres.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventana_Tres.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventana_Tres.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana_Tres().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Buscar;
    private javax.swing.JButton btn_PDF;
    private javax.swing.JButton btn_eliminar;
    private javax.swing.JButton btn_limpiar;
    private javax.swing.JButton btn_modificar;
    private javax.swing.JButton btn_registro;
    private javax.swing.JButton btn_volver;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txt_Cantidad;
    private javax.swing.JTextField txt_Genero;
    private javax.swing.JTextField txt_ID;
    private javax.swing.JTextField txt_Precio;
    private javax.swing.JTextField txt_buscar;
    private javax.swing.JTextField txt_titulo;
    // End of variables declaration//GEN-END:variables
}
