package servlet;


import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.Game;

import java.io.IOException;

@WebServlet (urlPatterns = "/chifoumi")
public class GameServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        RequestDispatcher requestDispatcher = req.getRequestDispatcher("/WEB-INF/play.jsp");
        requestDispatcher.forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String serverChoice = Game.ChoiceIntToString(Game.RandomNumber());
        String playerChoice = req.getParameter("choice");
        String msg = Game.results(serverChoice, playerChoice);

        req.setAttribute("result", msg);
        req.setAttribute("serverChoice", serverChoice);
        req.setAttribute("playerChoice", playerChoice);

        RequestDispatcher requestDispatcher = req.getRequestDispatcher("/WEB-INF/display.jsp");
        requestDispatcher.forward(req, resp);

    }
}
