package Arboles;

public class NodoHoja implements NodoBinario{
    private String dato;

    // Constructor
    public NodoHoja (String c) {
        this.dato = String.valueOf(c);
    }

    public NodoBinario getDerecha() {
        return null;
    }
    public void setDerecha(NodoBinario n) {

    }

    public Object getElemento() {
        return dato;
    }
    public void setElemento(Object d) {
        dato = (String) d;
    }

    public boolean esHoja() {
        return true;
    }

    public NodoBinario getIzquierda() {
        return null;
    }
    public void setIzquierda(NodoBinario n) {
    }
}
