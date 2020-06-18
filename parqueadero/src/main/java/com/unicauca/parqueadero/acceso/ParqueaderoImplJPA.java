/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unicauca.parqueadero.acceso;

import com.unicauca.parqueadero.acceso.controladores.ParqueaderoJpaController;
import com.unicauca.parqueadero.acceso.entidades.Parqueadero;
import com.unicauca.parqueadero.acceso.entidades.Tarifa;
import java.util.ArrayList;
import java.util.List;



/**
 *
 * @author alvarodanieleraso
 */
public class ParqueaderoImplJPA implements IparqueaderoDAO{
    
    
    ParqueaderoJpaController cParqueadero = new ParqueaderoJpaController();
    
    static ArrayList<Parqueadero> listaparqueadero = new ArrayList();
    
    Parqueadero aux = new Parqueadero(); //objeto auxiliar parqueadero
    
    private List<Parqueadero> lista;
    
    
    public ParqueaderoImplJPA() {
        lista = new ArrayList(); 
    }
    

    @Override
    public List<Parqueadero> getParqueaderos() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Parqueadero getParqueaderoByid(int id) {
        
        Parqueadero Parqq = new Parqueadero();
        
        com.unicauca.parqueadero.acceso.entidades.Parqueadero objParqueadero = new com.unicauca.parqueadero.acceso.entidades.Parqueadero();
        
        objParqueadero = cParqueadero.findParqueadero(id);
        
        Parqq.setDireccion(objParqueadero.getDireccion());
        Parqq.setIdParqueadero(objParqueadero.getIdParqueadero());
        Parqq.setNombre(objParqueadero.getNombre());
        Parqq.setPuestosOcupados(objParqueadero.getPuestosOcupados());
        Parqq.setPuestosTotales(objParqueadero.getPuestosTotales());
        Parqq.setTelefonos(objParqueadero.getTelefonos());
        
        return Parqq;
        
    }
    
}
