/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unicauca.parqueadero.presentacion;

import com.unicauca.parqeuadero.transversal.Comunicacion;
import com.unicauca.parqeuadero.transversal.Utilitarios;
import com.unicauca.parqueadero.cliente.NewJerseyClientVehiculoTicket;
import com.unicauca.parqueadero.cliente.TicketController;
import com.unicauca.parqueadero.cliente.Vehiculo;
import com.unicauca.parqueadero.cliente.VehiculoController;
import com.unicauca.parqueadero.cliente.VehiculoTicket;
import com.unicauca.parqueadero.cliente.VehiculoTicketController;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author danie
 */
public class GUISalida extends javax.swing.JInternalFrame {
    
    VehiculoController Cvehiculo = new VehiculoController();
    
    VehiculoTicketController CVehiculoTicket = new VehiculoTicketController();
    
    NewJerseyClientVehiculoTicket jerseyve = new NewJerseyClientVehiculoTicket();
    
    TicketController Cticket = new TicketController();
    
    //variable global placa para ser utilizada en otras partes
    String placaa="";
    
    //VARIABLE global fecha_horsa_salida
    String fecha_hora_sal = ""; 
    
    

    /**
     * Creates new form GUISalida
     */
    public GUISalida() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlNorte = new javax.swing.JPanel();
        lblBuscar = new javax.swing.JLabel();
        rbtnCodigo = new javax.swing.JRadioButton();
        rbtnPlaca = new javax.swing.JRadioButton();
        txtBuscar = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        btnSacar = new javax.swing.JButton();
        btnCerrar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        lblPlaca = new javax.swing.JLabel();
        txtPlaca = new javax.swing.JTextField();
        lblFecha1 = new javax.swing.JLabel();
        txtFecha1 = new javax.swing.JTextField();
        lblFecha2 = new javax.swing.JLabel();
        txtFecha2 = new javax.swing.JTextField();
        lblObservacion = new javax.swing.JLabel();
        txtObservacion = new javax.swing.JTextField();

        setClosable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Salida de Vehículos");

        pnlNorte.setLayout(new javax.swing.BoxLayout(pnlNorte, javax.swing.BoxLayout.LINE_AXIS));

        lblBuscar.setFont(new java.awt.Font("Lucida Sans Unicode", 3, 18)); // NOI18N
        lblBuscar.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblBuscar.setText("Buscar por: ");
        pnlNorte.add(lblBuscar);

        rbtnCodigo.setFont(new java.awt.Font("Lucida Sans Unicode", 3, 14)); // NOI18N
        rbtnCodigo.setSelected(true);
        rbtnCodigo.setText("Código");
        pnlNorte.add(rbtnCodigo);

        rbtnPlaca.setFont(new java.awt.Font("Lucida Sans Unicode", 3, 14)); // NOI18N
        rbtnPlaca.setText("Placa");
        pnlNorte.add(rbtnPlaca);

        txtBuscar.setFont(new java.awt.Font("Lucida Sans Unicode", 3, 14)); // NOI18N
        pnlNorte.add(txtBuscar);

        btnBuscar.setFont(new java.awt.Font("Lucida Sans Unicode", 3, 14)); // NOI18N
        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        pnlNorte.add(btnBuscar);

        getContentPane().add(pnlNorte, java.awt.BorderLayout.PAGE_START);

