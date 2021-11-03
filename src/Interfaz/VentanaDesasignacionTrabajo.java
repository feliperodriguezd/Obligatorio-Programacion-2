package Interfaz;

import Dominio.Cliente;
import Dominio.Sistema;
import Dominio.Trabajo;
import Dominio.Vendedor;
import javax.swing.JOptionPane;

public class VentanaDesasignacionTrabajo extends javax.swing.JFrame {
    private Sistema modelo;
    public VentanaDesasignacionTrabajo(Sistema unModelo) {
        modelo = unModelo;
        initComponents();
        listaTrabajos.setListData(modelo.obtenerTrabajosAsignados());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        listaTrabajos = new javax.swing.JList();
        eliminar = new javax.swing.JButton();
        etiquetaTrabajosAsignados = new javax.swing.JLabel();
        salir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Desasignación de trabajo");
        getContentPane().setLayout(null);

        jScrollPane1.setViewportView(listaTrabajos);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(10, 30, 151, 281);

        eliminar.setText("Eliminar");
        eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarActionPerformed(evt);
            }
        });
        getContentPane().add(eliminar);
        eliminar.setBounds(190, 140, 110, 40);

        etiquetaTrabajosAsignados.setText("Trabajos asignados:");
        getContentPane().add(etiquetaTrabajosAsignados);
        etiquetaTrabajosAsignados.setBounds(10, 10, 150, 20);

        salir.setText("Salir");
        salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirActionPerformed(evt);
            }
        });
        getContentPane().add(salir);
        salir.setBounds(223, 290, 100, 23);

        setBounds(0, 0, 346, 359);
    }// </editor-fold>//GEN-END:initComponents

    private void salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_salirActionPerformed

    private void eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarActionPerformed
        // TODO add your handling code here:
        if (listaTrabajos.getSelectedValue()!=null){
            Trabajo t = (Trabajo) listaTrabajos.getSelectedValue();
            Cliente c = null;
            Vendedor v = null;
            for (int i=0; i<modelo.getListaClientes().size();i++){
                if (modelo.getListaClientes().get(i) == t.getCliente()){
                    c = modelo.getListaClientes().get(i);
                }
            }
            for (int i=0; i<modelo.getListaVendedores().size();i++){
                if (modelo.getListaVendedores().get(i) == t.getVendedor()){
                    v = modelo.getListaVendedores().get(i);
                }
            }
            int confirmacion = JOptionPane.showConfirmDialog(this,"¿Desasignar trabajo? \n" + 
                                                                  "Cliente: " + c.getNombre() + ", " + c.getCedula() + ", " + c.getDireccion() + ", " + c.getCodigoPostal() + ", " + c.getDepartamento() + ", " + c.getMonto() + "\n" +
                                                                  "Vendedor: " + v.getNombre() + ", " + v.getCedula() + ", " + v.getDireccion() + ", " + v.getCelular() + ", " + v.getAño() + "\n" +
                                                                  "Costo del trabajo: " + t.getCosto() + "\n" +
                                                                  "Fecha: " + t.getDia() + "\n" + 
                                                                  "Cantidad de horas: " + t.getMaquinas().size(), "Confirmación",JOptionPane.YES_NO_OPTION);
            if (confirmacion==0){
                t.guardarEnTxt();
                modelo.desasignar(t);
                modelo.guardarDatos();
            }
        } else {
            JOptionPane.showMessageDialog(this, "Trabajo no seleccionado", "Error", JOptionPane.ERROR_MESSAGE);
        }
        listaTrabajos.setListData(modelo.obtenerTrabajosAsignados());
    }//GEN-LAST:event_eliminarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton eliminar;
    private javax.swing.JLabel etiquetaTrabajosAsignados;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList listaTrabajos;
    private javax.swing.JButton salir;
    // End of variables declaration//GEN-END:variables
}
