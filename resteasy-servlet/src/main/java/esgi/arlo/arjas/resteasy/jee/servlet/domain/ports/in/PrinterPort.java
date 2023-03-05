package esgi.arlo.arjas.resteasy.jee.servlet.domain.ports.in;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public interface PrinterPort {

    void printString(HttpServletResponse response, String toDisplay) throws IOException;
}
