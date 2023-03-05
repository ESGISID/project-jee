package esgi.arlo.arjas.jerseyservlet;

import esgi.arlo.arjas.jerseyservlet.entities.UsersService;

import java.io.*;
import javax.inject.Inject;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "helloServlet", value = "/hello-servlet")
public class HelloServlet extends HttpServlet {
    private String message;

    @Inject
    private PrinterPort printerPort;


    public void init() {
        message = "Hello World!";
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");
        UsersService service = new UsersService();
        service.saveUser();
        printerPort.printString(response, message);
    }

    public void destroy() {
    }
}