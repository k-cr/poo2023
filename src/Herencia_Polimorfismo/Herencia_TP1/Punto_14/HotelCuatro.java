package Herencia_Polimorfismo.Herencia_TP1.Punto_14;

public class HotelCuatro extends Hotel{
    String tipoGimnasio;
    String nombreRestaurante;
    int capacidadRestaurante;

    public HotelCuatro(String nombre, String direccion, String localidad, String gerente, int habitaciones, int camas, int pisos, double precio, String tipoGimnasio, String nombreRestaurante, int capacidadRestaurante) {
        super(nombre, direccion, localidad, gerente, habitaciones, camas, pisos, precio);
        this.tipoGimnasio = tipoGimnasio;
        this.nombreRestaurante = nombreRestaurante;
        this.capacidadRestaurante = capacidadRestaurante;
    }

    public String getTipoGimnasio() {
        return tipoGimnasio;
    }

    public void setTipoGimnasio(String tipoGimnasio) {
        this.tipoGimnasio = tipoGimnasio;
    }

    public String getNombreRestaurante() {
        return nombreRestaurante;
    }

    public void setNombreRestaurante(String nombreRestaurante) {
        this.nombreRestaurante = nombreRestaurante;
    }

    public int getCapacidadRestaurante() {
        return capacidadRestaurante;
    }

    public void setCapacidadRestaurante(int capacidadRestaurante) {
        this.capacidadRestaurante = capacidadRestaurante;
    }

    @Override
    public double calcularPrecio() {
        return precioHabitacion + habitaciones + calcularPrecioPorGimnasio() + calcularPrecioRestaurante();
    }

    public double calcularPrecioRestaurante() {
        if(getCapacidadRestaurante() < 30) {
            return 10;
        } else if (getCapacidadRestaurante() >= 30 && getCapacidadRestaurante() <= 50) {
            return 30;
        } else if (getCapacidadRestaurante() > 50) {
            return 50;
        }
        return 0;
    }

    public double calcularPrecioPorGimnasio() {
        if(getTipoGimnasio().equals("A")) {
            return 50;
        } else {
            return 30;
        }
    }
}
