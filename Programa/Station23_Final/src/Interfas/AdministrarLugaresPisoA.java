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
public class AdministrarLugaresPisoA extends javax.swing.JFrame {

    DaoUbicacion dao = new DaoUbicacion();

    public AdministrarLugaresPisoA() {
        initComponents();
        this.setLocationRelativeTo(null);
        validarTodo();
    }

    private void validarTodo() {
        validar(jbtUbicacionA1);
        validar(jbtUbicacionA2);
        validar(jbtUbicacionA3);
        validar(jbtUbicacionA4);
        validar(jbtUbicacionA5);
        validar(jbtUbicacionA6);
        validar(jbtUbicacionA7);
        validar(jbtUbicacionA8);
        validar(jbtUbicacionA9);
        validar(jbtUbicacionA10);
        validar(jbtUbicacionA11);
        validar(jbtUbicacionA12);
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
                AdministrarLugaresPisoA alpa = new AdministrarLugaresPisoA();
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
                AdministrarLugaresPisoA alpa = new AdministrarLugaresPisoA();
                alpa.setVisible(true);
            }
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jbtUbicacionA2 = new javax.swing.JButton();
        jbtUbicacionA1 = new javax.swing.JButton();
        jbtUbicacionA4 = new javax.swing.JButton();
        jbtUbicacionA3 = new javax.swing.JButton();
        jbtUbicacionA5 = new javax.swing.JButton();
        jbtUbicacionA6 = new javax.swing.JButton();
        jbtUbicacionA7 = new javax.swing.JButton();
        jbtUbicacionA8 = new javax.swing.JButton();
        jbtUbicacionA9 = new javax.swing.JButton();
        jbtUbicacionA10 = new javax.swing.JButton();
        jbtUbicacionA11 = new javax.swing.JButton();
        jbtUbicacionA12 = new javax.swing.JButton();
        jbtRetroceder = new javax.swing.JButton();
        jbtPisoB = new javax.swing.JButton();
        jbtPisoA = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(36, 35, 35));
        jPanel1.setPreferredSize(new java.awt.Dimension(570, 505));

        jbtUbicacionA2.setBackground(new java.awt.Color(255, 255, 102));
        jbtUbicacionA2.setFont(new java.awt.Font("Racing Sans One", 0, 18)); // NOI18N
        jbtUbicacionA2.setText("A2");
        jbtUbicacionA2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtUbicacionA2ActionPerformed(evt);
            }
        });

        jbtUbicacionA1.setBackground(new java.awt.Color(255, 255, 102));
        jbtUbicacionA1.setFont(new java.awt.Font("Racing Sans One", 0, 18)); // NOI18N
        jbtUbicacionA1.setText("A1");
        jbtUbicacionA1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtUbicacionA1ActionPerformed(evt);
            }
        });

        jbtUbicacionA4.setBackground(new java.awt.Color(255, 255, 102));
        jbtUbicacionA4.setFont(new java.awt.Font("Racing Sans One", 0, 18)); // NOI18N
        jbtUbicacionA4.setText("A4");
        jbtUbicacionA4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtUbicacionA4ActionPerformed(evt);
            }
        });

        jbtUbicacionA3.setBackground(new java.awt.Color(255, 255, 102));
        jbtUbicacionA3.setFont(new java.awt.Font("Racing Sans One", 0, 18)); // NOI18N
        jbtUbicacionA3.setText("A3");
        jbtUbicacionA3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtUbicacionA3ActionPerformed(evt);
            }
        });

        jbtUbicacionA5.setBackground(new java.awt.Color(255, 255, 102));
        jbtUbicacionA5.setFont(new java.awt.Font("Racing Sans One", 0, 18)); // NOI18N
        jbtUbicacionA5.setText("A5");
        jbtUbicacionA5.setToolTipText("");
        jbtUbicacionA5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtUbicacionA5ActionPerformed(evt);
            }
        });

        jbtUbicacionA6.setBackground(new java.awt.Color(255, 255, 102));
        jbtUbicacionA6.setFont(new java.awt.Font("Racing Sans One", 0, 18)); // NOI18N
        jbtUbicacionA6.setText("A6");
        jbtUbicacionA6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtUbicacionA6ActionPerformed(evt);
            }
        });

        jbtUbicacionA7.setBackground(new java.awt.Color(255, 255, 102));
        jbtUbicacionA7.setFont(new java.awt.Font("Racing Sans One", 0, 18)); // NOI18N
        jbtUbicacionA7.setText("A7");
        jbtUbicacionA7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtUbicacionA7ActionPerformed(evt);
            }
        });

        jbtUbicacionA8.setBackground(new java.awt.Color(255, 255, 102));
        jbtUbicacionA8.setFont(new java.awt.Font("Racing Sans One", 0, 18)); // NOI18N
        jbtUbicacionA8.setText("A8");
        jbtUbicacionA8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtUbicacionA8ActionPerformed(evt);
            }
        });

        jbtUbicacionA9.setBackground(new java.awt.Color(255, 255, 102));
        jbtUbicacionA9.setFont(new java.awt.Font("Racing Sans One", 0, 18)); // NOI18N
        jbtUbicacionA9.setText("A9");
        jbtUbicacionA9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtUbicacionA9ActionPerformed(evt);
            }
        });

        jbtUbicacionA10.setBackground(new java.awt.Color(255, 255, 102));
        jbtUbicacionA10.setFont(new java.awt.Font("Racing Sans One", 0, 18)); // NOI18N
        jbtUbicacionA10.setText("A10");
        jbtUbicacionA10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtUbicacionA10ActionPerformed(evt);
            }
        });

        jbtUbicacionA11.setBackground(new java.awt.Color(255, 255, 102));
        jbtUbicacionA11.setFont(new java.awt.Font("Racing Sans One", 0, 18)); // NOI18N
        jbtUbicacionA11.setText("A11");
        jbtUbicacionA11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtUbicacionA11ActionPerformed(evt);
            }
        });

        jbtUbicacionA12.setBackground(new java.awt.Color(255, 255, 102));
        jbtUbicacionA12.setFont(new java.awt.Font("Racing Sans One", 0, 18)); // NOI18N
        jbtUbicacionA12.setText("A12");
        jbtUbicacionA12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtUbicacionA12ActionPerformed(evt);
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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(104, 104, 104)
                .addComponent(jbtRetroceder, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jbtUbicacionA5, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(47, 47, 47)
                                    .addComponent(jbtUbicacionA6, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(46, 46, 46)
                                    .addComponent(jbtUbicacionA7, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(51, 51, 51)
                                    .addComponent(jbtUbicacionA8, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jbtUbicacionA1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(47, 47, 47)
                                    .addComponent(jbtUbicacionA2, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(46, 46, 46)
                                    .addComponent(jbtUbicacionA3, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(51, 51, 51)
                                    .addComponent(jbtUbicacionA4, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jbtUbicacionA9, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(47, 47, 47)
                                .addComponent(jbtUbicacionA10, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(46, 46, 46)
                                .addComponent(jbtUbicacionA11, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(51, 51, 51)
                                .addComponent(jbtUbicacionA12, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(151, 151, 151)
                        .addComponent(jbtPisoA, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(91, 91, 91)
                        .addComponent(jbtPisoB, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(97, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtRetroceder))
                .addGap(39, 39, 39)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtUbicacionA2, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtUbicacionA4, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtUbicacionA1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtUbicacionA3, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtUbicacionA6, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtUbicacionA8, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtUbicacionA5, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtUbicacionA7, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtUbicacionA10, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtUbicacionA12, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtUbicacionA9, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtUbicacionA11, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 108, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtPisoB, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtPisoA, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(77, 77, 77))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 601, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 514, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtUbicacionA2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtUbicacionA2ActionPerformed
        confirmarBloqueoLugar(jbtUbicacionA2);
    }//GEN-LAST:event_jbtUbicacionA2ActionPerformed

    private void jbtUbicacionA1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtUbicacionA1ActionPerformed
        confirmarBloqueoLugar(jbtUbicacionA1);
    }//GEN-LAST:event_jbtUbicacionA1ActionPerformed

    private void jbtUbicacionA4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtUbicacionA4ActionPerformed
        confirmarBloqueoLugar(jbtUbicacionA4);
    }//GEN-LAST:event_jbtUbicacionA4ActionPerformed

    private void jbtUbicacionA3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtUbicacionA3ActionPerformed
        confirmarBloqueoLugar(jbtUbicacionA3);
    }//GEN-LAST:event_jbtUbicacionA3ActionPerformed

    private void jbtUbicacionA5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtUbicacionA5ActionPerformed
        confirmarBloqueoLugar(jbtUbicacionA5);
    }//GEN-LAST:event_jbtUbicacionA5ActionPerformed

    private void jbtUbicacionA6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtUbicacionA6ActionPerformed
        confirmarBloqueoLugar(jbtUbicacionA6);
    }//GEN-LAST:event_jbtUbicacionA6ActionPerformed

    private void jbtUbicacionA7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtUbicacionA7ActionPerformed
        confirmarBloqueoLugar(jbtUbicacionA7);
    }//GEN-LAST:event_jbtUbicacionA7ActionPerformed

    private void jbtUbicacionA8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtUbicacionA8ActionPerformed
        confirmarBloqueoLugar(jbtUbicacionA8);
    }//GEN-LAST:event_jbtUbicacionA8ActionPerformed

    private void jbtUbicacionA9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtUbicacionA9ActionPerformed
        confirmarBloqueoLugar(jbtUbicacionA9);
    }//GEN-LAST:event_jbtUbicacionA9ActionPerformed

    private void jbtUbicacionA10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtUbicacionA10ActionPerformed
        confirmarBloqueoLugar(jbtUbicacionA10);
    }//GEN-LAST:event_jbtUbicacionA10ActionPerformed

    private void jbtUbicacionA11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtUbicacionA11ActionPerformed
        confirmarBloqueoLugar(jbtUbicacionA11);
    }//GEN-LAST:event_jbtUbicacionA11ActionPerformed

    private void jbtUbicacionA12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtUbicacionA12ActionPerformed
        confirmarBloqueoLugar(jbtUbicacionA12);
    }//GEN-LAST:event_jbtUbicacionA12ActionPerformed

    private void jbtRetrocederActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtRetrocederActionPerformed
        InicioAdministrador inicioAdministrador = new InicioAdministrador();
        inicioAdministrador.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jbtRetrocederActionPerformed

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

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton jbtPisoA;
    private javax.swing.JButton jbtPisoB;
    private javax.swing.JButton jbtRetroceder;
    private javax.swing.JButton jbtUbicacionA1;
    private javax.swing.JButton jbtUbicacionA10;
    private javax.swing.JButton jbtUbicacionA11;
    private javax.swing.JButton jbtUbicacionA12;
    private javax.swing.JButton jbtUbicacionA2;
    private javax.swing.JButton jbtUbicacionA3;
    private javax.swing.JButton jbtUbicacionA4;
    private javax.swing.JButton jbtUbicacionA5;
    private javax.swing.JButton jbtUbicacionA6;
    private javax.swing.JButton jbtUbicacionA7;
    private javax.swing.JButton jbtUbicacionA8;
    private javax.swing.JButton jbtUbicacionA9;
    // End of variables declaration//GEN-END:variables
}
