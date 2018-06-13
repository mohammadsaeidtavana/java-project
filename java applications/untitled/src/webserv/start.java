package webserv;

import com.sun.jersey.core.header.MediaTypes;
import org.codehaus.jettison.json.JSONException;
import org.codehaus.jettison.json.JSONObject;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

/**
 * Created by saeedtavana on 5/28/17.
 */
@Path("/home")
public class start {
    @GET
    @Produces("text/plain")
    @Path("/shows")
    public String show()
    {
        return "hello world";
    }
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/show")
    public person show(@QueryParam("age") int age,@QueryParam("name")  String name)
    {
        person person= new person();
        person.setAge(age);
        person.setName(name);
        return person;

    }

}
