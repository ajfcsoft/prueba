/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.prueba.dos;

import com.prueba.model.Respuesta;
import com.prueba.model.Validar;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Produces;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.ws.rs.core.MediaType;

/**
 * REST Web Service
 *
 * @author Antonio
 */
@Path("twostring")
public class TwostringResource {

    @Context
    private UriInfo context;

    /**
     * Creates a new instance of TwostringResource
     */
    public TwostringResource() {
    }

    /**
     * Retrieves representation of an instance of com.prueba.dos.TwostringResource
     * @return an instance of java.lang.String
     */
    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Respuesta getJson(Validar v) { 
        return twostring(v.getS1(), v.getS2());
    }

    public Respuesta twostring(String s1, String s2){
        char letra; int i, j;
        for(i=0; i<s1.length();i++){
            letra = s1.charAt(i);
            for(j=0; j<s2.length(); j++){
                if(letra==s2.charAt(j))
                    return new  Respuesta(true);
            }
        }
        return new Respuesta(false);
    }
}
