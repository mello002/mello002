/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;
import modelo.Adminstrativo;
import modelo.Solicitud;

/**
 *
 * @author rosme
 */
public class ControladorAdministrativo {

    public static ArrayList<Adminstrativo> lista = new ArrayList<Adminstrativo>();

    public void registrar_administrativo(Adminstrativo a) {
        lista.add(a);
        for (Adminstrativo ad:lista) {
            System.out.println(ad.getNombre()+" "+ad.getContraseña());
        }
    }

    public ArrayList<Adminstrativo> listar_administrativos() {
        return lista;
    }

    public void eliminar_administrativo(String codigo) {
        for (int i = 0; i < lista.size(); i++) {
            Adminstrativo administrativo = lista.get(i);

            if (codigo.equalsIgnoreCase(administrativo.getCodigoAdministrativo())) {
                lista.remove(i);
                JOptionPane.showMessageDialog(null, "Administrativo Eliminado(a)");
            } else {
                JOptionPane.showMessageDialog(null, "Admnistrativo no encontrado(a)");
            }
        }
    }

    public void modificar_administrativo(String codigo, String cargo, String estado, double sueldo, String identificacion, String nombre, String apellido, Date fecha_nacimiento, String contraseña, String edad) {

        for (int i = 0; i < lista.size(); i++) {
            Adminstrativo administrativo = lista.get(i);
            if (codigo.equalsIgnoreCase(administrativo.getCodigoAdministrativo())) {
                administrativo.setCargo(cargo);
                administrativo.setSueldo(sueldo);
                administrativo.setEdad(edad);
                administrativo.setDocIdentidas(identificacion);
                administrativo.setNombre(nombre);
                administrativo.setApellido(apellido);
                administrativo.setFechaNacimiento(fecha_nacimiento);
                administrativo.setEstado(estado);
                administrativo.setContraseña(contraseña);
                administrativo.setEdad(edad);
                JOptionPane.showMessageDialog(null, "Modificacion exitosa");
                break;
            } else {

                JOptionPane.showMessageDialog(null, "No se encontro el aula");
                break;
            }

        }

    }
    
    public void responder_solicitud(String codigo,String estado,String respuesta){
        for (int i = 0; i < ControladorSolicitud.lista.size(); i++) {
            Solicitud s=ControladorSolicitud.lista.get(i);
            if (codigo.equals(s.getIdSolicitud())) {
                s.setEstado(estado);
                s.setRespuesta(respuesta);
                JOptionPane.showMessageDialog(null, "Respuesta Enviada");
                break;
            }
        }
    }

}
