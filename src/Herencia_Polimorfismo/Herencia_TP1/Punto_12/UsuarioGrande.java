package Herencia_Polimorfismo.Herencia_TP1.Punto_12;

public class UsuarioGrande extends Usuario{
    int periodoMasGrande;
    boolean primeraVez;

    public UsuarioGrande(String d, String n) {
        super(d, n);
    }

    @Override
    void conexion(int s) {
        if(primeraVez) {
            periodoMasGrande = s;
        } else {
            if(s > periodoMasGrande) {
                super.conexion(0);
            } else {
                super.conexion(s);
            }
            primeraVez = true;
        }
    }
}
