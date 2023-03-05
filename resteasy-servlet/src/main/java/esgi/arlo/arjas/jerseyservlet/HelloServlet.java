package esgi.arlo.arjas.jerseyservlet;

import java.io.*;
import javax.inject.Inject;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

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
        printerPort.printString(response, message);
    }

    public void destroy() {
    }
}