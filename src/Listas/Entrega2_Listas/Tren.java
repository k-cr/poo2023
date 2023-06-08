package Listas.Entrega2_Listas;

public class Tren {
    int cantidadVagones;
    Vagon puntero;
    public Tren() {
        this.cantidadVagones = 0;
    }

    public void nuevoVagon(int maximo) {
        Vagon nuevo = new Vagon(maximo);
        if (puntero == null) {
            puntero = nuevo;
        } else {
            Vagon actual = puntero;
            while (actual.getSiguiente() != null) {
                actual = actual.getSiguiente();
            }
            actual.setSiguiente(nuevo);
        }
        this.cantidadVagones++;
    }

    public void subirPasajeros(int pasajeros) {
        Vagon primero = puntero;
        boolean corte = false;
        if (primero == null) {
            System.out.println("No hay vagones");
            return;
        } else {
            while (primero.getSiguiente() != null && !corte) {
                if (pasajeros < (primero.getCantidadMaxima() - primero.getCantidadOcupada())) {
                    primero.setCantidadOcupada(primero.getCantidadOcupada() + pasajeros);
                    corte = true;
                } else {
                    primero = primero.getSiguiente();
                }
            }
        }
    }

    public void bajarPasajeros(int posicion, int pasajeros) {
        if (puntero == null) {
            System.out.println("No hay vagones");
            return;
        } else {
            Vagon primero = puntero;
            int pos = 1;
            while (primero.getSiguiente() != null) {
                if (pos == posicion && primero.getCantidadOcupada() > pasajeros) {
                    primero.setCantidadOcupada(primero.getCantidadOcupada() - pasajeros);
                    return;
                }
                pos++;
                primero = primero.getSiguiente();
            }
        }
    }

    public void verVagones() {
        Vagon actual = puntero;
        while (actual != null) {
            System.out.println("Cantidad de pasajeros: " + actual.getCantidadOcupada() + "/" + actual.getCantidadMaxima());
            actual = actual.getSiguiente();
        }
    }
}
