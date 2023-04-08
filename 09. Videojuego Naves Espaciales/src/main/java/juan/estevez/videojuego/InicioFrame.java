package juan.estevez.videojuego;

/**
 *
 * @author Juan Carlos Estevez Vargas
 */
public class InicioFrame extends javax.swing.JFrame {

    /**
     * Constructor de clase.
     */
    public InicioFrame() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnJugar = new javax.swing.JButton();
        txtNombre = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        cmbControlesCreditos = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(102, 102, 255));

        jPanel1.setBackground(new java.awt.Color(102, 102, 255));

        btnJugar.setBackground(new java.awt.Color(204, 204, 255));
        btnJugar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnJugar.setForeground(new java.awt.Color(102, 153, 255));
        btnJugar.setText("JUGAR");
        btnJugar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnJugarActionPerformed(evt);
            }
        });

        txtNombre.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtNombre.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 255));
        jLabel1.setText("Nombre del Jugador: ");

        cmbControlesCreditos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "Controles", "Créditos", "Puntuaciones" }));
        cmbControlesCreditos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbControlesCreditosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnJugar, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(31, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cmbControlesCreditos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(40, 40, 40))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(cmbControlesCreditos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnJugar, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnJugarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnJugarActionPerformed
        String nombre = txtNombre.getText();

        if (nombre.length() == 0) {
            System.out.println("No puedes dejar el nombre vacío.");
        } else {
            java.awt.EventQueue.invokeLater(() -> {
                new JuegoFrame(nombre).setVisible(true);
            });
        }
    }//GEN-LAST:event_btnJugarActionPerformed

    private void cmbControlesCreditosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbControlesCreditosActionPerformed
        if (cmbControlesCreditos.getSelectedItem() == "Créditos") {
            CreditosFrame creditosFrame = new CreditosFrame();
            creditosFrame.setVisible(true);
            creditosFrame.setLocationRelativeTo(null);
            this.dispose();
        } else if (cmbControlesCreditos.getSelectedItem() == "Controles") {
            ControlesFrame controlesFrame = new ControlesFrame();
            controlesFrame.setVisible(true);
            controlesFrame.setLocationRelativeTo(null);
            this.dispose();
        }
    }//GEN-LAST:event_cmbControlesCreditosActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InicioFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new InicioFrame().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnJugar;
    private javax.swing.JComboBox<String> cmbControlesCreditos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
