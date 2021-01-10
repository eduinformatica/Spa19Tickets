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
   
}
