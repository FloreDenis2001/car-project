package ControllerServiceTicketTest;

import Exceptii.IdStatusException;
import controller.ControllerServiceTicket;
import model.ServiceTicket;
import org.junit.jupiter.api.Test;

import javax.naming.directory.InvalidAttributeIdentifierException;

import static org.junit.jupiter.api.Assertions.*;

class ControllerServiceTicketTest {
    @Test
    public void afisareTest() {
        ControllerServiceTicket controllerServiceTicket = new ControllerServiceTicket();
        controllerServiceTicket.afisare();
    }

    @Test
    public void findTest(){
        ControllerServiceTicket controllerServiceTicket=new ControllerServiceTicket();
        assertEquals(4,controllerServiceTicket.findServiceTicketById(1).getCustomerId());
    }

    @Test
    public void addTest() throws IdStatusException {
        ControllerServiceTicket controllerServiceTicket=new ControllerServiceTicket();
        controllerServiceTicket.addServiceTicket(new ServiceTicket(8,1000,3,4,"19/01/2022","the best","21/05/2022"));
        assertEquals(1000,controllerServiceTicket.findServiceTicketById(8).getServiceTicketNumber());
    }

    @Test
    public void add2Test() throws IdStatusException{
        ControllerServiceTicket controllerServiceTicket=new ControllerServiceTicket();
        assertThrows(IdStatusException.class,()->   controllerServiceTicket.addServiceTicket(new ServiceTicket(1,1000,3,4,"19/01/2022","the best","21/05/2022")));
    }

    @Test
    public void eraseTest() throws IdStatusException{
        ControllerServiceTicket controllerServiceTicket=new ControllerServiceTicket();
        controllerServiceTicket.eraseServiceTicket(1);
        assertEquals(null,controllerServiceTicket.findServiceTicketById(1));
    }

    @Test
    public void erase2Test() throws IdStatusException{
        ControllerServiceTicket controllerServiceTicket=new ControllerServiceTicket();
        assertThrows(IdStatusException.class,()->controllerServiceTicket.eraseServiceTicket(10));
    }

    @Test
    public void updateTest() throws IdStatusException{
        ControllerServiceTicket controllerServiceTicket=new ControllerServiceTicket();
        controllerServiceTicket.updateServiceTicketNumber(1,221);
        assertEquals(221,controllerServiceTicket.findServiceTicketById(1).getServiceTicketNumber());
    }

    @Test
    public void update2Test() throws IdStatusException{
        ControllerServiceTicket controllerServiceTicket=new ControllerServiceTicket();
        assertThrows(IdStatusException.class,()->controllerServiceTicket.updateServiceTicketNumber(10,4821));
    }
}