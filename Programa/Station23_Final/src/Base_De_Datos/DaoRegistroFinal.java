/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Base_De_Datos;

import clases.RegistroFinal;
import conexion.ConexionBD;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

public class DaoRegistroFinal {
    
     private final ConexionBD conexionBD = new ConexionBD();
    private String mensaje;
    
    public List<RegistroFinal> regFinTodoSel(String fecha) {
        List<RegistroFinal> lista = null;
        StringBuilder sql = new StringBuilder();
        sql.append("SELECT ")
                .append("placa, ")
                .append("tipo_vehiculo, ")
                .append("id_ubicacion, ")
                .append("hora_entrada, ")
                .append("hora_salida, ")
                .append("pago_total")
                .append(" FROM registro_final")
                .append(" WHERE DATE(hora_entrada) = ?")
                .append(" OR DATE(hora_salida) = ?");
        try ( Connection cn = conexionBD.getConexion()) {
            PreparedStatement ps = cn.prepareStatement(sql.toString());
            ps.setString(1, fecha);
            ps.setString(2, fecha);
            ResultSet rs = ps.executeQuery();
            lista = new ArrayList<>();
            while (rs.next()) {
                RegistroFinal registroFinal = new RegistroFinal();
                registroFinal.setPlaca(rs.getString(1));
                registroFinal.setTipo_vehiculo(rs.getString(2));
                registroFinal.setId_ubicacion(rs.getString(3));
                registroFinal.setHora_entrada(rs.getTimestamp(4));
                registroFinal.setHora_salida(rs.getTimestamp(5));
                registroFinal.setPago_total(rs.getDouble(6));
                lista.add(registroFinal);
            }
        } catch (Exception e) {
            mensaje = e.getMessage();
        }
        return lista;
    }
    
    public List<RegistroFinal> regFinTodoVehiSel(String tipo_vehi, String fecha) {
        List<RegistroFinal> lista = null;
        StringBuilder sql = new StringBuilder();
        sql.append("SELECT ")
                .append("placa, ")
                .append("tipo_vehiculo, ")
                .append("id_ubicacion, ")
                .append("hora_entrada, ")
                .append("hora_salida, ")
                .append("pago_total")
                .append(" FROM registro_final")
                .append(" WHERE tipo_vehiculo = ?")
                .append(" AND (DATE(hora_entrada) = ?")
                .append(" OR DATE(hora_salida) = ?)");
        try ( Connection cn = conexionBD.getConexion()) {
            PreparedStatement ps = cn.prepareStatement(sql.toString());
            ps.setString(1, tipo_vehi);
            ps.setString(2, fecha);
            ps.setString(3, fecha);
            ResultSet rs = ps.executeQuery();
            lista = new ArrayList<>();
            while (rs.next()) {
                RegistroFinal registroFinal = new RegistroFinal();
                registroFinal.setPlaca(rs.getString(1));
                registroFinal.setTipo_vehiculo(rs.getString(2));
                registroFinal.setId_ubicacion(rs.getString(3));
                registroFinal.setHora_entrada(rs.getTimestamp(4));
                registroFinal.setHora_salida(rs.getTimestamp(5));
                registroFinal.setPago_total(rs.getDouble(6));
                lista.add(registroFinal);
            }
        } catch (Exception e) {
            mensaje = e.getMessage();
        }
        return lista;
    }
    
