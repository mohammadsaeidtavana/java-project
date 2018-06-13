package webserv;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

/**
 *
 */
@Path("/home")
public class services {
    @GET
    @Produces("text/plain")
    @Path("/shows")
    public String show()
    {
        return "hello servlet with restfull";

    }
}
