/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unicauca.parqueadero.presentacion;

import com.unicauca.parqeuadero.transversal.CodigoBarras;
import com.unicauca.parqeuadero.transversal.Comunicacion;
import com.unicauca.parqeuadero.transversal.Utilitarios;
import com.unicauca.parqueadero.cliente.TicketController;
import com.unicauca.parqueadero.cliente.TipoVehiculoController;
import com.unicauca.parqueadero.cliente.VehiculoController;
import com.unicauca.parqueadero.cliente.VehiculoTicketController;
import java.awt.Color;
import java.awt.Desktop;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author danie
 */
public class GUIEntrada extends javax.swing.JInternalFrame {

    
    VehiculoController vehiculoC = new VehiculoController();
    
    TipoVehiculoController tipoVehiculoC = new TipoVehiculoController();
    
    TicketController TicketC = new TicketController();
    
    Utilitarios objUtilitario = new Utilitarios();
    
    VehiculoTicketController CobjTickVeh = new VehiculoTicketController();
    
    
    /**
     * Creates new form GUIEntrada
     */
    public GUIEntrada() {
        initComponents();
        inicializarFecha();
        getTiposvehiculos();
        
        txtCascos.setEditable(true);
        txtCascos.setBackground(Color.lightGray);

        
      
        //tipoVehiculoC.getTipoVehiculo();
        
        //ocultamos el campo para los cascos
        //lblCascos.setVisible(false);
        //txtCascos.setVisible(false);
                
        cboTipo.addActionListener(cboTipo);
        
        cboTipo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //elementoCambiado();
                //System.out.println("cambiado");
                //int selecciondado = cboTipo.getSelectedIndex();
                
                String value = cboTipo.getSelectedItem().toString();
                
                System.out.println(value);
                
                if(value == "moto" || value == "Moto" || value == "MOTO"){
                    txtCascos.setEditable(true);
                    txtCascos.setBackground(Color.white);
                }else{
                   txtCascos.setEditable(false);
                   txtCascos.setBackground(Color.lightGray);
                }
            }
        });
    }

    
    
    
    private void getTiposvehiculos(){
        //limpiamos el combo
        cboTipo.removeAllItems();
        
        //agregamos opcion por defecto
        cboTipo.addItem("Selecciona un tipo de vehiculo");
        //agregamos los elementos
        cboTipo.addItem("Carro");
        cboTipo.addItem("Moto");
        
        //llamamos a tipo vehiculo para cargar en la lista 
        //tipoVehiculoC.getTipoVehiculo();
    }
    
    private void inicializarFecha() {
        Date fecha = Utilitarios.sumarHorasAFecha(new Date(), 0);
        String strFecha = Utilitarios.formatoFechaHora(fecha);
        txtFecha.setText(strFecha);
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnVehiculo = new javax.swing.JButton();
        btnCerrar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        lblPlaca = new javax.swing.JLabel();
        txtPlaca = new javax.swing.JTextField();
        lblTipo = new javax.swing.JLabel();
        cboTipo = new javax.swing.JComboBox<>();
        lblNombre = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        lblFecha = new javax.swing.JLabel();
        txtFecha = new javax.swing.JTextField();
        lblCascos = new javax.swing.JLabel();
        txtCascos = new javax.swing.JTextField();
        lblObservacion = new javax.swing.JLabel();
        txtObservacion = new javax.swing.JTextField();
        lblExplicacion = new javax.swing.JLabel();

        setClosable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Entrada de Vehículos");

        btnVehiculo.setText("Ingresar Vehículo");
        btnVehiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVehiculoActionPerformed(evt);
            }
        });
        jPanel1.add(btnVehiculo);

        btnCerrar.setText("Cerrar");
        btnCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarActionPerformed(evt);
            }
        });
        jPanel1.add(btnCerrar);

        getContentPane().add(jPanel1, java.awt.BorderLayout.PAGE_END);

        jPanel2.setLayout(new java.awt.GridLayout(6, 2));

        lblPlaca.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblPlaca.setText("Placa: ");
        jPanel2.add(lblPlaca);

        txtPlaca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPlacaActionPerformed(evt);
            }
        });
        jPanel2.add(txtPlaca);

        lblTipo.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblTipo.setText("Tipo de Vehículo: ");
        jPanel2.add(lblTipo);

        cboTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel2.add(cboTipo);

        lblNombre.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblNombre.setText("Nombres y Apellidos (opcional): ");
        jPanel2.add(lblNombre);
        jPanel2.add(txtNombre);

        lblFecha.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblFecha.setText("Fecha y Hora Entrada: ");
        jPanel2.add(lblFecha);
        jPanel2.add(txtFecha);

        lblCascos.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblCascos.setText("Cantidad de cascos: ");
        jPanel2.add(lblCascos);
        jPanel2.add(txtCascos);

        lblObservacion.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblObservacion.setText("Observación (opcional): ");
        jPanel2.add(lblObservacion);
        jPanel2.add(txtObservacion);

        getContentPane().add(jPanel2, java.awt.BorderLayout.CENTER);

        lblExplicacion.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        lblExplicacion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblExplicacion.setText("Llene todos los campos que no digan opcional para hacer el ingreso del vehículo ");
        getContentPane().add(lblExplicacion, java.awt.BorderLayout.PAGE_START);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btnCerrarActionPerformed

    private void btnVehiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVehiculoActionPerformed
        
        //bandera que controla el envio de la informacion al servidor
        int errores = 0;
        
        
        String placa = txtPlaca.getText();
        String valueTipoVehiculo = cboTipo.getSelectedItem().toString();
        String nombreClient = txtNombre.getText();
        String fechayhoraEntrada = txtFecha.getText();
        String cantidadcascos =txtCascos.getText();
        String Observacion = txtObservacion.getText();
        
        
        String fechaFinal="";
       
        int tipoVehiculo = 0;
        
        if(valueTipoVehiculo=="Carro" || valueTipoVehiculo=="carro" || valueTipoVehiculo=="CARRO" ){
            tipoVehiculo = 1;
        }else{
            tipoVehiculo = 2;
        }
        
        //validamos que la placa y el tipo de vehiculo no esten vacios
        
        
        if(cboTipo.getSelectedIndex() == 0 ){
             Comunicacion.mensajeError("Se debe seleccionar un tipo de vehiculo","Vehiculo");
             errores = 1;
        }
        
        
        if(txtPlaca.getText().length()==0){
            Comunicacion.mensajeError("Se debe ingresar una placa","Vehiculo");
            errores = 1;
        }
        
        
        boolean VALIDARplac = validarPlaca(placa.replaceAll("-", ""));
        
        if(VALIDARplac == false){
            Comunicacion.mensajeError("Se debe ingresar una placa valida","Vehiculo");
            errores = 1;
        }
        
        
        if(errores == 0){
            try {
                //llamada al metodo de crear vehiculo
                if(vehiculoC.crearVehiculo(placa, "null", tipoVehiculo, "null", "null")){
                    Comunicacion.mensajeExito("Vehiculo registrado exitosamente","Vehiculo");
                }else{
                    Comunicacion.mensajeError("Error al registrar el vehiculo","Vehiculo");
                }
                
                
                //cremamos el codigo del ticket
                Integer codigoTicket = objUtilitario.generarcodigoTicket();
                
                System.out.println("codigo antes de enviarlo");
                System.out.println(codigoTicket);
                
                try {
                    
                    final String OLD_FORMAT = "dd-MM-yyyy hh:mm a";
                    final String NEW_FORMAT = "yyy-MM-dd HH:mm:ss";
                    
                    
                    String oldDateString = fechayhoraEntrada;
                    String newDateString;
                    
                    SimpleDateFormat sdf = new SimpleDateFormat(OLD_FORMAT);
                    Date d = sdf.parse(oldDateString);
                    sdf.applyPattern(NEW_FORMAT);
                    newDateString = sdf.format(d);
                    
                    //System.out.println("esta es la fecha para crear el ticket xxxxxxxxx");
                    //System.out.println(newDateString);
                    
                    //CONVERTIMOS A FECHA Y SE LA PASAMOS PARA CREAL EL TICKET
                    //Date dateFinal=new SimpleDateFormat("yyy-MM-dd HH:mm:ss").parse(newDateString);
                    fechaFinal=newDateString;
                    
                    
                    
                    
                } catch (ParseException e) {
                    e.printStackTrace();
                }
                
                
                
                //seteamos la fecha de salida 
                String horaSalida = "0000-00-00 00:00:00";
                
                
                //nuevo 
                //creamos el ticket del vehiculo junto con su codigo
                //utilizamos el objeto de ticket controller para crear el ticket
                Integer resTicket = TicketC.crearTicket(codigoTicket, fechaFinal, horaSalida);
                
                
                //finalmente creamos el codigo de barras
                CodigoBarras objCod = new CodigoBarras();
                objCod.crearPDF(placa,codigoTicket.toString());
                
                
                //abrimos el archivo pdf creado
                
                Desktop.getDesktop().open(new File("barras.pdf"));
                
                //finalmente creamos la relacion entre el ticket y el vehiculo 
                CobjTickVeh.crearTicketVehiculo(placa,resTicket);
                
                //fin nuevo 
                
            } catch (IOException ex) {
                 Logger.getLogger(GUIEntrada.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }else{
             //Comunicacion.mensajeError("Error al registrar el vehiculo","Vehiculo");
        }
        
    }//GEN-LAST:event_btnVehiculoActionPerformed

    
    
    public boolean validarPlaca(String placa){
        //Matcher m = Pattern.compile("[a-zA-Z]{3}[0-9]{3}|[a-zA-Z]{3}[0-9]{2}[a-zA-Z]").matcher(placa);
        Matcher m = Pattern.compile("[a-zA-Z]{3}[0-9]{3}").matcher(placa);
        if (m.find()) {
            System.out.println(placa + " is a valid number plate");
            return true;
        } else {
            System.out.println(placa + " is not a valid number plate");
            return false;
        }
    }
    
    
    private void txtPlacaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPlacaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPlacaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCerrar;
    private javax.swing.JButton btnVehiculo;
    private javax.swing.JComboBox<String> cboTipo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblCascos;
    private javax.swing.JLabel lblExplicacion;
    private javax.swing.JLabel lblFecha;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblObservacion;
    private javax.swing.JLabel lblPlaca;
    private javax.swing.JLabel lblTipo;
    private javax.swing.JTextField txtCascos;
    private javax.swing.JTextField txtFecha;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtObservacion;
    private javax.swing.JTextField txtPlaca;
    // End of variables declaration//GEN-END:variables
}
