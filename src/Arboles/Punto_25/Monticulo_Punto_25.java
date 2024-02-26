package Arboles.Punto_25;

import java.util.Vector;

public class Monticulo_Punto_25 {
    Trabajo[] trabajos;
    int numnodos, dimension;

    public Monticulo_Punto_25() {
        dimension = 51;
        trabajos = new Trabajo[dimension];
        numnodos = 0;
    }

    public void insertar(Trabajo trabajo) {
        if (numnodos < dimension) {
            numnodos++;
            trabajos[numnodos] = trabajo;
            restaurarMonticuloHaciaArriba();
        }
    }

    public Trabajo eliminar(int indice) {
        Trabajo aux = trabajos[indice];
        trabajos[indice] = trabajos[numnodos];
        numnodos--;
        restaurarMonticuloHaciaAbajo(indice);
        return aux;
    }

    public void restaurarMonticuloHaciaArriba() {
        int actual, padre;
        Trabajo aux;
        boolean ok = false;
        actual = numnodos;
        padre = actual / 2;
        while (actual > 1 && !ok) {
            if (trabajos[padre].getId() <= trabajos[actual].getId()) {
                ok = true;
            } else {
                aux = trabajos[padre];
                trabajos[padre] = trabajos[actual];
                trabajos[actual] = aux;
                actual = padre;
                padre = actual / 2;
            }
        }
    }

    public void restaurarMonticuloHaciaAbajo(int indice) {
        boolean ok = false;
        int maxhijo;
        int raiz = indice;
        Trabajo aux;
        while (raiz * 2 <= numnodos && !ok) {
            if (raiz * 2 == numnodos) {
                maxhijo = raiz;
            } else {
                if (trabajos[raiz * 2].getId() < trabajos[raiz * 2 + 1].getId()) {
                    maxhijo = raiz * 2;
                } else {
                    maxhijo = raiz * 2 + 1;
                }
            }
            if (trabajos[raiz].getId() > trabajos[maxhijo].getId()) {
                aux = trabajos[raiz];
                trabajos[raiz] = trabajos[maxhijo];
                trabajos[maxhijo] = aux;
                raiz = maxhijo;
            } else {
                ok = true;
            }
        }
    }

    public void inorden(int indice) {
        if (indice <= numnodos) {
            inorden(indice * 2);
            Trabajo trabajo = trabajos[indice];
            System.out.println("Usuario: " + trabajo.getId() + ", con el token: " + trabajo.getToken());
            inorden(indice * 2 + 1);
        }
    }
}
