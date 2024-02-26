package Arboles;

public class Nodo {
    int info;
    Nodo izquierdo;
    Nodo derecho;
    public Nodo(int info) {
        this.info = info;
        this.izquierdo = null;
        this.derecho = null;
    }


    public int getInfo() {
        return info;
    }

    public void setInfo(int info) {
        this.info = info;
    }

    public Nodo getIzquierdo() {
        return izquierdo;
    }

    public void setIzquierdo(Nodo izquierdo) {
        this.izquierdo = izquierdo;
    }

    public Nodo getDerecho() {
        return derecho;
    }

    public void setDerecho(Nodo derecho) {
        this.derecho = derecho;
    }

    public boolean esHoja() {
        return this.derecho == null && this.izquierdo == null;
    }

    public boolean tieneHijo() {
        if (this.derecho == null && this.izquierdo != null) {
            return true;
        } else if (this.derecho != null && this.izquierdo == null) {
            return true;
        } else if (this.derecho != null) {
            return true;
        } else {
            return false;
        }
    }

    public Nodo getHijo() {
        if (this.derecho == null) {
            return this.izquierdo;
        } else {
            return this.derecho;
        }
    }
}