    public List<RegistroFinal> regFinPisoASel(String fecha) {
        List<RegistroFinal> lista = null;
        StringBuilder sql = new StringBuilder();
        sql.append("SELECT ")
                .append("placa, ")
                .append("tipo_vehiculo, ")
                .append("id_ubicacion, ")
                .append("hora_entrada, ")
                .append("hora_salida, ")
                .append("pago_total")
                .append(" FROM registro_final")
                .append(" WHERE id_ubicacion LIKE 'A%'")
                .append(" AND (DATE(hora_entrada) = ?")
                .append(" OR DATE(hora_salida) = ?)");
        try ( Connection cn = conexionBD.getConexion()) {
            PreparedStatement ps = cn.prepareStatement(sql.toString());
            ps.setString(1, fecha);
            ps.setString(2, fecha);
            ResultSet rs = ps.executeQuery();
            lista = new ArrayList<>();
            while (rs.next()) {
                RegistroFinal registroFinal = new RegistroFinal();
                registroFinal.setPlaca(rs.getString(1));
                registroFinal.setTipo_vehiculo(rs.getString(2));
                registroFinal.setId_ubicacion(rs.getString(3));
                registroFinal.setHora_entrada(rs.getTimestamp(4));
                registroFinal.setHora_salida(rs.getTimestamp(5));
                registroFinal.setPago_total(rs.getDouble(6));
                lista.add(registroFinal);
            }
        } catch (Exception e) {
            mensaje = e.getMessage();
        }
        return lista;
    }
    
    public List<RegistroFinal> regFinPisoAVehiSel(String tipo_vehi, String fecha) {
        List<RegistroFinal> lista = null;
        StringBuilder sql = new StringBuilder();
        sql.append("SELECT ")
                .append("placa, ")
                .append("tipo_vehiculo, ")
                .append("id_ubicacion, ")
                .append("hora_entrada, ")
                .append("hora_salida, ")
                .append("pago_total")
                .append(" FROM registro_final")
                .append(" WHERE id_ubicacion LIKE 'A%'")
                .append(" AND tipo_vehiculo = ?")
                .append(" AND (DATE(hora_entrada) = ?")
                .append(" OR DATE(hora_salida) = ?)");
        try ( Connection cn = conexionBD.getConexion()) {
            PreparedStatement ps = cn.prepareStatement(sql.toString());
            ps.setString(1, tipo_vehi);
            ps.setString(2, fecha);
            ps.setString(3, fecha);
            ResultSet rs = ps.executeQuery();
            lista = new ArrayList<>();
            while (rs.next()) {
                RegistroFinal registroFinal = new RegistroFinal();
                registroFinal.setPlaca(rs.getString(1));
                registroFinal.setTipo_vehiculo(rs.getString(2));
                registroFinal.setId_ubicacion(rs.getString(3));
                registroFinal.setHora_entrada(rs.getTimestamp(4));
                registroFinal.setHora_salida(rs.getTimestamp(5));
                registroFinal.setPago_total(rs.getDouble(6));
                lista.add(registroFinal);
            }
        } catch (Exception e) {
            mensaje = e.getMessage();
        }
        return lista;
    }
    
    public List<RegistroFinal> regFinPisoBSel(String fecha) {
        List<RegistroFinal> lista = null;
        StringBuilder sql = new StringBuilder();
        sql.append("SELECT ")
                .append("placa, ")
                .append("tipo_vehiculo, ")
                .append("id_ubicacion, ")
                .append("hora_entrada, ")
                .append("hora_salida, ")
                .append("pago_total")
                .append(" FROM registro_final")
                .append(" WHERE id_ubicacion LIKE 'B%'")
                .append(" AND (DATE(hora_entrada) = ?")
                .append(" OR DATE(hora_salida) = ?)");
        try ( Connection cn = conexionBD.getConexion()) {
            PreparedStatement ps = cn.prepareStatement(sql.toString());
            ps.setString(1, fecha);
            ps.setString(2, fecha);
            ResultSet rs = ps.executeQuery();
            lista = new ArrayList<>();
            while (rs.next()) {
                RegistroFinal registroFinal = new RegistroFinal();
                registroFinal.setPlaca(rs.getString(1));
                registroFinal.setTipo_vehiculo(rs.getString(2));
                registroFinal.setId_ubicacion(rs.getString(3));
                registroFinal.setHora_entrada(rs.getTimestamp(4));
                registroFinal.setHora_salida(rs.getTimestamp(5));
                registroFinal.setPago_total(rs.getDouble(6));
                lista.add(registroFinal);
            }
        } catch (Exception e) {
            mensaje = e.getMessage();
        }
        return lista;
    }
    
