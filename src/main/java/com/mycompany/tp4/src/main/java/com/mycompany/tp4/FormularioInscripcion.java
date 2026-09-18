package com.mycompany.tp4;

import java.awt.Component;
import java.util.HashSet;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class FormularioInscripcion extends javax.swing.JInternalFrame {

    private HashSet<Alumno> alumnos;
    private HashSet<Materia> materias;

    public FormularioInscripcion(HashSet<Alumno> alumnosCompartidos, HashSet<Materia> materiasCompartidas) {
        initComponents();
        this.alumnos = alumnosCompartidos;
        this.materias = materiasCompartidas;

        llenarCombos();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jbInscribir = new javax.swing.JButton();
        jPanelInscripcion = new javax.swing.JPanel();
        jcbMateria = new javax.swing.JComboBox<>();
        jcbAlumno = new javax.swing.JComboBox<>();

        setClosable(true);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("Formulario de Incripcion");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setText("Elija una materia");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setText("Elija un alumno");

        jbInscribir.setText("Inscribir");
        jbInscribir.addActionListener(this::jbInscribirActionPerformed);

        jcbMateria.addActionListener(this::jcbMateriaActionPerformed);

        javax.swing.GroupLayout jPanelInscripcionLayout = new javax.swing.GroupLayout(jPanelInscripcion);
        jPanelInscripcion.setLayout(jPanelInscripcionLayout);
        jPanelInscripcionLayout.setHorizontalGroup(
            jPanelInscripcionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelInscripcionLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelInscripcionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jcbMateria, 0, 232, Short.MAX_VALUE)
                    .addComponent(jcbAlumno, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(32, Short.MAX_VALUE))
        );
        jPanelInscripcionLayout.setVerticalGroup(
            jPanelInscripcionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelInscripcionLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jcbMateria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addComponent(jcbAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jbInscribir)
                            .addComponent(jPanelInscripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(32, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jLabel2)
                        .addGap(27, 27, 27)
                        .addComponent(jLabel3))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jPanelInscripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 91, Short.MAX_VALUE)
                .addComponent(jbInscribir)
                .addGap(32, 32, 32))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbInscribirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbInscribirActionPerformed

        if (!validarCamposVacios(jPanelInscripcion)) {

            Alumno alumnoSeleccionado = (Alumno) (Object) jcbAlumno.getSelectedItem();
            Materia materiaSeleccionada = (Materia) (Object) jcbMateria.getSelectedItem();

            alumnoSeleccionado.agregarMateria(materiaSeleccionada);

            JOptionPane.showMessageDialog(this, "Inscripción exitosa:\n"
                    + alumnoSeleccionado.getNombre() + " en " + materiaSeleccionada.getNombre());

            vaciarCampos(jPanelInscripcion);

        } else {
            JOptionPane.showMessageDialog(this, "Asegúrate de seleccionar un alumno y una materia.");
        }

    }//GEN-LAST:event_jbInscribirActionPerformed

    private void jcbMateriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbMateriaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcbMateriaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanelInscripcion;
    private javax.swing.JButton jbInscribir;
    private javax.swing.JComboBox<String> jcbAlumno;
    private javax.swing.JComboBox<String> jcbMateria;
    // End of variables declaration//GEN-END:variables

    private void llenarCombos() {
        jcbAlumno.removeAllItems();
        jcbMateria.removeAllItems();

        for (Alumno alu : alumnos) {
            ((javax.swing.JComboBox) jcbAlumno).addItem(alu);
        }

        for (Materia mat : materias) {
            ((javax.swing.JComboBox) jcbMateria).addItem(mat);
        }
    }

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
