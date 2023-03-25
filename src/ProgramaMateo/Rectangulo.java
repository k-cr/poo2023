package ProgramaMateo;

public class Rectangulo extends Figura{
    double Base;
    double Altura;

    public Rectangulo(String fo, String bo, double base, double altura) {
        super(fo, bo);
        Base = base;
        Altura = altura;
    }

    public double getBase() {
        return this.Base;
    }

    public void setBase(double ba) {
        this.Base = ba;
    }

    public double getAltura() {
        return this.Altura;
    }

    public void setAltura(double al) {
        this.Altura = al;
    }

    /*
    public double Perimetro(double Base, double Altura){
        double s=2*this.getBase()*this.getAltura();
        return this.s;
    }

    public double Superficie(double Base, double Altura){
        double a=this.getBase()*this.getAltura();
        return this.a;
    }*/

}
