package Herencia_Polimorfismo.Herencia_TP1.Punto_10;
/*
    Una empresa de medios impresos y gráficos financia publicaciones. Todas las publicaciones tienen un título
    y una persona responsable de la dirección de la publicación. Tienen además un código numérico que las
    identifica unívocamente. Las publicaciones pueden ser de dos tipos: diarios y revistas. Las publicaciones
    escritas tienen un editor responsable, una cantidad de páginas, un precio y un año de publicación. Los diarios
    que se imprimen son semanales o quincenales, se cobra una pequeña cantidad de recargo por envíos al
    interior, y se registra la semana y mes de publicación. Las revistas poseen el mes de publicación, el número y el
    título de la nota de tapa.
*/

public class Publicacion {
    int id;
    String titulo;
    String responsable;
    String editor;
    int paginas;
    double precio;
    int anhoPublicacion;

    public Publicacion(int id, String titulo, String responsable, String editor, int paginas, double precio, int anhoPublicacion) {
        this.id = id;
        this.titulo = titulo;
        this.responsable = responsable;
        this.editor = editor;
        this.paginas = paginas;
        this.precio = precio;
        this.anhoPublicacion = anhoPublicacion;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getResponsable() {
        return responsable;
    }

    public void setResponsable(String responsable) {
        this.responsable = responsable;
    }

    public String getEditor() {
        return editor;
    }

    public void setEditor(String editor) {
        this.editor = editor;
    }

    public int getPaginas() {
        return paginas;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getAnhoPublicacion() {
        return anhoPublicacion;
    }

    public void setAnhoPublicacion(int anhoPublicacion) {
        this.anhoPublicacion = anhoPublicacion;
    }

    public double calcularPrecio() {
        return getPrecio();
    }
}
