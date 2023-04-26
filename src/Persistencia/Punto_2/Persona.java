package Persistencia.Punto_2;

public class Persona {
    String nombre;
    int dni;
    double altura;

    public Persona(String nombre, int dni, double altura) {
        this.nombre = nombre;
        this.dni = dni;
        this.altura = altura;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
}
