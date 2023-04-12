package Excepciones.Punto_6;

import javax.swing.*;

public class InterfazGrafica {

    public InterfazGrafica() {

    }
    public void mostrar(Archivo archivo) throws Error1, Error2 {
        if(archivo.tipo.equals("Binario")) {
            throw new Error1();
        } else if (!archivo.puedeLeer) {
            throw new Error2();
        } else {
            JOptionPane.showMessageDialog(null, "Mostrando archivo: " + archivo.nombre);
        }
    }

    public void mensajeError(String s) {

    }
}
