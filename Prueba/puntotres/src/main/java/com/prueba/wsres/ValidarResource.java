/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.prueba.wsres;

import com.prueba.model.Ordena;
import com.prueba.model.Respuesta;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Produces;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;

/**
 * REST Web Service
 *
 * @author Antonio
 */
@Path("validar")
public class ValidarResource {

    @Context
    private UriInfo context;

    /**
     * Creates a new instance of ValidarResource
     */
    public ValidarResource() {
    }

    /**
     * Retrieves representation of an instance of com.prueba.wsres.ValidarResource
     * @return an instance of java.lang.String
     */
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Respuesta getJson(Ordena ordenar) {      
       return new Respuesta(ordenar.ordenar());
    }
}
