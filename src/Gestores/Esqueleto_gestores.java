package Gestores;

import javax.swing.*;
import java.util.Scanner;

public class Esqueleto_gestores {
        public static void main (String[] args) {
            // Instanciar objetos.
            Scanner input = new Scanner(System.in);
            int opcion = -1;
            do {
                try {
                    String lectura = JOptionPane.showInputDialog(null,
                            """
                                    -------------------------------
                                    Ingrese una opción:\s
                                    1.\s
                                    2.\s
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
                            String algo = JOptionPane.showInputDialog("Ingrese algo");
                            System.out.println(algo);
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
