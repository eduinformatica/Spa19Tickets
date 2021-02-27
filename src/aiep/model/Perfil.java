package aiep.model;

/**
 *
 * @author ites_
 * @version 1.0
 */
public class Perfil {
    private int perId;
    private String perNombre;
    
//    Construtor vacio
    public Perfil() {}

    public int getPerId() {
        return perId;
    }

    public void setPerId(int perId) {
        this.perId = perId;
    }

    public String getPerNombre() {
        return perNombre;
    }

    public void setPerNombre(String perNombre) {
        this.perNombre = perNombre;
    } 
}
