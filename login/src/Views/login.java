package Views;

public class login extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(login.class.getName());


    public login() {
        initComponents();
    this.setLocationRelativeTo(null);
    
    //es para hacer funcionar el enter
     this.getRootPane().setDefaultButton(btn_enter);
     
     
     // 3. Programar la lógica del Checkbox para ver la contraseña
        vist.setLabel("Ver"); // Le ponemos texto descriptivo al checkbox
        vist.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                // Si el checkbox está marcado (1 es seleccionado)
                if (evt.getStateChange() == java.awt.event.ItemEvent.SELECTED) {
                    txt_password.setEchoChar((char) 0); // Muestra el texto de la contraseña
                } else {
                    txt_password.setEchoChar('•'); // Vuelve a ocultarla con puntitos
                }
            }
        });
    }
     

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        Wallpeper_Registro = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        label_usuario = new javax.swing.JLabel();
        label_contraseña = new javax.swing.JLabel();
        txt_userName = new javax.swing.JTextField();
        txt_password = new javax.swing.JPasswordField();
        btn_enter = new javax.swing.JButton();
        vist = new java.awt.Checkbox();
        btn_crear = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        Wallpaper = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Wallpeper_Registro.setBackground(new java.awt.Color(40, 147, 153));
        Wallpeper_Registro.setForeground(new java.awt.Color(102, 102, 102));
        Wallpeper_Registro.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Wallpeper_Registro.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Wallpeper_Registro.setMaximumSize(new java.awt.Dimension(930, 420));
        Wallpeper_Registro.setPreferredSize(new java.awt.Dimension(930, 420));
        Wallpeper_Registro.setRequestFocusEnabled(false);

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("INICIAR SESION");
        jLabel1.setVerticalTextPosition(javax.swing.SwingConstants.TOP);

        label_usuario.setBackground(new java.awt.Color(255, 255, 255));
        label_usuario.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        label_usuario.setForeground(new java.awt.Color(255, 255, 255));
        label_usuario.setText("Usuario:");

        label_contraseña.setBackground(new java.awt.Color(255, 255, 255));
        label_contraseña.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        label_contraseña.setForeground(new java.awt.Color(255, 255, 255));
        label_contraseña.setText("Contraseña:");

        txt_userName.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txt_userName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_userNameActionPerformed(evt);
            }
        });

        txt_password.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        btn_enter.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn_enter.setText("Ingresar");
        btn_enter.setActionCommand("AceptarK");
        btn_enter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_enterActionPerformed(evt);
            }
        });

        btn_crear.setBackground(new java.awt.Color(40, 147, 153));
        btn_crear.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btn_crear.setForeground(new java.awt.Color(255, 255, 255));
        btn_crear.setText("Crear Cuenta");
        btn_crear.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_crear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_crearActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Wallpeper_RegistroLayout = new javax.swing.GroupLayout(Wallpeper_Registro);
        Wallpeper_Registro.setLayout(Wallpeper_RegistroLayout);
        Wallpeper_RegistroLayout.setHorizontalGroup(
            Wallpeper_RegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Wallpeper_RegistroLayout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addGroup(Wallpeper_RegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Wallpeper_RegistroLayout.createSequentialGroup()
                        .addComponent(label_contraseña)
                        .addGap(18, 18, 18))
                    .addGroup(Wallpeper_RegistroLayout.createSequentialGroup()
                        .addComponent(label_usuario)
                        .addGap(53, 53, 53)))
                .addGroup(Wallpeper_RegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Wallpeper_RegistroLayout.createSequentialGroup()
                        .addComponent(txt_password, javax.swing.GroupLayout.DEFAULT_SIZE, 189, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(vist, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(83, 83, 83))
                    .addGroup(Wallpeper_RegistroLayout.createSequentialGroup()
                        .addGroup(Wallpeper_RegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn_enter, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_userName, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Wallpeper_RegistroLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(Wallpeper_RegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Wallpeper_RegistroLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(64, 64, 64))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Wallpeper_RegistroLayout.createSequentialGroup()
                        .addComponent(btn_crear)
                        .addGap(179, 179, 179))))
        );
        Wallpeper_RegistroLayout.setVerticalGroup(
            Wallpeper_RegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Wallpeper_RegistroLayout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(jLabel1)
                .addGap(39, 39, 39)
                .addGroup(Wallpeper_RegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_usuario)
                    .addComponent(txt_userName, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(Wallpeper_RegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Wallpeper_RegistroLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(Wallpeper_RegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(label_contraseña)
                            .addComponent(txt_password, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Wallpeper_RegistroLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(vist, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(btn_enter, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_crear)
                .addGap(76, 76, 76))
        );

        vist.getAccessibleContext().setAccessibleParent(txt_password);

        getContentPane().add(Wallpeper_Registro, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 0, 500, 400));
        Wallpeper_Registro.getAccessibleContext().setAccessibleName("");

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setMaximumSize(new java.awt.Dimension(930, 420));
        jPanel2.setName(""); // NOI18N

        Wallpaper.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/log_market.jpeg"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addComponent(Wallpaper)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Wallpaper, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 440, 400));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_userNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_userNameActionPerformed
        // para que sirva el enter
        txt_password.requestFocus();
    }//GEN-LAST:event_txt_userNameActionPerformed

    private void btn_enterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_enterActionPerformed

        String correoIngresado = txt_userName.getText().trim();
    String passwordIngresado = new String(txt_password.getPassword()).trim();

    // 1. Validaciones
    if (!correoIngresado.contains("@")) {
        javax.swing.JOptionPane.showMessageDialog(this, "El usuario Inexistente");
        return;
    }

    // 2. Administrador fijo
    if (correoIngresado.equals("SuperSale@uni.edu.ni") && passwordIngresado.equals("UNIALMAMATER")) {
        javax.swing.JOptionPane.showMessageDialog(this, "Bienvenido Administrador");
        new Views.Gestion().setVisible(true);
        this.dispose();
        return;
    }

    // 3. Consulta de Diagnóstico
    String sql = "SELECT correo, contrasena FROM usuarios WHERE correo = ?";
    
    try (java.sql.Connection con = Data_base.Conexion.conectar();
         java.sql.PreparedStatement pst = con.prepareStatement(sql)) {
        
        pst.setString(1, correoIngresado);
        java.sql.ResultSet rs = pst.executeQuery();
        
        if (rs.next()) {
            String passBD = rs.getString("contrasena");
            System.out.println("DEBUG: Encontré correo: " + rs.getString("correo"));
            System.out.println("DEBUG: Contraseña en BD: " + passBD);
            System.out.println("DEBUG: Contraseña ingresada: " + passwordIngresado);

            if (passBD.equals(passwordIngresado)) {
                javax.swing.JOptionPane.showMessageDialog(this, "Bienvenido");
                new Views.Gestion().setVisible(true);
                this.dispose();
            } else {
                javax.swing.JOptionPane.showMessageDialog(this, "Contraseña incorrecta. BD dice: " + passBD);
            }
        } else {
            javax.swing.JOptionPane.showMessageDialog(this, "Usuario no existe en la base de datos.");
        }
    } catch (java.sql.SQLException e) {
        javax.swing.JOptionPane.showMessageDialog(this, "Error SQL: " + e.getMessage());
    }

    }//GEN-LAST:event_btn_enterActionPerformed

    private void btn_crearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_crearActionPerformed
        // para ingresar ala creaciones de cuentas nuevas
        
        Create_accont cuenta = new Create_accont();
        cuenta.setVisible(true);
        this.dispose();
    
    }//GEN-LAST:event_btn_crearActionPerformed

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
        java.awt.EventQueue.invokeLater(() -> new login().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Wallpaper;
    private javax.swing.JPanel Wallpeper_Registro;
    private javax.swing.JButton btn_crear;
    private javax.swing.JButton btn_enter;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel label_contraseña;
    private javax.swing.JLabel label_usuario;
    private javax.swing.JPasswordField txt_password;
    private javax.swing.JTextField txt_userName;
    private java.awt.Checkbox vist;
    // End of variables declaration//GEN-END:variables
}
