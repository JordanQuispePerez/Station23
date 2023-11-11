/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Base_De_Datos;

import clases.RegistroInicial;
import conexion.ConexionBD;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

public class DaoRegistroInicial {

    private final ConexionBD conexionBD = new ConexionBD();
    private String mensaje;

    public List<RegistroInicial> regIniIngTodoSel() {
        List<RegistroInicial> lista = null;
        StringBuilder sql = new StringBuilder();
        sql.append("SELECT ")
                .append("placa, ")
                .append("tipo_vehiculo, ")
                .append("id_ubicacion, ")
                .append("hora_entrada")
                .append(" FROM registro_inicial");
        try (Connection cn = conexionBD.getConexion()) {
            PreparedStatement ps = cn.prepareStatement(sql.toString());
            ResultSet rs = ps.executeQuery();
            lista = new ArrayList<>();
            while (rs.next()) {
                RegistroInicial registroInicial = new RegistroInicial();
                registroInicial.setPlaca(rs.getString(1));
                registroInicial.setTipo_vehiculo(rs.getString(2));
                registroInicial.setLugar(rs.getString(3));
                registroInicial.setHora_entrada(rs.getTimestamp(4));
                lista.add(registroInicial);
            }
        } catch (Exception e) {
            mensaje = e.getMessage();
        }
        return lista;
    }

    public List<RegistroInicial> regIniIngTodoVehiSel(String tipo_vehi) {
        List<RegistroInicial> lista = null;
        StringBuilder sql = new StringBuilder();
        sql.append("SELECT ")
                .append("placa, ")
                .append("tipo_vehiculo, ")
                .append("id_ubicacion, ")
                .append("hora_entrada")
                .append(" FROM registro_inicial")
                .append(" WHERE tipo_vehiculo = ?");
        try (Connection cn = conexionBD.getConexion()) {
            PreparedStatement ps = cn.prepareStatement(sql.toString());
            ps.setString(1, tipo_vehi);
            ResultSet rs = ps.executeQuery();
            lista = new ArrayList<>();
            while (rs.next()) {
                RegistroInicial registroInicial = new RegistroInicial();
                registroInicial.setPlaca(rs.getString(1));
                registroInicial.setTipo_vehiculo(rs.getString(2));
                registroInicial.setLugar(rs.getString(3));
                registroInicial.setHora_entrada(rs.getTimestamp(4));
                lista.add(registroInicial);
            }
        } catch (Exception e) {
            mensaje = e.getMessage();
        }
        return lista;
    }

    public List<RegistroInicial> regIniIngPisoATodoSel() {
        List<RegistroInicial> lista = null;
        StringBuilder sql = new StringBuilder();
        sql.append("SELECT ")
                .append("placa, ")
                .append("tipo_vehiculo, ")
                .append("id_ubicacion, ")
                .append("hora_entrada")
                .append(" FROM registro_inicial")
                .append(" WHERE id_ubicacion LIKE 'A%'");
        try (Connection cn = conexionBD.getConexion()) {
            PreparedStatement ps = cn.prepareStatement(sql.toString());
            ResultSet rs = ps.executeQuery();
            lista = new ArrayList<>();
            while (rs.next()) {
                RegistroInicial registroInicial = new RegistroInicial();
                registroInicial.setPlaca(rs.getString(1));
                registroInicial.setTipo_vehiculo(rs.getString(2));
                registroInicial.setLugar(rs.getString(3));
                registroInicial.setHora_entrada(rs.getTimestamp(4));
                lista.add(registroInicial);
            }
        } catch (Exception e) {
            mensaje = e.getMessage();
        }
        return lista;
    }

    public List<RegistroInicial> regIniIngPisoATodoVehiSel(String tipo_vehi) {
        List<RegistroInicial> lista = null;
        StringBuilder sql = new StringBuilder();
        sql.append("SELECT ")
                .append("placa, ")
                .append("tipo_vehiculo, ")
                .append("id_ubicacion, ")
                .append("hora_entrada")
                .append(" FROM registro_inicial")
                .append(" WHERE id_ubicacion LIKE 'A%'")
                .append(" AND tipo_vehiculo = ?");
        try (Connection cn = conexionBD.getConexion()) {
            PreparedStatement ps = cn.prepareStatement(sql.toString());
            ps.setString(1, tipo_vehi);
            ResultSet rs = ps.executeQuery();
            lista = new ArrayList<>();
            while (rs.next()) {
                RegistroInicial registroInicial = new RegistroInicial();
                registroInicial.setPlaca(rs.getString(1));
                registroInicial.setTipo_vehiculo(rs.getString(2));
                registroInicial.setLugar(rs.getString(3));
                registroInicial.setHora_entrada(rs.getTimestamp(4));
                lista.add(registroInicial);
            }
        } catch (Exception e) {
            mensaje = e.getMessage();
        }
        return lista;
    }

