package Herencia_Polimorfismo.Herencia_TP1.Punto_12;

public class Usuario {
    private String nombre, dni;
    private int cuenta;
    Usuario(String d, String n) {
        nombre = n;
        dni = d;
        cuenta = 0;
    }

    void conexion (int s) {
        cuenta = cuenta + s;
    }

    double calcularFacturacion() {
        return cuenta * 0.32;
    }

    void reset() {
        cuenta = 0;
    }

    String getNombre() {
        return nombre;
    }

    String getDni() {
        return dni;
    }
}
