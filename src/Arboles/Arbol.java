package Arboles;

import java.util.Iterator;
import java.util.Stack;

public class Arbol {
    Nodo raiz;

    public Arbol() {
        this.raiz = null;
    }

    /**
     * Comprueba si el árbol está vacío
     * @return true o false
     */
    public boolean estaVacio() {
        return this.raiz == null;
    }

    /**
     * Busca el nodo en cuestión
     * @param valor es el valor que busco en el árbol
     * @return si está o no en el árbol
     */
    public boolean buscarNodo(int valor) {
        Nodo puntero;
        puntero = raiz;
        boolean encontrado = false;
        while (puntero != null && !encontrado) {
            if (puntero.getInfo() == valor) {
                encontrado = true;
            } else {
                if (puntero.getInfo() < valor) {
                    puntero = puntero.getDerecho();
                } else {
                    puntero = puntero.getIzquierdo();
                }
            }
        }
        return encontrado;
    }

    /**
     * Busca un nodo en particular
     * @param valor el nodo que quiero buscar
     * @return el nodo enterno que busco
     */
    public Nodo encontrarNodo(int valor) {
        Nodo puntero = raiz;
        Nodo aux = null;
        boolean encontrado = false;
        while (puntero != null && !encontrado) {
            if (puntero.getInfo() == valor) {
                aux = new Nodo(valor);
                encontrado = true;
            } else {
                if (puntero.getInfo() < valor) {
                    puntero = puntero.getDerecho();
                } else {
                    puntero = puntero.getIzquierdo();
                }
            }
        }
        return aux;
    }

    /**
     * Busca el padre de un valor
     * @param valor el valor del cual quiero buscar el padre
     * @return el nodo padre de ese valor
     */
    public Nodo padre(int valor) {
        Nodo puntero = raiz;
        Nodo aux = null;
        while (puntero != null) {
            if (puntero.getInfo() < valor) {
                aux = puntero;
                puntero = puntero.getDerecho();
            } else {
                aux = puntero;
                puntero = puntero.getIzquierdo();
            }
        }
        return aux;
    }


    /**
     * Muestra por pantalla su hermano y su padre
     * @param puntero el nodo al cual voy a buscar su hermano y padre
     */
    public void familia(Nodo puntero) {
        if (this.buscarNodo(puntero.getInfo())) {
            Nodo padre = padre(puntero.getInfo());
            if (padre != null) {
                System.out.println("El padre es: " + padre.getInfo());
            } else {
                System.out.println("Este nodo es la raíz");
            }
        } else {
            System.out.println("Este nodo no existe");
        }
    }

    /**
     * Obtiene la raíz
     * @return el nodo raíz
     */
    public Nodo getRaiz() {
        return this.raiz;
    }

    /**
     * Inserto elemento dentro del árbol
     * @param valor el valor a insertar
     */
    public void insertarElemento(int valor) {
        Nodo nuevo, puntero, anterior;
        nuevo = new Nodo(valor);
        puntero = raiz;
        anterior = null;
        while (puntero != null) {
            anterior = puntero;
            if (puntero.getInfo() > valor) {
                puntero = puntero.getIzquierdo();
            } else {
                puntero = puntero.getDerecho();
            }
        }
        if (anterior == null) {
            raiz = nuevo;
        } else {
            if (anterior.getInfo() > valor) {
                anterior.setIzquierdo(nuevo);
            } else {
                anterior.setDerecho(nuevo);
            }
        }
    }

    /**
     * Busco el menor entre los valores
     * @param puntero de donde arranco a buscar
     * @return el elemento menor
     */
    public Nodo buscaMenor(Nodo puntero) {
        Nodo aux = puntero.getIzquierdo();
        while (aux.getDerecho() != null) {
            aux = aux.getDerecho();
        }
        return aux;
    }

    /**
     * ELimina un nodo del árbol
     * @param valor el valor a eliminar
     */
    public void eliminarNodo(int valor) {
        Nodo puntero = raiz;
        Nodo testigo = null;
        // Recorre el árbol buscando el valor.
        while (puntero.getInfo() != valor) {
            testigo = puntero;
            if (valor > puntero.getInfo()) {
                puntero = puntero.getDerecho();
            } else {
                puntero = puntero.getIzquierdo();
            }
        }
        // Compruebo si es hoja o tiene hijo para mover los nodos.
        if (puntero.esHoja()) {
            if (testigo == null) {
                raiz = null;
            } else if (puntero == testigo.getIzquierdo()) {
                testigo.setIzquierdo(null);
            } else {
                testigo.setIzquierdo(null);
            }
        } else if (puntero.tieneHijo()) {
            if (puntero == (testigo != null ? testigo.getIzquierdo() : null)) {
                testigo.setIzquierdo(puntero.getHijo());
            } else {
                if (testigo != null) {
                    testigo.setDerecho(puntero.getHijo());
                }
            }
        } else // Si no es ninguno
        {
            Nodo aux = buscaMenor(puntero);
            puntero.setInfo(aux.getInfo());
            testigo = puntero;
            puntero = puntero.getIzquierdo();
            while (puntero != aux) {
                testigo = puntero;
                puntero = puntero.getDerecho();
            }
            if (aux == testigo.getIzquierdo()) {
                testigo.setIzquierdo(aux.getIzquierdo());
            } else {
                if (aux.tieneHijo()) {
                    testigo.setDerecho(aux.getHijo());
                } else {
                    testigo.setDerecho(null);
                }
            }
        }
    }

