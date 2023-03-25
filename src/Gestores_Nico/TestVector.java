package Gestores_Nico;
import java.util.Vector;

/*--------------------------------------------
                FUNCIONAMIENTO

EL MISMO QUE LA CLASE TEST OBJETO, REEMPLAZAR LO NECESARIO.
---------------------------------------------*/
public class TestVector {
    Vector <TestObjeto> testObjetos;
    public TestVector()
    {
        this.testObjetos = new Vector<>();
    }

    //Añadir objetos
    public void añadirElementos(TestObjeto Objeto)
    {
        testObjetos.addElement(Objeto);
    }

    //Eliminar objetos
    public void eliminarElementos(int indice)
    {
        if(testObjetos.isEmpty())
        {
            System.out.println("No hay elementos.");
        }
        else
        if(indice > 0 && indice < testObjetos.size())
        {
            testObjetos.removeElementAt(indice);
        }
        else
        {
            System.out.println("No hay elemento ahí.");
        }
    }

    //Vaciar vector
    public void vaciarVector()
    {
        testObjetos.clear();
    }

    //Lista los elementos del vector. <--- ESTE METODO ES EL QUE SE PUEDE CAMBIAR PARA TODO
    public void listarElementos()
    {
        for (TestObjeto testObjeto : testObjetos)
        {
            System.out.println("Acá muestran lo que quieran mostrar del vector, ejemplo: " + testObjeto.getString1());
        }
    }

    //Listar cosas específicas de los hijos
    public void listarEspecifico()
    {
        for (TestObjeto testObjeto : testObjetos)
        {
            if(testObjeto instanceof TestObjetoHija)
            {
                System.out.println("Reemplazan TestObjetoHija por la clase que quieran.");
                System.out.println("Esta funcionalidad se puede duplicar según cuantos hijos tenga.");
            }
        }
    }
}
