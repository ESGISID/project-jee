package esgi.arlo.arjas.jerseyservlet;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public interface PrinterPort {

    void printString(HttpServletResponse response, String toDisplay) throws IOException;
}
