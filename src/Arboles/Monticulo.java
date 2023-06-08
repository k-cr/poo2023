package Arboles;

import java.util.Vector;

public class Monticulo {
    Vector<Integer> nodos;
    int numnodos;
    int dimension;
    public Monticulo() {
        nodos = new Vector<Integer>(50);
        dimension = nodos.capacity();
        numnodos = 0;
    }

    public void insertar(int nuevo) {
        if (dimension > numnodos) {
            nodos.insertElementAt(nuevo, numnodos);
            numnodos++;
            this.restaurarMonticuloHaciaArriba();
        }
    }

    public int eliminar(int indice) {
        int aux = nodos.elementAt(indice);
        nodos.insertElementAt(nodos.elementAt(numnodos), indice); // Relleno el hueco con la última hoja
        numnodos--;
        restaurarMonticuloHaciaAbajo(indice);
        return aux;
    }

    /**
     * Recorre el montículo hacia arriba para re-acomodar el árbol.
     */
    public void restaurarMonticuloHaciaArriba() {
        int actual, padre, aux;
        boolean ok = false;
        // Asigno el actual a la posición donde estoy parado.
        actual = numnodos;
        // actual / 2 porque recordemos que tiene 2 hijos y es un árbol binario.
        padre = actual / 2;
        while (actual > 1 && !ok) {
            int valorPadre = nodos.elementAt(padre - 1);
            int valorActual = nodos.elementAt(actual - 1);
            if (valorPadre >= valorActual) {
                ok = true;
            } else {
                // Intercambia con el padre
                aux = nodos.elementAt(padre);
                nodos.insertElementAt(nodos.elementAt(actual - 1), padre - 1);
                nodos.insertElementAt(aux, actual - 1);
                // Sube en el árbol
                actual = padre;
                padre = actual / 2;
            }
        }
    }

    /**
     * Restaura el montículo hacia abajo y re-acomoda el árbol
     */
    public void restaurarMonticuloHaciaAbajo(int indice) {
        boolean ok = false;
        int maxhijo, aux, raiz = indice;
        while (raiz * 2 <= numnodos && !ok) {
            if (raiz * 2 == numnodos) {
                maxhijo = raiz;
            } else {
                if (nodos.elementAt(raiz*2) >= nodos.elementAt(raiz*2+1)) {
                    maxhijo = raiz;
                } else {
                    if (nodos.elementAt(raiz*2) > nodos.elementAt(raiz*2+1)) {
                        maxhijo = raiz * 2;
                    } else {
                        maxhijo = raiz * 2 + 1;
                    }
                }
                if (nodos.elementAt(raiz - 1) < nodos.elementAt(maxhijo - 1)) {
                    aux = nodos.elementAt(raiz - 1);
                    nodos.insertElementAt(nodos.elementAt(maxhijo - 1), raiz - 1);
                    nodos.insertElementAt(aux, nodos.elementAt(maxhijo - 1));
                    raiz = maxhijo;
                } else {
                    ok = true;
                }
            }
        }
    }

    /**
     * Recorre el montículo en preorden
     * @param indice de donde arranca a recorrer.
     */
    public void preorden (int indice) {
        if (indice <= numnodos) {
            System.out.print(nodos.elementAt(indice) + " ");
            preorden(indice*2);
            preorden(indice*2+1);
        }
    }

    /**
     * Muestra el montículo en inorden
     * @param indice a
     */
    public void inorden(int indice) {
        if (indice <= numnodos) {
            inorden(indice * 2);
            System.out.print(nodos.elementAt(indice) + " ");
            inorden(indice * 2 + 1);
        }
    }

    /**
     * Muestra el montículo en postorden
     * @param indice a
     */
    public void postorden(int indice) {
        if (indice <= numnodos) {
            inorden(indice * 2);
            inorden(indice * 2 + 1);
            System.out.print(nodos.elementAt(indice) + " ");
        }
    }

    /**
     * Pregunta si está vacío el montículo
     * @return retorna si está vacío o no
     */
    public boolean estaVacio() {
        return nodos.isEmpty();
    }

    /**
     * Pregunta si está lleno
     * @return si está lleno o no
     */
    public boolean estaLleno() {
        return numnodos == nodos.capacity();
    }

    /**
     * Limpia la cola de prioridad
     */
    public void limpiarColaPrioridad() {
        nodos = new Vector<Integer>(dimension);
        numnodos = 0;
    }
}
