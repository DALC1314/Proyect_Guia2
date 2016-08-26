package SistemaDeInventarios;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Consultar extends javax.swing.JFrame {

    private JFrame ventanaPadre;
    private File fichero; // Archivo con el que vamos a trabajar

    /**
     * Creates new form Consultar
     */
    public Consultar(JFrame jF, File fich) {
        this.fichero = fich;
        this.ventanaPadre = jF;
        this.ventanaPadre.setVisible(false);
        initComponents();
        this.setVisible(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelTitulo = new javax.swing.JLabel();
        jLabelNombre = new javax.swing.JLabel();
        jTextFieldCodigo = new javax.swing.JTextField();
        jButtonLimpiar = new javax.swing.JButton();
        jLabelUsuario = new javax.swing.JLabel();
        jLabelContraseña = new javax.swing.JLabel();
        jTextFieldDescripcion = new javax.swing.JTextField();
        jTextFieldCantidad = new javax.swing.JTextField();
        jButtonAtras = new javax.swing.JButton();
        jButtonBuscar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Proyecto GUIA2 - Construccion de Software");
        setResizable(false);

        jLabelTitulo.setFont(new java.awt.Font("Arial Narrow", 0, 18)); // NOI18N
        jLabelTitulo.setText("Sistema de Inventario - > Consultar Item por Codigo");

        jLabelNombre.setFont(new java.awt.Font("Arial Narrow", 0, 14)); // NOI18N
        jLabelNombre.setText("Codigo:");
        jLabelNombre.setAlignmentX(0.5F);
        jLabelNombre.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);

        jTextFieldCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCodigoActionPerformed(evt);
            }
        });

        jButtonLimpiar.setFont(new java.awt.Font("Arial Narrow", 0, 14)); // NOI18N
        jButtonLimpiar.setText("Limpiar");
        jButtonLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLimpiarActionPerformed(evt);
            }
        });

        jLabelUsuario.setFont(new java.awt.Font("Arial Narrow", 0, 14)); // NOI18N
        jLabelUsuario.setText("Descripcion");

        jLabelContraseña.setFont(new java.awt.Font("Arial Narrow", 0, 14)); // NOI18N
        jLabelContraseña.setText("Cantidad");

        jTextFieldDescripcion.setEditable(false);
        jTextFieldDescripcion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldDescripcionActionPerformed(evt);
            }
        });

        jTextFieldCantidad.setEditable(false);
        jTextFieldCantidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCantidadActionPerformed(evt);
            }
        });

        jButtonAtras.setFont(new java.awt.Font("Arial Narrow", 0, 14)); // NOI18N
        jButtonAtras.setText("Atras");
        jButtonAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAtrasActionPerformed(evt);
            }
        });

        jButtonBuscar.setFont(new java.awt.Font("Arial Narrow", 0, 14)); // NOI18N
        jButtonBuscar.setText("Buscar");
        jButtonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBuscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButtonAtras)
                        .addGap(262, 262, 262)
                        .addComponent(jButtonLimpiar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelNombre, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabelUsuario, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabelContraseña, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jTextFieldCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextFieldCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextFieldDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 1, Short.MAX_VALUE)))
                        .addComponent(jButtonBuscar)))
                .addGap(44, 44, 44))
            .addGroup(layout.createSequentialGroup()
                .addGap(77, 77, 77)
                .addComponent(jLabelTitulo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabelTitulo)
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNombre)
                    .addComponent(jTextFieldCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonBuscar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelUsuario))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelContraseña))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 77, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonLimpiar)
                    .addComponent(jButtonAtras))
                .addContainerGap())
        );

        setSize(new java.awt.Dimension(528, 334));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLimpiarActionPerformed
        jTextFieldCodigo.setText("");
        jTextFieldDescripcion.setText("");
        jTextFieldCantidad.setText("");
    }//GEN-LAST:event_jButtonLimpiarActionPerformed

    private void jButtonAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAtrasActionPerformed
        this.setVisible(false);
        ventanaPadre.setVisible(true);
    }//GEN-LAST:event_jButtonAtrasActionPerformed

    private void jButtonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBuscarActionPerformed

        String espacios = " "; 
        String[] pedazos; 
        String nombre; 
        String nombrePedazo; 
        Boolean encontrado = false; 

        jTextFieldDescripcion.setText("");
        jTextFieldCantidad.setText("");

        if (jTextFieldCodigo.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Te falta agregar el nombre", "Error", JOptionPane.INFORMATION_MESSAGE);
        } else {
            try {
                BufferedReader reader = new BufferedReader(new FileReader(fichero));  //Abrirarchivo
                String linea = reader.readLine(); //leer primera linea

                if (linea == null) {
                    JOptionPane.showMessageDialog(this, "El archivo está vacio", "Archivo vacío", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    do {
                        pedazos = linea.split(espacios, 3); //Se divide la linea leida 

                        nombre = jTextFieldCodigo.getText().toUpperCase();
                        nombrePedazo = pedazos[0].toUpperCase();
                        if (nombrePedazo.equals(nombre)) {
                            encontrado = true;
                            jTextFieldDescripcion.setText(pedazos[1]);
                            jTextFieldCantidad.setText(pedazos[2]);
                        }
                        linea = reader.readLine(); //leemos la siguiente línea
                    } while (linea != null);
                    if (!encontrado) {
                        JOptionPane.showMessageDialog(this, "No hay coincidencia", "No encontrado", JOptionPane.INFORMATION_MESSAGE);
                    }
                }
                reader.close(); //cerramos el fichero
            } catch (IOException ex) {
                Logger.getLogger(Consultar.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_jButtonBuscarActionPerformed

    private void jTextFieldCantidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCantidadActionPerformed
    }//GEN-LAST:event_jTextFieldCantidadActionPerformed

    private void jTextFieldDescripcionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldDescripcionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldDescripcionActionPerformed

    private void jTextFieldCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldCodigoActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAtras;
    private javax.swing.JButton jButtonBuscar;
    private javax.swing.JButton jButtonLimpiar;
    private javax.swing.JLabel jLabelContraseña;
    private javax.swing.JLabel jLabelNombre;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JLabel jLabelUsuario;
    private javax.swing.JTextField jTextFieldCantidad;
    private javax.swing.JTextField jTextFieldCodigo;
    private javax.swing.JTextField jTextFieldDescripcion;
    // End of variables declaration//GEN-END:variables
}
