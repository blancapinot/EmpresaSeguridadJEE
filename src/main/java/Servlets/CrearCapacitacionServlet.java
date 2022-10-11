package Servlets;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;

@WebServlet(name = "CrearCapacitacion", value = "/crear-capacitacion")
public class CrearCapacitacionServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        if(session.getAttribute("usuario") == null){
            getServletContext().getRequestDispatcher("/views/login.jsp").forward(request, response);
        } else {
            getServletContext().getRequestDispatcher("/views/crearCapacitacion.jsp").forward(request, response);
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String usuario = request.getParameter("usuario");
        String password = request.getParameter("password");

        if (usuario.equalsIgnoreCase("admin") && password.equalsIgnoreCase("1234")) {
            HttpSession session = request.getSession();
            session.setAttribute("usuario", usuario);
            session.setAttribute("password", password);
            getServletContext().getRequestDispatcher("/views/crearCapacitacion.jsp").forward(request, response);
        } else {
            getServletContext().getRequestDispatcher("/views/login.jsp").forward(request, response);
        }
    }
}
