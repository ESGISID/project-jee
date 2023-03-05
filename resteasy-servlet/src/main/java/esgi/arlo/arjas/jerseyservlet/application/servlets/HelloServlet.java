package esgi.arlo.arjas.jerseyservlet.application.servlets;

import esgi.arlo.arjas.jerseyservlet.domain.ports.in.PrinterPort;
import esgi.arlo.arjas.jerseyservlet.domain.ports.out.UsersPersistencePort;

import java.io.*;
import javax.annotation.security.PermitAll;
import javax.inject.Inject;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "helloServlet", value = "/hello-servlet")
public class HelloServlet extends HttpServlet {
    private String message;

    @Inject
    private PrinterPort printerPort;
    
    @Inject
    private UsersPersistencePort usersPersistencePort;


    public void init() {
        message = "Hello World!";
    }

    @PermitAll
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");
        usersPersistencePort.saveUser("Armand","Jonathan");
        printerPort.printString(response, message);
    }

    public void destroy() {
    }
}