package main.servlet;

import main.entity.customer;
import main.impl.UserImpl;
import main.service.UserService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by ZhangHao on 2018/8/13.
 */
    @WebServlet("/UserServlet")
    public class UserServlet extends javax.servlet.http.HttpServlet {
        private static final long serialVersionUID = 1L;

        protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
            String username = request.getParameter("username");
            //String operate = request.getParameter("operate");
            response.setContentType("text/html;charset=UTF-8");
            UserService user = new UserImpl();
            if (!"".equals(username)){
                customer customer = user.login(username);
                if (null!=customer){
                    request.setAttribute("username",customer.getFirst_name());
                    request.getRequestDispatcher("/FilmServlet").forward(request,response);
                }else{
                    response.sendRedirect("index.jsp");
                }
            }else{
                response.sendRedirect("index.jsp");
            }

        }


    }
