package Listas.Punto_10;

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
        return this.actual.getInfo();
    }

    public int getRepetido() {
        return this.actual.getContador();
    }

    /*
    public boolean checkRepetido(int data) {
        boolean encontrato = false;
        while (tieneProximo()) {
            if (this.getActual() == data) {
                encontrato = true;
            }
            this.proximo();
        }
        return encontrato;
    }
    */

    /*
    public void incrementar(int data) {
        while (tieneProximo()) {
            if (this.getActual() == data) {
                this.actual.incrementarOcurrencia();
            }
            this.proximo();
        }
    }
    */

    public void mostrarLista() {
        while (tieneProximo()) {
            System.out.println("Valor: " + this.getActual() + ", veces insertado: " + this.getRepetido());
            this.proximo();
        }
    }
}
