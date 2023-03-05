package esgi.arlo.ajas.servlet.ports;

import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

public interface PrinterPort {

    void printResponse(HttpServletResponse response, String toDisplay) throws IOException;
}
