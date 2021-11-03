package Interfaz;

import Dominio.Sistema;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class VentanaMenu extends javax.swing.JFrame {
    private Sistema modelo;
    
    public VentanaMenu(Sistema unSistema) {
        modelo = unSistema;
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        menuBar = new javax.swing.JMenuBar();
        fileMenu = new javax.swing.JMenu();
        AltaCliente = new javax.swing.JMenuItem();
        AltaVendedor = new javax.swing.JMenuItem();
        AltaIndividualTrabajo = new javax.swing.JMenuItem();
        AltaMasivaTrabajo = new javax.swing.JMenuItem();
        AsignacionTrabajo = new javax.swing.JMenuItem();
        ConsultasPlanificacion = new javax.swing.JMenuItem();
        DesignacionTrabajo = new javax.swing.JMenuItem();
        Configuracion = new javax.swing.JMenuItem();
        Terminar = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Menú");

        fileMenu.setMnemonic('f');
        fileMenu.setText("Menú");
        fileMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fileMenuActionPerformed(evt);
            }
        });

        AltaCliente.setMnemonic('o');
        AltaCliente.setText("Alta de cliente");
        AltaCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AltaClienteActionPerformed(evt);
            }
        });
        fileMenu.add(AltaCliente);

        AltaVendedor.setMnemonic('s');
        AltaVendedor.setText("Alta de vendedor");
        AltaVendedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AltaVendedorActionPerformed(evt);
            }
        });
        fileMenu.add(AltaVendedor);

        AltaIndividualTrabajo.setMnemonic('a');
        AltaIndividualTrabajo.setText("Alta individual de trabajo");
        AltaIndividualTrabajo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AltaIndividualTrabajoActionPerformed(evt);
            }
        });
        fileMenu.add(AltaIndividualTrabajo);

        AltaMasivaTrabajo.setMnemonic('x');
        AltaMasivaTrabajo.setText("Alta masiva de trabajos");
        AltaMasivaTrabajo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AltaMasivaTrabajoActionPerformed(evt);
            }
        });
        fileMenu.add(AltaMasivaTrabajo);

        AsignacionTrabajo.setMnemonic('o');
        AsignacionTrabajo.setText("Asignación de trabajos");
        AsignacionTrabajo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AsignacionTrabajoActionPerformed(evt);
            }
        });
        fileMenu.add(AsignacionTrabajo);

        ConsultasPlanificacion.setMnemonic('o');
        ConsultasPlanificacion.setText("Consulta de planificación");
        ConsultasPlanificacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConsultasPlanificacionActionPerformed(evt);
            }
        });
        fileMenu.add(ConsultasPlanificacion);

        DesignacionTrabajo.setMnemonic('o');
        DesignacionTrabajo.setText("Desasignación de trabajo");
        DesignacionTrabajo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DesignacionTrabajoActionPerformed(evt);
            }
        });
        fileMenu.add(DesignacionTrabajo);

        Configuracion.setMnemonic('o');
        Configuracion.setText("Configuración");
        Configuracion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConfiguracionActionPerformed(evt);
            }
        });
        fileMenu.add(Configuracion);

        Terminar.setMnemonic('o');
        Terminar.setText("Terminar");
        Terminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TerminarActionPerformed(evt);
            }
        });
        fileMenu.add(Terminar);

        menuBar.add(fileMenu);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 279, Short.MAX_VALUE)
        );

        setBounds(0, 0, 414, 337);
    }// </editor-fold>//GEN-END:initComponents

    
    private void AltaMasivaTrabajoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AltaMasivaTrabajoActionPerformed
        VentanaAltaMasivaTrabajo v = new VentanaAltaMasivaTrabajo(modelo);
        v.setVisible(true);
    }//GEN-LAST:event_AltaMasivaTrabajoActionPerformed

    private void AltaVendedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AltaVendedorActionPerformed
        // TODO add your handling code here:
        VentanaAltaVendedor v = new VentanaAltaVendedor(modelo);
        v.setVisible(true);
    }//GEN-LAST:event_AltaVendedorActionPerformed

    private void AltaIndividualTrabajoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AltaIndividualTrabajoActionPerformed
        // TODO add your handling code here:
        VentanaAltaIndivTrabajo v = new VentanaAltaIndivTrabajo(modelo);
        v.setVisible(true);
    }//GEN-LAST:event_AltaIndividualTrabajoActionPerformed

    private void fileMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fileMenuActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_fileMenuActionPerformed

    private void AltaClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AltaClienteActionPerformed
        // TODO add your handling code here:
        VentanaAltaCliente v = new VentanaAltaCliente(modelo);
        v.setVisible(true);
    }//GEN-LAST:event_AltaClienteActionPerformed

    private void AsignacionTrabajoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AsignacionTrabajoActionPerformed
        // TODO add your handling code here:
        VentanaAsignacionTrabajo v = new VentanaAsignacionTrabajo(modelo);
        v.setVisible(true);
    }//GEN-LAST:event_AsignacionTrabajoActionPerformed

    private void ConsultasPlanificacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConsultasPlanificacionActionPerformed
        // TODO add your handling code here:
        VentanaConsultaPlanificacion v = new VentanaConsultaPlanificacion(modelo);
        v.setVisible(true);
    }//GEN-LAST:event_ConsultasPlanificacionActionPerformed

    private void DesignacionTrabajoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DesignacionTrabajoActionPerformed
        // TODO add your handling code here:
        VentanaDesasignacionTrabajo v = new VentanaDesasignacionTrabajo(modelo);
        v.setVisible(true);
    }//GEN-LAST:event_DesignacionTrabajoActionPerformed

    private void ConfiguracionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConfiguracionActionPerformed
        // TODO add your handling code here:
        VentanaConfiguracion v = new VentanaConfiguracion(modelo);
        v.setVisible(true);
    }//GEN-LAST:event_ConfiguracionActionPerformed

    private void TerminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TerminarActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_TerminarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem AltaCliente;
    private javax.swing.JMenuItem AltaIndividualTrabajo;
    private javax.swing.JMenuItem AltaMasivaTrabajo;
    private javax.swing.JMenuItem AltaVendedor;
    private javax.swing.JMenuItem AsignacionTrabajo;
    private javax.swing.JMenuItem Configuracion;
    private javax.swing.JMenuItem ConsultasPlanificacion;
    private javax.swing.JMenuItem DesignacionTrabajo;
    private javax.swing.JMenuItem Terminar;
    private javax.swing.JMenu fileMenu;
    private javax.swing.JMenuBar menuBar;
    // End of variables declaration//GEN-END:variables

}
