package Persistencia.Punto_2;
import javax.swing.*;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        String nombreArchivo = "datos.dat";
        try {
            ArchivoPersonas gestor = new ArchivoPersonas(nombreArchivo);
            int opcion = -1;
            do {
                try {
                    String lectura = JOptionPane.showInputDialog(null,
                            """
                                    -------------------------------
                                    Ingrese una opción:\s
                                    1. Escribir una persona. \s
                                    2. Buscar una persona. \s
                                    3. Leer personas. \s
                                    4. Calcular altura promedio. \s
                                    5. Generar auxiliar.dar con las personas que superan 1.60mts.
                                    6. Mostrar personas altas.
                                    0. Salir. \s
                                    -------------------------------""");
                    opcion = Integer.parseInt(lectura);
                    switch (opcion) {
                        case 1 -> // Manejar caso 1
                        {
                            String nombre = JOptionPane.showInputDialog(null, "¿Cómo se llama la persona? 10 caracteres como máximo");
                            int dni = Integer.parseInt(JOptionPane.showInputDialog(null, "¿Cuál es su DNI?"));
                            double altura = Double.parseDouble(JOptionPane.showInputDialog(null, "¿Altura?"));
                            Persona persona = new Persona(nombre, dni, altura);
                            gestor.escribirPersona(persona);
                        }
                        case 2 ->{
                            int dni = Integer.parseInt(JOptionPane.showInputDialog(null, "¿Cuál es su DNI?"));
                            gestor.buscarPersona(dni);
                        }
                        case 3 ->
                        {
                            JOptionPane.showMessageDialog(null, gestor.leerPersonas());
                        }
                        case 4 ->
                        {
                            JOptionPane.showMessageDialog(null, gestor.calcularAlturaPromedio());
                        }
                        case 5 ->
                        {
                            gestor.guardarEnArchivoMayor160cm();
                            JOptionPane.showMessageDialog(null, "Personas guardadas.");
                        }
                        case 6 ->
                        {
                            JOptionPane.showMessageDialog(null, gestor.leerPersonasAltas());
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
