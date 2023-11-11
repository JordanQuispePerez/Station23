/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Interfas;

import clases.JPanelConFondo;
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
public class SeleccionUbiPisoA extends javax.swing.JFrame {

    DaoUbicacion dao = new DaoUbicacion();
    RegistroInicial reg_ini;

    public SeleccionUbiPisoA() {
        initComponents();
        this.setLocationRelativeTo(null);
        jbtSiguiente.setEnabled(false);
    }

    public void setRegistroIncial(RegistroInicial rt) {
        reg_ini = rt;
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

    private void bloquearBotones() {
        jbtUbicacionA1.setEnabled(false);
        jbtUbicacionA2.setEnabled(false);
        jbtUbicacionA3.setEnabled(false);
        jbtUbicacionA4.setEnabled(false);
        jbtUbicacionA5.setEnabled(false);
        jbtUbicacionA6.setEnabled(false);
        jbtUbicacionA7.setEnabled(false);
        jbtUbicacionA8.setEnabled(false);
        jbtUbicacionA9.setEnabled(false);
        jbtUbicacionA10.setEnabled(false);
        jbtUbicacionA11.setEnabled(false);
        jbtUbicacionA12.setEnabled(false);
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

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Fondo = new javax.swing.JPanel();
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
        jbtSiguiente = new javax.swing.JButton();
        jbtPisoB = new javax.swing.JButton();
        jbtPisoA = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        rSLabelFecha1 = new rojeru_san.RSLabelFecha();
        rSLabelHora1 = new rojeru_san.RSLabelHora();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(new java.awt.Dimension(20, 50));

        Fondo.setBackground(new java.awt.Color(59, 54, 47));
        Fondo.setPreferredSize(new java.awt.Dimension(570, 505));

        jbtUbicacionA2.setBackground(new java.awt.Color(255, 255, 102));
        jbtUbicacionA2.setFont(new java.awt.Font("Racing Sans One", 1, 18)); // NOI18N
        jbtUbicacionA2.setText("A2");
        jbtUbicacionA2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtUbicacionA2ActionPerformed(evt);
            }
        });

        jbtUbicacionA1.setBackground(new java.awt.Color(255, 255, 102));
        jbtUbicacionA1.setFont(new java.awt.Font("Racing Sans One", 1, 18)); // NOI18N
        jbtUbicacionA1.setText("A1");
        jbtUbicacionA1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtUbicacionA1ActionPerformed(evt);
            }
        });

        jbtUbicacionA4.setBackground(new java.awt.Color(255, 255, 102));
        jbtUbicacionA4.setFont(new java.awt.Font("Racing Sans One", 1, 18)); // NOI18N
        jbtUbicacionA4.setText("A4");
        jbtUbicacionA4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtUbicacionA4ActionPerformed(evt);
            }
        });

        jbtUbicacionA3.setBackground(new java.awt.Color(255, 255, 102));
        jbtUbicacionA3.setFont(new java.awt.Font("Racing Sans One", 1, 18)); // NOI18N
        jbtUbicacionA3.setText("A3");
        jbtUbicacionA3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtUbicacionA3ActionPerformed(evt);
            }
        });

        jbtUbicacionA5.setBackground(new java.awt.Color(255, 255, 102));
        jbtUbicacionA5.setFont(new java.awt.Font("Racing Sans One", 1, 18)); // NOI18N
        jbtUbicacionA5.setText("A5");
        jbtUbicacionA5.setToolTipText("");
        jbtUbicacionA5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtUbicacionA5ActionPerformed(evt);
            }
        });

        jbtUbicacionA6.setBackground(new java.awt.Color(255, 255, 102));
        jbtUbicacionA6.setFont(new java.awt.Font("Racing Sans One", 1, 18)); // NOI18N
        jbtUbicacionA6.setText("A6");
        jbtUbicacionA6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtUbicacionA6ActionPerformed(evt);
            }
        });

        jbtUbicacionA7.setBackground(new java.awt.Color(255, 255, 102));
        jbtUbicacionA7.setFont(new java.awt.Font("Racing Sans One", 1, 18)); // NOI18N
        jbtUbicacionA7.setText("A7");
        jbtUbicacionA7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtUbicacionA7ActionPerformed(evt);
            }
        });

        jbtUbicacionA8.setBackground(new java.awt.Color(255, 255, 102));
        jbtUbicacionA8.setFont(new java.awt.Font("Racing Sans One", 1, 18)); // NOI18N
        jbtUbicacionA8.setText("A8");
        jbtUbicacionA8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtUbicacionA8ActionPerformed(evt);
            }
        });

        jbtUbicacionA9.setBackground(new java.awt.Color(255, 255, 102));
        jbtUbicacionA9.setFont(new java.awt.Font("Racing Sans One", 1, 18)); // NOI18N
        jbtUbicacionA9.setText("A9");
        jbtUbicacionA9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtUbicacionA9ActionPerformed(evt);
            }
        });

        jbtUbicacionA10.setBackground(new java.awt.Color(255, 255, 102));
        jbtUbicacionA10.setFont(new java.awt.Font("Racing Sans One", 1, 18)); // NOI18N
        jbtUbicacionA10.setText("A10");
        jbtUbicacionA10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtUbicacionA10ActionPerformed(evt);
            }
        });

        jbtUbicacionA11.setBackground(new java.awt.Color(255, 255, 102));
        jbtUbicacionA11.setFont(new java.awt.Font("Racing Sans One", 1, 18)); // NOI18N
        jbtUbicacionA11.setText("A11");
        jbtUbicacionA11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtUbicacionA11ActionPerformed(evt);
            }
        });

        jbtUbicacionA12.setBackground(new java.awt.Color(255, 255, 102));
        jbtUbicacionA12.setFont(new java.awt.Font("Racing Sans One", 1, 18)); // NOI18N
        jbtUbicacionA12.setText("A12");
        jbtUbicacionA12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtUbicacionA12ActionPerformed(evt);
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

        jPanel1.setBackground(new java.awt.Color(249, 138, 7));

        rSLabelFecha1.setForeground(new java.awt.Color(0, 0, 0));

        rSLabelHora1.setForeground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(rSLabelFecha1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 162, Short.MAX_VALUE)
                .addComponent(rSLabelHora1, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rSLabelFecha1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rSLabelHora1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Racing Sans One", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Ocupado");

        jLabel2.setFont(new java.awt.Font("Racing Sans One", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Desahabilitado");

        jLabel3.setFont(new java.awt.Font("Racing Sans One", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Disponible");

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
            .addGap(0, 0, Short.MAX_VALUE)
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
            .addGap(0, 24, Short.MAX_VALUE)
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
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jLabel4.setBackground(new java.awt.Color(245, 245, 245));
        jLabel4.setFont(new java.awt.Font("Racing Sans One", 1, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(245, 245, 245));
        jLabel4.setText("Espacios Libres");

        javax.swing.GroupLayout FondoLayout = new javax.swing.GroupLayout(Fondo);
        Fondo.setLayout(FondoLayout);
        FondoLayout.setHorizontalGroup(
            FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FondoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 3, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FondoLayout.createSequentialGroup()
                .addGroup(FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(FondoLayout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(FondoLayout.createSequentialGroup()
                                .addGap(154, 154, 154)
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jbtPisoB, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(FondoLayout.createSequentialGroup()
                                .addGroup(FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel1))
                                .addGap(35, 35, 35)
                                .addGroup(FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jbtSiguiente, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(22, 22, 22))))
                    .addGroup(FondoLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(FondoLayout.createSequentialGroup()
                                .addComponent(jbtUbicacionA1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(47, 47, 47)
                                .addComponent(jbtUbicacionA2, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(46, 46, 46)
                                .addComponent(jbtUbicacionA3, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(51, 51, 51)
                                .addComponent(jbtUbicacionA4, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(FondoLayout.createSequentialGroup()
                                .addGroup(FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jbtPisoA, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(FondoLayout.createSequentialGroup()
                                        .addGroup(FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jbtUbicacionA9, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jbtUbicacionA5, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(47, 47, 47)
                                        .addGroup(FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jbtUbicacionA6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jbtUbicacionA10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(46, 46, 46)
                                        .addGroup(FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jbtUbicacionA7, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jbtUbicacionA11, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(51, 51, 51)
                                .addGroup(FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jbtUbicacionA8, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jbtUbicacionA12, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addGap(74, 74, 74))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FondoLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(158, 158, 158))
        );
        FondoLayout.setVerticalGroup(
            FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FondoLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtUbicacionA2, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtUbicacionA4, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtUbicacionA1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtUbicacionA3, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtUbicacionA6, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtUbicacionA8, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtUbicacionA5, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtUbicacionA7, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtUbicacionA10, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtUbicacionA12, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtUbicacionA9, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtUbicacionA11, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addGroup(FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(FondoLayout.createSequentialGroup()
                        .addGroup(FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE))
                        .addGap(25, 25, 25)
                        .addComponent(jLabel1)
                        .addGap(28, 28, 28)
                        .addGroup(FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(30, 30, 30))
                    .addGroup(FondoLayout.createSequentialGroup()
                        .addGroup(FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jbtPisoA, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbtPisoB, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(FondoLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(FondoLayout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addComponent(jbtSiguiente, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(38, 38, 38)))
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(Fondo, javax.swing.GroupLayout.PREFERRED_SIZE, 608, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Fondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtUbicacionA2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtUbicacionA2ActionPerformed
        confirmarLugar(jbtUbicacionA2);
    }//GEN-LAST:event_jbtUbicacionA2ActionPerformed

    private void jbtUbicacionA1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtUbicacionA1ActionPerformed
        confirmarLugar(jbtUbicacionA1);
    }//GEN-LAST:event_jbtUbicacionA1ActionPerformed

    private void jbtUbicacionA4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtUbicacionA4ActionPerformed
        confirmarLugar(jbtUbicacionA4);
    }//GEN-LAST:event_jbtUbicacionA4ActionPerformed

    private void jbtUbicacionA3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtUbicacionA3ActionPerformed
        confirmarLugar(jbtUbicacionA3);
    }//GEN-LAST:event_jbtUbicacionA3ActionPerformed

    private void jbtUbicacionA5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtUbicacionA5ActionPerformed
        confirmarLugar(jbtUbicacionA5);
    }//GEN-LAST:event_jbtUbicacionA5ActionPerformed

    private void jbtUbicacionA6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtUbicacionA6ActionPerformed
        confirmarLugar(jbtUbicacionA6);
    }//GEN-LAST:event_jbtUbicacionA6ActionPerformed

    private void jbtUbicacionA7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtUbicacionA7ActionPerformed
        confirmarLugar(jbtUbicacionA7);
    }//GEN-LAST:event_jbtUbicacionA7ActionPerformed

    private void jbtUbicacionA8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtUbicacionA8ActionPerformed
        confirmarLugar(jbtUbicacionA8);
    }//GEN-LAST:event_jbtUbicacionA8ActionPerformed

    private void jbtUbicacionA9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtUbicacionA9ActionPerformed
        confirmarLugar(jbtUbicacionA9);
    }//GEN-LAST:event_jbtUbicacionA9ActionPerformed

    private void jbtUbicacionA10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtUbicacionA10ActionPerformed
        confirmarLugar(jbtUbicacionA10);
    }//GEN-LAST:event_jbtUbicacionA10ActionPerformed

    private void jbtUbicacionA11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtUbicacionA11ActionPerformed
        confirmarLugar(jbtUbicacionA11);
    }//GEN-LAST:event_jbtUbicacionA11ActionPerformed

    private void jbtUbicacionA12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtUbicacionA12ActionPerformed
        confirmarLugar(jbtUbicacionA12);
    }//GEN-LAST:event_jbtUbicacionA12ActionPerformed

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
    private javax.swing.JPanel Fondo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JButton jbtPisoA;
    private javax.swing.JButton jbtPisoB;
    private javax.swing.JButton jbtSiguiente;
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
    private rojeru_san.RSLabelFecha rSLabelFecha1;
    private rojeru_san.RSLabelHora rSLabelHora1;
    // End of variables declaration//GEN-END:variables
}