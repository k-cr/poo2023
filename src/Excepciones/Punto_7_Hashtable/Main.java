package Excepciones.Punto_7_Hashtable;
import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        int opcion = -1;
        String nombreBD = JOptionPane.showInputDialog(null, "¿Cómo se llama la BD?");
        DataBase bd = new DataBase(nombreBD, false);
        do {
            try {
                String lectura = JOptionPane.showInputDialog(null,
                        """
                                -------------------------------
                                Ingrese una opción:\s
                                1. Abrir la base de datos. \s
                                2. Cerrar la base de datos. \s
                                3. Agregar una tabla. \s
                                4. Eliminar una tabla. \s
                                5. Listar tablas.\s
                                0. Salir. \s
                                -------------------------------""");
                opcion = Integer.parseInt(lectura);
                switch (opcion) {
                    case 1 -> {
                        bd.setAbierto(true);
                        JOptionPane.showMessageDialog(null, "Se ha abierto con éxito");
                    }
                    case 2 -> {
                        bd.setAbierto(false);
                        JOptionPane.showMessageDialog(null, "Se ha cerrado con éxito");
                    }
                    case 3 -> {
                        String nombreTabla = JOptionPane.showInputDialog(null, "¿Cómo se llama la tabla?");
                        Table tabla = new Table(nombreTabla);
                        try {
                            bd.createTable(tabla);
                        } catch (DBException | DuplicatedTableException e) {
                            JOptionPane.showMessageDialog(null, e.getMessage());
                        }
                    }
                    case 4 -> {
                        String id = JOptionPane.showInputDialog(null, "¿Cómo se llama la tabla que va a eliminar?");
                        try {
                            bd.removeTable(id);
                        } catch (DBException | TableException e) {
                            JOptionPane.showMessageDialog(null, e.getMessage());
                        }
                    }
                    case 5 -> {
                        try {
                            String tablas = bd.listTables();
                            JOptionPane.showMessageDialog(null, tablas
                            );
                        } catch (DBException e) {
                            JOptionPane.showMessageDialog(null, e.getMessage());
                        }
                    }
                    case 0 -> JOptionPane.showMessageDialog(null, "¡Adios!");
                    default -> JOptionPane.showMessageDialog(null, "Opción no válida. Inténtelo de nuevo.");
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Opción no válida");
            }
        } while (opcion != 0);
    }

}
