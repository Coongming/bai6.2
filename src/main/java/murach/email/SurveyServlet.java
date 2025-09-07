package murach.email;

import java.io.IOException;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import murach.business.User;

@WebServlet("/survey")
public class SurveyServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        String email      = req.getParameter("email");
        String firstName  = req.getParameter("firstName");
        String lastName   = req.getParameter("lastName");
        String heardFrom  = req.getParameter("heardFrom");
        // checkbox: null = không tick
        String updates    = (req.getParameter("updates") != null) ? "Yes" : "No";
        String contactVia = req.getParameter("contactVia");

        User user = new User(email, firstName, lastName, heardFrom, updates, contactVia);
        req.setAttribute("user", user);

        getServletContext().getRequestDispatcher("/survey.jsp").forward(req, resp);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        // Cho phép test nhanh bằng GET nếu cần
        doPost(req, resp);
    }
}
