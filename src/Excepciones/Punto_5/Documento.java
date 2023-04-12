package Excepciones.Punto_5;

public class Documento {
    int hojas;
    String nombre;

    public Documento(int hojas, String nombre) {
        this.hojas = hojas;
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getHojas() {
        return hojas;
    }

    public void setHojas(int hojas) {
        this.hojas = hojas;
    }
}
