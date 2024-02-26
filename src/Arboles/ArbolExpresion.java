package Arboles;

import java.util.Objects;
import java.util.Stack;

public class ArbolExpresion {
    private NodoBinario raiz;

    /**
     * Genera el arbol de expresion a partir de una expresion entera
     * @param expresion expresion dada
     */
    public void generarArbol(Expresion expresion) {
        Stack <NodoBinario> pila = new Stack<>();
        char siguienteMovimiento, simbolo;
        NodoBinario ultimo, nuevo;

        simbolo = expresion.obtenerSimbolo();
        nuevo = new NodoInterno(simbolo);
        raiz = nuevo;
        siguienteMovimiento = 'i';
        System.out.println("Sim:" + simbolo);
        while (expresion.haySimbolo()) {
            simbolo = expresion.obtenerSimbolo();
            System.out.println("Sim:" + simbolo);
            ultimo = nuevo;
            if (Expresion.esOperador(simbolo)) {
                nuevo = new NodoInterno(simbolo);
                siguienteMovimiento = 'i';
            } else {
                nuevo = new NodoHoja(Character.toString(simbolo));
                siguienteMovimiento = 'd';
            }

            if (siguienteMovimiento == 'i') {
                ultimo.setIzquierda(nuevo);
                pila.push(ultimo);
            } else {
                ultimo = pila.peek();
                ultimo.setDerecha(nuevo);
            }
            // siguienteMovimiento = Expresion.esOperador(simbolo) ? 'i' : 'd';
        }
    }

    public int evaluarArbol() {
        return evaluarRecursivo(raiz);
    }

    public int evaluarRecursivo(NodoBinario nodo) {
        if (nodo instanceof NodoInterno) {
            char operador = (char) nodo.getElemento();
            int izquierda = evaluarRecursivo(nodo.getIzquierda());
            int derecha = evaluarRecursivo(nodo.getDerecha());
            return switch (operador) {
                case '+' -> izquierda + derecha;
                case '-' -> izquierda - derecha;
                case '*' -> izquierda * derecha;
                case '/' -> izquierda / derecha;
                default -> throw new IllegalArgumentException("Operador no válido: " + operador);
            };
        }
        return Integer.parseInt(nodo.getElemento().toString());
    }

    public String convertirExpresionPrefija(String expresion) {
        Stack<Character> pilaOperadores = new Stack<>();
        Stack<String> pilaExpresion = new Stack<>();
        // Invertir la expresión
        StringBuilder prefija = new StringBuilder();
        for (int i = 0; i < expresion.length(); i++) {
            char ch = expresion.charAt(i);
            if (obtenerPrecedencia(ch) > 0) {
                while (!pilaOperadores.isEmpty() && obtenerPrecedencia(pilaOperadores.peek()) >= obtenerPrecedencia(ch)) {
                    prefija.append(pilaExpresion.pop());
                }
                pilaOperadores.push(ch);
            } else {
                if (ch == ')') {
                    String x = pilaExpresion.pop();
                    while (!Objects.equals(x, ")")) {
                        prefija.append(x);
                        x = pilaExpresion.pop();
                    }
                } else {
                    if (ch == '(') {
                        pilaOperadores.push(ch);
                    } else {
                        prefija.append(ch);
                    }
                }
            }
        }
        for (int i = 0; i <= pilaExpresion.size(); i++) {
            prefija.append(pilaOperadores.pop());
        }
        return prefija.reverse().toString();
    }

    public StringBuilder InfijaToPrefija(String expresion) {
        StringBuilder result = new StringBuilder();
        StringBuilder input = new StringBuilder(expresion);
        input.reverse();
        // hacemos la pila solo de caracteres
        Stack<Character> stack = new Stack<Character>();
        char[] charsExp = new String(input).toCharArray();
        for (int i = 0; i < charsExp.length; i++) {

            if (charsExp[i] == '(') {
                charsExp[i] = ')';
                i++;
            } else if (charsExp[i] == ')') {
                charsExp[i] = '(';
                i++;
            }
        }
        for (int i = 0; i < charsExp.length; i++) {
            char c = charsExp[i];
            // chequea si char es operador o operando
            if (obtenerPrecedencia(c) > 0) {
                // sacamos si la precedencia es mayor
                while (stack.isEmpty() == false && obtenerPrecedencia(stack.peek()) >= obtenerPrecedencia(c)) {
                    result.append(stack.pop());
                }
                // luego insertamos
                stack.push(c);
            } else if (c == ')') {
                char x = stack.pop();
                while (x != '(') {
                    result.append(x);
                    x = stack.pop();
                }
            } else if (c == '(') {
                stack.push(c);
            } else {
                result.append(c);
            }
        }

        for (int i = 0; i <= stack.size(); i++) {
            result.append(stack.pop());
        }
        return result.reverse();
    }

    private int obtenerPrecedencia(char operador) {
        switch (operador) {
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
                return 2;
            default:
                return 0;
        }
    }


    public NodoBinario getRaiz() {
        return raiz;
    }

    public void preorden() {
        preorden(raiz);
    }

    public void preorden(NodoBinario nodo) {
        if ( nodo != null) // caso base
        { // caso general
            System.out.print(nodo.getElemento().toString()+" ");
            preorden (nodo.getIzquierda());
            preorden (nodo.getDerecha());
        }
    }

    public void inorden() {
        inorden(raiz);
    }

    public void inorden(NodoBinario nodo) {
        if ( nodo != null) // caso base
        { // caso general
            inorden (nodo.getIzquierda());
            System.out.print(nodo.getElemento().toString()+" ");
            inorden (nodo.getDerecha());
        }
    }

    public void postorden() {
        postorden(raiz);
    }

    public void postorden(NodoBinario nodo) {
        if ( nodo != null) // caso base
        { // caso general
            postorden (nodo.getIzquierda());
            postorden (nodo.getDerecha());
            System.out.print(nodo.getElemento().toString()+" ");
        }
    }
}
