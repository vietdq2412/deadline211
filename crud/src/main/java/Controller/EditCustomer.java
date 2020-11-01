package Controller;

import Model.Customer;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "EditCustomer", urlPatterns = "/edit")
public class EditCustomer extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int ID = Integer.parseInt(request.getParameter("id"));
        String name = request.getParameter("name");
        String age = request.getParameter("age");


        Customer customer = new Customer(ID, name, Integer.parseInt(age));
        Manager.edit(customer);
        RequestDispatcher dispatcher = request.getRequestDispatcher("/updateData");
        dispatcher.forward(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int ID = Integer.parseInt(request.getParameter("id"));
        List<Customer> list = new ArrayList<>();
        list.add(Manager.getCustomerByID(ID));
        request.setAttribute("customerList", list);
        RequestDispatcher dispatcher = request.getRequestDispatcher("/editCustomer.jsp");
        dispatcher.forward(request, response);
    }
}
