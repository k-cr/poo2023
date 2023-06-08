package Herencia_Polimorfismo.Herencia_TP1.Punto_13;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        GestorDocumentos gestorDocumentos = new GestorDocumentos();
        int opcion = -1;
        int op = -1;
        do {
            try {
                String lectura = JOptionPane.showInputDialog(null,
                        """
                                -------------------------------
                                Ingrese una opción:\s
                                1. Alquilar un barco. \s
                                2. Ver barcos alquilados. \s
                                0. Salir.\s
                                -------------------------------""");
                opcion = Integer.parseInt(lectura);
                switch (opcion) {
                    case 1 -> // Manejar caso 1
                    {
                        String opciones = JOptionPane.showInputDialog(null,
                                """
                                        -------------------------------
                                        ¿Qué barco quisiera alquilar?:\s
                                        1. Velero. \s
                                        2. Deportivo. \s
                                        3. Yate. \s
                                        -------------------------------
                                        """);
                        op = Integer.parseInt(opciones);
                        switch (op) {
                            case 1 -> {

                            }
                            case 2 -> {

                            }
                            case 3 -> {

                            }
                        }
                    }
                    case 2 -> {

                    }
                    case 0 -> {
                        JOptionPane.showMessageDialog(null, "¡Adios!");
                    }
                    default -> {
                        JOptionPane.showMessageDialog(null, "Opción no válida. Inténtelo de nuevo.");
                    }
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Opción no válida" + e.getMessage());
            }
        } while (opcion != 0);
    }
}
