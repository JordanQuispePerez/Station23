
package clases;

import java.util.Date;

/**
 *
 * @author danda
 */
public class RegistroFinal {
    private String codigo_reg;
    private String placa;
    private Date hora_entrada;
    private Date hora_salida;
    private String id_ubicacion;
    private String tipo_vehiculo;
    private Double pago_total;
    private Date hora_pago;

    public RegistroFinal() {
    }

    public String getCodigo_reg() {
        return codigo_reg;
    }

    public void setCodigo_reg(String codigo_reg) {
        this.codigo_reg = codigo_reg;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public Date getHora_entrada() {
        return hora_entrada;
    }

    public void setHora_entrada(Date hora_entrada) {
        this.hora_entrada = hora_entrada;
    }

    public Date getHora_salida() {
        return hora_salida;
    }

    public void setHora_salida(Date hora_salida) {
        this.hora_salida = hora_salida;
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

    public Double getPago_total() {
        return pago_total;
    }

    public void setPago_total(Double pago_total) {
        this.pago_total = pago_total;
    }

    public Date getHora_pago() {
        return hora_pago;
    }

    public void setHora_pago(Date hora_pago) {
        this.hora_pago = hora_pago;
    }

    
    
    
}
