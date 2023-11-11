/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Interfas;

import clases.JPanelColor;
import clases.JPanelConFondo;
import Base_De_Datos.DaoLogin;
import javax.swing.JOptionPane;

/**
 *
 * @author Braya
 */
public class Login extends javax.swing.JFrame {

    DaoLogin daoLogin = new DaoLogin();

    public Login() {
        initComponents();
        this.setLocationRelativeTo(null);
        JPanelConFondo panelFondo = new JPanelConFondo("src/img/fondo.png");
        panelFondo.setBounds(0, 0, jpnlFondoImagen.getWidth(), jpnlFondoImagen.getHeight());
        jpnlFondoImagen.add(panelFondo);
        jpnlFondoImagen.setOpaque(false);

        JPanelColor panelcolor = new JPanelColor();
        panelcolor.setBounds(0, 0, jpnlFondoImagen.getWidth(), jpnlFondoImagen.getHeight());
        jpnlFondoColor.add(panelcolor);
    }

    private Boolean Validar() {
        Boolean validar;
        String pass = new String(jpfContraseña.getPassword());
        validar = daoLogin.ubicacionGetCodigo(jtfUsuario.getText(), pass);
        return validar;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jpnlFondoColor = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jpnlFondoImagen = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jtfUsuario = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jpfContraseña = new javax.swing.JPasswordField();
        btnAdministrador = new javax.swing.JButton();
        btnCliente = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jpnlFondoColor.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Racing Sans One", 1, 24)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/logo_station23.png"))); // NOI18N

        javax.swing.GroupLayout jpnlFondoColorLayout = new javax.swing.GroupLayout(jpnlFondoColor);
        jpnlFondoColor.setLayout(jpnlFondoColorLayout);
        jpnlFondoColorLayout.setHorizontalGroup(
            jpnlFondoColorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpnlFondoColorLayout.createSequentialGroup()
                .addContainerGap(105, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(93, 93, 93))
        );
        jpnlFondoColorLayout.setVerticalGroup(
            jpnlFondoColorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnlFondoColorLayout.createSequentialGroup()
                .addGap(182, 182, 182)
                .addComponent(jLabel1)
                .addContainerGap(188, Short.MAX_VALUE))
        );

        jPanel1.add(jpnlFondoColor, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jpnlFondoImagen.setBackground(new java.awt.Color(255, 255, 255));
        jpnlFondoImagen.setPreferredSize(new java.awt.Dimension(350, 520));

        jLabel2.setFont(new java.awt.Font("Racing Sans One", 1, 24)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Usuario:");

        jLabel3.setFont(new java.awt.Font("Racing Sans One", 1, 24)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Iniciar Sesión");

        jtfUsuario.setFont(new java.awt.Font("Racing Sans One", 1, 24)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Racing Sans One", 1, 24)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Contraseña:");

        jpfContraseña.setFont(new java.awt.Font("Racing Sans One", 1, 24)); // NOI18N

        btnAdministrador.setFont(new java.awt.Font("Racing Sans One", 1, 16)); // NOI18N
        btnAdministrador.setForeground(new java.awt.Color(249, 138, 7));
        btnAdministrador.setText("Ingresar como Administrador");
        btnAdministrador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdministradorActionPerformed(evt);
            }
        });

        btnCliente.setBackground(new java.awt.Color(249, 138, 7));
        btnCliente.setFont(new java.awt.Font("Racing Sans One", 1, 18)); // NOI18N
        btnCliente.setForeground(new java.awt.Color(255, 255, 255));
        btnCliente.setText("Ingresar como Cliente");
        btnCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClienteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpnlFondoImagenLayout = new javax.swing.GroupLayout(jpnlFondoImagen);
        jpnlFondoImagen.setLayout(jpnlFondoImagenLayout);
        jpnlFondoImagenLayout.setHorizontalGroup(
            jpnlFondoImagenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnlFondoImagenLayout.createSequentialGroup()
                .addGap(97, 97, 97)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(76, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpnlFondoImagenLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jpnlFondoImagenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jtfUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, 290, Short.MAX_VALUE)
                    .addGroup(jpnlFondoImagenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jpfContraseña)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jpnlFondoImagenLayout.createSequentialGroup()
                            .addGap(8, 8, 8)
                            .addGroup(jpnlFondoImagenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel4)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(130, 130, 130))
                        .addComponent(btnAdministrador, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 290, Short.MAX_VALUE)
                        .addComponent(btnCliente, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(28, 28, 28))
        );
        jpnlFondoImagenLayout.setVerticalGroup(
            jpnlFondoImagenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnlFondoImagenLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jtfUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jpfContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addComponent(btnAdministrador, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(43, Short.MAX_VALUE))
        );

        jPanel1.add(jpnlFondoImagen, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 0, -1, -1));

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

    private void btnAdministradorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdministradorActionPerformed
        Boolean validar = Validar();
        if (validar) {
           InicioAdministrador inicioAdmin = new InicioAdministrador();
            inicioAdmin.setVisible(true);
            this.dispose();
        } else {
            JOptionPane.showMessageDialog(this, daoLogin.getMensaje(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnAdministradorActionPerformed

    private void btnClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClienteActionPerformed
        Boolean validar = Validar();
        if (validar) {
            InicioCliente inicioCliente = new InicioCliente();
            inicioCliente.setVisible(true);
            this.dispose();
        } else {
            JOptionPane.showMessageDialog(this, daoLogin.getMensaje(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnClienteActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdministrador;
    private javax.swing.JButton btnCliente;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jpfContraseña;
    private javax.swing.JPanel jpnlFondoColor;
    private javax.swing.JPanel jpnlFondoImagen;
    private javax.swing.JTextField jtfUsuario;
    // End of variables declaration//GEN-END:variables
}
