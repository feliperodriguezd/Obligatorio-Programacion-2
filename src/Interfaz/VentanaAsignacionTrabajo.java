package Interfaz;

import Dominio.Sistema;
import Dominio.Trabajo;
import java.awt.Color;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JButton;
import javax.swing.JOptionPane;

public class VentanaAsignacionTrabajo extends javax.swing.JFrame {
    private JButton[][] matB = new JButton[11][9];
    private Sistema modelo;
    
    public VentanaAsignacionTrabajo(Sistema unModelo){
        modelo = unModelo;
        initComponents();
        crearTabla();
        objetoPantalla();
    }
    private void objetoPantalla(){
        listaTrabajos.setListData(modelo.obtenerTrabajosSinAsignar());
    }
    private void crearTabla(){
        for (int fila = 0; fila < matB.length; fila++) {
            for (int col = 0; col < matB[0].length; col++){
                matB[fila][col] = new JButton("");
                if (col==0 && fila!=0){
                    matB[fila][col].setText(""+fila);
                    matB[fila][col].setBackground(Color.BLACK);
                    matB[fila][col].setForeground(Color.WHITE);
                }
                if (fila==0){
                    switch (col){
                        case 0 -> matB[fila][col].setText("");
                        case 1 -> matB[fila][col].setText("8");
                        case 2 -> matB[fila][col].setText("9");
                        case 3 -> matB[fila][col].setText("10");
                        case 4 -> matB[fila][col].setText("11");
                        case 5 -> matB[fila][col].setText("12");
                        case 6 -> matB[fila][col].setText("13");
                        case 7 -> matB[fila][col].setText("14");
                        case 8 -> matB[fila][col].setText("15");
                    }
                    matB[fila][col].setBackground(Color.BLACK);
                    matB[fila][col].setForeground(Color.WHITE);
                }
                if (col>0 && fila>0){
                    matB[fila][col].setMargin(new Insets(-5, -5, -5, -5));
                    matB[fila][col].setBackground(Color.GREEN);
                    matB[fila][col].addActionListener(new TileListener());
                }
                panel.add(matB[fila][col]);
            }
        }
    }
    
