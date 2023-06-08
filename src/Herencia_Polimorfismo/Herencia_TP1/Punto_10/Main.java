package Herencia_Polimorfismo.Herencia_TP1.Punto_10;

import javax.swing.*;

public class Main {
    public static void main (String[] args) {
        // Instanciar objetos.
        GestorPublicacion gestorPublicacion = new GestorPublicacion();
        int opcion = -1;
        int op = -1;
        do {
            try {
                String lectura = JOptionPane.showInputDialog(null,
                        """
                                -------------------------------
                                Ingrese una opción:\s
                                1. Añadir una publicación \s
                                2. Listar publicaciones. \s
                                0. Salir. \s
                                -------------------------------""");
                opcion = Integer.parseInt(lectura);
                switch (opcion) {
                    case 1 -> // Manejar caso 1
                    {
                        String anhadir = JOptionPane.showInputDialog(null, """
                                -------------------------------
                                ¿Qué quiere añadir? \s
                                1. Añadir una publicación de revista \s
                                2. Añadir una publicación de diario \s
                                -------------------------------
                                """);
                        op = Integer.parseInt(anhadir);
                        switch (op) {
                            case 1 -> {
                                int id = Integer.parseInt(JOptionPane.showInputDialog("¿Qué código de identificación?"));
                                String titulo = JOptionPane.showInputDialog(null, "¿Qué título tendrá la publicacion?");
                                String responsable = JOptionPane.showInputDialog(null, "¿Quién es el responsable?");
                                String editor = JOptionPane.showInputDialog(null, "¿Quién es el editor?");
                                int paginas = Integer.parseInt(JOptionPane.showInputDialog(null, "¿Cuántas páginas tendrá?"));
                                double precio = Double.parseDouble(JOptionPane.showInputDialog(null, "¿Qué precio tendrá?"));
                                int anhoPublicacion = Integer.parseInt(JOptionPane.showInputDialog(null, "¿En qué año se publicó?"));
                                int mesPublicacion = Integer.parseInt(JOptionPane.showInputDialog(null, "¿En qué mes se publicó?"));
                                int numero = Integer.parseInt(JOptionPane.showInputDialog(null, "¿Qué número de revista es?"));
                                Revista revista = new Revista(id, titulo, responsable, editor, paginas, precio, anhoPublicacion, mesPublicacion, numero);
                                gestorPublicacion.agregarPublicacion(revista);
                            }
                            case 2 -> {
                                int id = Integer.parseInt(JOptionPane.showInputDialog("¿Qué código de identificación?"));
                                String titulo = JOptionPane.showInputDialog(null, "¿Qué título tendrá la publicacion?");
                                String responsable = JOptionPane.showInputDialog(null, "¿Quién es el responsable?");
                                String editor = JOptionPane.showInputDialog(null, "¿Quién es el editor?");
                                int paginas = Integer.parseInt(JOptionPane.showInputDialog(null, "¿Cuántas páginas tendrá?"));
                                double precio = Double.parseDouble(JOptionPane.showInputDialog(null, "¿Qué precio tendrá?"));
                                int anhoPublicacion = Integer.parseInt(JOptionPane.showInputDialog(null, "¿En qué año se publicó?"));
                                int mesPublicacion = Integer.parseInt(JOptionPane.showInputDialog(null, "¿En qué mes se publicó?"));
                                int semanaPublicacion = Integer.parseInt(JOptionPane.showInputDialog(null, "¿En qué semana se publicó?"));
                                boolean esSemanal = false;
                                int parsear = Integer.parseInt(JOptionPane.showInputDialog(null, "¿Es semanal? Si sí, ponga 1, sino, 0"));
                                if (parsear == 1) esSemanal = true;
                                Diario diario = new Diario(id, titulo, responsable, editor, paginas, precio, anhoPublicacion, esSemanal, mesPublicacion, semanaPublicacion);
                                gestorPublicacion.agregarPublicacion(diario);
                            }
                        }
                    }
                    case 2 -> {
                        JOptionPane.showMessageDialog(null, gestorPublicacion.mostrarPublicacion());
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
