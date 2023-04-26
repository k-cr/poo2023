package Persistencia.Punto_4;

import javax.swing.*;

public class Main {
    public static void main (String[] args) {
        // Instanciar objetos.
        GestorPersonas gestor = new GestorPersonas();
        int opcion = -1;
        do {
            try {
                String lectura = JOptionPane.showInputDialog(null,
                        """
                                -------------------------------
                                Ingrese una opción:\s
                                1. Ingresar una persona. \s
                                2. Remover una persona de la lista. \s
                                3. Buscar una persona por su nombre. \s
                                4. Guardar las personas cargadas en un archivo. \s
                                5. Ver personas cargadas en el archivo. \s
                                6. Guardar contenedor entero. \s
                                7. Leer contenedor con todos sus personas. \s
                                0. Salir. \s
                                -------------------------------""");
                opcion = Integer.parseInt(lectura);
                switch (opcion) {
                    case 1 -> // Manejar caso 1
                    {
                        String nombre = JOptionPane.showInputDialog(null, "¿Cómo se llama la persona? Máximo 15 caracteres.");
                        int dni = Integer.parseInt(JOptionPane.showInputDialog(null, "¿Cuál es su DNI?"));
                        double altura = Double.parseDouble(JOptionPane.showInputDialog(null, "¿Qué altura tiene?"));
                        Persona persona = new Persona(nombre, dni, altura);
                        gestor.addPerson(persona);
                    }
                    case 2 ->
                    {
                        String nombre = JOptionPane.showInputDialog(null, "Ingrese el nombre de la persona que quiere eliminar.");
                        gestor.removePerson(nombre);
                    }
                    case 3 ->
                    {
                        String nombre = JOptionPane.showInputDialog(null, "Ingrese el nombre de la persona que quiere buscar.");
                        gestor.searchPerson(nombre);
                    }
                    case 4 ->
                    {
                        gestor.guardarPersonas(gestor.personas);
                    }
                    case 5 ->
                    {
                        JOptionPane.showMessageDialog(null, gestor.listarPersonas());
                    }
                    case 6 ->
                    {
                        String nombreArchivo = JOptionPane.showInputDialog(null, "¿Cómo se llamará el archivo?");
                        gestor.guardarContenedor(nombreArchivo);
                    }
                    case 7 ->
                    {
                        String nombreArchivo = JOptionPane.showInputDialog(null, "¿Cómo se llama el archivo?");
                        gestor.traerContenedor(nombreArchivo);
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
