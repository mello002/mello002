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
public class Persona {
        
private String docIdentidas;
    private String nombre;
    private String apellido;
    private Date fechaNacimiento;
    private String estado;

    public Persona() {
    }
 public Persona(String docIdentidas, String nombre, String apellido, Date fechaNacimiento, String estado) {
        this.docIdentidas = docIdentidas;
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNacimiento = fechaNacimiento;
        this.estado = estado;
    }
 
    public String getDocIdentidas() {
        return docIdentidas;
    }

    public void setDocIdentidas(String docIdentidas) {
        this.docIdentidas = docIdentidas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Persona{" + "docIdentidas=" + docIdentidas + ", nombre=" + nombre + ", apellido=" + apellido + ", fechaNacimiento=" + fechaNacimiento + ", estado=" + estado + '}';
    }

   

}