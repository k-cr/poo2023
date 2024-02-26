package Arboles.Punto_25;

import java.util.Random;

import Arboles.ColaDePrioridad;

public class Cola_Punto_25 {
    Monticulo_Punto_25 elementos;

    public Cola_Punto_25() {
        elementos = new Monticulo_Punto_25();
    }

    public Trabajo obtenerSigTrabajo() {
        Trabajo sacado = elementos.eliminar(1);
        return sacado;
    }

    public void insertar(Trabajo trabajo) {
        elementos.insertar(trabajo);
    }
}
