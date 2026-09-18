package com.mycompany.tp4;

import java.awt.Component;
import java.util.HashSet;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class AltaAlumno extends javax.swing.JInternalFrame {

    private HashSet<Alumno> alumnos;

    public AltaAlumno(HashSet<Alumno> alumnosCompartidos) {
        initComponents();
        this.alumnos = alumnosCompartidos;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelAltaFormularios = new javax.swing.JPanel();
        jtLegajo = new javax.swing.JTextField();
        jtApellido = new javax.swing.JTextField();
        jtNombre = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2Legajo = new javax.swing.JLabel();
        jLabel3apellido = new javax.swing.JLabel();
        jLabel4nombre = new javax.swing.JLabel();
        jButtonGuardar = new javax.swing.JButton();

        setClosable(true);
        setPreferredSize(new java.awt.Dimension(600, 400));

        javax.swing.GroupLayout jPanelAltaFormulariosLayout = new javax.swing.GroupLayout(jPanelAltaFormularios);
        jPanelAltaFormularios.setLayout(jPanelAltaFormulariosLayout);
        jPanelAltaFormulariosLayout.setHorizontalGroup(
            jPanelAltaFormulariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelAltaFormulariosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelAltaFormulariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtLegajo, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(118, Short.MAX_VALUE))
        );
        jPanelAltaFormulariosLayout.setVerticalGroup(
            jPanelAltaFormulariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelAltaFormulariosLayout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(jtLegajo, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("FORMULARIO ALUMNOS");

        jLabel2Legajo.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2Legajo.setText("Legajo");

        jLabel3apellido.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3apellido.setText("Apellido:");

        jLabel4nombre.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel4nombre.setText("Nombre");

        jButtonGuardar.setText("Guardar");
        jButtonGuardar.addActionListener(this::jButtonGuardarActionPerformed);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(243, 243, 243)
                        .addComponent(jButtonGuardar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3apellido)
                                    .addComponent(jLabel4nombre)
                                    .addComponent(jLabel2Legajo))
                                .addGap(30, 30, 30)
                                .addComponent(jPanelAltaFormularios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel1))))
                .addContainerGap(33, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jLabel2Legajo)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3apellido)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4nombre))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jPanelAltaFormularios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 96, Short.MAX_VALUE)
                .addComponent(jButtonGuardar)
                .addGap(24, 24, 24))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGuardarActionPerformed
        if (!validarCamposVacios(jPanelAltaFormularios)) {
            int legajo = Integer.parseInt(jtLegajo.getText());
            String apellido = jtApellido.getText();
            String nombre = jtNombre.getText();

            Alumno a = new Alumno(legajo, apellido, nombre);
            boolean agregado = this.alumnos.add(a);
            if (agregado) {
                JOptionPane.showMessageDialog(this, "Se agregó a: " + a.getNombre() + " " + a.getApellido());
                vaciarCampos(jPanelAltaFormularios);
            } else {
                JOptionPane.showMessageDialog(this, "El alumno con este legajo ya se encuentra registrado.");
            }
        } else {
            JOptionPane.showMessageDialog(this, "Completa los campos.");
        }
    }//GEN-LAST:event_jButtonGuardarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonGuardar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2Legajo;
    private javax.swing.JLabel jLabel3apellido;
    private javax.swing.JLabel jLabel4nombre;
    private javax.swing.JPanel jPanelAltaFormularios;
    private javax.swing.JTextField jtApellido;
    private javax.swing.JTextField jtLegajo;
    private javax.swing.JTextField jtNombre;
    // End of variables declaration//GEN-END:variables

    public boolean validarCamposVacios(JPanel jPanel) {
        for (Component c : jPanel.getComponents()) {
            if (c instanceof JTextField) {
                JTextField caja = (JTextField) c;
                if (caja.getText().trim().isEmpty()) {
                    return true;
                }
            }
        }

        for (Component c : jPanel.getComponents()) {
            if (c instanceof JComboBox) {
                JComboBox combo = (JComboBox) c;
                if (combo.getSelectedIndex() == -1) {
                    return true;
                }
            }
        }

        return false;
    }

    public void vaciarCampos(JPanel jPanel) {
        JComboBox combo = null;
        for (Component c : jPanel.getComponents()) {
            if (c instanceof JTextField) {
                JTextField caja = (JTextField) c;
                caja.setText("");
            }
        }
        for (int i = 0; i < jPanel.getComponents().length; i++) {
            if (jPanel.getComponents()[i] instanceof JTextField) {
                JTextField caja = (JTextField) jPanel.getComponents()[i];
                caja.setText("");
            }
            if (jPanel.getComponents()[i] instanceof JComboBox) {
                combo = (JComboBox) jPanel.getComponents()[i];
                combo.setSelectedIndex(-1);
            }

        }
    }
}
