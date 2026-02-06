package seng2050.lab2;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class generateValidHtml extends HttpServlet {
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
    throws ServletException, IOException {
        PrintWriter out = resp.getWriter();

        out.println("<!DOCTYPE html>");
        out.println("<html lang='en'>");
        out.println("<head>");
        out.println("\t<title> Valid HTML </title>");
        out.println("\t<meta charset='UTF-8'>");
        out.println("</head>");
        out.println("<body>");
        out.println("\t<h1>Valid HTML!</h1>");
        out.println("\t<p>This html page is valid, how awesome?");
        out.println("</body>");
        out.println("</html>");
    }
}
