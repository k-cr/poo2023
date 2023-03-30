package Herencia_Polimorfismo.Herencia_TP1.Punto_9;
import javax.swing.*;
import java.util.Vector;

public class GestorProgramas {
    Vector<Programa> programas;
    public GestorProgramas() {
        programas = new Vector<Programa>( 10);
    }
    public void agregarPrograma(Programa programa) {
        programas.add(programa);
        JOptionPane.showMessageDialog(null, "Programa añadido");
    }
    public String mostrarProgramas() {
        String textoMensaje = "";
        for (Programa programa: programas) {
            String tipo = "";
            if(programa instanceof Television) {
                tipo = "Televisión";
            } else if (programa instanceof Radio) {
                tipo = "Radio";
            }
            textoMensaje = (textoMensaje + "> Programa de " + tipo + " de duración: " + programa.getDuracionMinutos() + " minutos \n");
        }
        return textoMensaje;
    }
    public String cantidadComerciales() {
        String textoMensaje = "";
        for (Programa programa: programas) {
            if(programa instanceof Television) {
                textoMensaje = textoMensaje + "Para el programa de televisión con duración "
                        + programa.getDuracionMinutos()
                        + " minutos de la emisora " + programa.getEmisora()
                        + ", la cantidad de comerciales es de: "
                        + programa.mostrarComerciales() + " por tanda \n";
            } else if (programa instanceof Radio) {
                textoMensaje = textoMensaje + "Para el programa de radio con duración "
                        + programa.getDuracionMinutos()
                        + " minutos de la emisora " + programa.getEmisora()
                        + ", la cantidad de comerciales es de: "
                        + programa.mostrarComerciales() +
                        " a razón de 20 minutos del programa \n";
            }
        }
        return textoMensaje;
    }
}
