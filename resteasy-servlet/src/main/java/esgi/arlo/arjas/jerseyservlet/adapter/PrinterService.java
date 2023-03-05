package esgi.arlo.arjas.jerseyservlet.adapter;

import esgi.arlo.arjas.jerseyservlet.PrinterPort;

import javax.enterprise.context.RequestScoped;
import javax.enterprise.inject.Default;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@Default
@RequestScoped
public class PrinterService implements PrinterPort {

    @Override
    public void printString(HttpServletResponse response, String messageToDisplay) throws IOException {
        PrintWriter out = response.getWriter();
        out.println(messageToDisplay);

    }
}
