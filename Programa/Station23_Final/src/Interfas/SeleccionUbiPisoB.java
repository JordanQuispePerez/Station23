/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Interfas;

import clases.RegistroInicial;
import clases.Ubicacion;
import Base_De_Datos.DaoUbicacion;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JOptionPane;

/**
 *
 * @author Braya
 */
public class SeleccionUbiPisoB extends javax.swing.JFrame {

    DaoUbicacion dao = new DaoUbicacion();
    RegistroInicial reg_ini;

    public SeleccionUbiPisoB() {
        initComponents();
        this.setLocationRelativeTo(null);
        jbtSiguiente.setEnabled(false);
    }

    public void setRegistroIncial(RegistroInicial rt) {
        reg_ini = rt;
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

    private void bloquearBotones() {
        jbtUbicacionB1.setEnabled(false);
        jbtUbicacionB2.setEnabled(false);
        jbtUbicacionB3.setEnabled(false);
        jbtUbicacionB4.setEnabled(false);
        jbtUbicacionB5.setEnabled(false);
        jbtUbicacionB6.setEnabled(false);
        jbtUbicacionB7.setEnabled(false);
        jbtUbicacionB8.setEnabled(false);
        jbtUbicacionB9.setEnabled(false);
        jbtUbicacionB10.setEnabled(false);
        jbtUbicacionB11.setEnabled(false);
        jbtUbicacionB12.setEnabled(false);
        jbtPisoB.setEnabled(false);
        jbtPisoA.setEnabled(false);
    }
    
    private void validar(JButton btn) {
        Ubicacion ubi = dao.ubicacionGet(btn.getText());
        String tipo_vehi = ubi.getTipo_vehiculo();
        String estado = ubi.getEstado();
        if (tipo_vehi.equalsIgnoreCase(reg_ini.getTipo_vehiculo())) {
            switch (estado) {
                case "libre" -> {
                    btn.setBackground(new Color(0xFE, 0xD3, 0x6B));
                }
                case "ocupado" -> {
                    btn.setBackground(new Color(0xFD, 0x39, 0x39));
                    btn.setEnabled(false);
                }
                case "deshabilitado" -> {
                    btn.setBackground(new Color(0xD9, 0xD9, 0xD9));
                    btn.setEnabled(false);
                }
                default -> { 
                    btn.setBackground(new Color(0xD9, 0xD9, 0xD9));
                    btn.setEnabled(false);

                }
            }
        } else {
            btn.setBackground(Color.white);
            btn.setEnabled(false);
        }
    }

    private void confirmarLugar(JButton btn) {
        int opcion = JOptionPane.showOptionDialog(
                this,
                "¿Estas seguro de elegir este lugar?",
                "Confirmación",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE,
                null,
                new Object[]{"Sí", "No"},
                "Sí"
        );
        if (opcion == JOptionPane.YES_OPTION) {
            String idLugar = btn.getText();
            reg_ini.setLugar(idLugar);
            reg_ini.setCodigo_reg(dao.ubicacionGetCodigo(idLugar));
            System.out.println(idLugar);
            dao.ubicacionUpdEstado(idLugar, "ocupado");
            bloquearBotones();
            jbtSiguiente.setEnabled(true);
        } else if (opcion == JOptionPane.NO_OPTION) {

        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
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
        jbtSiguiente = new javax.swing.JButton();
        jbtPisoB = new javax.swing.JButton();
        jbtPisoA = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        rSLabelFecha1 = new rojeru_san.RSLabelFecha();
        rSLabelHora1 = new rojeru_san.RSLabelHora();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        jPanel2.setBackground(new java.awt.Color(217, 217, 217));
        jPanel2.setPreferredSize(new java.awt.Dimension(42, 17));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 42, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 17, Short.MAX_VALUE)
        );

        jPanel4.setBackground(new java.awt.Color(254, 211, 107));
        jPanel4.setPreferredSize(new java.awt.Dimension(42, 17));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 42, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 17, Short.MAX_VALUE)
        );

        jPanel3.setBackground(new java.awt.Color(253, 57, 57));
        jPanel3.setPreferredSize(new java.awt.Dimension(42, 17));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 42, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 17, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(59, 54, 47));
        jPanel1.setPreferredSize(new java.awt.Dimension(570, 505));

        jbtUbicacionB2.setBackground(new java.awt.Color(255, 255, 102));
        jbtUbicacionB2.setFont(new java.awt.Font("Racing Sans One", 1, 18)); // NOI18N
        jbtUbicacionB2.setText("B2");
        jbtUbicacionB2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtUbicacionB2ActionPerformed(evt);
            }
        });

        jbtUbicacionB1.setBackground(new java.awt.Color(255, 255, 102));
        jbtUbicacionB1.setFont(new java.awt.Font("Racing Sans One", 1, 18)); // NOI18N
        jbtUbicacionB1.setText("B1");
        jbtUbicacionB1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtUbicacionB1ActionPerformed(evt);
            }
        });

        jbtUbicacionB4.setBackground(new java.awt.Color(255, 255, 102));
        jbtUbicacionB4.setFont(new java.awt.Font("Racing Sans One", 1, 18)); // NOI18N
        jbtUbicacionB4.setText("B4");
        jbtUbicacionB4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtUbicacionB4ActionPerformed(evt);
            }
        });

        jbtUbicacionB3.setBackground(new java.awt.Color(255, 255, 102));
        jbtUbicacionB3.setFont(new java.awt.Font("Racing Sans One", 1, 18)); // NOI18N
        jbtUbicacionB3.setText("B3");
        jbtUbicacionB3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtUbicacionB3ActionPerformed(evt);
            }
        });

        jbtUbicacionB5.setBackground(new java.awt.Color(255, 255, 102));
        jbtUbicacionB5.setFont(new java.awt.Font("Racing Sans One", 1, 18)); // NOI18N
        jbtUbicacionB5.setText("B5");
        jbtUbicacionB5.setToolTipText("");
        jbtUbicacionB5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtUbicacionB5ActionPerformed(evt);
            }
        });

        jbtUbicacionB6.setBackground(new java.awt.Color(255, 255, 102));
        jbtUbicacionB6.setFont(new java.awt.Font("Racing Sans One", 1, 18)); // NOI18N
        jbtUbicacionB6.setText("B6");
        jbtUbicacionB6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtUbicacionB6ActionPerformed(evt);
            }
        });

        jbtUbicacionB7.setBackground(new java.awt.Color(255, 255, 102));
        jbtUbicacionB7.setFont(new java.awt.Font("Racing Sans One", 1, 18)); // NOI18N
        jbtUbicacionB7.setText("B7");
        jbtUbicacionB7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtUbicacionB7ActionPerformed(evt);
            }
        });

        jbtUbicacionB8.setBackground(new java.awt.Color(255, 255, 102));
        jbtUbicacionB8.setFont(new java.awt.Font("Racing Sans One", 1, 18)); // NOI18N
        jbtUbicacionB8.setText("B8");
        jbtUbicacionB8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtUbicacionB8ActionPerformed(evt);
            }
        });

        jbtUbicacionB9.setBackground(new java.awt.Color(255, 255, 102));
        jbtUbicacionB9.setFont(new java.awt.Font("Racing Sans One", 1, 18)); // NOI18N
        jbtUbicacionB9.setText("B9");
        jbtUbicacionB9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtUbicacionB9ActionPerformed(evt);
            }
        });

        jbtUbicacionB10.setBackground(new java.awt.Color(255, 255, 102));
        jbtUbicacionB10.setFont(new java.awt.Font("Racing Sans One", 1, 18)); // NOI18N
        jbtUbicacionB10.setText("B10");
        jbtUbicacionB10.setToolTipText("");
        jbtUbicacionB10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtUbicacionB10ActionPerformed(evt);
            }
        });

        jbtUbicacionB11.setBackground(new java.awt.Color(255, 255, 102));
        jbtUbicacionB11.setFont(new java.awt.Font("Racing Sans One", 1, 18)); // NOI18N
        jbtUbicacionB11.setText("B11");
        jbtUbicacionB11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtUbicacionB11ActionPerformed(evt);
            }
        });

        jbtUbicacionB12.setBackground(new java.awt.Color(255, 255, 102));
        jbtUbicacionB12.setFont(new java.awt.Font("Racing Sans One", 1, 18)); // NOI18N
        jbtUbicacionB12.setText("B12");
        jbtUbicacionB12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtUbicacionB12ActionPerformed(evt);
            }
        });

        jbtSiguiente.setBackground(new java.awt.Color(167, 190, 56));
        jbtSiguiente.setFont(new java.awt.Font("Racing Sans One", 1, 18)); // NOI18N
        jbtSiguiente.setText("Siguiente");
        jbtSiguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtSiguienteActionPerformed(evt);
            }
        });

        jbtPisoB.setBackground(new java.awt.Color(102, 204, 255));
        jbtPisoB.setFont(new java.awt.Font("Racing Sans One", 1, 18)); // NOI18N
        jbtPisoB.setText("Piso B");
        jbtPisoB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtPisoBActionPerformed(evt);
            }
        });

        jbtPisoA.setBackground(new java.awt.Color(102, 204, 255));
        jbtPisoA.setFont(new java.awt.Font("Racing Sans One", 1, 18)); // NOI18N
        jbtPisoA.setText("Piso A");
        jbtPisoA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtPisoAActionPerformed(evt);
            }
        });

        jPanel5.setBackground(new java.awt.Color(217, 217, 217));
        jPanel5.setPreferredSize(new java.awt.Dimension(42, 17));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 42, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel6.setBackground(new java.awt.Color(254, 211, 107));
        jPanel6.setPreferredSize(new java.awt.Dimension(42, 17));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 42, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 23, Short.MAX_VALUE)
        );

        jPanel7.setBackground(new java.awt.Color(253, 57, 57));
        jPanel7.setPreferredSize(new java.awt.Dimension(42, 17));

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 42, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 23, Short.MAX_VALUE)
        );

        jPanel8.setBackground(new java.awt.Color(249, 138, 7));

        rSLabelFecha1.setForeground(new java.awt.Color(0, 0, 0));

        rSLabelHora1.setForeground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(rSLabelFecha1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(rSLabelHora1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(rSLabelHora1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rSLabelFecha1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jLabel2.setFont(new java.awt.Font("Racing Sans One", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Desahabilitado");

        jLabel1.setFont(new java.awt.Font("Racing Sans One", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Ocupado");

        jLabel3.setFont(new java.awt.Font("Racing Sans One", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Disponible");

        jLabel4.setBackground(new java.awt.Color(245, 245, 245));
        jLabel4.setFont(new java.awt.Font("Racing Sans One", 1, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(245, 245, 245));
        jLabel4.setText("Espacios Libres");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 338, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(95, 95, 95))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(74, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jbtUbicacionB9, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(47, 47, 47)
                                .addComponent(jbtUbicacionB10, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(46, 46, 46)
                                .addComponent(jbtUbicacionB11, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(51, 51, 51)
                                .addComponent(jbtUbicacionB12, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                                    .addComponent(jbtUbicacionB4, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 62, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jbtPisoA, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jbtPisoB, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(47, 47, 47))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jbtSiguiente, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(64, 64, 64))))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
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
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE))
                        .addGap(16, 16, 16)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel3))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jbtPisoA, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbtPisoB, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jbtSiguiente, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 580, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 543, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtUbicacionB2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtUbicacionB2ActionPerformed
        confirmarLugar(jbtUbicacionB2);
    }//GEN-LAST:event_jbtUbicacionB2ActionPerformed

    private void jbtUbicacionB1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtUbicacionB1ActionPerformed
        confirmarLugar(jbtUbicacionB1);
    }//GEN-LAST:event_jbtUbicacionB1ActionPerformed

    private void jbtUbicacionB4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtUbicacionB4ActionPerformed
        confirmarLugar(jbtUbicacionB4);
    }//GEN-LAST:event_jbtUbicacionB4ActionPerformed

    private void jbtUbicacionB3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtUbicacionB3ActionPerformed
        confirmarLugar(jbtUbicacionB3);
    }//GEN-LAST:event_jbtUbicacionB3ActionPerformed

    private void jbtUbicacionB5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtUbicacionB5ActionPerformed
        confirmarLugar(jbtUbicacionB5);
    }//GEN-LAST:event_jbtUbicacionB5ActionPerformed

    private void jbtUbicacionB6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtUbicacionB6ActionPerformed
        confirmarLugar(jbtUbicacionB6);
    }//GEN-LAST:event_jbtUbicacionB6ActionPerformed

    private void jbtUbicacionB7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtUbicacionB7ActionPerformed
        confirmarLugar(jbtUbicacionB7);
    }//GEN-LAST:event_jbtUbicacionB7ActionPerformed

    private void jbtUbicacionB8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtUbicacionB8ActionPerformed
        confirmarLugar(jbtUbicacionB8);
    }//GEN-LAST:event_jbtUbicacionB8ActionPerformed

    private void jbtUbicacionB9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtUbicacionB9ActionPerformed
        confirmarLugar(jbtUbicacionB9);
    }//GEN-LAST:event_jbtUbicacionB9ActionPerformed

    private void jbtUbicacionB10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtUbicacionB10ActionPerformed
        confirmarLugar(jbtUbicacionB10);
    }//GEN-LAST:event_jbtUbicacionB10ActionPerformed

    private void jbtUbicacionB11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtUbicacionB11ActionPerformed
        confirmarLugar(jbtUbicacionB11);
    }//GEN-LAST:event_jbtUbicacionB11ActionPerformed

    private void jbtUbicacionB12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtUbicacionB12ActionPerformed
        confirmarLugar(jbtUbicacionB12);
    }//GEN-LAST:event_jbtUbicacionB12ActionPerformed

    private void jbtSiguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtSiguienteActionPerformed
        ConfirmarRegistro confirmarRegistro = new ConfirmarRegistro();
        confirmarRegistro.setRegistroIncial(reg_ini);
        confirmarRegistro.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jbtSiguienteActionPerformed

    private void jbtPisoBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtPisoBActionPerformed
        SeleccionUbiPisoB pisob = new SeleccionUbiPisoB();
        pisob.setRegistroIncial(reg_ini);
        pisob.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jbtPisoBActionPerformed

    private void jbtPisoAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtPisoAActionPerformed
        SeleccionUbiPisoA pisoa = new SeleccionUbiPisoA();
        pisoa.setRegistroIncial(reg_ini);
        pisoa.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jbtPisoAActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JButton jbtPisoA;
    private javax.swing.JButton jbtPisoB;
    private javax.swing.JButton jbtSiguiente;
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
    private rojeru_san.RSLabelFecha rSLabelFecha1;
    private rojeru_san.RSLabelHora rSLabelHora1;
    // End of variables declaration//GEN-END:variables
}
