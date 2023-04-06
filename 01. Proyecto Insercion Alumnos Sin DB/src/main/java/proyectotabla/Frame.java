package proyectotabla;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Frame extends javax.swing.JFrame {

    DefaultTableModel modeloTabla = new DefaultTableModel();

    public Frame() {
        LlenarTabla();
        initComponents();
        this.setTitle("Panel Estudiantes");
        this.setLocationRelativeTo(null);
    }

    private void LlenarTabla() {
        modeloTabla.addColumn("Nombre");
        modeloTabla.addColumn("Matricula");
        modeloTabla.addColumn("Promedio");
        modeloTabla.addColumn("Telefono");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        LabelNombre = new javax.swing.JLabel();
        LabelMatricula = new javax.swing.JLabel();
        LabelPromedio = new javax.swing.JLabel();
        LabelTelefono = new javax.swing.JLabel();
        CampoNombre = new javax.swing.JTextField();
        CampoMatricula = new javax.swing.JTextField();
        CampoPromedio = new javax.swing.JTextField();
        CampoTelefono = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tabla = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        BtnGuardar = new javax.swing.JButton();
        BtnEliminar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(254, 6, 6));
        setForeground(new java.awt.Color(62, 62, 62));

        LabelNombre.setFont(new java.awt.Font("Ubuntu", 1, 17)); // NOI18N
        LabelNombre.setText("Nombre");

        LabelMatricula.setFont(new java.awt.Font("Ubuntu", 1, 17)); // NOI18N
        LabelMatricula.setText("Matricula");

        LabelPromedio.setFont(new java.awt.Font("Ubuntu", 1, 17)); // NOI18N
        LabelPromedio.setText("Promedio");

        LabelTelefono.setFont(new java.awt.Font("Ubuntu", 1, 17)); // NOI18N
        LabelTelefono.setText("Telefono");

        CampoNombre.setFont(new java.awt.Font("Ubuntu", 2, 15)); // NOI18N
        CampoNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CampoNombreActionPerformed(evt);
            }
        });

        CampoMatricula.setFont(new java.awt.Font("Ubuntu", 2, 15)); // NOI18N

        CampoPromedio.setFont(new java.awt.Font("Ubuntu", 2, 15)); // NOI18N

        CampoTelefono.setFont(new java.awt.Font("Ubuntu", 2, 15)); // NOI18N

        Tabla.setModel(modeloTabla);
        jScrollPane1.setViewportView(Tabla);

        jLabel5.setFont(new java.awt.Font("Ubuntu", 1, 22)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(17, 136, 247));
        jLabel5.setText("DATOS DEL ALUMNO");

        BtnGuardar.setBackground(new java.awt.Color(40, 40, 40));
        BtnGuardar.setFont(new java.awt.Font("Ubuntu", 1, 22)); // NOI18N
        BtnGuardar.setText("Guardar");
        BtnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnGuardarActionPerformed(evt);
            }
        });

        BtnEliminar.setBackground(new java.awt.Color(40, 40, 40));
        BtnEliminar.setFont(new java.awt.Font("Ubuntu", 1, 20)); // NOI18N
        BtnEliminar.setText("ELIMINAR");
        BtnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnEliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(LabelPromedio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(LabelTelefono, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(LabelMatricula, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(LabelNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(CampoNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 117, Short.MAX_VALUE)
                    .addComponent(CampoMatricula)
                    .addComponent(CampoPromedio)
                    .addComponent(CampoTelefono))
                .addGap(12, 12, 12)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 470, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
            .addGroup(layout.createSequentialGroup()
                .addGap(93, 93, 93)
                .addComponent(BtnGuardar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BtnEliminar)
                .addGap(53, 53, 53))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(218, 218, 218))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel5)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(LabelNombre)
                            .addComponent(CampoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(13, 13, 13)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(CampoMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LabelMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(17, 17, 17)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(LabelPromedio)
                            .addComponent(CampoPromedio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(LabelTelefono)
                            .addComponent(CampoTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BtnEliminar)
                    .addComponent(BtnGuardar))
                .addContainerGap(40, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CampoNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CampoNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CampoNombreActionPerformed

    private void BtnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnGuardarActionPerformed

        Object[] arreglo = new Object[4];
        arreglo[0] = CampoNombre.getText();
        arreglo[1] = CampoMatricula.getText();
        arreglo[2] = CampoPromedio.getText();
        arreglo[3] = CampoTelefono.getText();
        modeloTabla.addRow(arreglo);

        CampoNombre.setText(" ");
        CampoMatricula.setText(" ");
        CampoPromedio.setText(" ");
        CampoTelefono.setText(" ");

    }//GEN-LAST:event_BtnGuardarActionPerformed

    private void BtnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnEliminarActionPerformed

        boolean confirmacion = false;

        int num_fila = Tabla.getSelectedRow();

        if (num_fila < 0) {
            JOptionPane.showMessageDialog(null, "Debe seleccionar una fila, no sea idiota");
        } else {
            int opcion = JOptionPane.showConfirmDialog(null, "¿Seguro que desea eliminar ésta fila?");
            confirmacion = true;
        }
        if (confirmacion) {
            modeloTabla.removeRow(num_fila);
            JOptionPane.showMessageDialog(null, "Fila eliminada");
        }

    }//GEN-LAST:event_BtnEliminarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Frame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnEliminar;
    private javax.swing.JButton BtnGuardar;
    private javax.swing.JTextField CampoMatricula;
    private javax.swing.JTextField CampoNombre;
    private javax.swing.JTextField CampoPromedio;
    private javax.swing.JTextField CampoTelefono;
    private javax.swing.JLabel LabelMatricula;
    private javax.swing.JLabel LabelNombre;
    private javax.swing.JLabel LabelPromedio;
    private javax.swing.JLabel LabelTelefono;
    private javax.swing.JTable Tabla;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
