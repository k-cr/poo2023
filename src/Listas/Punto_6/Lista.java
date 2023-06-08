package Listas.Punto_6;

public class Lista {
    Nodo puntero;
    public void insertarAlFinal(int data) {
        Nodo nuevo = new Nodo(data);
        if (puntero == null) {
            puntero = nuevo;
        } else {
            Nodo actual = puntero;
            while (actual.siguiente != null) {
                actual = actual.siguiente;
            }
            actual.siguiente = nuevo;
        }
    }

    public void leerLista() {
        Nodo actual = puntero;
        while (actual != null) {
            System.out.println("Data: " + actual.data);
            actual = actual.siguiente;
        }
    }

    public void actualizarNodo(int indice, int data) {
        Nodo actual = puntero;
        int contador = 0;
        while (actual != null) {
            if (contador == indice) {
                actual.data = data;
                break;
            }
            actual = actual.siguiente;
            contador++;
        }
    }

    public void invertirLista() {
        Nodo anterior = null;
        Nodo actual = puntero;
        Nodo siguiente = null;

        while (actual != null) {
            siguiente = actual.siguiente;
            actual.siguiente = anterior;
            anterior = actual;
            actual = siguiente;
        }
        puntero = anterior;
    }
}
