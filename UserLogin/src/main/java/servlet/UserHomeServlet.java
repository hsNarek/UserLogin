package servlet;

import database.manager.UserManager;
import database.model.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/home")
public class UserHomeServlet extends HttpServlet {
    UserManager userManager = new UserManager();

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        User user = userManager.getByEmailAndPassword(req.getParameter("email"), req.getParameter("password"));
        if (user.getId() == 0) {

            resp.sendRedirect("userDoesNotExist.jsp");
        } else {

            req.setAttribute("username", user.getName());
            req.setAttribute("surname", user.getSurname());
            req.setAttribute("age", user.getAge());
            req.setAttribute("email", user.getEmail());
            req.getRequestDispatcher("home.jsp").forward(req, resp);
        }


    }
}
