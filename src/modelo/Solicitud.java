/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.Date;

/**
 *
 * @author Usuario
 */
public class Solicitud {
    
    private String idSolicitud;
    private String tipoSolicitud;
    private String codigoEmpleado;
    private Aula aula;
    private Date fechaSolicitud;
    private String descripcionSolicitud;
    private String estado;

    public Solicitud() {
    }

    public Solicitud(String idSolicitud, String tipoSolicitud, String codigoEmpleado, Aula aula, Date fechaSolicitud, String descripcionSolicitud, String estado) {
        this.idSolicitud = idSolicitud;
        this.tipoSolicitud = tipoSolicitud;
        this.codigoEmpleado = codigoEmpleado;
        this.aula = aula;
        this.fechaSolicitud = fechaSolicitud;
        this.descripcionSolicitud = descripcionSolicitud;
        this.estado = estado;
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

    public Aula getAula() {
        return aula;
    }

    public void setAula(Aula aula) {
        this.aula = aula;
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
