package Excepciones.Punto_7_Hashtable;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Hashtable;

public class DataBase {
    Hashtable<String, Table> container;
    String nombre;
    boolean abierto;
    public DataBase(String nombre, boolean abierto) {
        this.nombre = nombre;
        this.abierto = abierto;
        container = new Hashtable<String, Table>(10);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isAbierto() {
        return abierto;
    }

    public void setAbierto(boolean abierto) {
        this.abierto = abierto;
    }
    public void createTable(Table table) throws DBException, DuplicatedTableException {
        if(!abierto) {
            throw new DBException();
        } else if (container.containsKey(table.getNombre())) {
            throw new DuplicatedTableException();
        } else {
            container.put(table.getNombre(), table);
            JOptionPane.showMessageDialog(null, "Tabla agregada con éxito.");
        }
    }

    public void removeTable(String id) throws DBException, TableException {
        if (!abierto) {
            throw new DBException();
        } else if (!container.containsKey(id)) {
            throw new TableException();
        } else {
            container.remove(id);
            JOptionPane.showMessageDialog(null, "Tabla eliminada.");
        }
    }

    public void renameTable(String nombre1, String nombre2) throws DBException, TableException{
        ArrayList<Table> tablas = new ArrayList<>(10);
        if (!abierto) {
            throw new DBException();
        } else {
            int indice = 0;
            boolean encontrato = false;
            if(!container.containsKey(nombre1)) {
                throw new TableException(1);
            } else {
                if (container.containsKey(nombre2)) {
                    throw new TableException(2);
                } else {
                    container.get(nombre1).setNombre(nombre2);
                    System.out.println("¡Logrado!");
                }
            }
        }
    }

    public String listTables() throws DBException {
        String textoMensaje = "Las tablas que están cargados son: \n";
        ArrayList<Table> tablas = new ArrayList<>(10);
        if (!abierto) {
            throw new DBException();
        } else {
            int indice = 0;
            container.forEach((nombre, tabla) -> {
                tablas.add(tabla);
            });
            for (Table tabla: tablas) {
                indice++;
                textoMensaje = textoMensaje + indice + ". " + tabla.getNombre() + "\n";
            }
        }
        return textoMensaje;
    }
    public void open() {
        this.abierto = true;
    }

    public void close() {
        this.abierto = false;
    }
}
