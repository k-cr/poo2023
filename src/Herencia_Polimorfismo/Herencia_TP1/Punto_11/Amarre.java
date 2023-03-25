package Herencia_Polimorfismo.Herencia_TP1.Punto_11;

import java.util.Date;

public class Amarre {
    String nombreCliente;
    int dniCliente;
    String fechaInicial;
    String fechaFin;
    int posicion;
    Barco barco;

    public Amarre(String nombreCliente, int dniCliente, String fechaInicial, String fechaFin, int posicion, Barco barco) {
        this.nombreCliente = nombreCliente;
        this.dniCliente = dniCliente;
        this.fechaInicial = fechaInicial;
        this.fechaFin = fechaFin;
        this.posicion = posicion;
        this.barco = barco;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public int getDniCliente() {
        return dniCliente;
    }

    public void setDniCliente(int dniCliente) {
        this.dniCliente = dniCliente;
    }

    public String getFechaInicial() {
        return fechaInicial;
    }

    public void setFechaInicial(String fechaInicial) {
        this.fechaInicial = fechaInicial;
    }

    public String getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(String fechaFin) {
        this.fechaFin = fechaFin;
    }

    public int getPosicion() {
        return posicion;
    }

    public void setPosicion(int posicion) {
        this.posicion = posicion;
    }

    public Barco getBarco() {
        return barco;
    }

    public void setBarco(Barco barco) {
        this.barco = barco;
    }

    public double calcularAlquiler() {
        Date fechaInicio = new Date(getFechaInicial());
        Date fechaFin = new Date(getFechaFin());
        long diasInicio = fechaInicio.getTime();
        long diasFin = fechaFin.getTime();
        long diasTotales = (diasFin - diasInicio) / (1000 * 60 * 60 * 24);
        Barco barco = getBarco();
        return (diasTotales * barco.calcularPrecio() * 2);
    }
}
