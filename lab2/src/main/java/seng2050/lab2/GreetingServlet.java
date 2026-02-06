package seng2050.lab2;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class GreetingServlet extends HttpServlet {
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
    throws IOException, ServletException {
        String firstName = req.getParameter("firstName");
        String lastName = req.getParameter("lastName");

        PrintWriter out = resp.getWriter();

        out.println("<!DOCTYPE html>");
        out.println("<html lang='en'>");
        out.println("<head>");
        out.println("\t<title>Greeting</title>");
        out.println("\t<meta charset='UTF-8'>");
        out.println("</head>");
        out.println("<body>");
        out.println("\t<h1>Greetings, "+firstName+" "+lastName+"</h1>");
        out.println("\t<p>...if that is your real name");
        out.println("</body>");
        out.println("</html>");
    }
}
