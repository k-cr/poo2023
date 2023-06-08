package Listas.Punto_7;
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

    public void insertarAlPrincipio(int data) {
        Nodo nuevo = new Nodo(data);
        nuevo.siguiente = puntero;
        puntero = nuevo;
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

    public void eliminarNodo(int index) {
        if (puntero == null) {
            return;
        }
        Nodo actual = puntero;
        if (index == 0) {
            puntero = puntero.siguiente;
        } else {
            int contador = 0;
            Nodo testigo = null;
            while (actual != null && contador != index) {
                testigo = actual;
                actual = actual.siguiente;
                contador++;
            }
            if (actual != null) {
                testigo.siguiente = actual.siguiente;
            }
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