    public List<RegistroFinal> regFinPisoBVehiSel(String tipo_vehi, String fecha) {
        List<RegistroFinal> lista = null;
        StringBuilder sql = new StringBuilder();
        sql.append("SELECT ")
                .append("placa, ")
                .append("tipo_vehiculo, ")
                .append("id_ubicacion, ")
                .append("hora_entrada, ")
                .append("hora_salida, ")
                .append("pago_total")
                .append(" FROM registro_final")
                .append(" WHERE id_ubicacion LIKE 'B%'")
                .append(" AND tipo_vehiculo = ?")
                .append(" AND (DATE(hora_entrada) = ?")
                .append(" OR DATE(hora_salida) = ?)");
        try ( Connection cn = conexionBD.getConexion()) {
            PreparedStatement ps = cn.prepareStatement(sql.toString());
            ps.setString(1, tipo_vehi);
            ps.setString(2, fecha);
            ps.setString(3, fecha);
            ResultSet rs = ps.executeQuery();
            lista = new ArrayList<>();
            while (rs.next()) {
                RegistroFinal registroFinal = new RegistroFinal();
                registroFinal.setPlaca(rs.getString(1));
                registroFinal.setTipo_vehiculo(rs.getString(2));
                registroFinal.setId_ubicacion(rs.getString(3));
                registroFinal.setHora_entrada(rs.getTimestamp(4));
                registroFinal.setHora_salida(rs.getTimestamp(5));
                registroFinal.setPago_total(rs.getDouble(6));
                lista.add(registroFinal);
            }
        } catch (Exception e) {
            mensaje = e.getMessage();
        }
        return lista;
    }
    
    //..........................................
    
    public List<RegistroFinal> regFinTodoSelRango(String fechaIni, String fechaFinal) {
        List<RegistroFinal> lista = null;
        StringBuilder sql = new StringBuilder();
        sql.append("SELECT ")
                .append("placa, ")
                .append("tipo_vehiculo, ")
                .append("id_ubicacion, ")
                .append("hora_entrada, ")
                .append("hora_salida, ")
                .append("pago_total")
                .append(" FROM registro_final")
                .append(" WHERE (DATE(hora_entrada) BETWEEN ? AND ?) ")
                .append(" OR (DATE(hora_salida) BETWEEN ? AND ?)");
        try ( Connection cn = conexionBD.getConexion()) {
            PreparedStatement ps = cn.prepareStatement(sql.toString());
            ps.setString(1, fechaIni);
            ps.setString(2, fechaFinal);
            ps.setString(3, fechaIni);
            ps.setString(4, fechaFinal);
            ResultSet rs = ps.executeQuery();
            lista = new ArrayList<>();
            while (rs.next()) {
                RegistroFinal registroFinal = new RegistroFinal();
                registroFinal.setPlaca(rs.getString(1));
                registroFinal.setTipo_vehiculo(rs.getString(2));
                registroFinal.setId_ubicacion(rs.getString(3));
                registroFinal.setHora_entrada(rs.getTimestamp(4));
                registroFinal.setHora_salida(rs.getTimestamp(5));
                registroFinal.setPago_total(rs.getDouble(6));
                lista.add(registroFinal);
            }
        } catch (Exception e) {
            mensaje = e.getMessage();
        }
        return lista;
    }
    
    public List<RegistroFinal> regFinTodoVehiSelRango(String tipo_vehi, String fechaIni, String fechaFinal) {
        List<RegistroFinal> lista = null;
        StringBuilder sql = new StringBuilder();
        sql.append("SELECT ")
                .append("placa, ")
                .append("tipo_vehiculo, ")
                .append("id_ubicacion, ")
                .append("hora_entrada, ")
                .append("hora_salida, ")
                .append("pago_total")
                .append(" FROM registro_final")
                .append(" WHERE tipo_vehiculo = ?")
                .append(" AND (DATE(hora_entrada) BETWEEN ? AND ?) ")
                .append(" OR (DATE(hora_salida) BETWEEN ? AND ?)");
        try ( Connection cn = conexionBD.getConexion()) {
            PreparedStatement ps = cn.prepareStatement(sql.toString());
            ps.setString(1, tipo_vehi);
            ps.setString(2, fechaIni);
            ps.setString(3, fechaFinal);
            ps.setString(4, fechaIni);
            ps.setString(5, fechaFinal);
            ResultSet rs = ps.executeQuery();
            lista = new ArrayList<>();
            while (rs.next()) {
                RegistroFinal registroFinal = new RegistroFinal();
                registroFinal.setPlaca(rs.getString(1));
                registroFinal.setTipo_vehiculo(rs.getString(2));
                registroFinal.setId_ubicacion(rs.getString(3));
                registroFinal.setHora_entrada(rs.getTimestamp(4));
                registroFinal.setHora_salida(rs.getTimestamp(5));
                registroFinal.setPago_total(rs.getDouble(6));
                lista.add(registroFinal);
            }
        } catch (Exception e) {
            mensaje = e.getMessage();
        }
        return lista;
    }
    
