package clases;

import java.util.Date;

public class RegistroInicial {

    private String codigo_reg;
    private String placa;
    private Date hora_entrada;
    private String lugar;
    private String tipo_vehiculo;

    public RegistroInicial() {
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

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public String getTipo_vehiculo() {
        return tipo_vehiculo;
    }

    public void setTipo_vehiculo(String tipo_vehiculo) {
        this.tipo_vehiculo = tipo_vehiculo;
    }
    
    
    
}
