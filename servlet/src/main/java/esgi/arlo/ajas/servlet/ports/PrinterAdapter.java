package esgi.arlo.ajas.servlet.ports;

import jakarta.enterprise.context.RequestScoped;
import jakarta.enterprise.inject.Default;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@Default
@RequestScoped
public class PrinterAdapter implements PrinterPort{
    @Override
    public void printResponse(HttpServletResponse response, String toDisplay) throws IOException {
        // Hello
        PrintWriter out = response.getWriter();
            out.println("<html><body>");
            out.println("<h1>" + toDisplay + "</h1>");
            out.println("</body></html>");
    }
}
