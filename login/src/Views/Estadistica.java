package Views;

public class Estadistica extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(Estadistica.class.getName());

    /**
     * Creates new form Estadistica
     */
    public Estadistica() {
        initComponents();
     this.setSize(940, 415); 
    this.setLocationRelativeTo(null);
    
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btn_Venta = new javax.swing.JButton();
        btn_Estadisticas = new javax.swing.JButton();
        btn_Inventario = new javax.swing.JButton();
        btn_Perfil = new javax.swing.JButton();
        btn_Salir = new javax.swing.JButton();
        vt_lista = new javax.swing.JPanel();
        txt_Total = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Lista_Ventas = new javax.swing.JList<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(940, 415));
        setMinimumSize(new java.awt.Dimension(940, 415));

        btn_Venta.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn_Venta.setText("Ventas");
        btn_Venta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_VentaActionPerformed(evt);
            }
        });

        btn_Estadisticas.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn_Estadisticas.setText("Estadistica");
        btn_Estadisticas.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.darkGray, java.awt.Color.darkGray, java.awt.Color.white, java.awt.Color.darkGray));
        btn_Estadisticas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_EstadisticasActionPerformed(evt);
            }
        });

        btn_Inventario.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn_Inventario.setText("Inventario");
        btn_Inventario.setBorder(null);
        btn_Inventario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_InventarioActionPerformed(evt);
            }
        });

        btn_Perfil.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn_Perfil.setText("Perfil");
        btn_Perfil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_PerfilActionPerformed(evt);
            }
        });

        btn_Salir.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn_Salir.setText("Salir");
        btn_Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_SalirActionPerformed(evt);
            }
        });

        vt_lista.setBackground(new java.awt.Color(153, 153, 153));
        vt_lista.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.black, java.awt.Color.black, java.awt.Color.white, java.awt.Color.gray));
        vt_lista.setMaximumSize(new java.awt.Dimension(510, 350));
        vt_lista.setMinimumSize(new java.awt.Dimension(510, 350));
        vt_lista.setPreferredSize(new java.awt.Dimension(510, 350));

        txt_Total.setText("TOTAL");

        Lista_Ventas.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(Lista_Ventas);

        javax.swing.GroupLayout vt_listaLayout = new javax.swing.GroupLayout(vt_lista);
        vt_lista.setLayout(vt_listaLayout);
        vt_listaLayout.setHorizontalGroup(
            vt_listaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, vt_listaLayout.createSequentialGroup()
                .addContainerGap(19, Short.MAX_VALUE)
                .addGroup(vt_listaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_Total)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 469, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16))
        );
        vt_listaLayout.setVerticalGroup(
            vt_listaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, vt_listaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_Total)
                .addGap(34, 34, 34))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_Venta, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_Estadisticas, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_Inventario, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_Perfil, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_Salir, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(69, 69, 69)
                .addComponent(vt_lista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(76, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(vt_lista, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(btn_Venta, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(btn_Estadisticas, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(btn_Inventario, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(btn_Perfil, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(btn_Salir, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(50, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_VentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_VentaActionPerformed

        Ventas Product = new Ventas();
        Product.setVisible(true);
        this.dispose();
        
        
    }//GEN-LAST:event_btn_VentaActionPerformed

    private void btn_EstadisticasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_EstadisticasActionPerformed
        // TODO add your handling code here:



    }//GEN-LAST:event_btn_EstadisticasActionPerformed

    private void btn_InventarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_InventarioActionPerformed
        // TODO add your handling code here:

        Inventario Almacen= new Inventario();
        Almacen.setVisible(true);
        this.dispose();

    }//GEN-LAST:event_btn_InventarioActionPerformed

    
    private void btn_SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_SalirActionPerformed

        // esto hace que vueva al login de nuevo

        login Secion = new login();
        Secion.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_SalirActionPerformed

    private void btn_PerfilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_PerfilActionPerformed

        Perfil Profile = new Perfil();
        Profile.setVisible(true);
        this.dispose();



        // TODO add your handling code here:
    }//GEN-LAST:event_btn_PerfilActionPerformed

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
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> new Estadistica().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JList<String> Lista_Ventas;
    private javax.swing.JButton btn_Estadisticas;
    private javax.swing.JButton btn_Inventario;
    private javax.swing.JButton btn_Perfil;
    private javax.swing.JButton btn_Salir;
    private javax.swing.JButton btn_Venta;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel txt_Total;
    private javax.swing.JPanel vt_lista;
    // End of variables declaration//GEN-END:variables
}
