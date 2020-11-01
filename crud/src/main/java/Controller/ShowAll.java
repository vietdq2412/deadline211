package Controller;

import Controller.Manager;
import Model.Customer;

import javax.servlet.RequestDispatcher;
import java.io.IOException;
import java.util.List;

@javax.servlet.annotation.WebServlet(name = "Controller.Servlet", urlPatterns = "/showCustomerList")
public class ShowAll extends javax.servlet.http.HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
       List<Customer> customerList = Manager.getCustomerList();

        System.out.println(customerList.get(customerList.size()-1).getName());

       request.setAttribute("customerList", customerList);
        RequestDispatcher dispatcher = request.getRequestDispatcher("showCustomerList.jsp");
        dispatcher.forward(request,response);
    }
}
