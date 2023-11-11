/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Interfas;

import clases.RegistroFinal;
import Base_De_Datos.DaoRegistroFinal;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import java.awt.Desktop;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author danda
 */
public class Boleta extends javax.swing.JFrame {

    RegistroFinal reg_fin = new RegistroFinal();
    DaoRegistroFinal daoRegistroFinal = new DaoRegistroFinal();
    double comision;

    public Boleta(RegistroFinal registroFinal, double com) {
        initComponents();
        this.setLocationRelativeTo(null);
        reg_fin = registroFinal;
        comision = com;
    }

    public void imprimirBoleta() throws FileNotFoundException {

        int hora_retirada;
        float minutos_retirada;

        Date fecha_s = reg_fin.getHora_salida();
        Date fecha_e = reg_fin.getHora_entrada();
        Date hora_s = reg_fin.getHora_salida();
        Date hora_e = reg_fin.getHora_entrada();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat sdh = new SimpleDateFormat("HH:mm");
        String hora_ent = sdh.format(hora_e);
        String hora_sal = sdh.format(hora_s);
        String fecha_ent = sdf.format(fecha_e);
        String fecha_sal = sdf.format(fecha_s);
        String[] fecha_salida = fecha_sal.split("/");//array de fecha de salida String, tomo el reloj en el momento q presiona el boton
        String[] fecha_ingreso = fecha_ent.split("/");//array de fecha de ingreso String, tomo los datos que pasa del arraylist
        String[] hora_ingreso = hora_ent.split(":");//array de horas de ingreso String, tomo la hora que me pasa del arraylist
        String[] tiempo_retirada = hora_sal.split(":");//array de la hora de retirada string
        hora_retirada = Integer.parseInt(tiempo_retirada[0]); //hora de retirada int, tomo la hora q calculo en el momento que toca el boton
        minutos_retirada = Integer.parseInt(tiempo_retirada[1]);//minutos de retirada int, tomo los minutos q calculo en el momento que toca el boton

        Calendar cal = Calendar.getInstance();

        cal.set(Calendar.DAY_OF_MONTH, Integer.parseInt(fecha_ingreso[0]));
        cal.set(Calendar.MONTH, Integer.parseInt(fecha_ingreso[1]));
        cal.set(Calendar.YEAR, Integer.parseInt(fecha_ingreso[2]));
        Date firstDate = cal.getTime();

        cal.set(Calendar.DAY_OF_MONTH, Integer.parseInt(fecha_salida[0]));
        cal.set(Calendar.MONTH, Integer.parseInt(fecha_salida[1]));
        cal.set(Calendar.YEAR, Integer.parseInt(fecha_salida[2]));
        Date secondDate = cal.getTime();

        long diff = ((secondDate.getTime() - firstDate.getTime()) / 1000 / 60 / 60 / 24);//DIAS DE DIFERENCIA

        long horas_dif = hora_retirada - Integer.parseInt(hora_ingreso[0]);//diferencia de horas
        float horas_min_dif = (minutos_retirada - Integer.parseInt(hora_ingreso[1])) / 60;//diferencia de minutos, expresadas em horas

        float HORAS_TOTALES = diff * 24 + horas_dif + horas_min_dif;//suma de horas_totales=horas_dias + horas_horas + horas_minutos
        float HORAS_TOTALES_REDONDEADO;
        HORAS_TOTALES_REDONDEADO = Math.round(HORAS_TOTALES);

        int int_HORAS_TOTALES_REDONDEADO = (int) HORAS_TOTALES_REDONDEADO;

        double costo_total = reg_fin.getPago_total();

        JOptionPane.showMessageDialog(null, "Vehiculo de Placa: " + reg_fin.getPlaca()
                + "\nTipo vehiculo: " + reg_fin.getTipo_vehiculo()
                + "\nUbicación: " + reg_fin.getId_ubicacion()
                + "\nFecha de ingreso: " + fecha_ent + "  Hora de ingreso: " + hora_ent
                + "\nFecha de salida: " + fecha_sal + "  Hora de salida: " + hora_sal
                + "\nLa cant de horas reales en el parking son: " + HORAS_TOTALES + "hs"
                + "\nLa cant de horas a calcular de parking son: " + HORAS_TOTALES_REDONDEADO + "hs"
                + "\nComisión: S/. " + comision
                + "\nEl precio a pagar es de: S/. " + costo_total + "\n"
        );

        // Nombre del archivo PDF
        String nombreArchivo = "Recibo.pdf";

        // Crear el documento PDF
        Document documento = new Document();

        try {
            // Crear el escritor PDF
            PdfWriter.getInstance(documento, new FileOutputStream(nombreArchivo));

            // Abrir el documento
            documento.open();

            // Agregar contenido al documento
            documento.add(new Paragraph("Placa: " + reg_fin.getPlaca()));
            documento.add(new Paragraph("Tipo vehiculo: " + reg_fin.getTipo_vehiculo()));
            documento.add(new Paragraph("Ubicación: " + reg_fin.getId_ubicacion()));
            documento.add(new Paragraph("Fecha de ingreso: " + fecha_ent + "  Hora de ingreso: " + hora_ent));
            documento.add(new Paragraph("Fecha de salida: " + fecha_sal + "  Hora de salida: " + hora_sal));
            documento.add(new Paragraph("La cantidad de horas a calcular de parking son: " + HORAS_TOTALES_REDONDEADO + "hs"));
            documento.add(new Paragraph("Tiene una comisión de: S/. " + comision + "hs"));
            documento.add(new Paragraph("El precio a pagar es de: S/" + costo_total + "\n"));

            // Cerrar el documento
            documento.close();

            System.out.println("El ticket se ha creado exitosamente en el archivo " + nombreArchivo);
        } catch (DocumentException c) {
            c.printStackTrace();
        } catch (FileNotFoundException j) {
            j.printStackTrace();
        }
    }

    public void abrirEnEdge(String archivo) {
        try {
            String osName = System.getProperty("os.name").toLowerCase();
            if (osName.contains("win")) {
                ProcessBuilder builder = new ProcessBuilder("cmd.exe", "/c", "start microsoft-edge:" + archivo);
                builder.start();
            } else {
                System.out.println("No se puede abrir en Edge en este sistema operativo.");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jbtPagar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(36, 35, 35));

        jbtPagar.setBackground(new java.awt.Color(249, 127, 6));
        jbtPagar.setFont(new java.awt.Font("Racing Sans One", 0, 18)); // NOI18N
        jbtPagar.setText("IMPRIMIR BOLETA");
        jbtPagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtPagarActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/logo_station23.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(146, 146, 146)
                        .addComponent(jbtPagar, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(189, 189, 189)
                        .addComponent(jLabel1)))
                .addContainerGap(148, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jbtPagar, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(96, Short.MAX_VALUE))
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

    private void jbtPagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtPagarActionPerformed
        try {
            imprimirBoleta();
            abrirEnEdge("file:///C:/Users/Braya/OneDrive/Escritorio/Station23_Final/Station23_Final/Recibo.pdf");
            daoRegistroFinal.regIni(reg_fin);
            System.out.println(daoRegistroFinal.getMensaje());
            InicioCliente inicioCliente = new InicioCliente();
            inicioCliente.setVisible(true);
            this.dispose();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Boleta.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jbtPagarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton jbtPagar;
    // End of variables declaration//GEN-END:variables
}
