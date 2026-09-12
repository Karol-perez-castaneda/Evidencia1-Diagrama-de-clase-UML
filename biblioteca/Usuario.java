
package biblioteca;

public class Usuario {
    private int idUsuario;
    private String nombre;
    private String documento;
    private String tipoUsuario;
    
Usuario (int idUsuario, String nombre, String documento, String tipoUsuario){

    this.idUsuario = idUsuario;
    this.nombre = nombre;
    this.documento = documento;
    this.tipoUsuario = tipoUsuario;
}    
    
public void registrar(){}

public String obtenerInfo(){
    return null;
}

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public String getTipoUsuario() {
        return tipoUsuario;
    }

    public void setTipoUsuario(String tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }

}
