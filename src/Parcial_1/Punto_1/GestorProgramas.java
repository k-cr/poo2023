package Parcial_1.Punto_1;

import java.util.Vector;

public class GestorProgramas {
    Vector<Programa> programas;
    public GestorProgramas() {
        programas = new Vector<Programa>(10);
    }

    public void agregarPrograma(Programa programa) {
        programas.add(programa);
    }

    public void verPeliculaPorPais(String pais) {
        for (Programa programa: programas) {
            if (programa instanceof Pelicula) {
                if (programa.getPaisOrigen() == pais) {
                    System.out.println("> " + programa.getTitulo() + " de duración: " + ((Pelicula) programa).getMinutos() + " minutos");
                }
            }
        }
    }

    public void verPelisMenosQueridas() {
        for (Programa programa : programas) {
            if (programa instanceof Pelicula) {
                if (programa.getNoMeGusta() > programa.getNoMeGusta()) {
                    System.out.println("> " + programa.getTitulo() + " de duración: " + ((Pelicula) programa).getMinutos() + " minutos");
                }
            }
        }
    }

    public void verPelisDocumentalesMenor120Minutos() {
        for (Programa programa : programas) {
            if (programa instanceof Pelicula) {
                if (((Pelicula) programa).getMinutos() < 120) {
                    System.out.println("> " + programa.getTitulo() + " de duración: " + ((Pelicula) programa).getMinutos() + " minutos");
                }
            } else if (programa instanceof Documental) {
                if (((Documental) programa).getDuracionMinutos() < 120) {
                    System.out.println("> " + programa.getTitulo() + " de duración: " + ((Documental) programa).getDuracionMinutos() + " minutos");
                }
            }
        }
    }
}
