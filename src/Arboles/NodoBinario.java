package Arboles;

public interface NodoBinario {
    // recupera y asigna el hijo derecho
    NodoBinario getDerecha();
    void setDerecha(NodoBinario nodo);

    // recupera y asigna del elemento del nodo
    Object getElemento();
    void setElemento(Object elemento);

    // devuelve true si el nodo es una hoja
    boolean esHoja();

    // recupera y asigna el hijo izquierdo
    NodoBinario getIzquierda();
    void setIzquierda(NodoBinario nodo);
}
