package Base_De_Datos;

import clases.Ubicacion;
import conexion.ConexionBD;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DaoUbicacion {

    private ConexionBD bd = new ConexionBD();
    private String mensaje;

    public List<Ubicacion> ubicacionSel() {
        List<Ubicacion> lista = null;

        StringBuilder sql = new StringBuilder();
        sql.append("SELECT ")
                .append("id_ubicacion,")
                .append("tipo_vehiculo,")
                .append("codigo_lugar,")
                .append("estado")
                .append(" FROM ubicacion");

        try (Connection c = bd.getConexion()) {
            PreparedStatement ps = c.prepareStatement(sql.toString());
            ResultSet rs = ps.executeQuery();
            lista = new ArrayList<>();
            while (rs.next()) {
                Ubicacion ubicacion = new Ubicacion();
                ubicacion.setId_ubicacion(rs.getString(1));
                ubicacion.setTipo_vehiculo(rs.getString(2));
                ubicacion.setCodigo_lugar(rs.getString(3));
                ubicacion.setEstado(rs.getString(4));
                lista.add(ubicacion);
            }
        } catch (Exception e) {
            mensaje = e.getMessage();
        }
        return lista;
    }

    public Ubicacion ubicacionGet(String id) {
        Ubicacion ubicacion = null;
        StringBuilder sql = new StringBuilder();
        sql.append("SELECT ")
                .append("id_ubicacion,")
                .append("tipo_vehiculo,")
                .append("codigo_lugar,")
                .append("estado")
                .append(" FROM ubicacion")
                .append(" WHERE id_ubicacion = ?");

        try (Connection cn = bd.getConexion()) {
            PreparedStatement ps = cn.prepareStatement(sql.toString());
            ps.setString(1, id);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                ubicacion = new Ubicacion();
                ubicacion.setId_ubicacion(rs.getString(1));
                ubicacion.setTipo_vehiculo(rs.getString(2));
                ubicacion.setCodigo_lugar(rs.getString(3));
                ubicacion.setEstado(rs.getString(4));
            } else {
                mensaje = "Sin datos";
            }
        } catch (SQLException e) {
            mensaje = e.getMessage();
        }
        return ubicacion;
    }

    public String ubicacionGetCodigo(String id) {
        String codigo = "";
        StringBuilder sql = new StringBuilder();
        sql.append("SELECT ")
                .append("codigo_lugar")
                .append(" FROM ubicacion")
                .append(" WHERE id_ubicacion = ?");

        try (Connection cn = bd.getConexion()) {
            PreparedStatement ps = cn.prepareStatement(sql.toString());
            ps.setString(1, id);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                codigo = rs.getString(1);
            } else {
                mensaje = "Sin datos";
            }
        } catch (SQLException e) {
            mensaje = e.getMessage();
        }
        return codigo;
    }

    public String ubicacionUpdEstado(String id, String est) {
        StringBuilder sql = new StringBuilder();
        sql.append("UPDATE ubicacion SET ")
                .append("estado = ? ")
                .append("WHERE id_ubicacion = ?");

        try (Connection cn = bd.getConexion()) {
            PreparedStatement ps = cn.prepareStatement(sql.toString());
            ps.setString(1, est);
            ps.setString(2, id);
            int resultado = ps.executeUpdate();
            if (resultado == 0) {
                mensaje = "Cero registros actualizados";
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

}
