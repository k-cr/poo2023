package ProgramaMateo;

import java.util.Vector;

public class Pizarra {

    Vector<Figura>elemento;

    Figura[] Elementos;
    int Actual;
    double fondo;

    public Pizarra(){
        this.elemento=new Vector<Figura>(10);
    }

    //public Figura[] getElementos() {
    //  return this.Elementos;
    //}

    //public void setElementos(Figura[] Elementos) {
    //  this.Elementos = Elementos;
    //}

    public int getActual() {
        return this.Actual;
    }

    public void setActual(int Actual) {
        this.Actual = Actual;
    }

    public double getFondo() {
        return this.fondo;
    }

    public void setFondo(double fondo) {
        this.fondo = fondo;
    }

    public void agregarFigura(Figura f){
        this.elemento.addElement(f);
    }

    public void quitarFigura(Figura f){
        this.elemento.removeElement(f);
    }

    public void mostrarFiguras(){
        for(Figura figura:elemento){
            System.out.println("figura " + figura.getBorde());
            System.out.println("figura" + figura.getFondo());
        }
    }
    //public void agregarFigura(Figura f){
    //  this.Elementos[this.Actual]=this.f;
    // this.Actual=this.Actual+1;

    //}

    //public void quitarFigura(Figura f){
    //  this.Elementos[this.Actual]=this.f;
    //  this.Actual=this.Actual-1;
    //}

}
