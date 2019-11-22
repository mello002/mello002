/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas;

import controlador.ControladorAdministrativo;
import controlador.ControladorAula;
import controlador.ControladorEmpleado;
import controlador.ControladorSolicitud;
import java.util.Date;
import modelo.Adminstrativo;
import modelo.Aula;
import modelo.Empleado;
import modelo.Solicitud;


public class Proyectoaula3s {

    
    public static void main(String[] args) {
       Login p=new Login();
       ControladorEmpleado ctrle=new ControladorEmpleado();
       ControladorAula ctrla=new ControladorAula();
       ControladorSolicitud ctrls=new ControladorSolicitud();
       ControladorAdministrativo ctrlad=new ControladorAdministrativo();
       Date d=new Date();
       
       Adminstrativo ad1=new Adminstrativo("A001","Administrativo","Activo",3000000,"1002193450","Jorge","Bustos",d,"1234","50 años");
       ctrlad.registrar_administrativo(ad1);
       
       
       Aula a1=new Aula("101","A","","En uso");
       Aula a2=new Aula("102","B","","En uso");
       Aula a3=new Aula("103","C","","En uso");
       Aula a4=new Aula("104","E","","En uso");
       ctrla.registrar_aula(a1);
       ctrla.registrar_aula(a2);
       ctrla.registrar_aula(a3);
       ctrla.registrar_aula(a4);
       
       
       Solicitud s1=new Solicitud("S001","Mantenimiento","C001","101-B",d,"sdafkjsdahfsdakjlfhsadlkfj","Por Aprobar","");
       Solicitud s2=new Solicitud("S002","Mantenimiento","C001","101-A",d,"sdafkjsdahfsdakjlfhsadlkfj","Por Aprobar","");
       ctrls.agregar_solicitud(s1);
       ctrls.agregar_solicitud(s2);
       
       Empleado e=new Empleado("C001","Docente",d,150000,"20 años","1002193450","Raul","Gonzalez",d,"Activo","1234");
       ctrle.registrar_empleado(e);
       
       p.setVisible(true);
       p.setLocationRelativeTo(null);
       
       
    }
    
}
