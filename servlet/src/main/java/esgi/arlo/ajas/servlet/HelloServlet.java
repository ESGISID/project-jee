package esgi.arlo.ajas.servlet;

import java.io.*;

import esgi.arlo.ajas.servlet.ports.PrinterPort;
import jakarta.inject.Inject;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet(name = "helloServlet", value = "/hello-servlet")
public class HelloServlet extends HttpServlet {

    private String message;
    private final PrinterPort printerPort;

    @Inject
    public HelloServlet(PrinterPort printerPort) {
        this.printerPort = printerPort;
    }

    public void init() {
        message = "Hello World!";
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");
        printerPort.printResponse(response, message);
    }

    public void destroy() {
    }
}