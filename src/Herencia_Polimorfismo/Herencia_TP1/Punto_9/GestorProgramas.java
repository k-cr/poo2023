package Herencia_Polimorfismo.Herencia_TP1.Punto_9;
import java.util.Vector;

public class GestorProgramas {
    Vector<Programa> programas;
    public GestorProgramas() {
        programas = new Vector<Programa>( 10);
    }
    public void agregarPrograma(Programa programa) {
        programas.add(programa);
    }
    public void mostrarProgramas() {
        System.out.println("Programas disponibles: ");
        for (Programa programa: programas) {
            String tipo = "";
            if(programa.getClass() == Television.class) {
                tipo = "Televisión";
            } else if (programa.getClass() == Radio.class) {
                tipo = "Radio";
            }
            System.out.println("> " + tipo + " de duración: " + programa.getDuracionMinutos() + " minutos.");
        }
    }
    public void cantidadComerciales() {
        for (Programa programa: programas) {
            String tipo = "";
            if(programa.getClass() == Television.class) {
                System.out.println("Para el programa de Televisión con duración "
                        + programa.getDuracionMinutos()
                        + " minutos de la emisora " + programa.getEmisora()
                        + ", la cantidad de comerciales es de: "
                        + programa.mostrarComerciales() + " por tanda");
            } else if (programa.getClass() == Radio.class) {
                System.out.println("Para el programa de radio con duración "
                        + programa.getDuracionMinutos()
                        + " minutos de la emisora " + programa.getEmisora()
                        + ", la cantidad de comerciales es de: "
                        + programa.mostrarComerciales() +
                        " a razón de 20 minutos del programa");
            }
        }
    }
}
