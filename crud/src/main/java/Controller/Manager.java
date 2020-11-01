package Controller;

import Model.Customer;

import java.util.ArrayList;
import java.util.List;

public class Manager {
    private static List<Customer> customerList = new ArrayList<>();
    static int nextID = 0;

    public Manager() {
    }


    static {
        initData();
    }

    private static void initData() {
        add(new Customer(nextID,"viet", 19));
        add(new Customer(nextID,"thanh", 19));
        add(new Customer(nextID,"chi", 30));
        add(new Customer(nextID,"toan", 40));
        add(new Customer(nextID,"minh", 50));
        add(new Customer(nextID,"linh", 50));
    }

    public static void add(Customer customer) {
        System.out.println("add");
        customerList.add(customer);
        nextID++;
    }

    public static void edit(Customer customer) {
        for (int i = 0; i < customerList.size(); i++) {
            if (customerList.get(i).getID() == customer.getID()) {
                customerList.set(i, customer);
            }
        }
    }

    public static void delete(int ID) {
        for (int i = 0; i < customerList.size(); i++) {
            if (customerList.get(i).getID() == ID) {
                customerList.remove(customerList.get(i));
            }
        }
    }

    public static List<Customer> getCustomerList() {
        return customerList;
    }

    public static Customer getCustomerByID(int ID) {
        for (Customer temp : customerList) {
            if (temp.getID() == ID) {
                return temp;
            }
        }
        return null;
    }

}
