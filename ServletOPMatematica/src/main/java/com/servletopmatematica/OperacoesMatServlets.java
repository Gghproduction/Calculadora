package com.servletopmatematica;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import java.io.*;

import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet(name= "OperacoesMatServlets", value= "/Operacoes-matematicas")
public class OperacoesMatServlets extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        String num1str = req.getParameter("num1");
        String num2str = req.getParameter("num2");

        Double num1 = Double.parseDouble(num1str);
        Double num2 = Double.parseDouble(num1str);

        double soma = num1 + num2;
        double subtracao = num1 - num2;
        double multiplicacao = num1 * num2;
        double divisao = num1 / num2;
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();
        out.println("<html>");
        out.println("<body>");
        out.println("<h1>Operações Matematicas</h1>");
        out.println("<h2>Soma</h2>");
        out.println("<p>"+ num1 + " + " +num2+" = "+soma+"</p>");
        out.println("<h2>Subtração</h2>");
        out.println("<p>"+num1+" * "+num2+" = "+subtracao+"</p>");
        out.println("<h2>Subtração</h2>");
        out.println("<p>"+num1+" - "+num2+" = "+subtracao+"</p>");
        out.println("<h2>Multiplicação</h2>");
        out.println("<p>"+num1+" * "+num2+" = "+multiplicacao+"</p>");
        out.println("<h2>Divisão</h2>");
        out.println("<p>"+num1+" / "+num2+" = "+divisao+"</p>");
    }
}
