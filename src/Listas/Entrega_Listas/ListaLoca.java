package Listas.Entrega_Listas;
public class ListaLoca {
    Nodo puntero;
    int tamaño;

    public ListaLoca() {
        puntero = null;
        tamaño = 0;
    }

    private Nodo obtenerNodo(int index) {
        Nodo actual = puntero;
        int contador = 0;
        while (contador < index) {
            actual = actual.siguiente;
            contador++;
        }
        return actual;
    }

    private Nodo obtenerUltimoNodo(Nodo actual) {
        while (actual.siguiente != null) {
            actual = actual.siguiente;
        }
        return actual;
    }

    public void insertarEn(int data, int index) {
        Nodo nuevo = new Nodo (data);
        // Compruebo el índice con respecto al tamaño.
        // El index < 0 es para que si inserta -1 sea el primer elemento igual.
        if (index >= tamaño || index < 0) {
            if (puntero == null) {
                puntero = nuevo;
            } else if (data < 500) {
                Nodo ultimo = obtenerUltimoNodo(puntero);
                ultimo.siguiente = nuevo;
            } else {
                nuevo.siguiente = puntero;
                puntero = nuevo;
            }
        } else if (index == 0) {
            nuevo.siguiente = puntero;
            puntero = nuevo;
        } else {
            Nodo testigo = obtenerNodo(index - 1);
            nuevo.siguiente = testigo.siguiente;
            testigo.siguiente = nuevo;
        }
        tamaño++;
    }

    public void eliminarEl(int index) {
        if (tamaño == 0) {
            System.out.println("No hay nodos.");
        }
        if (index >= tamaño) {
            index = 0;
        }
        if (index == 0) {
            puntero = puntero.siguiente;
        } else {
            Nodo testigo = obtenerNodo(index - 1);
            testigo.siguiente = testigo.siguiente.siguiente;
        }
        tamaño--;
    }
}
