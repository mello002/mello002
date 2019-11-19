/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.util.ArrayList;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import modelo.Aula;

public class ControladorAula {

    public static ArrayList<Aula> lista = new ArrayList<Aula>();

    public void registrar_aula(Aula a) {
        lista.add(a);
    }

    public ArrayList<Aula> listar_aulas() {
        return lista;
    }

    public void eliminar_aula(String bloque,String numero) {
        for (int i = 0; i < lista.size(); i++) {
            Aula aula = lista.get(i);

            if (bloque.equalsIgnoreCase(aula.getBloque()) && numero.equalsIgnoreCase(aula.getNumeroAula())) {
                lista.remove(i);
                JOptionPane.showMessageDialog(null, "Aula Eliminada");
            } else {
                JOptionPane.showMessageDialog(null, "Aula no encontrada");
            }
        }
    }

    public void modificar_aula(String numero,String bloque, String estadonuevo) {

        for (int i = 0; i < lista.size(); i++) {
            Aula aula = lista.get(i);
            if (numero.equalsIgnoreCase(aula.getNumeroAula()) && bloque.equalsIgnoreCase(aula.getBloque())) {
                
                aula.setEstadoAula(estadonuevo);
                JOptionPane.showMessageDialog(null, "Modificacion exitosa");
                break;
            } else {

                JOptionPane.showMessageDialog(null, "No se encontro el aula");
                break;
            }

        }

    }
    
    public JComboBox cargar_aulas(JComboBox combo){
    
        for (int i = 0; i < lista.size(); i++) {
            combo.addItem(lista.get(i).getNumeroAula()+"-"+lista.get(i).getBloque());
        }
        return combo;
    }
    
    public JComboBox cargar_numeros(JComboBox combonum){
        for (int i = 0; i < lista.size(); i++) {
            combonum.addItem(lista.get(i).getNumeroAula());
            
        }
        return combonum;
    }
    
    public JComboBox cargar_bloques(JComboBox combos){
        for (int i = 0; i < lista.size(); i++) {
            combos.addItem(lista.get(i).getBloque());
        }
        return combos;
    }

}
