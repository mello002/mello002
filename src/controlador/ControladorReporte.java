/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;
import modelo.Empleado;
import modelo.Reporte;
import modelo.Solicitud;

/**
 *
 * @author Usuario
 */
public class ControladorReporte {
    
   public static ArrayList<Reporte> lista=new ArrayList<Reporte>();
    
    public void registrar_reporte(Reporte r){
    lista.add(r);
    }
    
    public ArrayList<Reporte> listar_reportes(){
    return lista;
    }
    
    public void eliminar_reporte(int nreporte) {
        for (int i = 0; i < lista.size(); i++) {
            Reporte reporte = lista.get(i);

            if (nreporte==reporte.getNumeroReporte()) {
                lista.remove(i);
                JOptionPane.showMessageDialog(null, "Reporte Eliminado");
            } else {
                JOptionPane.showMessageDialog(null, "Reporte no encontrado");
            }
        }
    }
    
    public void modificar_reporte(int nreporte,Solicitud solicitud,Date fechareporte,Empleado empleado,String comentario,String estado) {

        for (int i = 0; i < lista.size(); i++) {
            Reporte reporte = lista.get(i);
            if (nreporte==reporte.getNumeroReporte()) {
                reporte.setSolicitud(solicitud);
                reporte.setFechaReporte(fechareporte);
                reporte.setEmpleado(empleado);
                reporte.setComentarioReporte(comentario);
                reporte.setEstado(estado);
                JOptionPane.showMessageDialog(null, "Modificacion exitosa");
                break;
            } else {

                JOptionPane.showMessageDialog(null, "No se encontro el aula");
                break;
            }

        }

    }
    
    
    
    
    
    
}