    private class TileListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            JButton cual = ((JButton) e.getSource());
            if (cual.getBackground() == Color.YELLOW){
                cual.setBackground(Color.GREEN);
            } else if (cual.getBackground() == Color.GREEN){
                cual.setBackground(Color.YELLOW);
            }
        }
    }
    
    private void mostrar(){
        String fecha1 = fecha.getText();
        DateFormat forma = new SimpleDateFormat("dd/MM/yyyy");
        if (fecha1.length()!=0){
            if(fecha1.charAt(0)=='0'){
                fecha1 = fecha1.substring(1,2) + fecha1.substring(2);
            }
            if (fecha1.charAt(2)=='0'){
                fecha1 = fecha1.substring(0,2)+fecha1.substring(3);
            }
            try {
                Date date = (Date) forma.parse(fecha1);
                for (int i=1;i<=10;i++){
                    for (int a=1;a<=8;a++){
                        matB[i][a].setBackground(Color.GREEN);
                    }
                }
                for (int i=0; i<modelo.getListaTrabajos().size();i++){
                    if (modelo.getListaTrabajos().get(i).getDia() != null){
                        if (modelo.getListaTrabajos().get(i).getDia().equals(fecha1)){
                            for (int a=0; a<modelo.getListaTrabajos().get(i).getMaquinas().size();a++){
                                if (modelo.getListaTrabajos().get(i).getMaquinas().get(a).charAt(1)=='/'){
                                    int fila = Integer.parseInt(modelo.getListaTrabajos().get(i).getMaquinas().get(a).substring(0,1));
                                    int columna = Integer.parseInt(modelo.getListaTrabajos().get(i).getMaquinas().get(a).substring(2,modelo.getListaTrabajos().get(i).getMaquinas().get(a).length()));
                                    matB[fila][columna].setBackground(Color.RED);
                                } else if (modelo.getListaTrabajos().get(i).getMaquinas().get(a).charAt(2)=='/'){
                                    int fila = Integer.parseInt(modelo.getListaTrabajos().get(i).getMaquinas().get(a).substring(0,2));
                                    int columna = Integer.parseInt(modelo.getListaTrabajos().get(i).getMaquinas().get(a).substring(3,modelo.getListaTrabajos().get(i).getMaquinas().get(a).length()));
                                    matB[fila][columna].setBackground(Color.RED);
                                }
                            }
                        }
                    }
                }
                objetoPantalla();
            } catch (ParseException e){
                JOptionPane.showMessageDialog(this, "Error en fecha", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        etiquetaFecha = new javax.swing.JLabel();
        fecha = new javax.swing.JTextField();
        etiquetaTrabajosSinAsignar = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        listaTrabajos = new javax.swing.JList();
        panel = new javax.swing.JPanel();
        mostrar = new javax.swing.JButton();
        salir = new javax.swing.JButton();
        asignar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle(" Asignación de trabajos");
        getContentPane().setLayout(null);

        etiquetaFecha.setText("Fecha:");
        getContentPane().add(etiquetaFecha);
        etiquetaFecha.setBounds(10, 30, 60, 30);
        getContentPane().add(fecha);
        fecha.setBounds(60, 30, 80, 30);

        etiquetaTrabajosSinAsignar.setText("Trabajos Sin Asignar:");
        getContentPane().add(etiquetaTrabajosSinAsignar);
        etiquetaTrabajosSinAsignar.setBounds(10, 72, 129, 25);

        jScrollPane1.setViewportView(listaTrabajos);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(10, 103, 142, 250);

        panel.setLayout(new java.awt.GridLayout(11, 9));
        getContentPane().add(panel);
        panel.setBounds(170, 41, 430, 370);

        mostrar.setText("Mostrar");
        mostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mostrarActionPerformed(evt);
            }
        });
        getContentPane().add(mostrar);
        mostrar.setBounds(60, 370, 90, 30);

        salir.setText("Salir");
        salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirActionPerformed(evt);
            }
        });
        getContentPane().add(salir);
        salir.setBounds(490, 420, 100, 23);

        asignar.setText("Asignar");
        asignar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                asignarActionPerformed(evt);
            }
        });
        getContentPane().add(asignar);
        asignar.setBounds(190, 420, 100, 23);

        setBounds(0, 0, 626, 490);
    }// </editor-fold>//GEN-END:initComponents

    private void salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_salirActionPerformed

    private void mostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mostrarActionPerformed
        // TODO add your handling code here:
        mostrar();
    }//GEN-LAST:event_mostrarActionPerformed

    private void asignarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_asignarActionPerformed
        // TODO add your handling code here:
        String fecha1 = fecha.getText();
        if (fecha1.length()!=0){
            DateFormat forma = new SimpleDateFormat("dd/MM/yyyy");
            if(fecha1.charAt(0)=='0'){
                fecha1 = fecha1.substring(1,2) + fecha1.substring(2);
            }
            if (fecha1.charAt(2)=='0'){
                fecha1 = fecha1.substring(0,2)+fecha1.substring(3);
            }
            try {
                Date date = (Date) forma.parse(fecha1);
                if (listaTrabajos.getSelectedValue() != null){
                    Trabajo t = (Trabajo)listaTrabajos.getSelectedValue();
                    for (int i=1; i<=10;i++){
                        for (int a=1; a<=8;a++){
                            if (matB[i][a].getBackground() == Color.YELLOW){
                                String cordenadas = i + "/" + a;
                                t.setMaquina(cordenadas);
                                t.setFecha(fecha1);
                                modelo.guardarDatos();
                            }
                        }
                    }
                    mostrar();
                } else {
                    JOptionPane.showMessageDialog(this, "Trabajo no seleccionado", "Error", JOptionPane.ERROR_MESSAGE);
                }
            } catch (ParseException e){
                JOptionPane.showMessageDialog(this, "Error en fecha", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_asignarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton asignar;
    private javax.swing.JLabel etiquetaFecha;
    private javax.swing.JLabel etiquetaTrabajosSinAsignar;
    private javax.swing.JTextField fecha;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList listaTrabajos;
    private javax.swing.JButton mostrar;
    private javax.swing.JPanel panel;
    private javax.swing.JButton salir;
    // End of variables declaration//GEN-END:variables
}
