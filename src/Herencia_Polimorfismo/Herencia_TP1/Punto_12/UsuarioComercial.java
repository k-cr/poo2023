package Herencia_Polimorfismo.Herencia_TP1.Punto_12;

public class UsuarioComercial extends Usuario{
    int porcentajeDescuento;

    public UsuarioComercial(String d, String n, int porcentajeDescuento) {
        super(d, n);
        this.porcentajeDescuento = porcentajeDescuento;
    }

    public int getPorcentajeDescuento() {
        return porcentajeDescuento;
    }

    public void setPorcentajeDescuento(int porcentajeDescuento) {
        this.porcentajeDescuento = porcentajeDescuento;
    }

    @Override
    double calcularFacturacion() {
        double importe = super.calcularFacturacion();
        return importe - ((importe * getPorcentajeDescuento()) / 100);
    }
}
