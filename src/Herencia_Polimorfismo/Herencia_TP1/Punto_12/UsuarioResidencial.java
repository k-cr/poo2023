package Herencia_Polimorfismo.Herencia_TP1.Punto_12;

public class UsuarioResidencial extends Usuario{
    boolean primeraVez = false;
    public UsuarioResidencial(String d, String n) {
        super(d, n);
    }

    // No se contabilizan los primeros 3 minutos de conexión.

    @Override
    void conexion(int s) {
        if(primeraVez) {
            super.conexion(s);
        } else {
            if(s >= 180) {
                primeraVez = true;
                super.conexion(s - 180);
            } else {
                primeraVez = true;
                super.conexion(0);
            }
        }
    }
}
