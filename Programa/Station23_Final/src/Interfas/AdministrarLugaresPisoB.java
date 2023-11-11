/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Interfas;

import clases.Ubicacion;
import Base_De_Datos.DaoUbicacion;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JOptionPane;

/**
 *
 * @author Braya
 */
public class AdministrarLugaresPisoB extends javax.swing.JFrame {

    DaoUbicacion dao = new DaoUbicacion();

    public AdministrarLugaresPisoB() {
        initComponents();
        this.setLocationRelativeTo(null);
        validarTodo();
    }

    
    private void validarTodo(){
        validar(jbtUbicacionB1);
        validar(jbtUbicacionB2);
        validar(jbtUbicacionB3);
        validar(jbtUbicacionB4);
        validar(jbtUbicacionB5);
        validar(jbtUbicacionB6);
        validar(jbtUbicacionB7);
        validar(jbtUbicacionB8);
        validar(jbtUbicacionB9);
        validar(jbtUbicacionB10);
        validar(jbtUbicacionB11);
        validar(jbtUbicacionB12);
    }
    
    private void validar(JButton btn) {
        Ubicacion ubi = dao.ubicacionGet(btn.getText());
        String estado = ubi.getEstado();
        switch (estado) {
            case "libre" -> {
                btn.setBackground(Color.green);
            }
            case "ocupado" -> {
                btn.setBackground(Color.yellow);
                btn.setEnabled(false);
            }
            case "bloqueado" -> {
                btn.setBackground(Color.red);
            }
            default -> {

            }
        }
    }

