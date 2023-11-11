/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Interfas;

import clases.RegistroFinal;
import clases.RegistroInicial;
import Base_De_Datos.DaoRegistroFinal;
import Base_De_Datos.DaoRegistroInicial;
import clases.Excel;
import java.io.IOException;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Braya
 */
public class AdministrarRegistro extends javax.swing.JFrame {

    DaoRegistroInicial daoRegistroInicial = new DaoRegistroInicial();
    DaoRegistroFinal daoRegistroFinal = new DaoRegistroFinal();
    ResultSet rs;
    SimpleDateFormat formato = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");

    public AdministrarRegistro() {
        initComponents();
        this.setLocationRelativeTo(null);
        jtbRegistros.setModel(cambiarTabla(1));
        jbtCalcular.setEnabled(false);
    }

    private void habilitar() {
        jdcDia.setEnabled(true);
        jdcDiaInicio.setEnabled(true);
        jdcDiaFinal.setEnabled(true);
        jbtBuscarRango.setEnabled(true);
    }

    private void deshabilitar() {
        jdcDia.setEnabled(false);
        jdcDiaInicio.setEnabled(false);
        jdcDiaFinal.setEnabled(false);
        jbtBuscarRango.setEnabled(false);
    }

    private void listarVehiculosIngresos() {

    }

    private DefaultTableModel cambiarTabla(int i) {
        if (i == 1) {
            DefaultTableModel modelo1 = new DefaultTableModel();
            modelo1.addColumn("Placa");
            modelo1.addColumn("Tipo de Vehículo");
            modelo1.addColumn("Ubicación");
            modelo1.addColumn("Hora de Entrada");
            return modelo1;
        } else {
            DefaultTableModel modelo2 = new DefaultTableModel();
            modelo2.addColumn("Placa");
            modelo2.addColumn("Tipo de Vehículo");
            modelo2.addColumn("Ubicación");
            modelo2.addColumn("Hora de Entrada");
            modelo2.addColumn("Hora de Salida");
            modelo2.addColumn("Pago Total");
            return modelo2;
        }
    }

    private DefaultTableModel imprimir1(List<RegistroInicial> lista, DefaultTableModel mod) {
        DefaultTableModel modelo = mod;
        for (RegistroInicial registroInicial : lista) {
            String Hora_E = formato.format(registroInicial.getHora_entrada());
            modelo.addRow(new Object[]{registroInicial.getPlaca(), registroInicial.getTipo_vehiculo(), registroInicial.getLugar(), Hora_E});
        }
        return modelo;
    }

    private DefaultTableModel imprimir2(List<RegistroFinal> lista, DefaultTableModel mod) {
        DefaultTableModel modelo = mod;
        for (RegistroFinal registroFinal : lista) {
            String Hora_E = formato.format(registroFinal.getHora_entrada());
            String Hora_S = formato.format(registroFinal.getHora_salida());
            String pago = String.format("%.2f", registroFinal.getPago_total());
            modelo.addRow(new Object[]{registroFinal.getPlaca(), registroFinal.getTipo_vehiculo(), registroFinal.getId_ubicacion(), Hora_E, Hora_S, pago});
        }
        return modelo;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jdcDia = new com.toedter.calendar.JDateChooser();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtbRegistros = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jcbPisos = new javax.swing.JComboBox<>();
        jcbTipoVehi = new javax.swing.JComboBox<>();
        jbtBuscarDia = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jbtBuscarRango = new javax.swing.JButton();
        jbtCalcular = new javax.swing.JButton();
        jtfSuma = new javax.swing.JTextField();
        jcbTipoRegistro = new javax.swing.JComboBox<>();
        jdcDiaInicio = new com.toedter.calendar.JDateChooser();
        jdcDiaFinal = new com.toedter.calendar.JDateChooser();
        jbtRetroceder = new javax.swing.JButton();
        jbtExportar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(36, 35, 35));

        jdcDia.setDateFormatString("dd/MM/yyyy");

