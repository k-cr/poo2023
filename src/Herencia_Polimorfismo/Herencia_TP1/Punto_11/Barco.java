package Herencia_Polimorfismo.Herencia_TP1.Punto_11;

public class Barco {
    String matricula;
    int eslora;
    int anhoFabricacion;

    public Barco(String matricula, int eslora, int anhoFabricacion) {
        this.matricula = matricula;
        this.eslora = eslora;
        this.anhoFabricacion = anhoFabricacion;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public int getEslora() {
        return eslora;
    }

    public void setEslora(int eslora) {
        this.eslora = eslora;
    }

    public int getAnhoFabricacion() {
        return anhoFabricacion;
    }

    public void setAnhoFabricacion(int anhoFabricacion) {
        this.anhoFabricacion = anhoFabricacion;
    }

    public double calcularPrecio() { return 0; }
}
