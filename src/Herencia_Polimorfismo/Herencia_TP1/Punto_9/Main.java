package Herencia_Polimorfismo.Herencia_TP1.Punto_9;
import javax.swing.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
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
                                2. Listar espacios comerciales.\s
                                3.\s
                                4.\s
                                5.\s
                                6.\s
                                7.\s
                                8.\s
                                9.\s
                                0.\s
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

                            }
                            case 2 -> {
                                // Añadir un programa de RADIO
                            }
                        }
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
