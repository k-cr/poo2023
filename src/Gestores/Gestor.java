package Gestores;

import java.util.ArrayList;

public class Gestor {
    private ArrayList<Objeto> objetos;
    public Gestor() {
        objetos = new ArrayList<Objeto>();
    }
    public void agregar(Objeto objeto) {
        objetos.add(objeto);
    }
    public boolean eliminar(String nombre) {
        for (Objeto obj: objetos) {
            if (obj.getNombre().equals(nombre)) {
                objetos.remove(obj);
                return true;
            }
        }
        return false;
    }
    public ArrayList<Objeto> getObjetos() {
        return objetos;
    }
}
