package Herencia_Polimorfismo.Herencia_TP1.Punto_11;

import javax.swing.*;
import java.util.Vector;

public class Puerto {
    Vector <Amarre> amarres;
    public Puerto() {
        amarres = new Vector<Amarre>(10);
    }

    public void alquilarAmarre(Amarre amarre) {
        amarres.add(amarre);
        JOptionPane.showMessageDialog(null, "Amarre alquilado con éxito.");
    }

    public String mostrarAmarresAlquilados() {
        String textoMensaje = "";
        for (Amarre amarre : amarres) {
            textoMensaje = (textoMensaje + "> Amarre de la posición "
                                         + amarre.getPosicion() + " alquilado el " + amarre.getFechaInicial() + " hasta el "
                                         + amarre.getFechaFin() + " por un total de: $" + amarre.calcularAlquiler() + "\n");
        }
        return textoMensaje;
    }
}
