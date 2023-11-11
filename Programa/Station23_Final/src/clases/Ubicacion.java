
package clases;

public class Ubicacion {
    private String id_ubicacion;
    private String tipo_vehiculo;
    private String codigo_lugar;
    private String estado;

    public Ubicacion() {
    }

    public Ubicacion(String id_ubicacion, String tipo_vehiculo, String codigo_lugar, String estado) {
        this.id_ubicacion = id_ubicacion;
        this.tipo_vehiculo = tipo_vehiculo;
        this.codigo_lugar = codigo_lugar;
        this.estado = estado;
    }

    public String getId_ubicacion() {
        return id_ubicacion;
    }

    public void setId_ubicacion(String id_ubicacion) {
        this.id_ubicacion = id_ubicacion;
    }

    public String getTipo_vehiculo() {
        return tipo_vehiculo;
    }

    public void setTipo_vehiculo(String tipo_vehiculo) {
        this.tipo_vehiculo = tipo_vehiculo;
    }

    public String getCodigo_lugar() {
        return codigo_lugar;
    }

    public void setCodigo_lugar(String codigo_lugar) {
        this.codigo_lugar = codigo_lugar;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    

    
}
