package hellos;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.*;
import javax.servlet.*;

public class HelloServlet extends HttpServlet {

    /**
     * Handles GET requests.
     *
     * @param request the HTTP request.
     * @param response the HTTP response.
     * @throws IOException in case an I/O occurs.
     */
     String name;
     public void init (ServletConfig config) throws ServletException {
       this.name = config.getInitParameter("name");
     }


    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        try (final PrintWriter out = response.getWriter()) {
            out.println("Hello world " + this.name);
        }
    }
}
