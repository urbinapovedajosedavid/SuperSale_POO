package Views;

import java.awt.Image;
import javax.swing.ImageIcon;

public class Perfil extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(Perfil.class.getName());


    public Perfil() {
         initComponents();
     this.setSize(940, 415); 
    this.setLocationRelativeTo(null);
// 1. Cargas la imagen original desde tu proyecto
    ImageIcon imagenOriginal = new ImageIcon(getClass().getResource("/Imagenes/Logo_UNI.png"));
    
    // 2. EXTRAE EL TAMAÑO REAL DEL JLABEL (log_Uni) EN TIEMPO DE EJECUCIÓN
    // Esto evita usar números fijos como 600 o 150.
    int anchoLabel = log_Uni.getPreferredSize().width;
    int altoLabel = log_Uni.getPreferredSize().height;
    
    // Si el label ya tiene dimensiones asignadas en el diseño, usamos sus propiedades actuales
    if (log_Uni.getWidth() > 0 && log_Uni.getHeight() > 0) {
        anchoLabel = log_Uni.getWidth();
        altoLabel = log_Uni.getHeight();
    }

    // 3. Creas la imagen escalada usando las variables del tamaño del JLabel
    // Image.SCALE_SMOOTH garantiza la máxima calidad posible al redimensionar
    Image imagenEscalada = imagenOriginal.getImage().getScaledInstance(anchoLabel, altoLabel, Image.SCALE_SMOOTH);
    
    // 4. Conviertes la imagen escalada otra vez en icono y la asignas
    ImageIcon imagenFinal = new ImageIcon(imagenEscalada);
    log_Uni.setIcon(imagenFinal);
      
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
        log_Uni = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btn_Venta.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn_Venta.setText("Ventas");
        btn_Venta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_VentaActionPerformed(evt);
            }
        });

        btn_Estadisticas.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn_Estadisticas.setText("Estadistica");
        btn_Estadisticas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_EstadisticasActionPerformed(evt);
            }
        });

        btn_Inventario.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn_Inventario.setText("Inventario");
        btn_Inventario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_InventarioActionPerformed(evt);
            }
        });

        btn_Perfil.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn_Perfil.setText("Perfil");
        btn_Perfil.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.darkGray, java.awt.Color.darkGray, java.awt.Color.white, java.awt.Color.darkGray));
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
        vt_lista.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        vt_lista.setMaximumSize(new java.awt.Dimension(510, 390));

        log_Uni.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Logo_UNI.png"))); // NOI18N
        log_Uni.setMaximumSize(new java.awt.Dimension(64, 38));

        javax.swing.GroupLayout vt_listaLayout = new javax.swing.GroupLayout(vt_lista);
        vt_lista.setLayout(vt_listaLayout);
        vt_listaLayout.setHorizontalGroup(
            vt_listaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(vt_listaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(log_Uni, javax.swing.GroupLayout.DEFAULT_SIZE, 627, Short.MAX_VALUE))
        );
        vt_listaLayout.setVerticalGroup(
            vt_listaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(vt_listaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(log_Uni, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
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
                .addGap(18, 18, 18)
                .addComponent(vt_lista, javax.swing.GroupLayout.DEFAULT_SIZE, 637, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(btn_Venta, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(btn_Estadisticas, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(btn_Inventario, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(btn_Perfil, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(btn_Salir, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(33, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(vt_lista, javax.swing.GroupLayout.DEFAULT_SIZE, 386, Short.MAX_VALUE)
                .addContainerGap())
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

        Estadistica Registro = new Estadistica();
        Registro.setVisible(true);
        this.dispose();
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
        java.awt.EventQueue.invokeLater(() -> new Perfil().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Estadisticas;
    private javax.swing.JButton btn_Inventario;
    private javax.swing.JButton btn_Perfil;
    private javax.swing.JButton btn_Salir;
    private javax.swing.JButton btn_Venta;
    private javax.swing.JLabel log_Uni;
    private javax.swing.JPanel vt_lista;
    // End of variables declaration//GEN-END:variables
}
