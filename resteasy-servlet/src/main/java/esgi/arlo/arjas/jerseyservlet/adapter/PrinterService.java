package esgi.arlo.arjas.jerseyservlet.adapter;

import esgi.arlo.arjas.jerseyservlet.PrinterPort;
import esgi.arlo.arjas.jerseyservlet.qualifiers.H2DataSource;

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
        out.println(H2DataSource.getVersion());

    }
}
