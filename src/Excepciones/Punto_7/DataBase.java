package Excepciones.Punto_7;

import javax.swing.*;
import java.util.Vector;

public class DataBase {
    Vector<Table> container;
    String nombre;
    boolean abierto;

    public DataBase(String nombre, boolean abierto) {
        container = new Vector<Table>(10);
        this.nombre = nombre;
        this.abierto = abierto;
    }

    public void createTable(Table table) throws DBException{
        if(!abierto) {
            throw new DBException();
        } else {
            container.add(table);
            JOptionPane.showMessageDialog(null, "Añadida con éxito.");
        }
    }

    public void removeTable(int indice) throws DBException, TableException{
        if(!abierto) {
            throw new DBException();
        } else if (indice < 0 || indice > container.size()){
            throw new TableException();
        } else {
            String nombreTabla = container.elementAt(indice).getNombre();
            container.remove(indice);
            JOptionPane.showMessageDialog(null, "Tabla Eliminado.");
        }
    }

    public String listTables() throws DBException{
        String textoMensaje = "";
        if(!abierto) {
            throw new DBException();
        } else {
            int indice = 0;
            for (Table tabla: container) {
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
}
