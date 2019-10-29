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
public class Empleado extends Persona {  
    
    private String codEmpleado;
    private String cargo;
    private Date fechaIngreso;
    private double sueldo;
   private String estad;

    public Empleado() {
    }

    public Empleado(String codEmpleado, String cargo, Date fechaIngreso, double sueldo, String estad) {
        this.codEmpleado = codEmpleado;
        this.cargo = cargo;
        this.fechaIngreso = fechaIngreso;
        this.sueldo = sueldo;
        this.estad = estad;
    }

    public Empleado(String codEmpleado, String cargo, Date fechaIngreso, double sueldo, String estad, String docIdentidas, String nombre, String apellido, Date fechaNacimiento, String estado) {
        super(docIdentidas, nombre, apellido, fechaNacimiento, estado);
        this.codEmpleado = codEmpleado;
        this.cargo = cargo;
        this.fechaIngreso = fechaIngreso;
        this.sueldo = sueldo;
        this.estad = estad;
    }

    public String getCodEmpleado() {
        return codEmpleado;
    }

    public void setCodEmpleado(String codEmpleado) {
        this.codEmpleado = codEmpleado;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public Date getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(Date fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public String getEstad() {
        return estad;
    }

    public void setEstad(String estad) {
        this.estad = estad;
    }

    @Override
    public String toString() {
        return "Empleado{" + "codEmpleado=" + codEmpleado + ", cargo=" + cargo + ", fechaIngreso=" + fechaIngreso + ", sueldo=" + sueldo + ", estad=" + estad + '}';
    }
   
}
