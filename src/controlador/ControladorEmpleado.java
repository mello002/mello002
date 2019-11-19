/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;
import modelo.Aula;
import modelo.Empleado;

/**
 *
 * @author Usuario
 */
public class ControladorEmpleado {
    
    public static ArrayList<Empleado> lista=new ArrayList<Empleado>();
    
    public void registrar_empleado(Empleado e) {
        lista.add(e);
    }
    
    public ArrayList<Empleado> listar_empleados() {
        return lista;
    }
    
    public void eliminar_empleado(String codigo) {
        for (int i = 0; i < lista.size(); i++) {
            Empleado empleado = lista.get(i);

            if (codigo.equalsIgnoreCase(empleado.getCodEmpleado())) {
                lista.remove(i);
                JOptionPane.showMessageDialog(null, "Empleado Eliminado(a)");
            } else {
                JOptionPane.showMessageDialog(null, "Empleado no encontrado(a)");
            }
        }
    }
    
    public void modificar_empleado(String codigo,String cargo,Date fecha_ingreso,double sueldo,String edad,String docidentidad,String nombre, String apellido, Date fechaNacimiento, String estado,String contraseña) {

        for (int i = 0; i < lista.size(); i++) {
            Empleado empleado = lista.get(i);
            if (codigo.equalsIgnoreCase(empleado.getCodEmpleado())) {
                empleado.setCargo(cargo);
                empleado.setFechaIngreso(fecha_ingreso);
                empleado.setSueldo(sueldo);
                empleado.setEstad(edad);
                empleado.setDocIdentidas(docidentidad);
                empleado.setNombre(nombre);
                empleado.setApellido(apellido);
                empleado.setFechaNacimiento(fechaNacimiento);
                empleado.setEstado(estado);
                empleado.setContraseña(contraseña);
                JOptionPane.showMessageDialog(null, "Modificacion exitosa");
                break;
            } else {

                JOptionPane.showMessageDialog(null, "No se encontro el aula");
                break;
            }

        }

    }
    
    
    
    
    
}
