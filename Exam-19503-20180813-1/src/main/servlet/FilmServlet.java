package main.servlet;

import main.entity.film;
import main.impl.FilmImpl;
import main.service.FilmService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.List;

/**
 * Created by ZhangHao on 2018/8/13.
 */
@WebServlet("/FilmServlet")
public class FilmServlet extends javax.servlet.http.HttpServlet {
    private static final long serialVersionUID = 1L;
    public void doPost(HttpServletRequest request, HttpServletResponse response)throws ServletException,IOException{
        FilmService fs = new FilmImpl();
        response.setContentType("text/html;charset=UTF-8");
        List<film> films = fs.showFilm();
       // HttpSession session = request.getSession();
       // session.setAttribute("filmList",films);
        //response.sendRedirect("film.jsp");
        request.setAttribute("filmList",films);
        request.getRequestDispatcher("/film.jsp").forward(request,response);

    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doGet(req, resp);
        doPost(req,resp);
    }
}
