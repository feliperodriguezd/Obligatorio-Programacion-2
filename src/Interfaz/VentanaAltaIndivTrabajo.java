package Interfaz;

import Dominio.*;
import javax.swing.JOptionPane;

public class VentanaAltaIndivTrabajo extends javax.swing.JFrame {

    private Sistema modelo;
    public VentanaAltaIndivTrabajo(Sistema unModelo) {
        modelo=unModelo;
        initComponents();
        objetoPantalla();
    }
    
    private void objetoPantalla(){
        descripcion.setText("");
        costo.setText("");
        listaClientes.setListData(modelo.obtenerClientes());
        listaVendedores.setListData(modelo.obtenerVendedores());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        listaVendedores = new javax.swing.JList();
        jScrollPane2 = new javax.swing.JScrollPane();
        listaClientes = new javax.swing.JList();
        etiquetaVendedor = new javax.swing.JLabel();
        etiquetaCliente = new javax.swing.JLabel();
        etiquetaDescripcion = new javax.swing.JLabel();
        etiquetaCosto = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        descripcion = new javax.swing.JTextPane();
        costo = new javax.swing.JTextField();
        salir = new javax.swing.JButton();
        agregar1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Alta individual de trabajo");
        getContentPane().setLayout(null);

        jScrollPane1.setViewportView(listaVendedores);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(130, 31, 97, 260);

        jScrollPane2.setViewportView(listaClientes);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(20, 31, 97, 260);

        etiquetaVendedor.setText("Vendedor:");
        getContentPane().add(etiquetaVendedor);
        etiquetaVendedor.setBounds(130, 11, 86, 14);

        etiquetaCliente.setText("Cliente:");
        getContentPane().add(etiquetaCliente);
        etiquetaCliente.setBounds(18, 11, 86, 14);

        etiquetaDescripcion.setText("Descripción:");
        getContentPane().add(etiquetaDescripcion);
        etiquetaDescripcion.setBounds(264, 31, 75, 14);

        etiquetaCosto.setText("Costo:");
        getContentPane().add(etiquetaCosto);
        etiquetaCosto.setBounds(264, 152, 57, 14);

        jScrollPane5.setViewportView(descripcion);

        getContentPane().add(jScrollPane5);
        jScrollPane5.setBounds(264, 51, 257, 95);
        getContentPane().add(costo);
        costo.setBounds(264, 172, 257, 30);

        salir.setText("Salir");
        salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirActionPerformed(evt);
            }
        });
        getContentPane().add(salir);
        salir.setBounds(440, 270, 98, 20);

        agregar1.setText("Agregar");
        agregar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregar1ActionPerformed(evt);
            }
        });
        getContentPane().add(agregar1);
        agregar1.setBounds(343, 210, 98, 40);

        setBounds(0, 0, 571, 337);
    }// </editor-fold>//GEN-END:initComponents
  
    private void salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_salirActionPerformed

    private void agregar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregar1ActionPerformed
        // TODO add your handling code here:
        int monto = 0;
        Cliente unCliente = (Cliente) listaClientes.getSelectedValue();
        Vendedor unVendedor = (Vendedor) listaVendedores.getSelectedValue();
        String descripcion1 = descripcion.getText().replace(" ", "");
        try{
            monto = Integer.parseInt(costo.getText());
            if (descripcion1.length()!=0){
                if (unCliente!=null && unVendedor!=null){
                    Trabajo t = new Trabajo(unCliente,unVendedor,descripcion1,monto, modelo.getSiguienteNumero());
                    modelo.setSiguienteNumero(modelo.getSiguienteNumero()+modelo.getNumeroDeA());
                    modelo.setListaTrabajos(t);
                    unCliente.setMonto(monto);
                    JOptionPane.showMessageDialog(this, "Se dio de alta el trabajo: " + t.getNumero(), "Alta Trabajos", JOptionPane.INFORMATION_MESSAGE);
                    modelo.guardarDatos();
                    objetoPantalla();
                } else {
                    JOptionPane.showMessageDialog(this, "Cliente o vendedor no seleccionado", "Error", JOptionPane.ERROR_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(this, "Descripcion vacia", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } 
        catch(NumberFormatException e){
            JOptionPane.showMessageDialog(this, "Error al ingresar costo", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_agregar1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton agregar1;
    private javax.swing.JTextField costo;
    private javax.swing.JTextPane descripcion;
    private javax.swing.JLabel etiquetaCliente;
    private javax.swing.JLabel etiquetaCosto;
    private javax.swing.JLabel etiquetaDescripcion;
    private javax.swing.JLabel etiquetaVendedor;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JList listaClientes;
    private javax.swing.JList listaVendedores;
    private javax.swing.JButton salir;
    // End of variables declaration//GEN-END:variables
}
