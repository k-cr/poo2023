package Parcial_1.Punto_3;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class ArchivoPromedios {
    RandomAccessFile promedio;
    public void ArchivoPromedios(String name) throws FileNotFoundException {
        this.promedio = new RandomAccessFile(name, "rw");
    }
    // varios metodos
    public float cantidadMayoresa6 () {
        int contador = 0;
        try {
            promedio.seek(0);
            while (promedio.getFilePointer() <= promedio.length()) {
                promedio.readLong();
                float comparar = promedio.readFloat();
                if (comparar >= 60) {
                    contador = contador  + 1;
                }
            }
        } catch (IOException e) {
            System.out.print(e.getMessage());
        } finally {
            System.out.println("La cantidad de alumnos con un promedio mayor a 6 son: " + contador);
        }
        return 0;
    }
}
