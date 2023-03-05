package esgi.arlo.arjas.jerseyservlet.application.servlets;


import esgi.arlo.arjas.jerseyservlet.domain.ports.in.PrinterPort;
import esgi.arlo.arjas.jerseyservlet.persistence.adaters.UsersPersistenceService;

import java.io.*;
import javax.annotation.security.PermitAll;
import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "searchServlet", value = "/search-servlet")
public class SearchServlet extends HttpServlet {
    private String username;

    @Inject
    private PrinterPort printerPort;

    @Inject
    private UsersPersistenceService usersPersistenceService;


    public void init() {
    }

    @PermitAll
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        System.out.println(request.getParameter("username"));
        request.setAttribute("foundUsers", usersPersistenceService.getAllUsers());
        request.getRequestDispatcher("/ListUsers.jsp").forward(request,response);

    }

    public void destroy() {
    }
}
