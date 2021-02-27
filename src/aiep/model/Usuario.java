package aiep.model;

/**
 *
 * @author DAGG
 * @version 1.0
 */
public class Usuario {
    
    private int usuId;
    private String usuRut;
    private String usuNombre;
    private String usuApaterno;
    private String usuAmaterno;
    private String usuClave;
    private Perfil perId;
    
    // Constructor vacio
    public Usuario() {}

    public int getUsuId() {
        return usuId;
    }

    public void setUsuId(int usuId) {
        this.usuId = usuId;
    }

    public String getUsuRut() {
        return usuRut;
    }

    public void setUsuRut(String usuRut) {
        this.usuRut = usuRut;
    }

    public String getUsuNombre() {
        return usuNombre;
    }

    public void setUsuNombre(String usuNombre) {
        this.usuNombre = usuNombre;
    }

    public String getUsuApaterno() {
        return usuApaterno;
    }

    public void setUsuApaterno(String usuApaterno) {
        this.usuApaterno = usuApaterno;
    }

    public String getUsuAmaterno() {
        return usuAmaterno;
    }

    public void setUsuAmaterno(String usuAmaterno) {
        this.usuAmaterno = usuAmaterno;
    }

    public String getUsuClave() {
        return usuClave;
    }

    public void setUsuClave(String usuClave) {
        this.usuClave = usuClave;
    }

    public Perfil getPerId() {
        return perId;
    }

    public void setPerId(Perfil perId) {
        this.perId = perId;
    }
}
