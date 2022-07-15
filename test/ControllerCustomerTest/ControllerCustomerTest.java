package ControllerCustomerTest;

import Exceptii.IdStatusException;
import controller.ControllerCustomer;
import model.Customer;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class ControllerCustomerTest {

    @Test
    public void afisareTest() {
        ControllerCustomer controllerCustomer = new ControllerCustomer();
        controllerCustomer.afisare();
    }

    @Test
    public void findById() {
        ControllerCustomer controllerCustomer = new ControllerCustomer();
        assertEquals("Tocaci", controllerCustomer.findCustomerById(1).getLastname());
    }

    @Test
    public void addCustomer() throws IdStatusException {
        ControllerCustomer controllerCustomer = new ControllerCustomer();
        controllerCustomer.addCustomer(new Customer(7, "Pop", "Cosmin", "0759001826", "Porumbeilor", "Constanta", "Costinesti", "Romania", "95771"));
        assertEquals("Pop", controllerCustomer.findCustomerById(7).getLastname());
    }

    @Test
    public void addCustomer2() throws IdStatusException {
        ControllerCustomer controllerCustomer = new ControllerCustomer();
        assertThrows(IdStatusException.class, () -> controllerCustomer.addCustomer(new Customer(3, "Pop", "Cosmin", "0759001826", "Porumbeilor", "Constanta", "Costinesti", "Romania", "95771")));
    }

    @Test
    public void eraseCustomer() throws IdStatusException{
        ControllerCustomer controllerCustomer=new ControllerCustomer();
        controllerCustomer.eraseCustomer(1);
        assertEquals(null,controllerCustomer.findCustomerById(1));
    }

    @Test
    public void eraseCustomer2() throws IdStatusException{
        ControllerCustomer controllerCustomer=new ControllerCustomer();
        assertThrows(IdStatusException.class,()-> controllerCustomer.eraseCustomer(51));
    }

    @Test
    public void updateCustomer()throws  IdStatusException{
        ControllerCustomer controllerCustomer=new ControllerCustomer();
        controllerCustomer.updateCustomer(1,"112");
        assertEquals("112",controllerCustomer.findCustomerById(1).getPhoneNumber());
    }

    @Test
    public void updateCustomer2() throws IdStatusException{
        ControllerCustomer controllerCustomer=new ControllerCustomer();
assertThrows(IdStatusException.class,()-> controllerCustomer.updateCustomer(10,"112"));
    }
}