    public List<RegistroFinal> regFinPisoASelRango(String fechaIni, String fechaFinal) {
        List<RegistroFinal> lista = null;
        StringBuilder sql = new StringBuilder();
        sql.append("SELECT ")
                .append("placa, ")
                .append("tipo_vehiculo, ")
                .append("id_ubicacion, ")
                .append("hora_entrada, ")
                .append("hora_salida, ")
                .append("pago_total")
                .append(" FROM registro_final")
                .append(" WHERE id_ubicacion LIKE 'A%'")
                .append(" AND (DATE(hora_entrada) BETWEEN ? AND ?) ")
                .append(" OR (DATE(hora_salida) BETWEEN ? AND ?)");
        try ( Connection cn = conexionBD.getConexion()) {
            PreparedStatement ps = cn.prepareStatement(sql.toString());
            ps.setString(1, fechaIni);
            ps.setString(2, fechaFinal);
            ps.setString(3, fechaIni);
            ps.setString(4, fechaFinal);
            ResultSet rs = ps.executeQuery();
            lista = new ArrayList<>();
            while (rs.next()) {
                RegistroFinal registroFinal = new RegistroFinal();
                registroFinal.setPlaca(rs.getString(1));
                registroFinal.setTipo_vehiculo(rs.getString(2));
                registroFinal.setId_ubicacion(rs.getString(3));
                registroFinal.setHora_entrada(rs.getTimestamp(4));
                registroFinal.setHora_salida(rs.getTimestamp(5));
                registroFinal.setPago_total(rs.getDouble(6));
                lista.add(registroFinal);
            }
        } catch (Exception e) {
            mensaje = e.getMessage();
        }
        return lista;
    }
    
    public List<RegistroFinal> regFinPisoAVehiSelRango(String tipo_vehi, String fechaIni, String fechaFinal) {
        List<RegistroFinal> lista = null;
        StringBuilder sql = new StringBuilder();
        sql.append("SELECT ")
                .append("placa, ")
                .append("tipo_vehiculo, ")
                .append("id_ubicacion, ")
                .append("hora_entrada, ")
                .append("hora_salida, ")
                .append("pago_total")
                .append(" FROM registro_final")
                .append(" WHERE id_ubicacion LIKE 'A%'")
                .append(" AND tipo_vehiculo = ?")
                .append(" AND (DATE(hora_entrada) BETWEEN ? AND ?) ")
                .append(" OR (DATE(hora_salida) BETWEEN ? AND ?)");
        try ( Connection cn = conexionBD.getConexion()) {
            PreparedStatement ps = cn.prepareStatement(sql.toString());
            ps.setString(1, tipo_vehi);
            ps.setString(2, fechaIni);
            ps.setString(3, fechaFinal);
            ps.setString(4, fechaIni);
            ps.setString(5, fechaFinal);
            ResultSet rs = ps.executeQuery();
            lista = new ArrayList<>();
            while (rs.next()) {
                RegistroFinal registroFinal = new RegistroFinal();
                registroFinal.setPlaca(rs.getString(1));
                registroFinal.setTipo_vehiculo(rs.getString(2));
                registroFinal.setId_ubicacion(rs.getString(3));
                registroFinal.setHora_entrada(rs.getTimestamp(4));
                registroFinal.setHora_salida(rs.getTimestamp(5));
                registroFinal.setPago_total(rs.getDouble(6));
                lista.add(registroFinal);
            }
        } catch (Exception e) {
            mensaje = e.getMessage();
        }
        return lista;
    }
    
