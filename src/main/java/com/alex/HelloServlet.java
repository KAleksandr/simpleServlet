package com.alex;

import com.alex.connection.MyServlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class HelloServlet extends HttpServlet {
  @Override
  protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    PrintWriter writer = resp.getWriter();
    writer.write("<h1>Hello JAVA</h1>");
    writer.write("<h2>My first deploy</h2>");
    writer.write("<form action=\"myservlet\">\n" +
            "            <input type=\"submit\" value=\"Create table 'example' in your database\"/>\n" +
            "        </form>");
  }
  MyServlet myServlet = new MyServlet();

}
