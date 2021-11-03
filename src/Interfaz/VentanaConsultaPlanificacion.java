package Interfaz;

import Dominio.Sistema;
import java.awt.Color;
import java.awt.Insets;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;
import javax.swing.JButton;
import javax.swing.JOptionPane;

public class VentanaConsultaPlanificacion extends javax.swing.JFrame {
    
    private JButton[][] matB = new JButton[11][9];
    private Sistema modelo;
    
    public VentanaConsultaPlanificacion(Sistema unModelo){
        modelo = unModelo;
        initComponents();
        crearTabla();
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
                }
                panel.add(matB[fila][col]);
            }
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        fecha = new javax.swing.JTextField();
        mostrar = new javax.swing.JButton();
        salir = new javax.swing.JButton();

        setTitle("Consulta de planificación");
        getContentPane().setLayout(null);

        panel.setLayout(new java.awt.GridLayout(11, 9));
        getContentPane().add(panel);
        panel.setBounds(180, 20, 460, 400);

        jLabel1.setText("Fecha:");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(10, 19, 69, 14);
        getContentPane().add(fecha);
        fecha.setBounds(57, 21, 90, 30);

        mostrar.setText("Mostrar");
        mostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mostrarActionPerformed(evt);
            }
        });
        getContentPane().add(mostrar);
        mostrar.setBounds(20, 70, 140, 30);

        salir.setText("Salir");
        salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirActionPerformed(evt);
            }
        });
        getContentPane().add(salir);
        salir.setBounds(540, 430, 100, 23);

        setBounds(0, 0, 668, 498);
    }// </editor-fold>//GEN-END:initComponents
  
    private void salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_salirActionPerformed

    private void mostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mostrarActionPerformed
        // TODO add your handling code here:
        String fecha1 = fecha.getText();
        DateFormat forma = new SimpleDateFormat("dd/MM/yyyy");
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
                    matB[i][a].setText("");
                }
            }
            for (int i=0; i<modelo.getListaTrabajos().size();i++){
                if (modelo.getListaTrabajos().get(i).getDia() != null){
                    if (modelo.getListaTrabajos().get(i).getDia().equals(fecha1)){
                        Random rand = new Random();
                        float r = rand.nextFloat();
                        float g = rand.nextFloat();
                        float b = rand.nextFloat();
                        Color randomColor = new Color(r, g, b);
                        for (int a=0; a<modelo.getListaTrabajos().get(i).getMaquinas().size();a++){
                            if (modelo.getListaTrabajos().get(i).getMaquinas().get(a).charAt(1)=='/'){
                                int fila = Integer.parseInt(modelo.getListaTrabajos().get(i).getMaquinas().get(a).substring(0,1));
                                int columna = Integer.parseInt(modelo.getListaTrabajos().get(i).getMaquinas().get(a).substring(2,modelo.getListaTrabajos().get(i).getMaquinas().get(a).length()));
                                matB[fila][columna].setBackground(randomColor);
                                matB[fila][columna].setText(""+modelo.getListaTrabajos().get(i).getNumero());
                            } else if (modelo.getListaTrabajos().get(i).getMaquinas().get(a).charAt(2)=='/'){
                                int fila = Integer.parseInt(modelo.getListaTrabajos().get(i).getMaquinas().get(a).substring(0,2));
                                int columna = Integer.parseInt(modelo.getListaTrabajos().get(i).getMaquinas().get(a).substring(3,modelo.getListaTrabajos().get(i).getMaquinas().get(a).length()));
                                matB[fila][columna].setBackground(randomColor);
                                matB[fila][columna].setText(""+modelo.getListaTrabajos().get(i).getNumero());
                            }
                        }
                    }
                }
            }
        } catch (ParseException e){
            JOptionPane.showMessageDialog(this, "Error en fecha", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_mostrarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField fecha;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton mostrar;
    private javax.swing.JPanel panel;
    private javax.swing.JButton salir;
    // End of variables declaration//GEN-END:variables
}
