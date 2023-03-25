package Gestores_Nico;
/*-------------------------------------------
                FUNCIONAMIENTO
Reemplazar cada enteroX con variables enteras,
Reemplazar cada stringX con variable String,
Reemplazar cada charX con variables char,
Reemplazar cada doubleX con variables doubleX.

Para hacer todo más rápido, pueden apretar Ctrl + H (visual studio)
Y en el campo de FIND poner lo que van a buscar, y en el campo de
REPLACE por lo que quieren, luego apretar CTRL + ALT + ENTER
/-------------------------------------------*/
public class TestObjeto {
    private int entero1, entero2, entero3;
    private String string1, string2, string3;
    private char char1, char2, char3;
    private double double1, double2, double3;
    public TestObjeto(int entero1, int entero2, int entero3, String string1, String string2, String string3, char char1, char char2, char char3, double double1, double double2, double double3)
    {
        this.entero1 = entero1;
        this.entero2 = entero2;
        this.entero3 = entero3;
        this.string1 = string1;
        this.string2 = string2;
        this.string3 = string3;
        this.char1 = char1;
        this.char2 = char2;
        this.char3 = char3;
        this.double1 = double1;
        this.double2 = double2;
        this.double3 = double3;
    }
    public void setEntero1(int entero1)
    {
        this.entero1 = entero1;
    }
    public void setString1(String string1)
    {
        this.string1 = string1;
    }
    public void setChar1(char char1)
    {
        this.char1 = char1;
    }
    public void setDouble1(double double1)
    {
        this.double1 = double1;
    }
    //2//
    public void setEntero2(int entero2)
    {
        this.entero2 = entero2;
    }
    public void setString2(String string2)
    {
        this.string2 = string2;
    }
    public void setChar2(char char2)
    {
        this.char2 = char2;
    }
    public void setDouble2(double double2)
    {
        this.double2 = double2;
    }
    //3//
    public void setEntero3(int entero3)
    {
        this.entero3 = entero3;
    }
    public void setString3(String string3)
    {
        this.string3 = string3;
    }
    public void setChar3(char char3)
    {
        this.char3 = char3;
    }
    public void setDouble3(double double3)
    {
        this.double3 = double3;
    }
    //GET 1//
    public int getEntero1()
    {
        return entero1;
    }
    public String getString1()
    {
        return string1;
    }
    public char getChar1()
    {
        return char1;
    }
    public double getDouble1()
    {
        return double1;
    }
    //2//
    public int getEntero2()
    {
        return entero2;
    }
    public String getString2()
    {
        return string2;
    }
    public char getChar2()
    {
        return char2;
    }
    public double getDouble2()
    {
        return double2;
    }
    //3//
    public int getEntero3()
    {
        return entero3;
    }
    public String getString3()
    {
        return string3;
    }
    public char getChar3()
    {
        return char3;
    }
    public double getDouble3()
    {
        return double3;
    }
}
