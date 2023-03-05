package esgi.arlo.arjas.jerseyservlet.application.servlets;

import esgi.arlo.arjas.jerseyservlet.domain.ports.in.PrinterPort;
import esgi.arlo.arjas.jerseyservlet.domain.ports.out.UsersPersistencePort;
import esgi.arlo.arjas.jerseyservlet.persistence.entities.UsersPersistenceService;

import java.io.*;
import javax.annotation.security.PermitAll;
import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "helloServlet", value = "/hello-servlet")
public class HelloServlet extends HttpServlet {
    private String message;

    @Inject
    private PrinterPort printerPort;
    
    @Inject
    private UsersPersistenceService usersPersistenceService;


    public void init() {
        message = "Hello World!";
    }

    @PermitAll
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        response.setContentType("text/html");
        usersPersistenceService.saveUser("Armand","Jonathan");
        usersPersistenceService.saveUser("Sidbee","Sidbee");
        response.sendRedirect(request.getContextPath() + "/index.jsp");
    }

    public void destroy() {
    }
}