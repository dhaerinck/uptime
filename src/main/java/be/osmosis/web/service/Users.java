/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package be.osmosis.web.service;

import be.osmosis.web.domain.User;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author diete
 */

@Path("users")
public class Users {
    
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public String getAdmin(){
        return new User("a101djkdfk", "dhaerinck@gmail.com", "Dieter", "Haerinck").toJson();
    }
    
}
