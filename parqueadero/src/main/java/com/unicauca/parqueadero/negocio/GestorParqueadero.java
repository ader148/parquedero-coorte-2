/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unicauca.parqueadero.negocio;

import com.unicauca.parqueadero.acceso.IparqueaderoDAO;
import com.unicauca.parqueadero.acceso.ParqueaderoImplJPA;


/**
 *
 * @author alvarodanieleraso
 */
public class GestorParqueadero {
    
    IparqueaderoDAO parqueaderos;
    
    public GestorParqueadero() {
        parqueaderos = new ParqueaderoImplJPA();
    }
    
    public com.unicauca.parqueadero.acceso.entidades.Parqueadero findParqueaderoByid(int id){
        return parqueaderos.getParqueaderoByid(id);
    }
    
}
