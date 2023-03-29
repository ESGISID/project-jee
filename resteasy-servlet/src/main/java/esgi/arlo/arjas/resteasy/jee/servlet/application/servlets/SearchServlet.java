package esgi.arlo.arjas.resteasy.jee.servlet.application.servlets;


import esgi.arlo.arjas.resteasy.jee.servlet.domain.pojos.Users;
import esgi.arlo.arjas.resteasy.jee.servlet.domain.ports.in.PrinterPort;
import esgi.arlo.arjas.resteasy.jee.servlet.persistence.adaters.UsersPersistenceService;

import java.io.*;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.security.PermitAll;
import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "searchServlet", value = "/search-servlet")
public class SearchServlet extends HttpServlet {

    private static final Logger LOGGER = Logger.getLogger(SearchServlet.class.getName());

    @Inject
    private UsersPersistenceService usersPersistenceService;

    public void init() {
    }

    @PermitAll
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        List<Users> found = usersPersistenceService.getAllUsers();
        request.setAttribute("foundUsers", found);
        LOGGER.log(Level.INFO, "Found user {0}", found);
        request.getRequestDispatcher("/ListUsers.jsp").forward(request,response);

    }

    public void destroy() {
    }
}
