/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unicauca.parqueadero.service;

import com.unicauca.parqueadero.acceso.entidades.Parqueadero;
import com.unicauca.parqueadero.negocio.GestorParqueadero;
import com.unicauca.parqueadero.negocio.GestorTarifa;
import javax.ejb.Stateless;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author alvarodanieleraso
 */
@Stateless 
@Path("parqueaderos")
public class parqueaderoREST {
    
    private GestorParqueadero parqueaderoDB;
    
    public parqueaderoREST() {
        parqueaderoDB = new GestorParqueadero();
    }
    
    @GET
    @Path("{id}")
    @Produces({MediaType.APPLICATION_JSON})
    public Parqueadero find(@PathParam("id") int id) {
        return parqueaderoDB.findParqueaderoByid(id);
    }
    
    
    
    
}
