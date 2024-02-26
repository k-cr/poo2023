package Arboles;

public class Expresion {
    String expresion;
    int l, s;

    public Expresion(String expresion) {
        this.expresion = expresion;
        l = expresion.length();
        s = 0;
    }

    char obtenerSimbolo() {
        char aux = expresion.charAt(s);
        s++;
        return aux;
    }

    boolean haySimbolo() {
        return s <= l - 1;
    }

    static boolean esOperador(char ch) {
        if (ch != '+' && ch != '-' && ch != '*' && ch != '/' )
            return false;
        else
            return true;
    }
}
