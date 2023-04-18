package Excepciones.Punto_7_DBMS;

import Excepciones.Punto_7_Hashtable.DBException;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        int opcion = -1;
        DBMS gestorDataBase = new DBMS();
        do {
            try {
                String lectura = JOptionPane.showInputDialog(null,
                        """
                                -------------------------------
                                Ingrese una opción:\s
                                1. Crear una base de datos. \s
                                2. Eliminar una base de datos. \s
                                3. Abrir base de datos. \s
                                4. Cerrar base de datos. \s
                                5. Agregar una tabla a una base de datos.\s
                                6. Eliminar una tabla de una base de datos. \s
                                7. Consultar las tablas de una base de datos. \s
                                0. Salir. \s
                                -------------------------------""");
                opcion = Integer.parseInt(lectura);
                switch (opcion) {
                    case 1 -> {
                        String nombre = JOptionPane.showInputDialog(null, "¿Cómo se llama la base de datos?");
                        try {
                            DataBase database = new DataBase(nombre);
                            gestorDataBase.newDB(database);
                        } catch (DBMSException e){
                            JOptionPane.showMessageDialog(null, e.getMessage());
                        }
                    }
                    case 2 -> {
                        String nombrebd = JOptionPane.showInputDialog(null, "¿Qué base quiere eliminar? \n" + gestorDataBase.listDB());
                        try {
                            gestorDataBase.deleteDB(nombrebd);
                        } catch (DBMSException e) {
                            JOptionPane.showMessageDialog(null, e.getMessage());
                        }
                    }
                    case 3 -> {
                        String nombrebd = JOptionPane.showInputDialog(null, "¿Qué base quiere abrir? \n" + gestorDataBase.listDB());
                        try {
                            gestorDataBase.openDB(nombrebd);
                        } catch (DBMSException e) {
                            JOptionPane.showMessageDialog(null, e.getMessage());
                        }
                    }
                    case 4 -> {
                        String nombrebd = JOptionPane.showInputDialog(null, "¿Qué base quiere cerrar? \n" + gestorDataBase.listDB());
                        try {
                            gestorDataBase.closeDB(nombrebd);
                        } catch (DBMSException e) {
                            JOptionPane.showMessageDialog(null, e.getMessage());
                        }
                    }
                    case 5 -> {
                        String nombrebd = JOptionPane.showInputDialog(null, "¿A qué base de datos quiere añadirle una tabla? \n" + gestorDataBase.listDB());
                        String nombreTabla = JOptionPane.showInputDialog(null, "¿Cómo se llama la tabla que quiere añadir?");
                        Table tabla = new Table(nombreTabla);
                        try {
                            gestorDataBase.createTable(nombrebd, tabla);
                        } catch (DBMSException e) {
                            JOptionPane.showMessageDialog(null, e.getMessage());
                        }
                    }
                    case 6 -> {
                        String nombrebd = JOptionPane.showInputDialog(null, "¿A qué base de datos quiere sacarle una tabla? \n" + gestorDataBase.listDB());
                        String nombreTabla = JOptionPane.showInputDialog(null, "¿Cómo se llama la tabla que quiere eliminar?");
                        try {
                            gestorDataBase.dropTable(nombrebd, nombreTabla);
                        } catch (DBMSException e) {
                            JOptionPane.showMessageDialog(null, e.getMessage());
                        }
                    }
                    case 7 -> {
                        String nombrebd = JOptionPane.showInputDialog(null, "¿De qué base de datos quiere ver la tabla? \n" + gestorDataBase.listDB());
                        try {
                            gestorDataBase.listTableOfDB(nombrebd);
                        } catch (DBMSException e) {
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
