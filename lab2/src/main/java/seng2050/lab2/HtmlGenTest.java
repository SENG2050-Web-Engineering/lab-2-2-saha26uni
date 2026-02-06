package seng2050.lab2;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class HtmlGenTest extends HttpServlet {
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) 
    throws IOException, ServletException {
        PrintWriter out = resp.getWriter();

        out.println(HtmlGen.Doctype());
        out.println(HtmlGen.head("HtmlGen Test"));
        out.println(HtmlGen.h1("HtmlGen Test"));
        out.println(HtmlGen.p("This page was generated using the HtmlGen class methods!"));
        out.println(HtmlGen.end());
    }
}
