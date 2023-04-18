package Excepciones.Punto_7_DBMS;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Hashtable;

public class DataBase {
    protected String nombre;
    protected Hashtable<String, Table> table;
    boolean state;
    DataBase(String nombre) {
        this.nombre = nombre;
        this.table = new Hashtable<String, Table>(10);
    }
    public void insertTable(Table table) throws DataBaseException{
        if (!this.getState()) {
            throw new DataBaseException(500);
        } else {
            if (this.table.containsKey(table.getNombre())) {
                throw new DataBaseException(1060);
            } else {
                this.table.put(table.getNombre(), table);
                JOptionPane.showMessageDialog(null, "Tabla insertada con éxito.");
            }
        }
    }

    public void dropTable(String stb) throws DataBaseException {
        if(!this.getState()) {
            throw new DataBaseException(500);
        } else {
            if (!this.table.containsKey(stb)) {
                throw new DataBaseException(404);
            } else {
                this.table.remove(stb);
                JOptionPane.showMessageDialog(null, "Tabla eliminada con éxito.");
            }
        }
    }

    public void listTable() throws DataBaseException{
        if (!this.getState()) {
            throw new DataBaseException(500);
        } else {
            String texto = "";
            ArrayList<Table> tablas = new ArrayList<Table>(10);
            this.table.forEach((nombre, tabla) -> {
                tablas.add(tabla);
            });
            for (Table tables: tablas) {
                texto = texto + "> " + tables.getNombre() + "\n";
            }
            JOptionPane.showMessageDialog(null, texto);
        }
    }

    public void open() {
        this.state = true;
    }

    public void close() {
        this.state = false;
    }

    public boolean getState() {
        return state;
    }

    public String getName() {
        return nombre;
    }

    public int countTables() {
        return table.size();
    }
}
