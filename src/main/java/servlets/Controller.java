package servlets;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;

public class Controller extends HttpServlet {

    private HashMap<String, String> map;

    public Controller() {
        map = new HashMap<>();
    }

    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        if (request.getParameter("addPageButton") != null) {
            response.sendRedirect("add.jsp");
        }
        else if (request.getParameter("findPageButton") != null) {
            response.sendRedirect("find.jsp");
        }
        else if (request.getParameter("backButton") != null) {
            response.sendRedirect("index.jsp");
        }
        else if (request.getParameter("addButton") != null) {
            String key = request.getParameter("key");
            String value = request.getParameter("value");
            map.put(key, value);
            response.sendRedirect("add.jsp");
        }
        else if (request.getParameter("findButton") != null) {
            String key = request.getParameter("key");
            String value = map.get(key);
            RequestDispatcher requestDispatcher = request.getRequestDispatcher("find.jsp");
            request.setAttribute("value", value);
            requestDispatcher.forward(request, response);
        }
    }
}
