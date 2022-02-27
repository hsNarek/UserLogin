package servlet;

import database.manager.UserManager;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/register")
public class UserRegistrationServlet extends HttpServlet {

    UserManager userManager = new UserManager();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.sendRedirect("register.jsp");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        userManager.addUser(req.getParameter("username"), req.getParameter("surname")
                , Integer.parseInt(req.getParameter("age")), req.getParameter("email"),
                req.getParameter("password"));
        req.setAttribute("username", req.getParameter("username"));
        req.getRequestDispatcher("home.jsp").forward(req, resp);


    }
}
