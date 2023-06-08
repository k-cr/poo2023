package Listas.Punto_9;

public class IteradorLista extends Lista{
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
}
