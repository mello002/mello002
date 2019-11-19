/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.Date;

/**
 *
 * @author rosme
 */
public class Adminstrativo extends Persona {

    private String cargo;
    private double sueldo;
    private String contraseña;
    private String codigoAdministrativo;
    private String edad;

    public Adminstrativo(String cargo, double sueldo) {
        this.cargo = cargo;

        this.sueldo = sueldo;
    }

    public Adminstrativo() {
    }

    public Adminstrativo(String codigo,String cargo, String estado, double sueldo, String docIdentidas, String nombre, String apellido, Date fechaNacimiento,String contraseña,String edad) {
        super(docIdentidas, nombre, apellido, fechaNacimiento, estado);
        this.cargo = cargo;
        this.contraseña=contraseña;
        this.sueldo = sueldo;
        this.codigoAdministrativo=codigo;
        this.edad=edad;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }
    
    

    public String getCodigoAdministrativo() {
        return codigoAdministrativo;
    }

    public void setCodigoAdministrativo(String codigoAdministrativo) {
        this.codigoAdministrativo = codigoAdministrativo;
    }
    
    

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }
    
    

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

}
