package com.xworkz.servlet;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = "/actor", loadOnStartup = 1)
public class ActorServlet extends GenericServlet {

    public ActorServlet() {
        System.out.println("ActorServlet created by Tomcat");
    }

    @Override
    public void service(ServletRequest req, ServletResponse resp) throws ServletException, IOException {


        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();


        String name = req.getParameter("name");
        String lang = req.getParameter("lang");
        String salary = req.getParameter("salary");
        String blockbusters = req.getParameter("blockbusters");
        String flops = req.getParameter("flops");
        String upcomingMovie = req.getParameter("upcomingMovie");
        String producer = req.getParameter("producer");
        String director = req.getParameter("director");
        String budget = req.getParameter("budget");


        out.println("<html>");
        out.println("<head><title>Actor Info</title></head>");
        out.println("<body>");
        out.println("<h2 style='color:green;'>✅ Actor data submitted successfully!</h2>");
        out.println("<h3>Actor Details:</h3>");
        out.println("<ul>");
        out.println("<li><strong>Name:</strong> " + name + "</li>");
        out.println("<li><strong>Language:</strong> " + lang + "</li>");
        out.println("<li><strong>Salary:</strong> " + salary + "</li>");
        out.println("<li><strong>Blockbusters:</strong> " + blockbusters + "</li>");
        out.println("<li><strong>Flops:</strong> " + flops + "</li>");
        out.println("<li><strong>Upcoming Movie:</strong> " + upcomingMovie + "</li>");
        out.println("<li><strong>Producer:</strong> " + producer + "</li>");
        out.println("<li><strong>Director:</strong> " + director + "</li>");
        out.println("<li><strong>Budget:</strong> " + budget + "</li>");
        out.println("</ul>");
        out.println("<br><a href='index.html'>🔙 Back to Home</a>");
        out.println("</body>");
        out.println("</html>");
    }
}
