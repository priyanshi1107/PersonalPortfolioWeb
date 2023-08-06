/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.useservlet;

/**
 *
 * @author Neet
 */
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "Servlet", urlPatterns = {"/Servlet"})
public class Servlet extends HttpServlet {

    private static final long serialVersionUID = 1L;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String yourName = "Prishi";
        System.out.println("dynamic val"+ yourName);

        request.setAttribute("name", yourName);

        request.getRequestDispatcher("/home.jsp").forward(request, response);
//        response.sendRedirect("/home.jsp");
    }

//    private String getDynamicValue() {
//       
//        return "Prishi";
//    }
}
