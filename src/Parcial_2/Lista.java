package Parcial_2;

public class Lista {
    private Nodo primero;
    private Nodo ultimo;

    public Lista() {
        primero = ultimo = null;
    }

    Iterador getIterador() {
        return new Iterador(this.primero);
    }

    public void insertarFinal(char caracter) {
        Nodo nuevo = new Nodo(caracter, null);
        if (primero == null) {
            primero = nuevo;
        } else {
            Nodo actual = primero;
            while (actual.getSiguiente() != null) {
                actual = actual.getSiguiente();
            }
            actual.setSiguiente(nuevo);
        }
        System.out.println("Ingresado.");
    }
}
