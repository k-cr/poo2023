package Arboles.Punto_25;

public class Trabajo {
    public int id, prioridad;
    public String token;

    public Trabajo(int id, String token) {
        this.id = id;
        this.token = token;
    }

    public void setId(int id) {
        this.id = id;
    }   

    public int getId() {
        return id;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getToken() {
        return token;
    }

    public void setPrioridad() {
        if (id >= 0 && id < 100) this.prioridad = 0;
        if (id >= 100 && id < 200) this.prioridad = 1;
        if (id >= 200 && id < 300) this.prioridad = 2;
        if (id >= 300 && id < 400) this.prioridad = 3;
        if (id >= 400 && id < 500) this.prioridad = 4;
        if (id >= 500 && id < 600) this.prioridad = 5;
        if (id >= 600 && id < 700) this.prioridad = 6;
        if (id >= 700 && id < 800) this.prioridad = 7;
        if (id >= 800 && id < 900) this.prioridad = 8;
        if (id >= 900 && id < 1000) this.prioridad = 9;
        if (id >= 1000) this.prioridad = 10;
    }

    public int getPrioridad() {
        return prioridad;
    }
}
