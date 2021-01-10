package aiep.model;

/**
 *
 * @author DAGG
 * @version 1.0
 */
public class Usuario {
    
    private int idusuario; //idusuario
    private String rut;
    private String nombre;
    private String apaterno;
    private String amaterno;
    private String usu_password; //clave
//    private int idperfil;
    
    // Cosntructor vacio
    public Usuario() {}
    
    
    public int getId() {
        return idusuario;
    }
    public void setId(int idusuario) {
        this.idusuario = idusuario;
    }
    
    
    public String getRut() {
        return rut;
    }
    public void setRut(String dni) {
        this.rut = dni;
    }
    
    
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
    public String getApaterno() {
        return apaterno;
    }
    public void setApaterno(String apaterno) {
        this.apaterno = apaterno;
    }
    
    
    public String getAmaterno() {
        return amaterno;
    }
    public void setAmaterno(String amaterno) {
        this.amaterno = amaterno;
    }
    
    
    public String getUsu_Password() {
        return usu_password;
    }
    public void setUsu_Password(String clave) {
        this.usu_password = clave;
    }
}
