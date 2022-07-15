package controller;

import Exceptii.IdStatusException;
import model.Customer;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class ControllerCustomer {
    ArrayList<Customer> customers;

    public ControllerCustomer() {
        customers = new ArrayList<>();
        this.load();
    }

    public void load() {
        try {
            File f = new File("C:\\Users\\flore\\Desktop\\mycode\\carDealership\\src\\res\\customer");
            Scanner scanner = new Scanner(f);
            while (scanner.hasNextLine()) {
                String text = scanner.nextLine();
                Customer c = new Customer(text);
                this.customers.add(c);
            }


        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void afisare() {
        for (Customer x : customers) {
            System.out.println(x);
        }
    }

    public Customer findCustomerById(int id) {
        for (Customer c : customers) {
            if (c.getCustomerId() == id) {
                return c;
            }
        }
        return null;
    }

    public void addCustomer(Customer x) throws IdStatusException {
        Customer d = findCustomerById(x.getCustomerId());
        if (d == null) {
            this.customers.add(x);
        } else {
            throw new IdStatusException("This customers exist !");
        }
    }

    public void eraseCustomer(int id) throws IdStatusException {
        Customer c = findCustomerById(id);
        if (c != null) {
            this.customers.remove(c);
        } else {
            throw new IdStatusException("This customer doesn't exist !");
        }
    }

    public void updateCustomer(int id,String phoneNumber)throws IdStatusException{
        Customer x =findCustomerById(id);
        if(x!=null){
            x.setPhoneNumber(phoneNumber);
        }else {
            throw new IdStatusException("This customer doesn't exist!");
        }
    }

}
