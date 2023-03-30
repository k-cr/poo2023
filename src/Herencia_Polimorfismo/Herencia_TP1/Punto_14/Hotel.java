package Herencia_Polimorfismo.Herencia_TP1.Punto_14;

public class Hotel extends Alojamiento{
    final static int precioHabitacion = 50;
    int habitaciones;
    int camas;
    int pisos;
    double precio;

    public Hotel(String nombre, String direccion, String localidad, String gerente, int habitaciones, int camas, int pisos, double precio) {
        super(nombre, direccion, localidad, gerente);
        this.habitaciones = habitaciones;
        this.camas = camas;
        this.pisos = pisos;
        this.precio = precio;
    }

    public int getHabitaciones() {
        return habitaciones;
    }

    public void setHabitaciones(int habitaciones) {
        this.habitaciones = habitaciones;
    }

    public int getCamas() {
        return camas;
    }

    public void setCamas(int camas) {
        this.camas = camas;
    }

    public int getPisos() {
        return pisos;
    }

    public void setPisos(int pisos) {
        this.pisos = pisos;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public double calcularPrecio() {
        return precio;
    }
}