    public List<RegistroInicial> regIniIngPisoBTodoSel() {
        List<RegistroInicial> lista = null;
        StringBuilder sql = new StringBuilder();
        sql.append("SELECT ")
                .append("placa, ")
                .append("tipo_vehiculo, ")
                .append("id_ubicacion, ")
                .append("hora_entrada")
                .append(" FROM registro_inicial")
                .append(" WHERE id_ubicacion LIKE 'B%'");
        try (Connection cn = conexionBD.getConexion()) {
            PreparedStatement ps = cn.prepareStatement(sql.toString());
            ResultSet rs = ps.executeQuery();
            lista = new ArrayList<>();
            while (rs.next()) {
                RegistroInicial registroInicial = new RegistroInicial();
                registroInicial.setPlaca(rs.getString(1));
                registroInicial.setTipo_vehiculo(rs.getString(2));
                registroInicial.setLugar(rs.getString(3));
                registroInicial.setHora_entrada(rs.getTimestamp(4));
                lista.add(registroInicial);
            }
        } catch (Exception e) {
            mensaje = e.getMessage();
        }
        return lista;
    }

    public List<RegistroInicial> regIniIngPisoBTodoVehiSel(String tipo_vehi) {
        List<RegistroInicial> lista = null;
        StringBuilder sql = new StringBuilder();
        sql.append("SELECT ")
                .append("placa, ")
                .append("tipo_vehiculo, ")
                .append("id_ubicacion, ")
                .append("hora_entrada")
                .append(" FROM registro_inicial")
                .append(" WHERE id_ubicacion LIKE 'B%'")
                .append(" AND tipo_vehiculo = ?");
        try (Connection cn = conexionBD.getConexion()) {
            PreparedStatement ps = cn.prepareStatement(sql.toString());
            ps.setString(1, tipo_vehi);
            ResultSet rs = ps.executeQuery();
            lista = new ArrayList<>();
            while (rs.next()) {
                RegistroInicial registroInicial = new RegistroInicial();
                registroInicial.setPlaca(rs.getString(1));
                registroInicial.setTipo_vehiculo(rs.getString(2));
                registroInicial.setLugar(rs.getString(3));
                registroInicial.setHora_entrada(rs.getTimestamp(4));
                lista.add(registroInicial);
            }
        } catch (Exception e) {
            mensaje = e.getMessage();
        }
        return lista;
    }

    public String regIniUpd(String id_ubicacion, String placa, String tipo_vehi, Date hora_entrada) {
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String formattedDate = formatter.format(hora_entrada);
        StringBuilder sql = new StringBuilder();
        sql.append("UPDATE registro_inicial SET ")
                .append("placa = ?, ")
                .append("tipo_vehiculo = ?, ")
                .append("hora_entrada = ? ")
                .append("WHERE id_ubicacion = ?");

        try (Connection cn = conexionBD.getConexion()) {
            int resultado;
            try (PreparedStatement ps = cn.prepareStatement(sql.toString())) {
                ps.setString(1, placa);
                ps.setString(2, tipo_vehi);
                ps.setString(3, formattedDate);
                ps.setString(4, id_ubicacion);
                resultado = ps.executeUpdate();
            }
            if (resultado == 0) {
                sql = new StringBuilder();
                sql.append("INSERT INTO registro_inicial ")
                        .append("(id_ubicacion, placa, tipo_vehiculo, hora_entrada) ")
                        .append("VALUES (?, ?, ?, ?)");
                try (Connection cnInsert = conexionBD.getConexion()) {
                    PreparedStatement psInsert = cnInsert.prepareStatement(sql.toString());
                    psInsert.setString(1, id_ubicacion);
                    psInsert.setString(2, placa);
                    psInsert.setString(3, tipo_vehi);
                    psInsert.setString(4, formattedDate);
                    int resultadoInsert = psInsert.executeUpdate();
                    if (resultadoInsert == 0) {
                        mensaje = "Cero registros insertados";
                    } else {
                        mensaje = "Se Registró correctamente";
                    }
                } catch (SQLException e) {
                    mensaje = e.getMessage();
                }
            } else {
                mensaje = "Se Registro correctamente";
            }
        } catch (SQLException e) {
            mensaje = e.getMessage();
        }
        return mensaje;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void Eliminar_registro(String placa) {
        StringBuilder sql = new StringBuilder();
        sql.append("DELETE FROM registro_inicial WHERE placa = ? ");

        try (Connection cn = conexionBD.getConexion()) {
            PreparedStatement ps = cn.prepareStatement(sql.toString());
            ps.setString(1, placa);
            int rowsAffected = ps.executeUpdate(); // Usar executeUpdate para DELETE
            if (rowsAffected > 0) {
                mensaje = "Registro eliminado exitosamente.";
            } else {
                mensaje = "No se encontraron registros con la placa especificada.";
            }
        } catch (Exception e) {
            mensaje = e.getMessage();
        }
    }

}
