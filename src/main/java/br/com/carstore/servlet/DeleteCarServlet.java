package br.com.carstore.servlet;

import br.com.carstore.dao.CarDao;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/delete-car")
public class DeleteCarServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {

        String carId = request.getParameter("id");

        new CarDao().deleteCarById(carId);

        response.sendRedirect("/find-all-cars");

    }

}
