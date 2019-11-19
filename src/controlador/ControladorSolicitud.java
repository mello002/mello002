/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import modelo.Solicitud;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import modelo.Aula;

/**
 *
 * @author Usuario
 */
public class ControladorSolicitud {
    
    public static ArrayList<Solicitud> lista=new ArrayList<Solicitud>();
    
    public void agregar_solicitud(Solicitud s){
    lista.add(s);
    }
    
    public ArrayList<Solicitud> listar_solicitudes(){
    return lista;
    }
    
    public void eliminar_solicitud(String idsolicitud) {
        for (int i = 0; i < lista.size(); i++) {
           Solicitud solicitud = lista.get(i);

            if (idsolicitud.equalsIgnoreCase(solicitud.getIdSolicitud())) {
                lista.remove(i);
                JOptionPane.showMessageDialog(null, "Solicitud Eliminada");
            } else {
                JOptionPane.showMessageDialog(null, "Solicitud no encontrada");
            }
        }
    }
    
    public void modificar_solicitud(String idsolicitud,String aula,String descripcion,String tipo) {

        for (int i = 0; i < lista.size(); i++) {
            Solicitud solicitud = lista.get(i);
            if (idsolicitud.equalsIgnoreCase(solicitud.getIdSolicitud())) {
                solicitud.setAula(aula);
                solicitud.setDescripcionSolicitud(descripcion);
                solicitud.setTipoSolicitud(tipo);
                JOptionPane.showMessageDialog(null, "Modificacion exitosa");
                break;
            }

        }

    }
    
    
}
