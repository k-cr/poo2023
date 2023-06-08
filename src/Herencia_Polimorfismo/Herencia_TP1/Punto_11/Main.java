package Herencia_Polimorfismo.Herencia_TP1.Punto_11;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        // Instanciar objetos.
        Puerto puerto = new Puerto();
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
                                JOptionPane.showMessageDialog(null, "Por favor, llene el siguiente formulario con los datos del barco.");
                                String matricula = JOptionPane.showInputDialog(null, "¿Qué matrícula tiene?");
                                int eslora = Integer.parseInt(JOptionPane.showInputDialog(null, "¿Cuántos metros de eslora?"));
                                int anhoFabricacion = Integer.parseInt(JOptionPane.showInputDialog(null, "¿En qué año se fabricó?"));
                                int mastiles = Integer.parseInt(JOptionPane.showInputDialog(null, "¿Cuántos mástiles tiene?"));
                                Velero velero = new Velero(matricula, eslora, anhoFabricacion, mastiles);
                                JOptionPane.showMessageDialog(null, "Por favor, llene el siguiente formulario con los datos del alquiler.");
                                String nombre = JOptionPane.showInputDialog(null, "Introduzca su nombre");
                                int dni = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduzca su DNI"));
                                String fechaInicio = JOptionPane.showInputDialog(null, "¿Desde qué día alquilará? Formato: aaaa-mm-dd");
                                String fechaFin = JOptionPane.showInputDialog(null, "¿Hasta qué día alquilará? Formato: aaaa-mm-dd");
                                int posicion = Integer.parseInt(JOptionPane.showInputDialog(null, "¿En qué posicion se encuentra ese amarre?"));
                                Amarre amarre = new Amarre(nombre, dni, fechaInicio, fechaFin, posicion, velero);
                                puerto.alquilarAmarre(amarre);
                            }
                            case 2 -> {
                                JOptionPane.showMessageDialog(null, "Por favor, llene el siguiente formulario con los datos del barco.");
                                String matricula = JOptionPane.showInputDialog(null, "¿Qué matrícula tiene?");
                                int eslora = Integer.parseInt(JOptionPane.showInputDialog(null, "¿Cuántos metros de eslora?"));
                                int anhoFabricacion = Integer.parseInt(JOptionPane.showInputDialog(null, "¿En qué año se fabricó?"));
                                int potencia = Integer.parseInt(JOptionPane.showInputDialog(null, "¿Cuántos CV de potencia tiene?"));
                                Deportivo deportivo = new Deportivo(matricula, eslora, anhoFabricacion, potencia);
                                JOptionPane.showMessageDialog(null, "Por favor, llene el siguiente formulario con los datos del alquiler.");
                                String nombre = JOptionPane.showInputDialog(null, "Introduzca su nombre");
                                int dni = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduzca su DNI"));
                                String fechaInicio = JOptionPane.showInputDialog(null, "¿Desde qué día alquilará? Formato: aaaa-mm-dd");
                                String fechaFin = JOptionPane.showInputDialog(null, "¿Hasta qué día alquilará? Formato: aaaa-mm-dd");
                                int posicion = Integer.parseInt(JOptionPane.showInputDialog(null, "¿En qué posicion se encuentra ese amarre?"));
                                Amarre amarre = new Amarre(nombre, dni, fechaInicio, fechaFin, posicion, deportivo);
                                puerto.alquilarAmarre(amarre);
                            }
                            case 3 -> {
                                JOptionPane.showMessageDialog(null, "Por favor, llene el siguiente formulario con los datos del barco.");
                                String matricula = JOptionPane.showInputDialog(null, "¿Qué matrícula tiene?");
                                int eslora = Integer.parseInt(JOptionPane.showInputDialog(null, "¿Cuántos metros de eslora?"));
                                int anhoFabricacion = Integer.parseInt(JOptionPane.showInputDialog(null, "¿En qué año se fabricó?"));
                                int potencia = Integer.parseInt(JOptionPane.showInputDialog(null, "¿Cuántos CV de potencia tiene?"));
                                int camarotes = Integer.parseInt(JOptionPane.showInputDialog(null, "¿Cuántos camarotes tiene?"));
                                Yate yate = new Yate(matricula, eslora, anhoFabricacion, potencia, camarotes);
                                JOptionPane.showMessageDialog(null, "Por favor, llene el siguiente formulario con los datos< del alquiler.");
                                String nombre = JOptionPane.showInputDialog(null, "Introduzca su nombre");
                                int dni = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduzca su DNI"));
                                String fechaInicio = JOptionPane.showInputDialog(null, "¿Desde qué día alquilará? Formato: aaaa-mm-dd");
                                String fechaFin = JOptionPane.showInputDialog(null, "¿Hasta qué día alquilará? Formato: aaaa-mm-dd");
                                int posicion = Integer.parseInt(JOptionPane.showInputDialog(null, "¿En qué posicion se encuentra ese amarre?"));
                                Amarre amarre = new Amarre(nombre, dni, fechaInicio, fechaFin, posicion, yate);
                                puerto.alquilarAmarre(amarre);
                            }
                        }
                    }
                    case 2 -> {
                        JOptionPane.showMessageDialog(null, puerto.mostrarAmarresAlquilados());
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
