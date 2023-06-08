package Listas.Punto_8;
import java.util.Stack;

public class IteradorLista extends Lista {
    Nodo actual;
    public IteradorLista(Nodo cabeza) {
        this.actual = cabeza;
    }

    public boolean tieneProximo() {
        return actual != null;
    }

    public void proximo() {
        this.actual = this.actual.getSiguiente();
    }

    public int getActual() {
        return this.actual.getData();
    }

    // 6.b
    public int contarElementos() {
        int contador = 0;
        while (this.tieneProximo()) {
            contador++;
            this.proximo();
        }
        return contador;
    }

    // 6.c
    public int calcularSumatoria() {
        int suma = 0;
        while (this.tieneProximo()){
            suma = suma + this.getActual();
            this.proximo();
        }
        return suma;
    }

    // 6.d
    public int devolverMenor() {
        return this.getActual();
    }
    public int devolverMayor() {
        int mayor = 0;
        while (this.tieneProximo()) {
            mayor = this.getActual();
            this.proximo();
        }
        return mayor;
    }

    public void verListaInvertida() {
        System.out.println("La lista invertida es: \n");
        Stack<Integer> pila = new Stack<Integer>();
        while (tieneProximo()) {
            pila.push(this.getActual());
            this.proximo();
        }
        while (!pila.empty()) {
            System.out.println(pila.pop());
        }
    }

    public void verListaRecursiva() {
        this.leerRecursivamente(this.actual);
    }

    public void leerRecursivamente(Nodo actual) {
        if (actual == null) {
            System.out.println("No hay elementos.");
        }
        if (actual.getSiguiente() == null) {
            System.out.println(actual.getData());
        } else {
            leerRecursivamente(actual.getSiguiente());
            System.out.println(actual.getData());
        }
    }

    public void verLista() {
        while (tieneProximo()) {
            System.out.println(this.getActual());
            this.proximo();
        }
    }
}
