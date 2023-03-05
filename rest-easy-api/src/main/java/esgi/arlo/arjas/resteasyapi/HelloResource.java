package esgi.arlo.arjas.resteasyapi;

import esgi.arlo.arjas.resteasyapi.ports.HelloPort;

import javax.annotation.PostConstruct;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

@Path("/hello-world")
public class HelloResource {

    private static final Logger LOGGER = Logger.getLogger(HelloResource.class.getName());

    @Inject
    private HelloPort helloPort;


    @GET
    @Produces
    public Response hello() {
        LOGGER.log(Level.INFO,"Saying hello to the world");
        return Response.ok(helloPort.sayHello(), MediaType.TEXT_PLAIN_TYPE  ).build();
    }
}