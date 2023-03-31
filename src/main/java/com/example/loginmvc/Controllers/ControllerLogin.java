package com.example.loginmvc.Controllers;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;
import com.example.loginmvc.Models.Login;

@WebServlet(name = "ControllerLogin", value = "/ControllerLogin")
public class ControllerLogin extends HttpServlet {
    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String login = request.getParameter("login");
        String senha = request.getParameter("senha");

        Login loginObj = new Login();

        boolean valida = loginObj.AutenticarLogin(login, senha);

        String res = " ";

        if (valida){
            response.sendRedirect("home.jsp");
        }else {
            res = "Login invalido";
            response.sendRedirect("index.jsp?resultado="+res);
        }

    }
}
