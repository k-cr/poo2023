package Excepciones.Punto_6;

import javax.swing.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        SistemaDeArchivo sistema = new SistemaDeArchivo(1, 1000000);
        int opcion = -1;
        do {
            try {
                String lectura = JOptionPane.showInputDialog(null,
                        """
                                -------------------------------
                                Ingrese una opción:\s
                                1. Añadir un archivo a un disco. \s
                                2. Mostrar los archivos del disco mediante la interfaz gráfica.\s
                                3. Comprobar información del disco. \s
                                0. Salir del programa. \s
                                -------------------------------""");
                opcion = Integer.parseInt(lectura);
                switch (opcion) {
                    case 1 -> {//
                        String nombre = JOptionPane.showInputDialog(null, "¿Cómo se llama el archivo?");
                        int tamanho = Integer.parseInt(JOptionPane.showInputDialog(null, "¿Cuánto pesa en bytes?"));
                        String fechaModificacion = JOptionPane.showInputDialog(null, "¿Cuál fue la última fecha de modificación? Formato: dd-mm-aaaa");
                        int puedeEscribir = Integer.parseInt(JOptionPane.showInputDialog(null, "¿Tiene permisos de escritura? 1) Sí, 0) No"));
                        boolean puedeE = puedeEscribir == 1;
                        int puedeLeer = Integer.parseInt(JOptionPane.showInputDialog(null, "¿Tiene permisos de lectura? 1) Sí, 0) No"));
                        boolean puedeL = puedeLeer == 1;
                        String tipo = JOptionPane.showInputDialog(null, "¿Qué tipo de archivo es? ¿Binario o Texto?");
                        Archivo archivo = new Archivo(nombre, tamanho, fechaModificacion, puedeE, puedeL, tipo);
                        sistema.agregarArchivo(archivo);
                    }
                    case 2 -> { //
                        sistema.listarArchivos();
                    }
                    case 3 -> { //
                        String caracteristicas = "ID: " + sistema.idDisco + "\n" + "Capacidad: " + sistema.capacidad + "\n";
                        JOptionPane.showMessageDialog(null, caracteristicas);
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
