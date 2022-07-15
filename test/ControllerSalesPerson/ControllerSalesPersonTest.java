package ControllerSalesPerson;

import Exceptii.IdStatusException;
import controller.ControllerSalesPerson;
import model.SalesPerson;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ControllerSalesPersonTest {
    @Test
    public void afisare(){
        ControllerSalesPerson controllerSalesPerson=new ControllerSalesPerson();
        controllerSalesPerson.afisare();
    }

    @Test
    public void findByIdTest(){
        ControllerSalesPerson controllerSalesPerson=new ControllerSalesPerson();
        assertEquals("Mike",controllerSalesPerson.findSalesPersonById(1).getLastName());
    }

    @Test
    public void addTest() throws IdStatusException {
        ControllerSalesPerson controllerSalesPerson=new ControllerSalesPerson();
        controllerSalesPerson.addSalesPerson(new SalesPerson(8,"Denis","Flore"));
        assertEquals("Denis",controllerSalesPerson.findSalesPersonById(8).getLastName());
    }

    @Test
    public void add2Test() throws IdStatusException{
        ControllerSalesPerson controllerSalesPerson=new ControllerSalesPerson();
        assertThrows(IdStatusException.class,()->controllerSalesPerson.addSalesPerson(new SalesPerson(1,"Flore","Denis")));
    }
   @Test
    public void eraseTest() throws  IdStatusException{
        ControllerSalesPerson controllerSalesPerson=new ControllerSalesPerson();
        controllerSalesPerson.eraseSalesPerson(1);
        assertEquals(null,controllerSalesPerson.findSalesPersonById(1));
   }

   @Test
    public void erase2Test()throws IdStatusException{
        ControllerSalesPerson controllerSalesPerson=new ControllerSalesPerson();
        assertThrows(IdStatusException.class,()->controllerSalesPerson.eraseSalesPerson(10));
   }

   @Test
    public void updateTest() throws IdStatusException{
        ControllerSalesPerson controllerSalesPerson=new ControllerSalesPerson();
        controllerSalesPerson.updateSalesPerson(1,"Ronaldo");
        assertEquals("Ronaldo",controllerSalesPerson.findSalesPersonById(1).getLastName());
   }

   @Test
    public void update2Test() throws IdStatusException{
        ControllerSalesPerson controllerSalesPerson=new ControllerSalesPerson();
        assertThrows(IdStatusException.class,()->controllerSalesPerson.updateSalesPerson(100,"Maria"));
   }

}