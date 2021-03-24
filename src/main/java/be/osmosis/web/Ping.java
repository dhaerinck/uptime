package be.osmosis.web;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("ping")
public class Ping{


    @GET
    public String message(){
        return "ping ping ping ping ping!!!!!";
    }


}