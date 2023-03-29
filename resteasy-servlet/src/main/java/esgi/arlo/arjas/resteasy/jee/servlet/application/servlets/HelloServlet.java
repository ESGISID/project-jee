package esgi.arlo.arjas.resteasy.jee.servlet.application.servlets;

import esgi.arlo.arjas.resteasy.jee.servlet.domain.ports.in.PrinterPort;
import esgi.arlo.arjas.resteasy.jee.servlet.domain.ports.out.UsersPersistencePort;
import esgi.arlo.arjas.resteasy.jee.servlet.persistence.adaters.UsersPersistenceService;

import java.io.*;
import javax.annotation.security.PermitAll;
import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "helloServlet", value = "/hello-servlet")
public class HelloServlet extends HttpServlet {
    private String message;

    private final PrinterPort printerPort;

    private final UsersPersistencePort usersPersistenceService;

    @Inject
    public HelloServlet(PrinterPort printerPort, UsersPersistencePort usersPersistenceService) {
        this.printerPort = printerPort;
        this.usersPersistenceService = usersPersistenceService;

    }


    public void init() {
        message = "Hello World!";
    }

    @PermitAll
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        if(usersPersistenceService.getAllUsers().size() == 0){
            usersPersistenceService.saveUser("Armand Dailly","monmot2pass", 100, "A code");
            usersPersistenceService.saveUser("Sid Bee","monmot2pass", 420, "Ashe addict");
            usersPersistenceService.saveUser("Arnaud Jourdain","monmot2pass", 300, "Cuda sensei");
            usersPersistenceService.saveUser("Denis Turbiez","monmot2pass", 1, "Fils du C");
            usersPersistenceService.saveUser("Enzo Soares","monmot2pass", 105, "React afficionado");

        }
        request.setAttribute("message", message);
        request.getRequestDispatcher("/index.jsp").forward(request,response);
    }

    public void destroy() {
    }
}