/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import modelo.Aula;

public class ControladorAula {

    ArrayList<Aula> lista = new ArrayList<Aula>();

    public void registrar_aula(Aula a) {
        lista.add(a);
    }

    public ArrayList<Aula> listar_aulas() {
        return lista;
    }

    public void eliminar_aula(String nombre) {
        for (int i = 0; i < lista.size(); i++) {
            Aula aula = lista.get(i);

            if (nombre.equalsIgnoreCase(aula.getNombreAula())) {
                lista.remove(i);
                JOptionPane.showMessageDialog(null, "Aula Eliminada");
            } else {
                JOptionPane.showMessageDialog(null, "Aula no encontrada");
            }
        }
    }

    public void modificar_aula(String numero, String bloque, String nombrenuevo, String estadonuevo) {

        for (int i = 0; i < lista.size(); i++) {
            Aula aula = lista.get(i);
            if (numero.equalsIgnoreCase(aula.getNumeroAula()) && bloque.equalsIgnoreCase(aula.getBloque())) {
                aula.setNombreAula(nombrenuevo);
                aula.setEstadoAula(estadonuevo);
                JOptionPane.showMessageDialog(null, "Modificacion exitosa");
                break;
            } else {

                JOptionPane.showMessageDialog(null, "No se encontro el aula");
                break;
            }

        }

    }
    

}
