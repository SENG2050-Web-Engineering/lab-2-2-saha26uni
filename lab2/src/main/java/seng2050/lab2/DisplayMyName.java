package seng2050.lab2;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class DisplayMyName extends HttpServlet {
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) 
    throws IOException, ServletException {
        PrintWriter out = resp.getWriter();
        String firstName = req.getParameter("firstName");
        String lastName = req.getParameter("lastName");
        
        out.println(HtmlGen.Doctype());
        out.println(HtmlGen.head("Display My Name"));
        out.println(HtmlGen.h1("Hello "+firstName+" "+lastName+"!"));
        out.println(HtmlGen.p("Wait, this feels familiar..."));
        out.println(HtmlGen.end());
    }

    protected void doPost(HttpServletRequest req, HttpServletResponse resp) 
    throws IOException, ServletException {
        PrintWriter out = resp.getWriter();
        String firstName = req.getParameter("firstName");
        String lastName = req.getParameter("lastName");
        
        out.println(HtmlGen.Doctype());
        out.println(HtmlGen.head("Display My Name"));
        out.println(HtmlGen.h1("Hello "+firstName+" "+lastName+"!"));
        out.println(HtmlGen.p("Wait, this feels familiar..."));
        out.println(HtmlGen.p("...and wait!? How can I read this?"));
        out.println(HtmlGen.end());
    }
}
