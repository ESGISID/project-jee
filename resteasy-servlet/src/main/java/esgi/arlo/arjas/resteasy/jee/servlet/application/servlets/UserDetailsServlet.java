package esgi.arlo.arjas.resteasy.jee.servlet.application.servlets;

import esgi.arlo.arjas.resteasy.jee.servlet.domain.pojos.Users;
import esgi.arlo.arjas.resteasy.jee.servlet.persistence.adaters.UsersPersistenceService;

import javax.inject.Inject;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.logging.Level;

@WebServlet(name = "userDetailsServlet", value = "/user-details-servlet")
public class UserDetailsServlet extends HttpServlet {

    @Inject
    private UsersPersistenceService usersPersistenceService;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println(request.getParameter("username"));
        final Users userDetails = usersPersistenceService.findUser(request.getParameter("username"));
        request.setAttribute("foundUser", userDetails);
        request.getRequestDispatcher("/UserDetails.jsp").forward(request,response);
    }

    @Override
    protected void doPut(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
