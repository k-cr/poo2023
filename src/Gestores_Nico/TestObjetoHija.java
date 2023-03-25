package Gestores_Nico;

public class TestObjetoHija extends TestObjeto{
    private int entero4;
    private String string4;
    private char char4;
    private double double4;
    public TestObjetoHija(int entero1, int entero2, int entero3, int entero4, String string1, String string2, String string3, String string4, char char1, char char2, char char3, char char4, double double1, double double2, double double3, double double4)
    {
        super(entero1, entero2, entero4, string1, string2, string4, char1, char2, char3, double1, double2, double3);
        this.entero4 = entero4;
        this.char4 = char4;
        this.double4 = double4;
        this.string4 = string4;
    }
    //4//
    public void setEntero4(int entero4)
    {
        this.entero4 = entero4;
    }
    public void setString4(String string4)
    {
        this.string4 = string4;
    }
    public void setChar4(char char4)
    {
        this.char4 = char4;
    }
    public void setDouble4(double double4)
    {
        this.double4 = double4;
    }
    //GET 4//
    public int getEntero4()
    {
        return entero4;
    }
    public String getString4()
    {
        return string4;
    }
    public char getChar4()
    {
        return char4;
    }
    public double getDouble4()
    {
        return double4;
    }
}
