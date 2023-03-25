package Herencia_Polimorfismo.Herencia_TP1.Punto_10;

import javax.swing.*;
import java.util.Vector;

public class GestorPublicacion {
    Vector<Publicacion> publicaciones;

    public GestorPublicacion() {
        publicaciones = new Vector<Publicacion>(10);
    }

    public void agregarPublicacion(Publicacion publicacion) {
        publicaciones.add(publicacion);
        JOptionPane.showMessageDialog(null, "Publicación añadida con éxito.");
    }

    public String mostrarPublicacion() {
        String textoMensaje = "";
        for (Publicacion publicacion: publicaciones) {
            String tipo = "";
            if (publicacion.getClass() == Diario.class) {
                tipo = "diario";
            } else if (publicacion.getClass() == Revista.class) {
                tipo = "revista";
            }
            textoMensaje = textoMensaje + "> " + tipo + " con precio: $" + publicacion.calcularPrecio() + "\n";
        }
        return textoMensaje;
    }
}
