package Listas.Punto_10;

public class Lista {
    Nodo puntero;
    public Lista() {
        puntero = null;
    }

    public void insertarNodo(int data) {
        Nodo nuevo = new Nodo(data);
        nuevo.setSiguiente(puntero);
        puntero = nuevo;
    }

    public void actualizarNodo(int index, int data) {
        Nodo actual = puntero;
        int contador = 0;
        while (actual != null) {
            if (contador == index) {
                actual.setInfo(data);
                break;
            }
            actual = actual.getSiguiente();
            contador++;
        }
    }

    public void eliminarNodo(int index) {
        if (puntero == null) {
            System.out.println("No hay elemento en la lista.");
            return;
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
