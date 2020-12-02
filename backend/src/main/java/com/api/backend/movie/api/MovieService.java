
package com.api.backend.movie.api;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author edwin
 */
@Path("/movie")
@Consumes(MediaType.APPLICATION_XML)
@Produces(MediaType.APPLICATION_XML)
public class MovieService {
    
    @GET
    @Path("/hello")
    public String hello() {
        return "Hello World !";
    }
}
