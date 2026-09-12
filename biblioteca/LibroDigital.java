
package biblioteca;

public class LibroDigital {
    
    private String formato;
    private Double tamañoArchivo;
    private String urlDescarga;
    private Boolean protegido;
    
    
LibroDigital (Libro libro, String formato, Double tamañoArchivo, String urlDescarga,Boolean protegido){

    this.formato = formato;
    this.tamañoArchivo = tamañoArchivo;
    this.urlDescarga = urlDescarga;
    this.protegido = protegido;
}

public void descargar(){}

public void leerEnLinea(){}

    public String getFormato() {
        return formato;
    }

    public void setFormato(String formato) {
        this.formato = formato;
    }

    public Double getTamañoArchivo() {
        return tamañoArchivo;
    }

    public void setTamañoArchivo(Double tamañoArchivo) {
        this.tamañoArchivo = tamañoArchivo;
    }

    public String getUrlDescarga() {
        return urlDescarga;
    }

    public void setUrlDescarga(String urlDescarga) {
        this.urlDescarga = urlDescarga;
    }

    public Boolean getProtegido() {
        return protegido;
    }

    public void setProtegido(Boolean protegido) {
        this.protegido = protegido;
    }

}
