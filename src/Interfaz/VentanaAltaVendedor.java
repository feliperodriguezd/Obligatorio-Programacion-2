package Interfaz;

import Dominio.Sistema;
import Dominio.Vendedor;
import javax.swing.JOptionPane;

public class VentanaAltaVendedor extends javax.swing.JFrame {
    private Sistema modelo;
    public VentanaAltaVendedor(Sistema unModelo) {
        modelo = unModelo;
        initComponents();
        objetoPantalla();
    }
    private void objetoPantalla(){
        nombre.setText("");
        direccion.setText("");
        añoIngreso.setText("");
        celular.setText("");
        cedula.setText("");
        modelo.ordenarPorNombreVendedores();
        listaVendedores.setListData(modelo.obtenerVendedores());
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        listaVendedores = new javax.swing.JList();
        nombre = new javax.swing.JTextField();
        etiquetaNombre = new javax.swing.JLabel();
        etiquetaDireccion = new javax.swing.JLabel();
        etiquetaCedula = new javax.swing.JLabel();
        etiquetaAñoIngreso = new javax.swing.JLabel();
        etiquetaCelular = new javax.swing.JLabel();
        agregar = new javax.swing.JButton();
        direccion = new javax.swing.JTextField();
        cedula = new javax.swing.JTextField();
        añoIngreso = new javax.swing.JTextField();
        celular = new javax.swing.JTextField();
        salir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Alta de vendedor");
        getContentPane().setLayout(null);

        jScrollPane1.setViewportView(listaVendedores);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(50, 30, 134, 269);

        nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombreActionPerformed(evt);
            }
        });
        getContentPane().add(nombre);
        nombre.setBounds(240, 33, 180, 30);

        etiquetaNombre.setText("Nombre:");
        getContentPane().add(etiquetaNombre);
        etiquetaNombre.setBounds(240, 14, 74, 14);

        etiquetaDireccion.setText("Dirección:");
        getContentPane().add(etiquetaDireccion);
        etiquetaDireccion.setBounds(240, 73, 74, 14);

        etiquetaCedula.setText("Cédula (sin guion):");
        getContentPane().add(etiquetaCedula);
        etiquetaCedula.setBounds(240, 130, 120, 20);

        etiquetaAñoIngreso.setText("Año de Ingreso a la Empresa:");
        getContentPane().add(etiquetaAñoIngreso);
        etiquetaAñoIngreso.setBounds(240, 190, 172, 20);

        etiquetaCelular.setText("Celular:");
        getContentPane().add(etiquetaCelular);
        etiquetaCelular.setBounds(240, 253, 86, 14);

        agregar.setText("Agregar");
        agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarActionPerformed(evt);
            }
        });
        getContentPane().add(agregar);
        agregar.setBounds(260, 323, 130, 30);

        direccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                direccionActionPerformed(evt);
            }
        });
        getContentPane().add(direccion);
        direccion.setBounds(240, 93, 180, 30);

        cedula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cedulaActionPerformed(evt);
            }
        });
        getContentPane().add(cedula);
        cedula.setBounds(240, 153, 180, 30);

        añoIngreso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                añoIngresoActionPerformed(evt);
            }
        });
        getContentPane().add(añoIngreso);
        añoIngreso.setBounds(240, 213, 180, 30);

        celular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                celularActionPerformed(evt);
            }
        });
        getContentPane().add(celular);
        celular.setBounds(240, 273, 180, 30);

        salir.setText("Salir");
        salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirActionPerformed(evt);
            }
        });
        getContentPane().add(salir);
        salir.setBounds(370, 380, 98, 20);

        setBounds(0, 0, 494, 446);
    }// </editor-fold>//GEN-END:initComponents
   
    private void nombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombreActionPerformed

    private void direccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_direccionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_direccionActionPerformed

    private void cedulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cedulaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cedulaActionPerformed

    private void añoIngresoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_añoIngresoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_añoIngresoActionPerformed

    private void celularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_celularActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_celularActionPerformed

    private void salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_salirActionPerformed

    private void agregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarActionPerformed
        // TODO add your handling code here:
        int cedula1=0;
        int año = 0;
        String cedula2=cedula.getText().replace(" ", "");
        String año1=añoIngreso.getText().replace(" ", "");
        try{
            cedula1 = Integer.parseInt(cedula2);
            try{
                año = Integer.parseInt(año1);
                if (!modelo.cedulaRepetidaVendedores(cedula1) && !modelo.cedulaRepetidaClientes(cedula1)){
                        Vendedor v = new Vendedor(nombre.getText(),direccion.getText(), cedula1, añoIngreso.getText(), celular.getText());
                        modelo.setListaVendedores(v);
                        modelo.guardarDatos();
                        objetoPantalla();
                } else {
                    JOptionPane.showMessageDialog(this, "Cedula repetida", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
            catch (NumberFormatException e){
                JOptionPane.showMessageDialog(this, "Error al ingresar el año", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } 
        catch (NumberFormatException e){
            JOptionPane.showMessageDialog(this, "Error al ingresar cedula", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_agregarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton agregar;
    private javax.swing.JTextField añoIngreso;
    private javax.swing.JTextField cedula;
    private javax.swing.JTextField celular;
    private javax.swing.JTextField direccion;
    private javax.swing.JLabel etiquetaAñoIngreso;
    private javax.swing.JLabel etiquetaCedula;
    private javax.swing.JLabel etiquetaCelular;
    private javax.swing.JLabel etiquetaDireccion;
    private javax.swing.JLabel etiquetaNombre;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList listaVendedores;
    private javax.swing.JTextField nombre;
    private javax.swing.JButton salir;
    // End of variables declaration//GEN-END:variables
}
