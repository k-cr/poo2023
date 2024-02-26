package Arboles;

public class NodoExpresion {
    char data;
    NodoExpresion derecha, izquierda;

    NodoExpresion(char data) {
        this.data = data;
        this.derecha = this.izquierda = null;
    }

    NodoExpresion(char data, NodoExpresion izquierda, NodoExpresion derecha) {
        this.data = data;
        this.izquierda = izquierda;
        this.derecha = derecha;
    }
}
