package Servlets;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;

@WebServlet(name = "LoginServlet", value = "/login")
public class LoginServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
            getServletContext().getRequestDispatcher("/views/login.jsp").forward(request, response);

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //doGet(request, response);
        String usuario = request.getParameter("usuario");
        String password = request.getParameter("password");

        if (usuario.equalsIgnoreCase("admin") && password.equalsIgnoreCase("1234")) {
            HttpSession session = request.getSession();
            session.setAttribute("usuario", usuario);
            session.setAttribute("password", password);
            getServletContext().getRequestDispatcher("/views/contacto.jsp").forward(request, response);
        } else {
            getServletContext().getRequestDispatcher("/views/login.jsp").forward(request, response);
        }
    }
}
