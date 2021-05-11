package com.demo.servlet;

import com.demo.dao.PhoneDao;
import com.demo.entity.PhoneEntity;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

@WebServlet(name = "AddPhoneServlet",urlPatterns = "/addphone")
public class AddPhoneServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            addPhone(request,response);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("addphones.jsp").forward(request, response);
    }

    private void addPhone(HttpServletRequest request, HttpServletResponse response) throws SQLException, IOException {

        PhoneDao dao = new PhoneDao();
        String name = request.getParameter("name");
        String brand = request.getParameter("brand");
        int price = Integer.parseInt(request.getParameter("price"));
        String description = request.getParameter("description");

        PhoneEntity phones = new PhoneEntity(name,brand,price,description);
        dao.insertProduct(phones);
        response.sendRedirect("listphone");
    }
}
