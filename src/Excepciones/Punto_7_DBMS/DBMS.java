package Excepciones.Punto_7_DBMS;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Hashtable;

public class DBMS {
    Hashtable<String, DataBase> databases;

    DBMS() {
        databases = new Hashtable<String, DataBase>(10);
    }

    public void newDB(DataBase db) throws DBMSException {
        if (databases.containsKey(db.getName())) {
            throw new DBMSException(1060);
        } else {
            this.databases.put(db.getName(), db);
            JOptionPane.showMessageDialog(null, "Base de datos con éxito.");
        }
    }

    public void openDB(String db) throws DBMSException{
        if (!databases.containsKey(db)) {
            throw new DBMSException(404);
        } else {
            this.databases.get(db).open();
            JOptionPane.showMessageDialog(null, "Se ha abierto con éxiyo.");
        }
    }

    public void deleteDB(String db) throws DBMSException{
        if (!databases.containsKey(db)) {
            throw new DBMSException(404);
        } else {
            this.databases.remove(db);
            JOptionPane.showMessageDialog(null, "Base de datos se ha removido con éxito.");
        }
    }

    public void closeDB(String db) throws DBMSException {
        if(!databases.containsKey(db)) {
            throw new DBMSException(404);
        } else {
            this.databases.get(db).close();
            JOptionPane.showMessageDialog(null, "Se ha cerrado con éxito");
        }
    }

    public void createTable(String db, Table t) throws DBMSException{
        if (!databases.containsKey(db)) {
            throw new DBMSException(404);
        } else {
            try {
                databases.get(db).insertTable(t);
            } catch (DataBaseException e) {
                JOptionPane.showMessageDialog(null, e.getMessage());
            }
        }
    }

    public void dropTable(String db, String stb) throws DBMSException{
        if (!databases.containsKey(db)) {
            throw new DBMSException(404);
        } else {
            try {
                databases.get(db).dropTable(stb);
            } catch (DataBaseException e) {
                JOptionPane.showMessageDialog(null, e.getMessage());
            }
        }
    }
    public String listDB() {
        String texto = "Escriba su nombre: \n";
        ArrayList<DataBase> bases = new ArrayList<>(10);
        this.databases.forEach((nombre, base) -> {
            bases.add(base);
        });
        for (DataBase bds: bases) {
            texto = texto + "> " + bds.getName() + "\n";
        }
        return texto;
    }

    public void listTableOfDB(String db) throws DBMSException {
        if (!databases.containsKey(db)) {
            throw new DBMSException(404);
        } else {
            try {
                databases.get(db).listTable();
            } catch (DataBaseException e) {
                JOptionPane.showMessageDialog(null, e.getMessage());
            }
        }
    }
}
