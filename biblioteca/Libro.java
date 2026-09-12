
package biblioteca;


public class Libro {
    
    private int idLibro;
    private String titulo;
    private String isbn;
    private int añoPublicacion;
    private EstadoDisponibilidad estado;
   
    
Libro (int idLibro, String titulo, String isbn, int añoPublicacion, EstadoDisponibilidad estado){

    this.idLibro = idLibro;
    this.titulo = titulo;
    this.isbn = isbn;
    this.añoPublicacion = añoPublicacion;
    this.estado = estado;

}

public void prestar(){}

public void actualizarEstado(){}

public String obtenerInfo(){
    return null;
}

    public int getIdLibro() {
        return idLibro;
    }

    public void setIdLibro(int idLibro) {
        this.idLibro = idLibro;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public int getAñoPublicacion() {
        return añoPublicacion;
    }

    public void setAñoPublicacion(int añoPublicacion) {
        this.añoPublicacion = añoPublicacion;
    }

    public EstadoDisponibilidad getEstado() {
        return estado;
    }

    public void setEstado(EstadoDisponibilidad estado) {
        this.estado = estado;
    }
    
}
