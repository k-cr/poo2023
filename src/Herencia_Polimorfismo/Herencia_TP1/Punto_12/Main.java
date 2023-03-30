package Herencia_Polimorfismo.Herencia_TP1.Punto_12;
import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        GestorUsuarios gestor = new GestorUsuarios();
        int opcion = -1;
        int op = -1;
        do {
            try {
                String lectura = JOptionPane.showInputDialog(null,
                        """
                                -------------------------------
                                Ingrese una opción:\s
                                1. Añadir un usuario a la red.\s
                                2. Registrar segundos en la cuenta de un usuario. \s
                                3. Mostrar usuarios conectados a la red.\s
                                0. Salir\s
                                -------------------------------""");
                opcion = Integer.parseInt(lectura);
                switch (opcion) {
                    case 1 -> // Manejar caso 1
                    {
                        String anhadir = JOptionPane.showInputDialog(null, """
                                -------------------------------
                                ¿Qué tipo de usuario es? \s
                                1. Usuario residencial. \s
                                2. Usuario comercial. \s
                                3. Gran usuario. \s
                                9. Volver al menú anterior. \s
                                -------------------------------
                                """);
                        op = Integer.parseInt(anhadir);
                        switch (op) {
                            case 1 -> {
                                String nombre = JOptionPane.showInputDialog(null, "¿Qué nombre tiene?");
                                String dni = JOptionPane.showInputDialog(null, "¿Qué DNI tiene?");
                                UsuarioResidencial usuarioResidencial = new UsuarioResidencial(dni, nombre);
                                gestor.agregarUsuario(usuarioResidencial);
                            }
                            case 2 -> {
                                String nombre = JOptionPane.showInputDialog(null, "¿Qué nombre tiene?");
                                String dni = JOptionPane.showInputDialog(null, "¿Qué DNI tiene?");
                                int descuento = Integer.parseInt(JOptionPane.showInputDialog(null, "¿Qué porcentaje de descuento tiene?"));
                                UsuarioComercial usuarioComercial = new UsuarioComercial(dni, nombre, descuento);
                                gestor.agregarUsuario(usuarioComercial);
                            }
                            case 3 -> {
                                String nombre = JOptionPane.showInputDialog(null, "¿Qué nombre tiene?");
                                String dni = JOptionPane.showInputDialog(null, "¿Qué DNI tiene?");
                                UsuarioGrande usuarioGrande = new UsuarioGrande(dni, nombre);
                                gestor.agregarUsuario(usuarioGrande);
                            }
                        }
                    }
                    case 2 ->
                    {
                        int posicion = Integer.parseInt(JOptionPane.showInputDialog(null,
                                "¿A qué usuario quiere agregarle segundos? \n" +
                                gestor.listaUsuarios()));
                        int segundos = Integer.parseInt(JOptionPane.showInputDialog(null, "¿Cuántos segundos?"));
                        gestor.agregarSegundos(posicion, segundos);
                    }
                    case 3 ->
                    {
                        JOptionPane.showMessageDialog(null, gestor.mostrarUsuarios());
                    }
                    case 0 ->
                    {
                        JOptionPane.showMessageDialog(null, "¡Adios!");
                    }
                    default ->
                    {
                        JOptionPane.showMessageDialog(null, "Opción no válida. Inténtelo de nuevo.");
                    }
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Opción no válida");
            }
        } while (opcion != 0);
    }

}
