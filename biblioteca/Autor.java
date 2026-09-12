
package biblioteca;

import java.util.Date;

public class Autor {
    
    private int idAutor;
    private String nombre;
    private String nacionalidad;
    private Date fechaNacimiento;
    
    Autor (int idAutor, String nombre, String nacionalidad, Date fechaNacimiento){
    
        this.idAutor = idAutor;
        this.nombre = nombre;
        this.nacionalidad = nacionalidad;
        this.fechaNacimiento = fechaNacimiento;
    
    }
    
    public void escribirLibro (){}
    
    public String obtenerInfo(){
        return null;
    }        

    public int getIdAutor() {
        return idAutor;
    }

    public void setIdAutor(int idAutor) {
        this.idAutor = idAutor;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
            

    
}
