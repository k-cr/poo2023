package Persistencia.Punto_1;

import javax.swing.*;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        String nombreArchivo = "enteros.dat";
        try {
            ArchivoEnteros gestor = new ArchivoEnteros(nombreArchivo);
            int opcion = -1;
            do {
                try {
                    String lectura = JOptionPane.showInputDialog(null,
                            """
                                    -------------------------------
                                    Ingrese una opción:\s
                                    1. Escribir un entero. \s
                                    2. Leer un entero según posición.\s
                                    3. Leer todos los enteros. \s
                                    4. Calcular promedio de los enteros almacenados. \s
                                    5. Mostrar de menor a mayor los enteros del archivo. \s
                                    0. Salir. \s
                                    -------------------------------""");
                    opcion = Integer.parseInt(lectura);
                    switch (opcion) {
                        case 1 -> // Manejar caso 1
                        {
                            int entero = Integer.parseInt(JOptionPane.showInputDialog(null, "¿Cuál entero quiere añadir?"));
                            gestor.escribirEntero(entero);
                        }
                        case 2 ->
                        {
                            int entero = Integer.parseInt(JOptionPane.showInputDialog(null, "¿Cuál entero quiere buscar? 1 para primero, 2 para segundo... así."));
                            gestor.buscarEntero(entero);
                        }
                        case 3 ->
                        {
                            JOptionPane.showMessageDialog(null, gestor.leerEnteros());
                        }
                        case 4 ->
                        {
                            JOptionPane.showMessageDialog(null, gestor.calcularPromedio());
                        }
                        case 5 ->
                        {
                            JOptionPane.showMessageDialog(null, gestor.mostrarEnterosOrdenados());
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
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
