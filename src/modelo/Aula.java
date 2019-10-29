/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Usuario
 */
public class Aula {
    
    
    private String numeroAula;
    private String bloque;
    private String nombreAula;
    private String estadoAula;

    public Aula() {
    }

    public Aula(String numeroAula, String bloque, String nombreAula, String estadoAula) {
        this.numeroAula = numeroAula;
        this.bloque = bloque;
        this.nombreAula = nombreAula;
        this.estadoAula = estadoAula;
    }

    public String getNumeroAula() {
        return numeroAula;
    }

    public void setNumeroAula(String numeroAula) {
        this.numeroAula = numeroAula;
    }

    public String getBloque() {
        return bloque;
    }

    public void setBloque(String bloque) {
        this.bloque = bloque;
    }

    public String getNombreAula() {
        return nombreAula;
    }

    public void setNombreAula(String nombreAula) {
        this.nombreAula = nombreAula;
    }

    public String getEstadoAula() {
        return estadoAula;
    }

    public void setEstadoAula(String estadoAula) {
        this.estadoAula = estadoAula;
    }

    @Override
    public String toString() {
        return "Aula{" + "numeroAula=" + numeroAula + ", bloque=" + bloque + ", nombreAula=" + nombreAula + ", estadoAula=" + estadoAula + '}';
    }
    
}
