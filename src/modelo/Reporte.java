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
public class Reporte {
   private int numeroReporte;
   private Solicitud solicitud;
   private Date fechaReporte;
   private Empleado empleado;
   private String  comentarioReporte;
   private String estado;

    public Reporte() {
    }

    public Reporte(int numeroReporte, Solicitud solicitud, Date fechaReporte, Empleado empleado, String comentarioReporte, String estado) {
        this.numeroReporte = numeroReporte;
        this.solicitud = solicitud;
        this.fechaReporte = fechaReporte;
        this.empleado = empleado;
        this.comentarioReporte = comentarioReporte;
        this.estado = estado;
    }

    public int getNumeroReporte() {
        return numeroReporte;
    }

    public void setNumeroReporte(int numeroReporte) {
        this.numeroReporte = numeroReporte;
    }

    public Solicitud getSolicitud() {
        return solicitud;
    }

    public void setSolicitud(Solicitud solicitud) {
        this.solicitud = solicitud;
    }

    public Date getFechaReporte() {
        return fechaReporte;
    }

    public void setFechaReporte(Date fechaReporte) {
        this.fechaReporte = fechaReporte;
    }

    public Empleado getEmpleado() {
        return empleado;
    }

    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }

    public String getComentarioReporte() {
        return comentarioReporte;
    }

    public void setComentarioReporte(String comentarioReporte) {
        this.comentarioReporte = comentarioReporte;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Reporte{" + "numeroReporte=" + numeroReporte + ", solicitud=" + solicitud + ", fechaReporte=" + fechaReporte + ", empleado=" + empleado + ", comentarioReporte=" + comentarioReporte + ", estado=" + estado + '}';
    }
   
}
