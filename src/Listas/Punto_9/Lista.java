package Listas.Punto_9;

import javax.swing.*;

public class Lista {
    Nodo puntero;

    public Lista() {
        puntero = null;
    }

    public void insertarAlFinal(int data) {
        Nodo nuevo = new Nodo(data);
        if (puntero == null) {
            puntero = nuevo;
        } else {
            Nodo actual = puntero;
            while (actual.getSiguiente() != null) {
                actual = actual.getSiguiente();
            }
            actual.setSiguiente(nuevo);
        }
    }

    public void insertarAlPrincipio(int data) {
        Nodo nuevo = new Nodo(data);
        nuevo.setSiguiente(puntero);
        puntero = nuevo;
    }

    public void actualizarNodo(int index, int data) {
        Nodo actual = puntero;
        int contador = 0;
        while (actual != null ) {
            if (contador == index) {
                actual.setData(data);
                break;
            }
            actual = actual.getSiguiente();
            contador++;
        }
    }

    public void eliminarNodo(int index) {
        if (puntero == null) {
            JOptionPane.showMessageDialog(null, "No hay elementos en la lista.");
        }
        Nodo actual = puntero;
        if (index == 0) {
            puntero = puntero.getSiguiente();
        } else {
            int contador = 0;
            Nodo testigo = null;
            while (actual != null && contador != index) {
                testigo = actual;
                actual = actual.getSiguiente();
                contador++;
            }
            if (actual != null) {
                testigo.setSiguiente(actual.getSiguiente());
            }
        }
    }

    public IteradorLista getIterador() {
        return new IteradorLista(puntero);
    }
}
