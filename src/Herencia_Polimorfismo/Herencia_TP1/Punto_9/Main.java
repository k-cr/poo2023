package Herencia_Polimorfismo.Herencia_TP1.Punto_9;
import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        GestorProgramas gestor = new GestorProgramas();
        int opcion = -1;
        int op = -1;
        do {
            try {
                String lectura = JOptionPane.showInputDialog(null,
                        """
                                -------------------------------
                                Ingrese una opción:\s
                                1. Añadir un programa.\s
                                2. Listar programas añadidos.\s
                                3. Mostrar cuántas comerciales tiene cada programa.\s
                                0. Salir\s
                                -------------------------------""");
                opcion = Integer.parseInt(lectura);
                switch (opcion) {
                    case 1 -> // Manejar caso 1
                    {
                        String anhadir = JOptionPane.showInputDialog(null, """
                                -------------------------------
                                ¿Qué quiere añadir? \s
                                1. Añadir un programa de televisión \s
                                2. Añadir un programa de radio \s
                                -------------------------------
                                """);
                        op = Integer.parseInt(anhadir);
                        switch (op) {
                            case 1 -> {
                                // Añadir un programa de TELE
                                int id = Integer.parseInt(JOptionPane.showInputDialog(null, "¿Qué código identificatorio tendrá?"));
                                String titulo = JOptionPane.showInputDialog(null, "¿Qué título tendrá el programa?");
                                String responsable = JOptionPane.showInputDialog(null, "¿Quién es el responsable?");
                                int duracion = Integer.parseInt(JOptionPane.showInputDialog(null, "¿Cuántos minutos durará?"));
                                String horaInicio = JOptionPane.showInputDialog(null, "¿A qué hora empieza? Formato hh:mm");
                                String emisora = JOptionPane.showInputDialog(null, "¿Quién es la emisora?");
                                int tandas = Integer.parseInt(JOptionPane.showInputDialog(null, "¿Cuántas tandas de publicidad tiene?"));
                                Television tele = new Television(titulo, responsable, id, duracion, horaInicio, emisora, tandas);
                                gestor.agregarPrograma(tele);
                            }
                            case 2 -> {
                                // Añadir un programa de RADIO
                                int id = Integer.parseInt(JOptionPane.showInputDialog(null, "¿Qué código identificatorio tendrá?"));
                                String titulo = JOptionPane.showInputDialog(null, "¿Qué título tendrá el programa?");
                                String responsable = JOptionPane.showInputDialog(null, "¿Quién es el responsable?");
                                int duracion = Integer.parseInt(JOptionPane.showInputDialog(null, "¿Cuántos minutos durará?"));
                                String horaInicio = JOptionPane.showInputDialog(null, "¿A qué hora empieza? Formato hh:mm");
                                String emisora = JOptionPane.showInputDialog(null, "¿Quién es la emisora?");
                                String responsableMusical = JOptionPane.showInputDialog(null, "¿Quién es el responsable musical?");
                                Radio radio = new Radio(titulo, responsable, id, duracion, horaInicio, emisora, responsableMusical);
                                gestor.agregarPrograma(radio);
                            }
                        }
                    }
                    case 2 ->
                    {
                        JOptionPane.showMessageDialog(null, gestor.mostrarProgramas());
                    }
                    case 3 ->
                    {
                        JOptionPane.showMessageDialog(null, gestor.cantidadComerciales());
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
