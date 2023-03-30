package Herencia_Polimorfismo.Herencia_TP1.Punto_12;

import javax.swing.*;
import java.util.Vector;

public class GestorUsuarios {
    Vector<Usuario> usuarios;
    public GestorUsuarios () {
        usuarios = new Vector<Usuario>(10);
    }

    public void agregarUsuario(Usuario usuario) {
        usuarios.add(usuario);
        JOptionPane.showMessageDialog(null, "Usuario agregado.");
    }

    public void agregarSegundos(int posicion, int segundos) {
        usuarios.elementAt(posicion).conexion(segundos);
        JOptionPane.showMessageDialog(null, "Segundos añadidos con éxito.");
    }

    public String listaUsuarios() {
        int index = 0;
        String textoMensaje = "";
        for (Usuario usuario: usuarios) {
            textoMensaje = textoMensaje +  "Usuario en la conexión " + index + " \n";
            index++;
        }
        return textoMensaje;
    }

    public String mostrarUsuarios() {
        int index = 0;
        String textoMensaje = "";
        for (Usuario usuario: usuarios) {
            textoMensaje = textoMensaje + "Al usuario en la conexión " + index + " se le debe facturar un total de: $" + usuario.calcularFacturacion() + "\n";
            index++;
        }
        return textoMensaje;
    }
}
