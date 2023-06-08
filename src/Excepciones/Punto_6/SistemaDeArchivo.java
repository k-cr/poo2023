package Excepciones.Punto_6;

import javax.swing.*;
import java.util.Vector;

public class SistemaDeArchivo {
    Vector<Archivo> archivos;
    int idDisco;
    int capacidad;
    InterfazGrafica interfazGrafica = new InterfazGrafica();
    public SistemaDeArchivo(int idDisco, int capacidad) {
        archivos = new Vector<Archivo>(10);
        this.capacidad = capacidad;
        this.idDisco = idDisco;
    }

    public int getIdDisco() {
        return idDisco;
    }

    public void setIdDisco(int idDisco) {
        this.idDisco = idDisco;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public void agregarArchivo(Archivo archivo) {
        archivos.add(archivo);
    }

    public void eliminarArchivo(int indice) {
        archivos.remove(indice);
    }
    public void listarArchivos(){
        for (Archivo arch: archivos) {
            try {
                interfazGrafica.mostrar(arch);
            } catch (Error1 | Error2 e) {
                JOptionPane.showMessageDialog(null, e.getMessage());
            }
        }
    }
}
