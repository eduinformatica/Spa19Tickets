package aiep.model;

import java.util.Date;

/**
 * @author DGOMEZ
 * @version 1.0
 */
public class Requerimiento {
    private int reqId;
    private Date reqFechaRequerimiento;
    private String reqDescripcion;
    private Date reqFechaPlazo;
    private Prioridad priId;
    private Usuario usuAsignado;
    private Usuario usuAsignante;
    private Estado estId;
    private TipoRequerimiento tipReqId;
    
//    Constructor
    public Requerimiento() {}

    public int getReqId() {
        return reqId;
    }

    public void setReqId(int reqId) {
        this.reqId = reqId;
    }

    public Date getReqFechaRequerimiento() {
        return reqFechaRequerimiento;
    }

    public void setReqFechaRequerimiento(Date reqFechaRequerimiento) {
        this.reqFechaRequerimiento = reqFechaRequerimiento;
    }

    public String getReqDescripcion() {
        return reqDescripcion;
    }

    public void setReqDescripcion(String reqDescripcion) {
        this.reqDescripcion = reqDescripcion;
    }

    public Date getReqFechaPlazo() {
        return reqFechaPlazo;
    }

    public void setReqFechaPlazo(Date reqFechaPlazo) {
        this.reqFechaPlazo = reqFechaPlazo;
    }

    public Prioridad getPriId() {
        return priId;
    }

    public void setPriId(Prioridad priId) {
        this.priId = priId;
    }

    public Usuario getUsuAsignado() {
        return usuAsignado;
    }

    public void setUsuAsignado(Usuario usuAsignado) {
        this.usuAsignado = usuAsignado;
    }

    public Usuario getUsuAsignante() {
        return usuAsignante;
    }

    public void setUsuAsignante(Usuario usuAsignante) {
        this.usuAsignante = usuAsignante;
    }

    public Estado getEstId() {
        return estId;
    }

    public void setEstId(Estado estId) {
        this.estId = estId;
    }

    public TipoRequerimiento getTipReqId() {
        return tipReqId;
    }

    public void setTipReqId(TipoRequerimiento tipReqId) {
        this.tipReqId = tipReqId;
    }
}