    private void confirmarBloqueoLugar(JButton btn) {
        Ubicacion ubi = dao.ubicacionGet(btn.getText());
        String estado = ubi.getEstado();
        if (estado.equals("libre")) {
            Object[] options = {"Bloquear", "Cancelar"};
            int selection = JOptionPane.showOptionDialog(
                    this,
                    "¿Esta seguro de bloquear este espacio?",
                    "Bloqueo de Estacionamiento",
                    JOptionPane.DEFAULT_OPTION,
                    JOptionPane.PLAIN_MESSAGE,
                    null,
                    options,
                    options[0]
            );
            if (selection == 0) {
                String idLugar = btn.getText();
                dao.ubicacionUpdEstado(idLugar, "bloqueado");
                this.dispose();
                AdministrarLugaresPisoB alpa = new AdministrarLugaresPisoB();
                alpa.setVisible(true);
            }
        } else if (estado.equals("bloqueado")) {
            Object[] options = {"Habiliar", "Cancelar"};
            int selection = JOptionPane.showOptionDialog(
                    this,
                    "¿Esta seguro de habilitar este espacio?",
                    "Bloqueo de Estacionamiento",
                    JOptionPane.DEFAULT_OPTION,
                    JOptionPane.PLAIN_MESSAGE,
                    null,
                    options,
                    options[0]
            );
            if (selection == 0) {
                String idLugar = btn.getText();
                dao.ubicacionUpdEstado(idLugar, "libre");
                this.dispose();
                AdministrarLugaresPisoB alpa = new AdministrarLugaresPisoB();
                alpa.setVisible(true);
            }
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jbtUbicacionB2 = new javax.swing.JButton();
        jbtUbicacionB1 = new javax.swing.JButton();
        jbtUbicacionB4 = new javax.swing.JButton();
        jbtUbicacionB3 = new javax.swing.JButton();
        jbtUbicacionB5 = new javax.swing.JButton();
        jbtUbicacionB6 = new javax.swing.JButton();
        jbtUbicacionB7 = new javax.swing.JButton();
        jbtUbicacionB8 = new javax.swing.JButton();
        jbtUbicacionB9 = new javax.swing.JButton();
        jbtUbicacionB10 = new javax.swing.JButton();
        jbtUbicacionB11 = new javax.swing.JButton();
        jbtUbicacionB12 = new javax.swing.JButton();
        jbtRetroceder = new javax.swing.JButton();
        jbtPisoB = new javax.swing.JButton();
        jbtPisoA = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(36, 35, 35));
        jPanel1.setPreferredSize(new java.awt.Dimension(570, 505));

        jbtUbicacionB2.setBackground(new java.awt.Color(255, 255, 102));
        jbtUbicacionB2.setFont(new java.awt.Font("Racing Sans One", 0, 18)); // NOI18N
        jbtUbicacionB2.setText("B2");
        jbtUbicacionB2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtUbicacionB2ActionPerformed(evt);
            }
        });

        jbtUbicacionB1.setBackground(new java.awt.Color(255, 255, 102));
        jbtUbicacionB1.setFont(new java.awt.Font("Racing Sans One", 0, 18)); // NOI18N
        jbtUbicacionB1.setText("B1");
        jbtUbicacionB1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtUbicacionB1ActionPerformed(evt);
            }
        });

        jbtUbicacionB4.setBackground(new java.awt.Color(255, 255, 102));
        jbtUbicacionB4.setFont(new java.awt.Font("Racing Sans One", 0, 18)); // NOI18N
        jbtUbicacionB4.setText("B4");
        jbtUbicacionB4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtUbicacionB4ActionPerformed(evt);
            }
        });

        jbtUbicacionB3.setBackground(new java.awt.Color(255, 255, 102));
        jbtUbicacionB3.setFont(new java.awt.Font("Racing Sans One", 0, 18)); // NOI18N
        jbtUbicacionB3.setText("B3");
        jbtUbicacionB3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtUbicacionB3ActionPerformed(evt);
            }
        });

        jbtUbicacionB5.setBackground(new java.awt.Color(255, 255, 102));
        jbtUbicacionB5.setFont(new java.awt.Font("Racing Sans One", 0, 18)); // NOI18N
        jbtUbicacionB5.setText("B5");
        jbtUbicacionB5.setToolTipText("");
        jbtUbicacionB5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtUbicacionB5ActionPerformed(evt);
            }
        });

        jbtUbicacionB6.setBackground(new java.awt.Color(255, 255, 102));
        jbtUbicacionB6.setFont(new java.awt.Font("Racing Sans One", 0, 18)); // NOI18N
        jbtUbicacionB6.setText("B6");
        jbtUbicacionB6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtUbicacionB6ActionPerformed(evt);
            }
        });

        jbtUbicacionB7.setBackground(new java.awt.Color(255, 255, 102));
        jbtUbicacionB7.setFont(new java.awt.Font("Racing Sans One", 0, 18)); // NOI18N
        jbtUbicacionB7.setText("B7");
        jbtUbicacionB7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtUbicacionB7ActionPerformed(evt);
            }
        });

        jbtUbicacionB8.setBackground(new java.awt.Color(255, 255, 102));
        jbtUbicacionB8.setFont(new java.awt.Font("Racing Sans One", 0, 18)); // NOI18N
        jbtUbicacionB8.setText("B8");
        jbtUbicacionB8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtUbicacionB8ActionPerformed(evt);
            }
        });

        jbtUbicacionB9.setBackground(new java.awt.Color(255, 255, 102));
        jbtUbicacionB9.setFont(new java.awt.Font("Racing Sans One", 0, 18)); // NOI18N
        jbtUbicacionB9.setText("B9");
        jbtUbicacionB9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtUbicacionB9ActionPerformed(evt);
            }
        });

        jbtUbicacionB10.setBackground(new java.awt.Color(255, 255, 102));
        jbtUbicacionB10.setFont(new java.awt.Font("Racing Sans One", 0, 18)); // NOI18N
        jbtUbicacionB10.setText("B10");
        jbtUbicacionB10.setToolTipText("");
        jbtUbicacionB10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtUbicacionB10ActionPerformed(evt);
            }
        });

        jbtUbicacionB11.setBackground(new java.awt.Color(255, 255, 102));
        jbtUbicacionB11.setFont(new java.awt.Font("Racing Sans One", 0, 18)); // NOI18N
        jbtUbicacionB11.setText("B11");
        jbtUbicacionB11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtUbicacionB11ActionPerformed(evt);
            }
        });

        jbtUbicacionB12.setBackground(new java.awt.Color(255, 255, 102));
        jbtUbicacionB12.setFont(new java.awt.Font("Racing Sans One", 0, 18)); // NOI18N
        jbtUbicacionB12.setText("B12");
        jbtUbicacionB12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtUbicacionB12ActionPerformed(evt);
            }
        });

        jbtRetroceder.setBackground(new java.awt.Color(36, 35, 35));
        jbtRetroceder.setFont(new java.awt.Font("Racing Sans One", 0, 18)); // NOI18N
        jbtRetroceder.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/salir.jpeg"))); // NOI18N
        jbtRetroceder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtRetrocederActionPerformed(evt);
            }
        });

        jbtPisoB.setBackground(new java.awt.Color(102, 204, 255));
        jbtPisoB.setFont(new java.awt.Font("Racing Sans One", 0, 18)); // NOI18N
        jbtPisoB.setText("Piso b");
        jbtPisoB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtPisoBActionPerformed(evt);
            }
        });

        jbtPisoA.setBackground(new java.awt.Color(102, 204, 255));
        jbtPisoA.setFont(new java.awt.Font("Racing Sans One", 0, 18)); // NOI18N
        jbtPisoA.setText("Piso a");
        jbtPisoA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtPisoAActionPerformed(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Racing Sans One", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Bloqueo de Ubicaion ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jbtUbicacionB5, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(47, 47, 47)
                                    .addComponent(jbtUbicacionB6, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(46, 46, 46)
                                    .addComponent(jbtUbicacionB7, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(51, 51, 51)
                                    .addComponent(jbtUbicacionB8, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jbtUbicacionB1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(47, 47, 47)
                                    .addComponent(jbtUbicacionB2, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(46, 46, 46)
                                    .addComponent(jbtUbicacionB3, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(51, 51, 51)
                                    .addComponent(jbtUbicacionB4, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jbtUbicacionB9, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(47, 47, 47)
                                        .addComponent(jbtUbicacionB10, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(46, 46, 46))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jbtPisoA, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(88, 88, 88)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jbtPisoB, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jbtUbicacionB11, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(51, 51, 51)
                                        .addComponent(jbtUbicacionB12, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(0, 37, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(80, 80, 80)
                        .addComponent(jbtRetroceder)))
                .addGap(26, 26, 26))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jbtRetroceder)
                        .addGap(37, 37, 37))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtUbicacionB2, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtUbicacionB4, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtUbicacionB1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtUbicacionB3, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtUbicacionB6, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtUbicacionB8, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtUbicacionB5, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtUbicacionB7, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtUbicacionB10, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtUbicacionB12, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtUbicacionB9, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtUbicacionB11, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 108, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtPisoB, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtPisoA, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(69, 69, 69))
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

    private void jbtUbicacionB2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtUbicacionB2ActionPerformed
        confirmarBloqueoLugar(jbtUbicacionB2);
    }//GEN-LAST:event_jbtUbicacionB2ActionPerformed

    private void jbtUbicacionB1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtUbicacionB1ActionPerformed
        confirmarBloqueoLugar(jbtUbicacionB1);
    }//GEN-LAST:event_jbtUbicacionB1ActionPerformed

    private void jbtUbicacionB4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtUbicacionB4ActionPerformed
        confirmarBloqueoLugar(jbtUbicacionB4);
    }//GEN-LAST:event_jbtUbicacionB4ActionPerformed

    private void jbtUbicacionB3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtUbicacionB3ActionPerformed
        confirmarBloqueoLugar(jbtUbicacionB3);
    }//GEN-LAST:event_jbtUbicacionB3ActionPerformed

    private void jbtUbicacionB5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtUbicacionB5ActionPerformed
        confirmarBloqueoLugar(jbtUbicacionB5);
    }//GEN-LAST:event_jbtUbicacionB5ActionPerformed

    private void jbtUbicacionB6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtUbicacionB6ActionPerformed
        confirmarBloqueoLugar(jbtUbicacionB6);
    }//GEN-LAST:event_jbtUbicacionB6ActionPerformed

    private void jbtUbicacionB7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtUbicacionB7ActionPerformed
        confirmarBloqueoLugar(jbtUbicacionB7);
    }//GEN-LAST:event_jbtUbicacionB7ActionPerformed

    private void jbtUbicacionB8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtUbicacionB8ActionPerformed
        confirmarBloqueoLugar(jbtUbicacionB8);
    }//GEN-LAST:event_jbtUbicacionB8ActionPerformed

    private void jbtUbicacionB9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtUbicacionB9ActionPerformed
        confirmarBloqueoLugar(jbtUbicacionB9);
    }//GEN-LAST:event_jbtUbicacionB9ActionPerformed

    private void jbtUbicacionB10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtUbicacionB10ActionPerformed
        confirmarBloqueoLugar(jbtUbicacionB10);
    }//GEN-LAST:event_jbtUbicacionB10ActionPerformed

    private void jbtUbicacionB11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtUbicacionB11ActionPerformed
        confirmarBloqueoLugar(jbtUbicacionB11);
    }//GEN-LAST:event_jbtUbicacionB11ActionPerformed

    private void jbtUbicacionB12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtUbicacionB12ActionPerformed
        confirmarBloqueoLugar(jbtUbicacionB12);
    }//GEN-LAST:event_jbtUbicacionB12ActionPerformed

    private void jbtPisoBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtPisoBActionPerformed
        AdministrarLugaresPisoB pisob = new AdministrarLugaresPisoB();
        pisob.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jbtPisoBActionPerformed

    private void jbtPisoAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtPisoAActionPerformed
        AdministrarLugaresPisoA pisoa = new AdministrarLugaresPisoA();
        pisoa.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jbtPisoAActionPerformed

    private void jbtRetrocederActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtRetrocederActionPerformed
        InicioAdministrador inicioAdministrador = new InicioAdministrador();
        inicioAdministrador.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jbtRetrocederActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton jbtPisoA;
    private javax.swing.JButton jbtPisoB;
    private javax.swing.JButton jbtRetroceder;
    private javax.swing.JButton jbtUbicacionB1;
    private javax.swing.JButton jbtUbicacionB10;
    private javax.swing.JButton jbtUbicacionB11;
    private javax.swing.JButton jbtUbicacionB12;
    private javax.swing.JButton jbtUbicacionB2;
    private javax.swing.JButton jbtUbicacionB3;
    private javax.swing.JButton jbtUbicacionB4;
    private javax.swing.JButton jbtUbicacionB5;
    private javax.swing.JButton jbtUbicacionB6;
    private javax.swing.JButton jbtUbicacionB7;
    private javax.swing.JButton jbtUbicacionB8;
    private javax.swing.JButton jbtUbicacionB9;
    // End of variables declaration//GEN-END:variables
}
