/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas;

import controlador.ControladorAdministrativo;
import controlador.ControladorSolicitud;
import modelo.Solicitud;

/**
 *
 * @author rosme
 */
public class AdministrarSolicitudes extends javax.swing.JInternalFrame {

String codigo="",tipo="",codemp="",aula="",fecha="",estado="",desc="";
    
    public AdministrarSolicitudes() {
        initComponents();
        txtrespuesta.setVisible(false);
        txtdescripcion.setEditable(false);
        btnGuardar.setEnabled(false);
        cargar_solicitudes();
        tabla_solicitudes.setEnabled(false);
        txtrespuesta.setLineWrap(true);
    }
    
    public void cargar_solicitudes(){
    String solicitudes[][]=new String[ControladorSolicitud.lista.size()][6];
        for (int i = 0; i < ControladorSolicitud.lista.size(); i++) {
            solicitudes[i][0]=ControladorSolicitud.lista.get(i).getIdSolicitud();
            solicitudes[i][1]=ControladorSolicitud.lista.get(i).getTipoSolicitud();
            solicitudes[i][2]=ControladorSolicitud.lista.get(i).getCodigoEmpleado();
            solicitudes[i][3]=ControladorSolicitud.lista.get(i).getAula();
            solicitudes[i][4]=ControladorSolicitud.lista.get(i).getFechaSolicitud().toString();
            solicitudes[i][5]=ControladorSolicitud.lista.get(i).getEstado();
            
        }
        tabla_solicitudes.setModel(new javax.swing.table.DefaultTableModel(solicitudes,new String[]{"Codigo","Tipo Solicitud","Codigo Empleado","Aula","Fecha Solicitud","Estado"}));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tabla_solicitudes = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        combo_respuesta = new javax.swing.JComboBox<>();
        lblrespuesta = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtrespuesta = new javax.swing.JTextArea();
        btnGuardar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtdescripcion = new javax.swing.JTextArea();

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

        jLabel2.setText("Respuesta");

        combo_respuesta.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Aprobada", "No aprobada" }));
        combo_respuesta.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                combo_respuestaItemStateChanged(evt);
            }
        });

        lblrespuesta.setText("Justifique su Respuesta");

        txtrespuesta.setColumns(20);
        txtrespuesta.setRows(5);
        jScrollPane2.setViewportView(txtrespuesta);

        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        jLabel3.setText("Descripcion de Solicitud: ");

        txtdescripcion.setColumns(20);
        txtdescripcion.setRows(5);
        jScrollPane3.setViewportView(txtdescripcion);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(278, 278, 278)
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(33, 33, 33)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblrespuesta)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel2)
                                            .addGap(27, 27, 27)
                                            .addComponent(combo_respuesta, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(btnGuardar))
                                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 377, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 393, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(151, 151, 151)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(12, 12, 12)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(combo_respuesta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnGuardar))
                .addGap(36, 36, 36)
                .addComponent(lblrespuesta)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void combo_respuestaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_combo_respuestaItemStateChanged
        if (combo_respuesta.getSelectedIndex()==0) {
            lblrespuesta.setVisible(false);
            txtrespuesta.setVisible(false);
        }else{
        lblrespuesta.setVisible(true);
            txtrespuesta.setVisible(true);
        }
    }//GEN-LAST:event_combo_respuestaItemStateChanged

    private void tabla_solicitudesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabla_solicitudesMouseClicked
        btnGuardar.setEnabled(true);
        int fila=tabla_solicitudes.getSelectedRow();
        codigo=tabla_solicitudes.getValueAt(fila, 0).toString();
        
        
        
        for (int i = 0; i < ControladorSolicitud.lista.size(); i++) {
            Solicitud s=ControladorSolicitud.lista.get(i);
            if (codigo.equals(s.getIdSolicitud())) {
                
                txtdescripcion.setText(s.getDescripcionSolicitud());
                break;
            }
        }
    }//GEN-LAST:event_tabla_solicitudesMouseClicked

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
       
        estado=combo_respuesta.getSelectedItem().toString();
       String r=combo_respuesta.getSelectedItem().toString()+"\n"+txtrespuesta.getText();
       ControladorAdministrativo ctrla=new ControladorAdministrativo();
       ctrla.responder_solicitud(codigo, estado, r);
       
    }//GEN-LAST:event_btnGuardarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGuardar;
    private javax.swing.JComboBox<String> combo_respuesta;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lblrespuesta;
    private javax.swing.JTable tabla_solicitudes;
    private javax.swing.JTextArea txtdescripcion;
    private javax.swing.JTextArea txtrespuesta;
    // End of variables declaration//GEN-END:variables
}