        btnSacar.setFont(new java.awt.Font("Lucida Sans Unicode", 1, 12)); // NOI18N
        btnSacar.setText("Sacar Vehículo");
        btnSacar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSacarActionPerformed(evt);
            }
        });
        jPanel1.add(btnSacar);

        btnCerrar.setFont(new java.awt.Font("Lucida Sans Unicode", 1, 12)); // NOI18N
        btnCerrar.setText("Cerrar");
        jPanel1.add(btnCerrar);

        getContentPane().add(jPanel1, java.awt.BorderLayout.PAGE_END);

        jPanel2.setLayout(new java.awt.GridLayout(4, 1));

        lblPlaca.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 18)); // NOI18N
        lblPlaca.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblPlaca.setText("Placa: ");
        jPanel2.add(lblPlaca);

        txtPlaca.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 18)); // NOI18N
        jPanel2.add(txtPlaca);

        lblFecha1.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 18)); // NOI18N
        lblFecha1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblFecha1.setText("Fecha y Hora de Entrada: ");
        jPanel2.add(lblFecha1);

        txtFecha1.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 18)); // NOI18N
        jPanel2.add(txtFecha1);

        lblFecha2.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 18)); // NOI18N
        lblFecha2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblFecha2.setText("Fecha y Hora de Salida: ");
        jPanel2.add(lblFecha2);

        txtFecha2.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 18)); // NOI18N
        jPanel2.add(txtFecha2);

        lblObservacion.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 18)); // NOI18N
        lblObservacion.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblObservacion.setText("Observaciones (Opcional): ");
        jPanel2.add(lblObservacion);

        txtObservacion.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 18)); // NOI18N
        jPanel2.add(txtObservacion);

        getContentPane().add(jPanel2, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSacarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSacarActionPerformed
      
        SimpleDateFormat formatter = new SimpleDateFormat("yyy-MM-dd HH:mm:ss");
        String dateInString = txtFecha1.getText();
        
        String dateInString2 = txtFecha2.getText();

        try {

            Date date = formatter.parse(dateInString);
            //System.out.println(formatter.format(date));
            
            Date date2 = formatter.parse(dateInString2);
            
            fecha_hora_sal = dateInString2;
            //System.out.println(formatter.format(date2));
            
            
            //System.out.println("diferencia entre minutos");
            //System.out.println(Utilitarios.calcularDiferenciaEnMinutos(date, date2));
            
            Long minutos_cobrar = Utilitarios.calcularDiferenciaEnMinutos(date, date2);
            
            double totalCobro = 0;
            
            
            //pendiente
            //traemos el tipo de vehiculo
            //comparamos a hora de entrada si esta entre hora diurna u hora nocturna
            //segun los dos valors recogidos anteriormente tremos la tarifa
            //realizando una busqueda por tipo_tarifa y tipo_vehiculo
            //finalmente realizamos los calculos con esa tarifa
            
            //dejamos la tarifa pro defecto por ahora
            int tarifa=1700;
            
            
            System.out.println("minutos a cobrar");
            System.out.println(minutos_cobrar);
            
            if(minutos_cobrar < 61){
                //tremos la tarifa minima y cobramos la minima
                totalCobro=tarifa;
                
            }else if(minutos_cobrar>=61){
                //treamos la tafifa y la multiplicamos por el numero de horas
                long numero_horas = minutos_cobrar/60;
                
                System.out.println("horas a tarifar");
                System.out.println(numero_horas);
                
                totalCobro=numero_horas*tarifa;
            }
            
            System.out.println("TOTAL A COBRAR");
            System.out.println(totalCobro);

        
        //lanzamos la interfaz 
        GUICobro ins = new GUICobro(placaa,fecha_hora_sal,String.valueOf(totalCobro));
        ins.setMaximizable(true);

        GUIMenuPrincipal.dskEscritorio.add(ins);
        ins.toFront();
        ins.setVisible(true);
        
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnSacarActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        //comprobamos si la busqueda es por codigo o por placa y llamamos al metodo correspondiente
        System.out.println("llamo al metodo buscar");
        
        if (rbtnCodigo.isSelected()) {
            //busqueda por codigo
            //System.out.println("busqueda por codigo seleccionada");
        }else if (rbtnPlaca.isSelected()) {
            //busqueda por placa
            //System.out.println("usqueda por placa seleccionada");
            
            //traemos del campo el string placa para buscar
            String placaBuscar= txtBuscar.getText();
            
            Vehiculo vehiculRespuesta =  Cvehiculo.buscarVehiculoPorPlaca(placaBuscar);
            
            //comprobamos que encontro un vehiculo con esa placa
            if(vehiculRespuesta.getPlaca() != ""){
                //System.out.println("encontro un vehiculo");
                
                placaa = vehiculRespuesta.getPlaca();
                
                //seteamos los campos a la interfaz 
                txtPlaca.setText(vehiculRespuesta.getPlaca());
                
                // seteamos la interfaz
                SimpleDateFormat formateador = new SimpleDateFormat("yyy-MM-dd HH:mm:ss");
                Date date = new Date();
                txtFecha2.setText(formateador.format(date));
                
                //traemos el Vehiculoticket para traer el id del ticket
                //System.out.println(CVehiculoTicket.getTicketIdByplaca("ABC-123"));
                
                //System.out.println("salida unica");
                //System.out.println(jerseyve.find(VehiculoTicket.class, "ABC-123").getTicket_id());
                
                //buscamos con el id del ticket y traemos la hora que entro el vehiculo
                //System.out.println("esta es la hora de entrada");
                //System.out.println(Cticket.findTicketById().getHora_entrada());
                //Cticket.findTicketById();
                
               /* SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
                String fechaComoCadena = sdf.format(Cticket.findTicketById().getHora_entrada());
                System.out.println(fechaComoCadena);*/
                
                
                //FORMATEAMOS LA FECHA PARA SETARLA AL CAMPO
                txtFecha1.setText("2020-06-18 08:18:09");
                
                //System.out.println(fecha_entrada.toString());
                        
            }else{
                //mostramos mensaje que no se encontro vehiculo
                Comunicacion.mensajeError("No se encontro el vehiculo","Vehiculo");
            }
            
            
        }
        
    }//GEN-LAST:event_btnBuscarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCerrar;
    private javax.swing.JButton btnSacar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblBuscar;
    private javax.swing.JLabel lblFecha1;
    private javax.swing.JLabel lblFecha2;
    private javax.swing.JLabel lblObservacion;
    private javax.swing.JLabel lblPlaca;
    private javax.swing.JPanel pnlNorte;
    private javax.swing.JRadioButton rbtnCodigo;
    private javax.swing.JRadioButton rbtnPlaca;
    private javax.swing.JTextField txtBuscar;
    private javax.swing.JTextField txtFecha1;
    private javax.swing.JTextField txtFecha2;
    private javax.swing.JTextField txtObservacion;
    private javax.swing.JTextField txtPlaca;
    // End of variables declaration//GEN-END:variables
}