    public List<RegistroFinal> regFinPisoBSelRango(String fechaIni, String fechaFinal) {
        List<RegistroFinal> lista = null;
        StringBuilder sql = new StringBuilder();
        sql.append("SELECT ")
                .append("placa, ")
                .append("tipo_vehiculo, ")
                .append("id_ubicacion, ")
                .append("hora_entrada, ")
                .append("hora_salida, ")
                .append("pago_total")
                .append(" FROM registro_final")
                .append(" WHERE id_ubicacion LIKE 'B%'")
                .append(" AND (DATE(hora_entrada) BETWEEN ? AND ?) ")
                .append(" OR (DATE(hora_salida) BETWEEN ? AND ?)");
        try ( Connection cn = conexionBD.getConexion()) {
            PreparedStatement ps = cn.prepareStatement(sql.toString());
            ps.setString(1, fechaIni);
            ps.setString(2, fechaFinal);
            ps.setString(3, fechaIni);
            ps.setString(4, fechaFinal);
            ResultSet rs = ps.executeQuery();
            lista = new ArrayList<>();
            while (rs.next()) {
                RegistroFinal registroFinal = new RegistroFinal();
                registroFinal.setPlaca(rs.getString(1));
                registroFinal.setTipo_vehiculo(rs.getString(2));
                registroFinal.setId_ubicacion(rs.getString(3));
                registroFinal.setHora_entrada(rs.getTimestamp(4));
                registroFinal.setHora_salida(rs.getTimestamp(5));
                registroFinal.setPago_total(rs.getDouble(6));
                lista.add(registroFinal);
            }
        } catch (Exception e) {
            mensaje = e.getMessage();
        }
        return lista;
    }
    
    public List<RegistroFinal> regFinPisoBVehiSelRango(String tipo_vehi, String fechaIni, String fechaFinal) {
        List<RegistroFinal> lista = null;
        StringBuilder sql = new StringBuilder();
        sql.append("SELECT ")
                .append("placa, ")
                .append("tipo_vehiculo, ")
                .append("id_ubicacion, ")
                .append("hora_entrada, ")
                .append("hora_salida, ")
                .append("pago_total")
                .append(" FROM registro_final")
                .append(" WHERE id_ubicacion LIKE 'B%'")
                .append(" AND tipo_vehiculo = ?")
                .append(" AND (DATE(hora_entrada) BETWEEN ? AND ?) ")
                .append(" OR (DATE(hora_salida) BETWEEN ? AND ?)");
        try ( Connection cn = conexionBD.getConexion()) {
            PreparedStatement ps = cn.prepareStatement(sql.toString());
            ps.setString(1, tipo_vehi);
            ps.setString(2, fechaIni);
            ps.setString(3, fechaFinal);
            ps.setString(4, fechaIni);
            ps.setString(5, fechaFinal);
            ResultSet rs = ps.executeQuery();
            lista = new ArrayList<>();
            while (rs.next()) {
                RegistroFinal registroFinal = new RegistroFinal();
                registroFinal.setPlaca(rs.getString(1));
                registroFinal.setTipo_vehiculo(rs.getString(2));
                registroFinal.setId_ubicacion(rs.getString(3));
                registroFinal.setHora_entrada(rs.getTimestamp(4));
                registroFinal.setHora_salida(rs.getTimestamp(5));
                registroFinal.setPago_total(rs.getDouble(6));
                lista.add(registroFinal);
            }
        } catch (Exception e) {
            mensaje = e.getMessage();
        }
        return lista;
    }

