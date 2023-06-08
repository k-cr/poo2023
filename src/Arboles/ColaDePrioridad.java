package Arboles;

public class ColaDePrioridad {
    Monticulo elementos;
    public ColaDePrioridad() {
        elementos = new Monticulo();
    }

    /**
     * Elimina el elemento en formato FIFO
     * @return el valor de lo que recuperó
     */
    public int suprimir() {
        int sacado = elementos.eliminar(1); // Siempre la raíz
        return sacado;
    }

    /**
     * Inserta el elemento en la cola
     * @param nuevo es el elemento a insertar
     */
    public void insertar(int nuevo) {
        elementos.insertar(nuevo);
    }

    /**
     * Verifica si la cola está vacía
     * @return
     */
    public boolean estaVacia() {
        return elementos.estaVacio();
    }
}
