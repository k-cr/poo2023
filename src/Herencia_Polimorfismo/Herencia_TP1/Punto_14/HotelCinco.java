package Herencia_Polimorfismo.Herencia_TP1.Punto_14;

public class HotelCinco extends Hotel{
    final static int precioLimosinas = 15;
    String tipoGimnasio;
    String nombreRestaurante;
    int capacidadRestaurante;
    int cantidadSalones;
    int cantidadSuites;
    int cantidadLimosinas;

    public HotelCinco(String nombre, String direccion, String localidad, String gerente, int habitaciones, int camas, int pisos, double precio, String tipoGimnasio, String nombreRestaurante, int capacidadRestaurante, int cantidadSalones, int cantidadSuites, int cantidadLimosinas) {
        super(nombre, direccion, localidad, gerente, habitaciones, camas, pisos, precio);
        this.tipoGimnasio = tipoGimnasio;
        this.nombreRestaurante = nombreRestaurante;
        this.capacidadRestaurante = capacidadRestaurante;
        this.cantidadSalones = cantidadSalones;
        this.cantidadSuites = cantidadSuites;
        this.cantidadLimosinas = cantidadLimosinas;
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

    public int getCantidadSalones() {
        return cantidadSalones;
    }

    public void setCantidadSalones(int cantidadSalones) {
        this.cantidadSalones = cantidadSalones;
    }

    public int getCantidadSuites() {
        return cantidadSuites;
    }

    public void setCantidadSuites(int cantidadSuites) {
        this.cantidadSuites = cantidadSuites;
    }

    public int getCantidadLimosinas() {
        return cantidadLimosinas;
    }

    public void setCantidadLimosinas(int cantidadLimosinas) {
        this.cantidadLimosinas = cantidadLimosinas;
    }
    @Override
    public double calcularPrecio() {
        return precioHabitacion + habitaciones + calcularPrecioPorGimnasio() + calcularPrecioRestaurante() + (precioLimosinas * getCantidadLimosinas());
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
