package aiep.model;

/**
 * @author DGOMEZ
 * @version 1.0
 */
public class Estado {
    private int estId;
    private String estNombre;
    
//    Constructor vacio
    public Estado() {}
    
    public int getEstId() {
        return estId;
    }
    
    public void setEstId(int estId) {
        this.estId = estId;
    }
    
    public String getEstNombre() {
        return estNombre;
    }
    
    public void setEstNombre(String estNombre) {
        this.estNombre = estNombre;
    }
}
