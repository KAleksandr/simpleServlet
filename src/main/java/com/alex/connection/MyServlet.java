package com.alex.connection;



import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(
        name = "MySQLDbServlet",
        urlPatterns = {"/mysqldbbservlet"}
)
public class MyServlet extends HttpServlet {
  public MyServlet() {
  }

  protected void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    response.setContentType("text/html;charset=UTF-8");
    PrintWriter out = response.getWriter();

    try {
      out.println("<html>");
      out.println("<head>");
      out.println("<title>Servlet MySQLDbServlet</title>");
      out.println("</head>");
      out.println("<body>");
      out.println("<h1>Ok, check the DB</h1>");
      out.println("</body>");
      out.println("</html>");
    } finally {
      out.close();
    }

    DbManager var4 = new DbManager();
    var4.runSqlStatement();
  }

  protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    this.processRequest(request, response);
  }

  protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    this.processRequest(request, response);
  }

  public String getServletInfo() {
    return "Short description";
  }
}