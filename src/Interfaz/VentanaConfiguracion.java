package Interfaz;

import Dominio.Sistema;
import Dominio.Trabajo;
import javax.swing.JOptionPane;

public class VentanaConfiguracion extends javax.swing.JFrame {
    private Sistema modelo;
    
    public VentanaConfiguracion(Sistema unModelo) {
        modelo = unModelo;
        initComponents();
        suma.setText(""+modelo.getNumeroDeA());
        siguienteNumero.setText(""+modelo.getSiguienteNumero());
    }
    private boolean numeroBien(int numero){
        boolean si=true;    
            if (modelo.getSiguienteNumero()>numero){
                si = false;
            }
        return si;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        etiquetaNumeracion = new javax.swing.JLabel();
        siguienteNumero = new javax.swing.JTextField();
        etiquetaIncrementos = new javax.swing.JLabel();
        suma = new javax.swing.JTextField();
        modificar = new javax.swing.JButton();
        salir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Configuración");

        etiquetaNumeracion.setText("Número del siguiente trabajo:");

        siguienteNumero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                siguienteNumeroActionPerformed(evt);
            }
        });

        etiquetaIncrementos.setText("Suma de a:");

        modificar.setText("Aceptar");
        modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modificarActionPerformed(evt);
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
                .addGap(133, 133, 133)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(siguienteNumero, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(suma, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(modificar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 129, Short.MAX_VALUE))
                    .addComponent(etiquetaIncrementos, javax.swing.GroupLayout.DEFAULT_SIZE, 168, Short.MAX_VALUE)
                    .addComponent(etiquetaNumeracion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(99, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(salir, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(etiquetaNumeracion)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(siguienteNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(etiquetaIncrementos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(suma, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(modificar, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 62, Short.MAX_VALUE)
                .addComponent(salir)
                .addContainerGap())
        );

        setBounds(0, 0, 414, 337);
    }// </editor-fold>//GEN-END:initComponents

    private void salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_salirActionPerformed

    private void modificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificarActionPerformed
        // TODO add your handling code here:
        int suma1 = 0;
        int siguiente1 =0;
        try{
            suma1 = Integer.parseInt(suma.getText());
            try{
                siguiente1 = Integer.parseInt(siguienteNumero.getText());
                if (numeroBien(siguiente1)){
                    modelo.setNumeroDeA(suma1);
                    modelo.setSiguienteNumero(siguiente1);
                    modelo.guardarDatos();
                } else {
                    JOptionPane.showMessageDialog(this, "Número menor al requerido", "Error", JOptionPane.ERROR_MESSAGE);
                }
            } catch (NumberFormatException e){
                JOptionPane.showMessageDialog(this, "Error al ingresar el siguiente número", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } catch (NumberFormatException e){
            JOptionPane.showMessageDialog(this, "Error al ingresar Incremento de números", "Error", JOptionPane.ERROR_MESSAGE);
        }
        suma.setText(suma.getText());
        siguienteNumero.setText(siguienteNumero.getText());
    }//GEN-LAST:event_modificarActionPerformed

    private void siguienteNumeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_siguienteNumeroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_siguienteNumeroActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel etiquetaIncrementos;
    private javax.swing.JLabel etiquetaNumeracion;
    private javax.swing.JButton modificar;
    private javax.swing.JButton salir;
    private javax.swing.JTextField siguienteNumero;
    private javax.swing.JTextField suma;
    // End of variables declaration//GEN-END:variables
}
