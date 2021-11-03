package Interfaz;

import Dominio.Sistema;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

public class VentanaAltaMasivaTrabajo extends javax.swing.JFrame {
    private Sistema modelo;
    public VentanaAltaMasivaTrabajo(Sistema unModelo) {
        modelo = unModelo;
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        elegirArchivo = new javax.swing.JButton();
        salir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Alta masiva de trabajos");

        elegirArchivo.setText("Elegir archivo");
        elegirArchivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                elegirArchivoActionPerformed(evt);
            }
        });

        salir.setText("Salir");
        salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(132, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(salir, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(elegirArchivo, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(130, 130, 130))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(102, Short.MAX_VALUE)
                .addComponent(elegirArchivo, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(83, 83, 83)
                .addComponent(salir)
                .addContainerGap())
        );

        setBounds(0, 0, 402, 312);
    }// </editor-fold>//GEN-END:initComponents

    private void elegirArchivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_elegirArchivoActionPerformed
        // TODO add your handling code here:
        JFileChooser fileChooser = new JFileChooser();
        int seleccion = fileChooser.showOpenDialog(this);
        String path = "";
        if (seleccion == JFileChooser.APPROVE_OPTION){
            path = fileChooser.getSelectedFile().getAbsolutePath();
            String[] respuesta = modelo.leerArchivo(path);
            modelo.guardarDatos();
            if (respuesta[0]!=null && respuesta[1]!=null){
                JOptionPane.showMessageDialog(this, "Se dieron de alta los trabajos " + respuesta[0] + " a " + respuesta[1], "Alta Trabajos", JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }//GEN-LAST:event_elegirArchivoActionPerformed

    private void salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_salirActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton elegirArchivo;
    private javax.swing.JButton salir;
    // End of variables declaration//GEN-END:variables
}
