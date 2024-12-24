package com.example.servlet;
import com.example.dao.PlayerDAO;
import com.example.model.Player;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

public class PlayerServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        PlayerDAO dao = new PlayerDAO();
        try {
            List<Player> players = dao.getAllPlayers();
            request.setAttribute("players", players);
            RequestDispatcher dispatcher = request.getRequestDispatcher("index.jsp");
            dispatcher.forward(request, response);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
