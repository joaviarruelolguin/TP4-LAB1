package com.mycompany.tp4;

import java.util.HashSet;

public class Vista extends javax.swing.JFrame {

    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(Vista.class.getName());
    private static final HashSet<Alumno> A_COMPARTIR = new HashSet();
    private static final HashSet<Materia> M_COMPARTIR = new HashSet();

    public Vista() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        menuBar1 = new java.awt.MenuBar();
        menu1 = new java.awt.Menu();
        menu2 = new java.awt.Menu();
        menuBar2 = new java.awt.MenuBar();
        menu3 = new java.awt.Menu();
        menu4 = new java.awt.Menu();
        menuBar3 = new java.awt.MenuBar();
        menu5 = new java.awt.Menu();
        menu6 = new java.awt.Menu();
        jInternalFrame2 = new javax.swing.JInternalFrame();
        jInternalFrame1 = new javax.swing.JInternalFrame();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuAlumno = new javax.swing.JMenu();
        jMenuItem1AgregarAlumno = new javax.swing.JMenuItem();
        jMenuMateria = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuRegistro = new javax.swing.JMenu();
        jMenuInscribir = new javax.swing.JMenuItem();
        jMenuSalir = new javax.swing.JMenu();
        escritorio = new javax.swing.JDesktopPane();

        menu1.setLabel("File");
        menuBar1.add(menu1);

        menu2.setLabel("Edit");
        menuBar1.add(menu2);

        menu3.setLabel("File");
        menuBar2.add(menu3);

        menu4.setLabel("Edit");
        menuBar2.add(menu4);

        menu5.setLabel("File");
        menuBar3.add(menu5);

        menu6.setLabel("Edit");
        menuBar3.add(menu6);

        jInternalFrame2.setVisible(true);

        javax.swing.GroupLayout jInternalFrame2Layout = new javax.swing.GroupLayout(jInternalFrame2.getContentPane());
        jInternalFrame2.getContentPane().setLayout(jInternalFrame2Layout);
        jInternalFrame2Layout.setHorizontalGroup(
            jInternalFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jInternalFrame2Layout.setVerticalGroup(
            jInternalFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jInternalFrame1.setBackground(new java.awt.Color(204, 204, 204));
        jInternalFrame1.setVisible(true);

        jMenuBar1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jMenuAlumno.setText("Alumno");

        jMenuItem1AgregarAlumno.setText("Agrega Alumno");
        jMenuItem1AgregarAlumno.addActionListener(this::jMenuItem1AgregarAlumnoActionPerformed);
        jMenuAlumno.add(jMenuItem1AgregarAlumno);

        jMenuBar1.add(jMenuAlumno);

        jMenuMateria.setText("Materia");

        jMenuItem1.setText("Agregar materia");
        jMenuItem1.addActionListener(this::jMenuItem1ActionPerformed);
        jMenuMateria.add(jMenuItem1);

        jMenuBar1.add(jMenuMateria);

        jMenuRegistro.setText("Registro");

        jMenuInscribir.setText("Inscribir");
        jMenuInscribir.addActionListener(this::jMenuInscribirActionPerformed);
        jMenuRegistro.add(jMenuInscribir);

        jMenuBar1.add(jMenuRegistro);

        jMenuSalir.setText("Salir");
        jMenuBar1.add(jMenuSalir);

        jInternalFrame1.setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 708, Short.MAX_VALUE)
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout escritorioLayout = new javax.swing.GroupLayout(escritorio);
        escritorio.setLayout(escritorioLayout);
        escritorioLayout.setHorizontalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        escritorioLayout.setVerticalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 467, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(escritorio)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jInternalFrame1)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jInternalFrame1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(escritorio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1AgregarAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1AgregarAlumnoActionPerformed
        escritorio.removeAll();
        escritorio.repaint();
        AltaAlumno aal = new AltaAlumno(A_COMPARTIR);
        aal.setVisible(true);
        escritorio.add(aal);
        escritorio.moveToFront(aal);

    }//GEN-LAST:event_jMenuItem1AgregarAlumnoActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        escritorio.removeAll();
        escritorio.repaint();
        RegistroMateria rm = new RegistroMateria(M_COMPARTIR);
        rm.setVisible(true);
        escritorio.add(rm);
        escritorio.moveToFront(rm);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuInscribirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuInscribirActionPerformed
        escritorio.removeAll();
        escritorio.repaint();
        FormularioInscripcion fi = new FormularioInscripcion(A_COMPARTIR, M_COMPARTIR);
        fi.setVisible(true);
        escritorio.add(fi);
        escritorio.moveToFront(fi);
    }//GEN-LAST:event_jMenuInscribirActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(() -> new Vista().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane escritorio;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JInternalFrame jInternalFrame2;
    private javax.swing.JMenu jMenuAlumno;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuInscribir;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem1AgregarAlumno;
    private javax.swing.JMenu jMenuMateria;
    private javax.swing.JMenu jMenuRegistro;
    private javax.swing.JMenu jMenuSalir;
    private java.awt.Menu menu1;
    private java.awt.Menu menu2;
    private java.awt.Menu menu3;
    private java.awt.Menu menu4;
    private java.awt.Menu menu5;
    private java.awt.Menu menu6;
    private java.awt.MenuBar menuBar1;
    private java.awt.MenuBar menuBar2;
    private java.awt.MenuBar menuBar3;
    // End of variables declaration//GEN-END:variables
}
