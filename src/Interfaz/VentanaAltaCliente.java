package Interfaz;

import Dominio.Cliente;
import Dominio.Sistema;
import javax.swing.JOptionPane;

public class VentanaAltaCliente extends javax.swing.JFrame  {
    private Sistema modelo;
    private Cliente cliente;
    
    public VentanaAltaCliente(Sistema unModelo) {
        modelo=unModelo;
        initComponents();
        ordenarPorNombre.setSelected(true);
        ordenarPorMonto.setSelected(false);
        objetoPantalla();
    }
    private void objetoPantalla(){
        nombre.setText("");
        direccion.setText("");
        codigoPostal.setText("");
        departamento.setText("");
        cedula.setText("");
        listaClientes.setListData(modelo.obtenerClientes());
    }
    private boolean departamentoBien(String departamento){
        boolean bien = false;
        switch (departamento){
            case "1" -> bien=true;
            case "2" -> bien=true;
            case "3" -> bien=true;
            case "4" -> bien=true;
            case "5" -> bien=true;
            case "6" -> bien=true;
            case "7" -> bien=true;
            case "8" -> bien=true;
            case "9" -> bien=true;
            case "10" -> bien=true;
            case "11" -> bien=true;
            case "12" -> bien=true;
            case "13" -> bien=true;
            case "14" -> bien=true;
            case "15" -> bien=true;
            case "16" -> bien=true;
            case "17" -> bien=true;
            case "18" -> bien=true;
            case "19" -> bien=true;
        }
        return bien;
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lista = new javax.swing.JScrollPane();
        listaClientes = new javax.swing.JList();
        nombre = new javax.swing.JTextField();
        etiquetaNombre = new javax.swing.JLabel();
        etiquetaDireccion = new javax.swing.JLabel();
        etiquetaCodigoPostal = new javax.swing.JLabel();
        etiquetaDepartamento = new javax.swing.JLabel();
        etiquetaCedula = new javax.swing.JLabel();
        agregar = new javax.swing.JButton();
        direccion = new javax.swing.JTextField();
        codigoPostal = new javax.swing.JTextField();
        departamento = new javax.swing.JTextField();
        cedula = new javax.swing.JTextField();
        salir = new javax.swing.JButton();
        ordenarPorNombre = new javax.swing.JRadioButton();
        ordenarPorMonto = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Alta de cliente");
        getContentPane().setLayout(null);

        lista.setViewportView(listaClientes);

        getContentPane().add(lista);
        lista.setBounds(41, 30, 134, 270);

        nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombreActionPerformed(evt);
            }
        });
        getContentPane().add(nombre);
        nombre.setBounds(227, 30, 180, 30);

        etiquetaNombre.setText("Nombre:");
        getContentPane().add(etiquetaNombre);
        etiquetaNombre.setBounds(227, 11, 74, 14);

        etiquetaDireccion.setText("Dirección:");
        getContentPane().add(etiquetaDireccion);
        etiquetaDireccion.setBounds(227, 70, 74, 14);

        etiquetaCodigoPostal.setText("Código Postal:");
        getContentPane().add(etiquetaCodigoPostal);
        etiquetaCodigoPostal.setBounds(227, 130, 100, 14);

        etiquetaDepartamento.setText("Departamento (1-19):");
        getContentPane().add(etiquetaDepartamento);
        etiquetaDepartamento.setBounds(227, 190, 150, 14);

        etiquetaCedula.setText("Cédula (sin guion):");
        getContentPane().add(etiquetaCedula);
        etiquetaCedula.setBounds(230, 250, 120, 20);

        agregar.setText("Agregar");
        agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarActionPerformed(evt);
            }
        });
        getContentPane().add(agregar);
        agregar.setBounds(250, 310, 130, 30);

        direccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                direccionActionPerformed(evt);
            }
        });
        getContentPane().add(direccion);
        direccion.setBounds(227, 90, 180, 30);

        codigoPostal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                codigoPostalActionPerformed(evt);
            }
        });
        getContentPane().add(codigoPostal);
        codigoPostal.setBounds(227, 150, 180, 30);

        departamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                departamentoActionPerformed(evt);
            }
        });
        getContentPane().add(departamento);
        departamento.setBounds(227, 210, 180, 30);

        cedula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cedulaActionPerformed(evt);
            }
        });
        getContentPane().add(cedula);
        cedula.setBounds(230, 270, 180, 30);

        salir.setText("Salir");
        salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirActionPerformed(evt);
            }
        });
        getContentPane().add(salir);
        salir.setBounds(380, 350, 98, 20);

        ordenarPorNombre.setText("Por Nombre");
        ordenarPorNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ordenarPorNombreActionPerformed(evt);
            }
        });
        getContentPane().add(ordenarPorNombre);
        ordenarPorNombre.setBounds(40, 310, 140, 23);

        ordenarPorMonto.setText("Por Monto");
        ordenarPorMonto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ordenarPorMontoActionPerformed(evt);
            }
        });
        getContentPane().add(ordenarPorMonto);
        ordenarPorMonto.setBounds(40, 340, 140, 23);

        setBounds(0, 0, 505, 415);
    }// </editor-fold>//GEN-END:initComponents
    
    private void direccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_direccionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_direccionActionPerformed

    private void codigoPostalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_codigoPostalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_codigoPostalActionPerformed

    private void departamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_departamentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_departamentoActionPerformed

    private void cedulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cedulaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cedulaActionPerformed

    private void salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_salirActionPerformed

    private void agregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarActionPerformed
        // TODO add your handling code here:
        int cedula1=0;
        String cedula2=cedula.getText().replace(" ", "");
        String nombre1=nombre.getText().replace(" ", "");
        String direccion1=direccion.getText().replace(" ", "");
        String codigoPostal1=codigoPostal.getText().replace(" ", "");
        try{
            cedula1= Integer.parseInt(cedula2);
            if (!modelo.cedulaRepetidaClientes(cedula1) && !modelo.cedulaRepetidaVendedores(cedula1)){
                if (departamentoBien(departamento.getText())){
                    if (nombre1.length()!=0 && direccion1.length() != 0 && codigoPostal1.length() != 0){
                        Cliente c = new Cliente(nombre.getText(),direccion.getText(), codigoPostal.getText(), departamento.getText(), cedula1);
                        modelo.setListaClientes(c);
                        if (ordenarPorNombre.isSelected()){
                            modelo.ordenarPorNombreClientes();
                        } else {
                            modelo.ordenarPorMontoClientes();
                        }
                        modelo.guardarDatos();
                        objetoPantalla();
                    } else {
                        JOptionPane.showMessageDialog(this, "Parametro vacio", "Error", JOptionPane.ERROR_MESSAGE);
                    }
                } else {
                    JOptionPane.showMessageDialog(this, "Error al ingresar departamento", "Error", JOptionPane.ERROR_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(this, "Cedula repetida", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } 
        catch (NumberFormatException e){
            JOptionPane.showMessageDialog(this, "Error al ingresar cedula", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_agregarActionPerformed

    private void ordenarPorNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ordenarPorNombreActionPerformed
        // TODO add your handling code here:
        ordenarPorNombre.setSelected(true);
        ordenarPorMonto.setSelected(false);
        modelo.ordenarPorNombreClientes();
        listaClientes.setListData(modelo.obtenerClientes());
    }//GEN-LAST:event_ordenarPorNombreActionPerformed

    private void ordenarPorMontoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ordenarPorMontoActionPerformed
        // TODO add your handling code here:
        ordenarPorNombre.setSelected(false);
        ordenarPorMonto.setSelected(true);
        modelo.ordenarPorMontoClientes();
        listaClientes.setListData(modelo.obtenerClientes());
    }//GEN-LAST:event_ordenarPorMontoActionPerformed

    private void nombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombreActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton agregar;
    private javax.swing.JTextField cedula;
    private javax.swing.JTextField codigoPostal;
    private javax.swing.JTextField departamento;
    private javax.swing.JTextField direccion;
    private javax.swing.JLabel etiquetaCedula;
    private javax.swing.JLabel etiquetaCodigoPostal;
    private javax.swing.JLabel etiquetaDepartamento;
    private javax.swing.JLabel etiquetaDireccion;
    private javax.swing.JLabel etiquetaNombre;
    private javax.swing.JScrollPane lista;
    private javax.swing.JList listaClientes;
    private javax.swing.JTextField nombre;
    private javax.swing.JRadioButton ordenarPorMonto;
    private javax.swing.JRadioButton ordenarPorNombre;
    private javax.swing.JButton salir;
    // End of variables declaration//GEN-END:variables
}
