package Herencia_Polimorfismo.Herencia_TP1.Punto_8;
import java.util.Vector;

public class GestorFiguras {
    Vector<Figura> pizarra;
    public GestorFiguras()
    {
        pizarra = new Vector <Figura> (10);
    }
    public void agregarFigura(Figura figura)
    {
        pizarra.addElement(figura);
    }

/*    public void mostrarFiguras()
    {
        System.out.println("Figuras dibujadas: ");
        for (Figura figura : pizarra)
        {
            String tipo = "";
            Vector<String> caracteristicas = new Vector<String>(10);
            if (figura instanceof Rectangulo) {
                tipo = "Rectángulo";
                caracteristicas.add("ancho: " + ((Rectangulo) figura).getAncho());
                caracteristicas.add(" alto: " + ((Rectangulo) figura).getLargo());
            } else if (figura instanceof Linea) {
                tipo = "Línea";
                caracteristicas.add("longitud: " + ((Linea) figura).getLongitud());
            } else if (figura instanceof Circunferencia) {
                tipo = "Círculo";
                caracteristicas.add("radio: " + ((Circunferencia) figura).getRadio());
            }
            System.out.println("> " + tipo + " con fondo: " + figura.getColorFondo() + ", y borde: " + figura.getColorBorde() + " con: " + caracteristicas.toString());
        }
    }

    */

    public void mostrarFiguras()
    {
        System.out.println("Figuras dibujadas: ");
        for (Figura figura : pizarra)
        {
            String tipo = "";
            Vector<String> caracteristicas = new Vector<String>(10);
            if (figura instanceof Rectangulo) {
                tipo = "Rectángulo";
                caracteristicas.add("ancho: " + ((Rectangulo) figura).getAncho());
                caracteristicas.add(" alto: " + ((Rectangulo) figura).getLargo());
            } else if (figura instanceof Linea) {
                tipo = "Línea";
                caracteristicas.add("longitud: " + ((Linea) figura).getLongitud());
            } else if (figura instanceof Circunferencia) {
                tipo = "Círculo";
                caracteristicas.add("radio: " + ((Circunferencia) figura).getRadio());
            }
            System.out.println("> " + tipo + " con fondo: " + figura.getColorFondo() + ", y borde: " + figura.getColorBorde() + " con: " + caracteristicas.toString());
        }
    }
    public Figura obtenerFigura(int posicion) {
        Figura figura = pizarra.elementAt(posicion);
        this.eliminarFigura(posicion);
        return figura;
    }
    public void eliminarFigura(int indice)
    {
        if(pizarra.isEmpty())
        {
            System.out.println("No hay elementos.");
        }
        else if(indice > -1 && indice < pizarra.size())
        {
            pizarra.removeElementAt(indice);
        }
        else
        {
            System.out.println("No hay elemento ahí.");
        }
    }
    public void mostrarRadios() {
        for (Figura figura : pizarra) {
            if (figura instanceof Circunferencia) {
                System.out.println(" > Radio: " + ((Circunferencia) figura).radio);
            }
        }
    }
    public void perimetroFiguras()
    {
        for (Figura figura : pizarra)
        {
            System.out.println("> " + figura.calcularPerimetro());
        }
    }
    public void superficieFiguras()
    {
        for (Figura figura : pizarra)
        {
            System.out.println("> " + figura.calcularSuperficie());
        }
    }
    public void borrarPizarra() {
        pizarra.clear();
        System.out.println("Pizarra borrada.");
    }
}