    /**
     * Muestra por inorden el árbol
     */
    public void inorden() {
        Stack<Object> stack = new Stack<>();
        Nodo testigo = raiz;
        do {
            while (testigo != null) {
                stack.add(testigo);
                testigo = testigo.getIzquierdo();
            }
            if (!stack.empty()) {
                testigo = (Nodo) stack.pop();
                System.out.println(testigo.getInfo());
                testigo = testigo.getDerecho();
            }
        } while (testigo != null || stack.empty());
    }

    /**
     * Muestra de manera recursiva el árbol en inorden
     * @param puntero base para mostrar de manera recursiva
     */
    public void inordenRecursivo(Nodo puntero) {
        if (puntero != null) {
            inordenRecursivo(puntero.getIzquierdo());
            System.out.println("> " + puntero.getInfo());
            inordenRecursivo(puntero.getDerecho());
        }
    }

    /**
     * Muestra de manera recursiva el árbol en preorden
     * @param puntero base para mostrar de manera recursiva
     */
    public void preorden (Nodo puntero) {
        if (puntero != null) {
            System.out.println("> " + puntero.getInfo());
            preorden(puntero.getIzquierdo());
            preorden(puntero.getDerecho());
        }
    }

    /**
     * Muestra de manera recursiva el árbol en postorden
     * @param puntero base para mostrar de manera recursiva
     */
    public void postorden (Nodo puntero) {
        if (puntero != null) {
            postorden(puntero.getIzquierdo());
            postorden(puntero.getDerecho());
            System.out.println(puntero.getInfo());
        }
    }

    /**
     * Suma los valores del árbol
     * @param puntero base para sumar de recursiva
     * @return la suma del árbol
     */
    public int sumarValores (Nodo puntero) {
        if (puntero == null) {
            return 0;
        } else {
            return puntero.getInfo() + sumarValores(puntero.getIzquierdo()) + sumarValores(puntero.getDerecho());
        }
    }

    /**
     * Busca el elemento mayor del árbol
     * @return el mayor elemento
     */
    public int buscarMayor() {
        Nodo actual = raiz;
        while (actual.getDerecho() != null) {
            actual = actual.getDerecho();
        }
        return actual.getInfo();
    }

    /**
     * Invoca el método para contar
     * @return la cantidad total de hojas
     */
    public int contarHojas() {
        return contarHojasResursivo(raiz);
    }

    /**
     * Cuenta recursivamente la cantidad de hojas
     * @param puntero de donde cuenta
     * @return 1 o 0, para iterar
     */
    public int contarHojasResursivo(Nodo puntero) {
        if (puntero != null) {
            if (puntero.esHoja()) {
                return 1;
            }
            return contarHojasResursivo(puntero.getIzquierdo()) + contarHojasResursivo(puntero.getDerecho());
        } else {
            return 0;
        }
    }

    /**
     * Cuenta los hijos izquierdos
     * @param puntero para moverse
     * @return la cantidad de hijos
     */
    public int contarHijosIzquierdo(Nodo puntero) {
        if (puntero == null)
            return 0;
        if (puntero.getIzquierdo() == null)
            return contarHijosIzquierdo(puntero.getDerecho());
        else
            return 1 + contarHijosIzquierdo(puntero.getIzquierdo()) + contarHijosIzquierdo(puntero.getDerecho());
    }

    /**
     * Cuenta los hijos derecha
     * @param puntero para moverse
     * @return la cantidad de hijos
     */
    public int contarHijosDerecha(Nodo puntero) {
        if (puntero == null)
            return 0;
        if (puntero.getDerecho() == null)
            return contarHijosDerecha(puntero.getIzquierdo());
        else
            return 1 + contarHijosDerecha(puntero.getDerecho()) + contarHijosDerecha(puntero.getIzquierdo());
    }

    /**
     * Comprueba si el arbol es zurdo
     * @return sí o no
     */
    public boolean esZurdo() {
        return contarHijosIzquierdo(raiz) > contarHijosDerecha(raiz);
    }

    /**
     * Comprueba si el arbol es derecho
     * @return sí o no
     */
    public boolean esDerecho() {
        return contarHijosDerecha(raiz) > contarHijosIzquierdo(raiz);
    }

