/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.Date;


public class Solicitud {
    
    private String idSolicitud;
    private String tipoSolicitud;
    private String codigoEmpleado;
    private String aula;
    private Date fechaSolicitud;
    private String descripcionSolicitud;
    private String estado;
    private String respuesta;

    public Solicitud() {
    }

    public Solicitud(String idSolicitud, String tipoSolicitud, String codigoEmpleado, String nombreaula, Date fechaSolicitud, String descripcionSolicitud, String estado,String respuesta) {
        this.idSolicitud = idSolicitud;
        this.tipoSolicitud = tipoSolicitud;
        this.codigoEmpleado = codigoEmpleado;
        this.aula = nombreaula;
        this.fechaSolicitud = fechaSolicitud;
        this.descripcionSolicitud = descripcionSolicitud;
        this.estado = estado;
        this.respuesta=respuesta;
    }

    public String getRespuesta() {
        return respuesta;
    }

    public void setRespuesta(String respuesta) {
        this.respuesta = respuesta;
    }
    
    

    public String getAula() {
        return aula;
    }

    public void setAula(String aula) {
        this.aula = aula;
    }
    
    

    public String getIdSolicitud() {
        return idSolicitud;
    }

    public void setIdSolicitud(String idSolicitud) {
        this.idSolicitud = idSolicitud;
    }

    public String getTipoSolicitud() {
        return tipoSolicitud;
    }

    public void setTipoSolicitud(String tipoSolicitud) {
        this.tipoSolicitud = tipoSolicitud;
    }

    public String getCodigoEmpleado() {
        return codigoEmpleado;
    }

    public void setCodigoEmpleado(String codigoEmpleado) {
        this.codigoEmpleado = codigoEmpleado;
    }

    

    public Date getFechaSolicitud() {
        return fechaSolicitud;
    }

    public void setFechaSolicitud(Date fechaSolicitud) {
        this.fechaSolicitud = fechaSolicitud;
    }

    public String getDescripcionSolicitud() {
        return descripcionSolicitud;
    }

    public void setDescripcionSolicitud(String descripcionSolicitud) {
        this.descripcionSolicitud = descripcionSolicitud;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Solicitud{" + "idSolicitud=" + idSolicitud + ", tipoSolicitud=" + tipoSolicitud + ", codigoEmpleado=" + codigoEmpleado + ", aula=" + aula + ", fechaSolicitud=" + fechaSolicitud + ", descripcionSolicitud=" + descripcionSolicitud + ", estado=" + estado + '}';
    }
    
    
    
    
     
    
    
    
}
