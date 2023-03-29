package Herencia_Polimorfismo.Herencia_TP1.Punto_14;

public class HotelTres extends Hotel{
    public HotelTres(String nombre, String direccion, String localidad, String gerente, int habitaciones, int camas, int pisos, double precio) {
        super(nombre, direccion, localidad, gerente, habitaciones, camas, pisos, precio);
    }

    @Override
    public double calcularPrecio() {
        return precioHabitacion + habitaciones;
    }
}
