/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

/**
 *
 * @author Braya
 */
public class Tarifario {
    private String tipo_vehiculo;
    private Double tarifa_hora;
    private Double comision;

    public Tarifario() {
    }

    public String getTipo_vehiculo() {
        return tipo_vehiculo;
    }

    public void setTipo_vehiculo(String tipo_vehiculo) {
        this.tipo_vehiculo = tipo_vehiculo;
    }

    public Double getTarifa_hora() {
        return tarifa_hora;
    }

    public void setTarifa_hora(Double tarifa_hora) {
        this.tarifa_hora = tarifa_hora;
    }

    public Double getComision() {
        return comision;
    }

    public void setComision(Double comision) {
        this.comision = comision;
    }
    
    
    
}
