/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author parth
 */
public class Configuration extends HttpServlet {

        @Override
        protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //Servlet Context example
        ServletContext ctx=getSevletContext();
        String a=ctx.getInitParameter("FilePath");
        String b=ctx.getInitParameter("MoviesPath");
        response.getWriter().print(a+b);
        ctx.setAttribute("username","hello");
        }

    private ServletContext getSevletContext() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}