    /**
     * Genera un iterador del arbol
     * @return el iterador del arbol
     */
    public Iterador getIterador() {
        return new Iterador(raiz);
    }

    public void contarHojaseInterinos() {
        int contadorHojas = 0;
        int contadorInterinos = 0;
        Stack<Nodo> pila = new Stack<>();
        pila.push(raiz);
        while (!pila.isEmpty()) {
            Nodo nodo = pila.pop();
            if (nodo.esHoja()) {
                contadorHojas++;
            } else {
                contadorInterinos++;
            }

            if(nodo.getDerecho() != null) {
                pila.push(nodo.getDerecho());
            }

            if (nodo.getIzquierdo() != null) {
                pila.push(nodo.getIzquierdo());
            }
        }
        contadorInterinos--; // Por la raíz
        System.out.println("Contador hojas: " + contadorHojas);
        System.out.println("Contador interinos: " + contadorInterinos);
        if (contadorHojas > contadorInterinos) System.out.println("Hay más hojas que interinos");
        if (contadorHojas < contadorInterinos) System.out.println("Hay más interinos que hojas");
        if (contadorHojas == contadorInterinos) System.out.println("Hay igual cantidad");
    }

    /**
     * Calcula la altura del árbol y devuelve la altura
     * @return la altura.
     */
    public int obtenerAltura() {
        if (raiz == null) {
            return 0;
        }
        Stack<Nodo>pila = new Stack<>();
        Stack<Integer> alturas = new Stack<>();
        pila.push(raiz);
        alturas.push(1);
        int maxAltura = 0;
        while (!pila.isEmpty()) {
            Nodo nodo = pila.pop();
            int alturaActual = alturas.pop();
            maxAltura = Math.max(maxAltura, alturaActual);

            if (nodo.getIzquierdo() != null) {
                pila.push(nodo.getIzquierdo());
                alturas.push(alturaActual + 1);
            }

            if (nodo.getDerecho() != null) {
                pila.push(nodo.getDerecho());
                alturas.push(alturaActual + 1);
            }
        }
        return maxAltura;
    }

    /**
     * Calcula la altura máxima del árbol
     * @param nodo nodo de donde arranca
     * @return la altura en cuestión
     */
    public int calcularAltura(Nodo nodo) {
        if (nodo == null) {
            return 0;
        }
        int alturaIzquierda = calcularAltura(nodo.getIzquierdo());
        int alturaDerecha = calcularAltura(nodo.getDerecho());

        if (alturaIzquierda > alturaDerecha) {
            return alturaIzquierda + 1;
        } else {
            return alturaDerecha + 1;
        }
    }

    public void masHojasQueInterinos() {
        Iterador iterador = (Iterador) getIterador();
    }

    /**
     * Llama al método verificar derecho para saber si es diestro o no
     * @return devuelve true si es diestro
     */
    public boolean esDerechoRecursivo () {
        return verificarDerecho(this.raiz, 0) >= 0;
    }

    /**
     * Recorre el árbol para verificar las alturas izquierdas y derechas para comparación
     * @param nodo
     * @param altura
     * @return la altura derecha (en caso de que sea diestro), -1 si es zurdo
     */
    public int verificarDerecho(Nodo nodo, int altura) {
        if (nodo == null) {
            return 0;
        }

        int alturaIzquierda = verificarDerecho(nodo.getIzquierdo(), altura + 1);
        int alturaDerecha = verificarDerecho(nodo.getDerecho(), altura + 1);

        if (alturaDerecha >= alturaIzquierda) {
            return alturaDerecha + 1;
        } else {
            return -1;
        }
    }

    /**
     * Cuenta la cantidad de elementos
     * @return utiliza iteradores para contarlos.
     */
    public int cantidadElementos() {
        int cantidad = 0;
        Iterator<Integer> iterador = (Iterator<Integer>) getIterador();
        while (iterador.hasNext()){
            iterador.next();
            cantidad++;
        }
        return cantidad;
    }

    /**
     * Recorre elemento por elemento viendo si es hoja o no.
     */
    public void imprimirHojas() {
        Iterator<Integer> iterador = (Iterator<Integer>) getIterador();
        while (iterador.hasNext()) {
            int valor = iterador.next();
            Nodo buscar = encontrarNodo(valor);
            if (buscar.esHoja()) {
                System.out.println(buscar.getInfo() + " ");
            }
        }
    }

    /**
     * Retorna la suma de los cuadrados de los elementos
     * @return la suma de los cuadrados de los elementos
     */
    public int sumaCuadrado() {
        int suma = 0;
        Iterator<Integer> iterator = (Iterator<Integer>) getIterador();
        while (iterator.hasNext()) {
            int valor = iterator.next();
            int potencia = valor^2;
            suma += potencia;
        }
        return suma;
    }
}