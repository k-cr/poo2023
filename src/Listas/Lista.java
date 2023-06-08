package Listas;
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
            System.out.println("Data: " + actual.info);
            actual = actual.siguiente;
        }
    }

    public void actualizarNodo(int indice, int data) {
        Nodo actual = puntero;
        int contador = 0;
        while (actual != null) {
            if (contador == indice) {
                actual.info = data;
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

    public void mostrarParteEntera() {
        int contador = puntero.getInfo();
        Nodo aux = puntero;
        aux = aux.getSiguiente();
        System.out.print("Parte entera: ");
        while (contador != 0) {
            System.out.print(aux.getInfo());
            contador--;
            aux = aux.getSiguiente();
        }
        System.out.print(" ");
    }

    public void mostrarParteDecimal() {
        int contador = puntero.getInfo();
        Nodo aux = puntero;
        aux = aux.getSiguiente();
        while (contador != 0) {
            contador--;
            aux = aux.getSiguiente();
        }
        System.out.println(" ");
        System.out.print("Parte decimal: ");
        while (aux != null) {
            System.out.print(aux.getInfo());
            aux = aux.getSiguiente();
        }
    }
}