        jtbRegistros.setFont(new java.awt.Font("Racing Sans One", 0, 12)); // NOI18N
        jtbRegistros.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jtbRegistros);

        jLabel1.setFont(new java.awt.Font("Racing Sans One", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Hasta:");

        jLabel2.setFont(new java.awt.Font("Racing Sans One", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Desde:");

        jcbPisos.setFont(new java.awt.Font("Racing Sans One", 0, 10)); // NOI18N
        jcbPisos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "---Seleccione---", "Todos", "Piso A", "Piso B" }));

        jcbTipoVehi.setFont(new java.awt.Font("Racing Sans One", 0, 10)); // NOI18N
        jcbTipoVehi.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "---Seleccione---", "Todos", "Auto", "Camioneta", "Moto" }));

        jbtBuscarDia.setBackground(new java.awt.Color(249, 138, 7));
        jbtBuscarDia.setFont(new java.awt.Font("Racing Sans One", 1, 12)); // NOI18N
        jbtBuscarDia.setText("Buscar");
        jbtBuscarDia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtBuscarDiaActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(249, 138, 7));
        jButton3.setFont(new java.awt.Font("Racing Sans One", 1, 12)); // NOI18N
        jButton3.setText("Reset");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jbtBuscarRango.setBackground(new java.awt.Color(249, 138, 7));
        jbtBuscarRango.setFont(new java.awt.Font("Racing Sans One", 1, 12)); // NOI18N
        jbtBuscarRango.setText("Buscar");
        jbtBuscarRango.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtBuscarRangoActionPerformed(evt);
            }
        });

        jbtCalcular.setBackground(new java.awt.Color(249, 138, 7));
        jbtCalcular.setFont(new java.awt.Font("Racing Sans One", 1, 12)); // NOI18N
        jbtCalcular.setText("Calcular Ingresos");
        jbtCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtCalcularActionPerformed(evt);
            }
        });

        jtfSuma.setFont(new java.awt.Font("Racing Sans One", 1, 12)); // NOI18N
        jtfSuma.setEnabled(false);

        jcbTipoRegistro.setFont(new java.awt.Font("Racing Sans One", 0, 10)); // NOI18N
        jcbTipoRegistro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "---Seleccione---", "Ingresos", "General" }));
        jcbTipoRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbTipoRegistroActionPerformed(evt);
            }
        });

        jdcDiaInicio.setDateFormatString("dd/MM/yyyy");

        jdcDiaFinal.setDateFormatString("dd/MM/yyyy");

        jbtRetroceder.setBackground(new java.awt.Color(36, 35, 35));
        jbtRetroceder.setFont(new java.awt.Font("Racing Sans One", 0, 18)); // NOI18N
        jbtRetroceder.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/salir.jpeg"))); // NOI18N
        jbtRetroceder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtRetrocederActionPerformed(evt);
            }
        });

        jbtExportar.setBackground(new java.awt.Color(249, 138, 7));
        jbtExportar.setFont(new java.awt.Font("Racing Sans One", 1, 12)); // NOI18N
        jbtExportar.setText("Exportar");
        jbtExportar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtExportarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jbtCalcular)
                        .addGap(18, 18, 18)
                        .addComponent(jtfSuma, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jbtExportar, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(jbtRetroceder)
                                .addGap(446, 446, 446))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jcbTipoRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jcbPisos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jcbTipoVehi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(72, 72, 72)
                                .addComponent(jdcDia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(35, 35, 35)
                                .addComponent(jbtBuscarDia)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jdcDiaInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jdcDiaFinal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(34, 34, 34)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton3)
                            .addComponent(jbtBuscarRango)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 1151, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jbtRetroceder)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jcbPisos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jcbTipoVehi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jcbTipoRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton3)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jbtBuscarRango)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jdcDiaFinal, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addGap(1, 1, 1)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jdcDiaInicio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
                            .addComponent(jdcDia, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbtBuscarDia))))
                .addGap(41, 41, 41)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtCalcular, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfSuma, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtExportar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(64, 64, 64))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jcbTipoRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbTipoRegistroActionPerformed
        String seleccion = (String) jcbTipoRegistro.getSelectedItem();
        if (seleccion.equals("Ingresos")) {
            deshabilitar();
        } else if (seleccion.equals("General")) {
            habilitar();
        } else {
            habilitar();
        }
    }//GEN-LAST:event_jcbTipoRegistroActionPerformed

    private void jbtBuscarDiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtBuscarDiaActionPerformed
        String seleccion_tipo_reg = (String) jcbTipoRegistro.getSelectedItem();
        String seleccion_piso = (String) jcbPisos.getSelectedItem();
        String seleccion_tipo_vehi = (String) jcbTipoVehi.getSelectedItem();
        switch (seleccion_tipo_reg) {
            case "Ingresos":
                switch (seleccion_piso) {
                    case "Todos":
                        switch (seleccion_tipo_vehi) {
                            case "Todos":
                                List<RegistroInicial> listat = daoRegistroInicial.regIniIngTodoSel();
                                DefaultTableModel modelot = imprimir1(listat, cambiarTabla(1));
                                jtbRegistros.setModel(modelot);
                                break;
                            case "Auto":
                                List<RegistroInicial> listaa = daoRegistroInicial.regIniIngTodoVehiSel("auto");
                                DefaultTableModel modeloa = imprimir1(listaa, cambiarTabla(1));
                                jtbRegistros.setModel(modeloa);
                                break;
                            case "Camioneta":
                                List<RegistroInicial> listac = daoRegistroInicial.regIniIngTodoVehiSel("camioneta");
                                DefaultTableModel modeloc = imprimir1(listac, cambiarTabla(1));
                                jtbRegistros.setModel(modeloc);
                                break;
                            case "Moto":
                                List<RegistroInicial> listam = daoRegistroInicial.regIniIngTodoVehiSel("moto");
                                DefaultTableModel modelom = imprimir1(listam, cambiarTabla(1));
                                jtbRegistros.setModel(modelom);
                                break;
                            default:
                                JOptionPane.showMessageDialog(this, "Por favor selecciona un tipo de vehículo.", "Error", JOptionPane.ERROR_MESSAGE);
                        }
                        break;
                    case "Piso A":
                        switch (seleccion_tipo_vehi) {
                            case "Todos":
                                List<RegistroInicial> lista = daoRegistroInicial.regIniIngPisoATodoSel();
                                DefaultTableModel modelo = imprimir1(lista, cambiarTabla(1));
                                jtbRegistros.setModel(modelo);
                                break;
                            case "Auto":
                                List<RegistroInicial> listaa = daoRegistroInicial.regIniIngPisoATodoVehiSel("auto");
                                DefaultTableModel modeloa = imprimir1(listaa, cambiarTabla(1));
                                jtbRegistros.setModel(modeloa);
                                break;
                            case "Camioneta":
                                List<RegistroInicial> listac = daoRegistroInicial.regIniIngPisoATodoVehiSel("camioneta");
                                DefaultTableModel modeloc = imprimir1(listac, cambiarTabla(1));
                                jtbRegistros.setModel(modeloc);
                                break;
                            case "Moto":
                                List<RegistroInicial> listam = daoRegistroInicial.regIniIngPisoATodoVehiSel("moto");
                                DefaultTableModel modelom = imprimir1(listam, cambiarTabla(1));
                                jtbRegistros.setModel(modelom);
                                break;
                            default:
                                JOptionPane.showMessageDialog(this, "Por favor selecciona un tipo de vehículo.", "Error", JOptionPane.ERROR_MESSAGE);
                        }
                        break;
                    case "Piso B":
                        switch (seleccion_tipo_vehi) {
                            case "Todos":
                                List<RegistroInicial> lista = daoRegistroInicial.regIniIngPisoBTodoSel();
                                DefaultTableModel modelo = imprimir1(lista, cambiarTabla(1));
                                jtbRegistros.setModel(modelo);
                                break;
                            case "Auto":
                                List<RegistroInicial> listaa = daoRegistroInicial.regIniIngPisoBTodoVehiSel("auto");
                                DefaultTableModel modeloa = imprimir1(listaa, cambiarTabla(1));
                                jtbRegistros.setModel(modeloa);
                                break;
                            case "Camioneta":
                                List<RegistroInicial> listac = daoRegistroInicial.regIniIngPisoBTodoVehiSel("camioneta");
                                DefaultTableModel modeloc = imprimir1(listac, cambiarTabla(1));
                                jtbRegistros.setModel(modeloc);
                                break;
                            case "Moto":
                                List<RegistroInicial> listam = daoRegistroInicial.regIniIngPisoBTodoVehiSel("moto");
                                DefaultTableModel modelom = imprimir1(listam, cambiarTabla(1));
                                jtbRegistros.setModel(modelom);
                                break;
                            default:
                                JOptionPane.showMessageDialog(this, "Por favor selecciona un tipo de vehículo.", "Error", JOptionPane.ERROR_MESSAGE);
                        }
                        break;
                    default:
                        JOptionPane.showMessageDialog(this, "Por favor selecciona un piso.", "Error", JOptionPane.ERROR_MESSAGE);
                }
                break;
            case "General":
                if (jdcDia.getDate()!=null){
                    Date fechaSeleccionada = jdcDia.getDate();
                SimpleDateFormat formatoMySQL = new SimpleDateFormat("yyyy-MM-dd");
                String fechaMySQL = formatoMySQL.format(fechaSeleccionada);
                switch (seleccion_piso) {
                    case "Todos":
                        switch (seleccion_tipo_vehi) {
                            case "Todos":
                                List<RegistroFinal> listat = daoRegistroFinal.regFinTodoSel(fechaMySQL);
                                DefaultTableModel modelot = imprimir2(listat, cambiarTabla(2));
                                jtbRegistros.setModel(modelot);
                                break;
                            case "Auto":
                                List<RegistroFinal> listaa = daoRegistroFinal.regFinTodoVehiSel("auto", fechaMySQL);
                                DefaultTableModel modeloa = imprimir2(listaa, cambiarTabla(2));
                                jtbRegistros.setModel(modeloa);
                                break;
                            case "Camioneta":
                                List<RegistroFinal> listac = daoRegistroFinal.regFinTodoVehiSel("camioneta", fechaMySQL);
                                DefaultTableModel modeloc = imprimir2(listac, cambiarTabla(2));
                                jtbRegistros.setModel(modeloc);
                                break;
                            case "Moto":
                                List<RegistroFinal> listam = daoRegistroFinal.regFinTodoVehiSel("moto", fechaMySQL);
                                DefaultTableModel modelom = imprimir2(listam, cambiarTabla(2));
                                jtbRegistros.setModel(modelom);
                                break;
                            default:
                                JOptionPane.showMessageDialog(this, "Por favor selecciona un tipo de vehículo.", "Error", JOptionPane.ERROR_MESSAGE);
                        }
                        break;
                    case "Piso A":
                        switch (seleccion_tipo_vehi) {
                            case "Todos":
                                List<RegistroFinal> lista = daoRegistroFinal.regFinPisoASel(fechaMySQL);
                                DefaultTableModel modelo = imprimir2(lista, cambiarTabla(1));
                                jtbRegistros.setModel(modelo);
                                break;
                            case "Auto":
                                List<RegistroFinal> listaa = daoRegistroFinal.regFinPisoAVehiSel("auto", fechaMySQL);
                                DefaultTableModel modeloa = imprimir2(listaa, cambiarTabla(2));
                                jtbRegistros.setModel(modeloa);
                                break;
                            case "Camioneta":
                                List<RegistroFinal> listac = daoRegistroFinal.regFinPisoAVehiSel("camioneta", fechaMySQL);
                                DefaultTableModel modeloc = imprimir2(listac, cambiarTabla(2));
                                jtbRegistros.setModel(modeloc);
                                break;
                            case "Moto":
                                List<RegistroFinal> listam = daoRegistroFinal.regFinPisoAVehiSel("moto", fechaMySQL);
                                DefaultTableModel modelom = imprimir2(listam, cambiarTabla(2));
                                jtbRegistros.setModel(modelom);
                                break;
                            default:
                                JOptionPane.showMessageDialog(this, "Por favor selecciona un tipo de vehículo.", "Error", JOptionPane.ERROR_MESSAGE);
                        }
                        break;
                    case "Piso B":
                        switch (seleccion_tipo_vehi) {
                            case "Todos":
                                List<RegistroFinal> lista = daoRegistroFinal.regFinPisoBSel(fechaMySQL);
                                DefaultTableModel modelo = imprimir2(lista, cambiarTabla(2));
                                jtbRegistros.setModel(modelo);
                                break;
                            case "Auto":
                                List<RegistroFinal> listaa = daoRegistroFinal.regFinPisoBVehiSel("auto", fechaMySQL);
                                DefaultTableModel modeloa = imprimir2(listaa, cambiarTabla(2));
                                jtbRegistros.setModel(modeloa);
                                break;
                            case "Camioneta":
                                List<RegistroFinal> listac = daoRegistroFinal.regFinPisoBVehiSel("camioneta", fechaMySQL);
                                DefaultTableModel modeloc = imprimir2(listac, cambiarTabla(2));
                                jtbRegistros.setModel(modeloc);
                                break;
                            case "Moto":
                                List<RegistroFinal> listam = daoRegistroFinal.regFinPisoBVehiSel("moto", fechaMySQL);
                                DefaultTableModel modelom = imprimir2(listam, cambiarTabla(2));
                                jtbRegistros.setModel(modelom);
                                break;
                            default:
                                JOptionPane.showMessageDialog(this, "Por favor selecciona un tipo de vehículo.", "Error", JOptionPane.ERROR_MESSAGE);
                        }
                        break;
                    default:
                        JOptionPane.showMessageDialog(this, "Por favor selecciona un piso.", "Error", JOptionPane.ERROR_MESSAGE);
                }
                break;
                }else{
                    JOptionPane.showMessageDialog(this, "Por favor selecciona una fecha.", "Error", JOptionPane.ERROR_MESSAGE);
                break;
                }
            default:
                JOptionPane.showMessageDialog(this, "Por favor selecciona un tipo de registro.", "Error", JOptionPane.ERROR_MESSAGE);
                break;
        }
        if (seleccion_tipo_reg.equals("Ingresos")) {
            jbtCalcular.setEnabled(false);
        } else if (seleccion_tipo_reg.equals("General")) {
            jbtCalcular.setEnabled(true);
        }
        habilitar();
    }//GEN-LAST:event_jbtBuscarDiaActionPerformed

    private void jbtBuscarRangoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtBuscarRangoActionPerformed
        String seleccion_tipo_reg = (String) jcbTipoRegistro.getSelectedItem();
        String seleccion_piso = (String) jcbPisos.getSelectedItem();
        String seleccion_tipo_vehi = (String) jcbTipoVehi.getSelectedItem();
        Date fechaSeleccionadaInicio = jdcDiaInicio.getDate();
        Date fechaSeleccionadaFinal = jdcDiaFinal.getDate();
        SimpleDateFormat formatoMySQL = new SimpleDateFormat("yyyy-MM-dd");
        String fechaMySQLInicio = formatoMySQL.format(fechaSeleccionadaInicio);
        String fechaMySQLFinal = formatoMySQL.format(fechaSeleccionadaFinal);
        switch (seleccion_piso) {
            case "Todos":
                switch (seleccion_tipo_vehi) {
                    case "Todos":
                        List<RegistroFinal> listat = daoRegistroFinal.regFinTodoSelRango(fechaMySQLInicio, fechaMySQLFinal);
                        DefaultTableModel modelot = imprimir2(listat, cambiarTabla(2));
                        jtbRegistros.setModel(modelot);
                        break;
                    case "Auto":
                        List<RegistroFinal> listaa = daoRegistroFinal.regFinTodoVehiSelRango("auto", fechaMySQLInicio, fechaMySQLFinal);
                        DefaultTableModel modeloa = imprimir2(listaa, cambiarTabla(2));
                        jtbRegistros.setModel(modeloa);
                        break;
                    case "Camioneta":
                        List<RegistroFinal> listac = daoRegistroFinal.regFinTodoVehiSelRango("camioneta", fechaMySQLInicio, fechaMySQLFinal);
                        DefaultTableModel modeloc = imprimir2(listac, cambiarTabla(2));
                        jtbRegistros.setModel(modeloc);
                        break;
                    case "Moto":
                        List<RegistroFinal> listam = daoRegistroFinal.regFinTodoVehiSelRango("moto", fechaMySQLInicio, fechaMySQLFinal);
                        DefaultTableModel modelom = imprimir2(listam, cambiarTabla(2));
                        jtbRegistros.setModel(modelom);
                        break;
                    default:
                        JOptionPane.showMessageDialog(this, "Por favor selecciona un tipo de vehículo.", "Error", JOptionPane.ERROR_MESSAGE);
                }
                break;
            case "Piso A":
                switch (seleccion_tipo_vehi) {
                    case "Todos":
                        List<RegistroFinal> lista = daoRegistroFinal.regFinPisoASelRango(fechaMySQLInicio, fechaMySQLFinal);
                        DefaultTableModel modelo = imprimir2(lista, cambiarTabla(2));
                        jtbRegistros.setModel(modelo);
                        break;
                    case "Auto":
                        List<RegistroFinal> listaa = daoRegistroFinal.regFinPisoAVehiSelRango("auto", fechaMySQLInicio, fechaMySQLFinal);
                        DefaultTableModel modeloa = imprimir2(listaa, cambiarTabla(2));
                        jtbRegistros.setModel(modeloa);
                        break;
                    case "Camioneta":
                        List<RegistroFinal> listac = daoRegistroFinal.regFinPisoAVehiSelRango("camioneta", fechaMySQLInicio, fechaMySQLFinal);
                        DefaultTableModel modeloc = imprimir2(listac, cambiarTabla(2));
                        jtbRegistros.setModel(modeloc);
                        break;
                    case "Moto":
                        List<RegistroFinal> listam = daoRegistroFinal.regFinPisoAVehiSelRango("moto", fechaMySQLInicio, fechaMySQLFinal);
                        DefaultTableModel modelom = imprimir2(listam, cambiarTabla(2));
                        jtbRegistros.setModel(modelom);
                        break;
                    default:
                        JOptionPane.showMessageDialog(this, "Por favor selecciona un tipo de vehículo.", "Error", JOptionPane.ERROR_MESSAGE);
                }
                break;
            case "Piso B":
                switch (seleccion_tipo_vehi) {
                    case "Todos":
                        List<RegistroFinal> lista = daoRegistroFinal.regFinPisoBSelRango(fechaMySQLInicio, fechaMySQLFinal);
                        DefaultTableModel modelo = imprimir2(lista, cambiarTabla(2));
                        jtbRegistros.setModel(modelo);
                        break;
                    case "Auto":
                        List<RegistroFinal> listaa = daoRegistroFinal.regFinPisoBVehiSelRango("auto", fechaMySQLInicio, fechaMySQLFinal);
                        DefaultTableModel modeloa = imprimir2(listaa, cambiarTabla(2));
                        jtbRegistros.setModel(modeloa);
                        break;
                    case "Camioneta":
                        List<RegistroFinal> listac = daoRegistroFinal.regFinPisoBVehiSelRango("camioneta", fechaMySQLInicio, fechaMySQLFinal);
                        DefaultTableModel modeloc = imprimir2(listac, cambiarTabla(2));
                        jtbRegistros.setModel(modeloc);
                        break;
                    case "Moto":
                        List<RegistroFinal> listam = daoRegistroFinal.regFinPisoBVehiSelRango("moto", fechaMySQLInicio, fechaMySQLFinal);
                        DefaultTableModel modelom = imprimir2(listam, cambiarTabla(2));
                        jtbRegistros.setModel(modelom);
                        break;
                    default:
                        JOptionPane.showMessageDialog(this, "Por favor selecciona un tipo de vehículo.", "Error", JOptionPane.ERROR_MESSAGE);
                }
                break;
            default:
                JOptionPane.showMessageDialog(this, "Por favor selecciona un piso.", "Error", JOptionPane.ERROR_MESSAGE);
        }
        jbtCalcular.setEnabled(true);
    }//GEN-LAST:event_jbtBuscarRangoActionPerformed

    private void jbtCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtCalcularActionPerformed
        int columna = 5;
        double total = 0.0;
        for (int i = 0; i < jtbRegistros.getRowCount(); i++) {
            String valor = jtbRegistros.getValueAt(i, columna).toString().replace(",", ".");
            total += Double.parseDouble(valor);
        }
        jtfSuma.setText(String.format("%.2f", total));
    }//GEN-LAST:event_jbtCalcularActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        jcbPisos.setSelectedIndex(0);
        jcbTipoRegistro.setSelectedIndex(0);
        jcbTipoVehi.setSelectedIndex(0);
        jdcDia.setDate(null);
        jdcDiaInicio.setDate(null);
        jdcDiaFinal.setDate(null);
        jbtCalcular.setEnabled(false);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jbtRetrocederActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtRetrocederActionPerformed
       InicioAdministrador in = new InicioAdministrador();
        in.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jbtRetrocederActionPerformed

    private void jbtExportarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtExportarActionPerformed
        Excel obj;
        try {
            obj = new Excel();
            obj.exportarExcel(jtbRegistros);
        } catch (IOException ex) {
            System.out.println("Error: " + ex);
        }
    }//GEN-LAST:event_jbtExportarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbtBuscarDia;
    private javax.swing.JButton jbtBuscarRango;
    private javax.swing.JButton jbtCalcular;
    private javax.swing.JButton jbtExportar;
    private javax.swing.JButton jbtRetroceder;
    private javax.swing.JComboBox<String> jcbPisos;
    private javax.swing.JComboBox<String> jcbTipoRegistro;
    private javax.swing.JComboBox<String> jcbTipoVehi;
    private com.toedter.calendar.JDateChooser jdcDia;
    private com.toedter.calendar.JDateChooser jdcDiaFinal;
    private com.toedter.calendar.JDateChooser jdcDiaInicio;
    private javax.swing.JTable jtbRegistros;
    private javax.swing.JTextField jtfSuma;
    // End of variables declaration//GEN-END:variables
}
