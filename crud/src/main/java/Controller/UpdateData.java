package Controller;

import Model.Customer;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "Servlet2", urlPatterns = "/updateData")
public class UpdateData extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Customer> list = Manager.getCustomerList();
        request.setAttribute("customerList",list);
        destroy();
        RequestDispatcher dispatcher = request.getRequestDispatcher("showCustomerList.jsp");
        dispatcher.forward(request,response);
    }
}
