package Herencia_Polimorfismo.Herencia_TP1.Punto_14;

import javax.swing.*;
import java.util.Vector;

public class GestorAlojamientos {
    Vector<Alojamiento> alojamientos;
    public GestorAlojamientos() {
        alojamientos = new Vector<Alojamiento>(10);
    }

    public void agregarAlojamiento(Alojamiento alojamiento) {
        this.alojamientos.add(alojamiento);
        JOptionPane.showMessageDialog(null, "Alojamiento añadido con éxito.");
    }

    public String mostrarAlojamientos() {
        String textoMensaje = "";
        for (Alojamiento alojamiento: alojamientos) {
            String tipo = "";
            if(alojamiento instanceof HotelTres) {
                tipo = "Hotel de tres estrellas";
            } else if (alojamiento instanceof HotelCuatro) {
                tipo = "Hotel de cuatro estrellas";
            } else if (alojamiento instanceof HotelCinco) {
                tipo = "Hotel de cinco estrellas";
            } else if (alojamiento instanceof Residencia) {
                tipo = "Residencia";
            } else if (alojamiento instanceof  Camping) {
                tipo = "Camping";
            }
            textoMensaje = textoMensaje + "> " + tipo + " ubicado en " + alojamiento.getLocalidad() + "\n";
        }
        return textoMensaje;
    }

    public String mostrarAlojamientosLocalidad(String localidad) {
        String textoMensaje = "";
        for (Alojamiento alojamiento: alojamientos) {
            if (alojamiento.getLocalidad().equals(localidad)) {
                String tipo = "";
                if(alojamiento instanceof HotelTres) {
                    tipo = "Hotel de tres estrellas";
                } else if (alojamiento instanceof HotelCuatro) {
                    tipo = "Hotel de cuatro estrellas";
                } else if (alojamiento instanceof HotelCinco) {
                    tipo = "Hotel de cinco estrellas";
                } else if (alojamiento instanceof Residencia) {
                    tipo = "Residencia";
                } else if (alojamiento instanceof  Camping) {
                    tipo = "Camping";
                }
                textoMensaje = textoMensaje + "> " + tipo + " ubicado en " + alojamiento.getLocalidad() + "\n";
            }
        }
        return textoMensaje;
    }
}
