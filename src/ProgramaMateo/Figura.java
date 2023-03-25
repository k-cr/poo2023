package ProgramaMateo;

public class Figura {
    private String fondo;
    private String borde;

    public Figura(String fo, String bo){
        this.fondo=fo;
        this.borde=bo; }


    public String getFondo() {
        return this.fondo;
    }

    public void setFondo(String fo) {
        this.fondo = fo;
    }

    public String getBorde() {
        return this.borde;
    }

    public void setBorde(String bo) {
        this.borde = bo;
    }

    public void Dibujar(){
        System.out.println("Dibujando");

    }

    //public abstract double Perimetro();

    //public abstract double Superficie();

}
