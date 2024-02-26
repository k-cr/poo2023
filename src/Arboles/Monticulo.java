package Arboles;
public class Monticulo {
    int[] nodos;
    int numnodos;
    int dimension;

    public Monticulo() {
        dimension = 50;
        nodos = new int[dimension];
        numnodos = 0;
    }

    public void insertar(int nuevo) {
        if (dimension > numnodos) {
            numnodos++;
            nodos[numnodos] = nuevo;
            this.restaurarMonticuloHaciaArriba();
        }
    }

    public int eliminar(int indice) {
        int aux = nodos[indice];
        nodos[indice] = nodos[numnodos];
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
            if (nodos[padre] >= nodos[actual]) {
                ok = true;
            } else {
                // Intercambia con el padre
                aux = nodos[padre];
                nodos[padre] = nodos[actual];
                nodos[actual] = aux;
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
                if (nodos[raiz * 2] > nodos[raiz * 2 + 1]) {
                    maxhijo = raiz * 2;
                } else {
                    maxhijo = raiz * 2 + 1;
                }
            }
            if (nodos[raiz] < nodos[maxhijo]) {
                aux = nodos[raiz];
                nodos[raiz] = nodos[numnodos];
                nodos[maxhijo] = aux;
                raiz = maxhijo;
            } else {
                ok = true;
            }
        }
    }

    /**
     * Recorre el montículo en preorden
     * 
     * @param indice de donde arranca a recorrer.
     */
    public void preorden(int indice) {
        if (indice <= numnodos) {
            System.out.print(nodos[indice] + " ");
            preorden(indice * 2);
            preorden(indice * 2 + 1);
        }
    }

    /**
     * Muestra el montículo en inorden
     * 
     * @param indice a
     */
    public void inorden(int indice) {
        if (indice <= numnodos) {
            inorden(indice * 2);
            System.out.print(nodos[indice] + " ");
            inorden(indice * 2 + 1);
        }
    }

    /**
     * Muestra el montículo en postorden
     * 
     * @param indice a
     */
    public void postorden(int indice) {
        if (indice <= numnodos) {
            inorden(indice * 2);
            inorden(indice * 2 + 1);
            System.out.print(nodos[indice] + " ");
        }
    }

    /**
     * Pregunta si está vacío el montículo
     * 
     * @return retorna si está vacío o no
     */
    public boolean estaVacio() {
        return nodos.length == 0;
    }

    /**
     * Pregunta si está lleno
     * 
     * @return si está lleno o no
     */
    public boolean estaLleno() {
        return numnodos == nodos.length;
    }

    /**
     * Limpia la cola de prioridad
     */
    public void limpiarColaPrioridad() {
        nodos = new int[dimension];
        numnodos = 0;
    }
}
