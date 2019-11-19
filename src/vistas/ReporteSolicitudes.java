/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas;

import controlador.ControladorSolicitud;
import modelo.Solicitud;

/**
 *
 * @author rosme
 */
public class ReporteSolicitudes extends javax.swing.JInternalFrame {

    /**
     * Creates new form ReporteSolicitudes
     */
    public ReporteSolicitudes() {
        initComponents();
        txtestado.setEditable(false);
        txtrespuesta.setEditable(false);
        cargar_solicitudes();
    }
    
    public void cargar_solicitudes() {

        String solicitudes[][] = new String[ControladorSolicitud.lista.size()][6];
        for (int i = 0; i < ControladorSolicitud.lista.size(); i++) {
            Solicitud solicitud = ControladorSolicitud.lista.get(i);
            if (Login.codigoempleado.equals(solicitud.getCodigoEmpleado())) {
                solicitudes[i][0] = ControladorSolicitud.lista.get(i).getIdSolicitud();
                solicitudes[i][1] = ControladorSolicitud.lista.get(i).getTipoSolicitud();
                solicitudes[i][2] = ControladorSolicitud.lista.get(i).getCodigoEmpleado();
                solicitudes[i][3] = ControladorSolicitud.lista.get(i).getAula();
                solicitudes[i][4] = ControladorSolicitud.lista.get(i).getFechaSolicitud().toString();
                solicitudes[i][5] = ControladorSolicitud.lista.get(i).getDescripcionSolicitud();
                

            }
        }
        
        tabla_solicitudes.setModel(new javax.swing.table.DefaultTableModel(solicitudes,new String[]{"Codigo Solicitud","Tipo Solicitud","Codigo Empleado","Aula","Fecha Solicitud","Descripcion"}));
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tabla_solicitudes = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtestado = new javax.swing.JTextField();
        lblrespuesta = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtrespuesta = new javax.swing.JTextArea();

        setClosable(true);

        tabla_solicitudes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tabla_solicitudes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabla_solicitudesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabla_solicitudes);

        jLabel1.setText("LISTADO DE SOLICITUDES");

        jLabel2.setText("Estado de Solicitud");

        lblrespuesta.setText("Respuesta");

        txtrespuesta.setColumns(20);
        txtrespuesta.setRows(5);
        jScrollPane2.setViewportView(txtrespuesta);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 667, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(306, 306, 306)
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(lblrespuesta))
                                .addGap(40, 40, 40)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtestado, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtestado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblrespuesta)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tabla_solicitudesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabla_solicitudesMouseClicked
       int fila=tabla_solicitudes.getSelectedRow();
       String codigo=tabla_solicitudes.getValueAt(fila, 0).toString();
       String estado="";
       String respuesta="";
        for (int i = 0; i < ControladorSolicitud.lista.size(); i++) {
            Solicitud s=ControladorSolicitud.lista.get(i);
            if (codigo.equals(s.getIdSolicitud())) {
                estado=s.getEstado();
                respuesta=s.getRespuesta();
            }
        }
        if (estado.equalsIgnoreCase("Aprobado")) {
            txtestado.setText(estado);
        }else{
        txtestado.setText(estado);
        txtrespuesta.setText(respuesta);
        }
    }//GEN-LAST:event_tabla_solicitudesMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblrespuesta;
    private javax.swing.JTable tabla_solicitudes;
    private javax.swing.JTextField txtestado;
    private javax.swing.JTextArea txtrespuesta;
    // End of variables declaration//GEN-END:variables
}