    public RegistroFinal buscarCodigo(String id) {
        RegistroFinal reguistro_final = null;
        StringBuilder sql = new StringBuilder();
        sql.append("SELECT ")
                .append("ubicacion.codigo_lugar,")
                .append("registro_inicial.placa,")
                .append("registro_inicial.hora_entrada,")
                .append("registro_inicial.id_ubicacion,")
                .append("registro_inicial.tipo_vehiculo")
                .append(" FROM registro_inicial JOIN ubicacion")
                .append(" ON registro_inicial.id_ubicacion = ubicacion.id_ubicacion")
                .append(" WHERE ubicacion.codigo_lugar = ?");

        try (Connection cn = conexionBD.getConexion()) {
            PreparedStatement ps = cn.prepareStatement(sql.toString());
            ps.setString(1, id);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                reguistro_final = new RegistroFinal();
                reguistro_final.setCodigo_reg(rs.getString(1));
                reguistro_final.setPlaca(rs.getString(2));
                reguistro_final.setHora_entrada(rs.getTimestamp(3));
                reguistro_final.setId_ubicacion(rs.getString(4));
                reguistro_final.setTipo_vehiculo(rs.getString(5));
                
            } else {
                mensaje = "Sin datos";
            }
        } catch (SQLException e) {
            mensaje = e.getMessage();
        }
        return reguistro_final;
    }

    public RegistroFinal buscarPlaca (String placa) {
        RegistroFinal reguistro_final = null;
        StringBuilder sql = new StringBuilder();
        sql.append("SELECT ")
                .append("ubicacion.codigo_lugar,")
                .append("registro_inicial.placa,")
                .append("registro_inicial.hora_entrada,")
                .append("registro_inicial.id_ubicacion,")
                .append("registro_inicial.tipo_vehiculo")
                .append(" FROM registro_inicial JOIN ubicacion")
                .append(" ON registro_inicial.id_ubicacion = ubicacion.id_ubicacion")
                .append(" WHERE registro_inicial.placa= ?");

        try (Connection cn = conexionBD.getConexion()) {
            PreparedStatement ps = cn.prepareStatement(sql.toString());
            ps.setString(1, placa);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                reguistro_final = new RegistroFinal();
                reguistro_final.setCodigo_reg(rs.getString(1));
                reguistro_final.setPlaca(rs.getString(2));
                reguistro_final.setHora_entrada(rs.getTimestamp(3));
                reguistro_final.setId_ubicacion(rs.getString(4));
                reguistro_final.setTipo_vehiculo(rs.getString(5));
                
            } else {
                mensaje = "Sin datos";
            }
        } catch (SQLException e) {
            mensaje = e.getMessage();
        }
        return reguistro_final;
    }
    
    public String regIni(RegistroFinal registroFinal) {
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String formatHoraEntrada = formatter.format(registroFinal.getHora_entrada());
        String formatHoraSalida = formatter.format(registroFinal.getHora_salida());
        String formatHoraPago = formatter.format(registroFinal.getHora_pago());
        StringBuilder sql = new StringBuilder();
        sql.append("INSERT INTO registro_final (")
                .append("codigo_reg, ")
                .append("placa, ")
                .append("tipo_vehiculo, ")
                .append("id_ubicacion, ")
                .append("hora_entrada, ")
                .append("hora_salida, ")
                .append("pago_total, ")
                .append("hora_pago")
                .append(") VALUES (?, ?, ?, ?, ?, ?, ?, ?)");
        try ( Connection cn = conexionBD.getConexion()) {
            PreparedStatement ps = cn.prepareStatement(sql.toString());
            ps.setString(1, registroFinal.getCodigo_reg());
            ps.setString(2, registroFinal.getPlaca());
            ps.setString(3, registroFinal.getTipo_vehiculo());
            ps.setString(4, registroFinal.getId_ubicacion());
            ps.setString(5, formatHoraEntrada);
            ps.setString(6, formatHoraSalida);
            ps.setDouble(7, registroFinal.getPago_total());
            ps.setString(8, formatHoraPago);
            int resultado = ps.executeUpdate();
            if (resultado == 0) {
                mensaje = "Cero registros agregados";
            }
        } catch (SQLException e) {
            mensaje = e.getMessage();
        }
        return mensaje;
    }
    
    public String getMensaje() {
        return mensaje;
    }
}