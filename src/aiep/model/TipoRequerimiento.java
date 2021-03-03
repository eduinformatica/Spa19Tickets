package aiep.model;

/**
 * @author DGOMEZ
 * @version 1.0
 */
public class TipoRequerimiento {
    private int tipReqId;
    private String tipReqNombre;
 
//    Constructor vacio
    public TipoRequerimiento() {}
    
//    Constructor con parametros
    public TipoRequerimiento(int tipReqId, String tipReqNombre) {
        this.tipReqId = tipReqId;
        this.tipReqNombre = tipReqNombre;
    }

    public int getTipReqId() {
        return tipReqId;
    }

    public void setTipReqId(int tipReqId) {
        this.tipReqId = tipReqId;
    }

    public String getTipReqNombre() {
        return tipReqNombre;
    }

    public void setTipReqNombre(String tipReqNombre) {
        this.tipReqNombre = tipReqNombre;
    }
}
