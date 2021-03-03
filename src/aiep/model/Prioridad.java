package aiep.model;

/**
 * @author DGOMEZ
 * @version 1.0;
 */
public class Prioridad {
    private int priId;
    private String priNombre;
    
//    Constructor vacio
    public Prioridad() {}
    
    public int getPriId() {
        return priId;
    }
    
    public void setPriId(int priId) {
        this.priId = priId;
    }
    
    public String getPriNombre() {
        return priNombre;
    }
    
    public void setPriNombre(String priNombre) {
        this.priNombre = priNombre;
    }
}
