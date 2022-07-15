package ControllerServiceMechanic;

import Exceptii.IdStatusException;
import controller.ControllerServiceMechanic;
import model.ServiceMechanic;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ControllerServiceMechanicTest {
    @Test
    public void afisareTest() {
        ControllerServiceMechanic controllerServiceMechanic = new ControllerServiceMechanic();
        controllerServiceMechanic.afisare();
    }

    @Test
    public void findByIdTest() {
        ControllerServiceMechanic controllerServiceMechanic = new ControllerServiceMechanic();
        assertEquals(5, controllerServiceMechanic.findById(1).getHours());
    }

    @Test
    public void addTest() throws IdStatusException {
        ControllerServiceMechanic controllerServiceMechanic = new ControllerServiceMechanic();
        controllerServiceMechanic.addServiceMechanic(new ServiceMechanic(10, 3, 2, 4, 10, "good", 6));
        assertEquals(6, controllerServiceMechanic.findById(10).getRate());
    }

    @Test
    public void add2Test() throws IdStatusException {
        ControllerServiceMechanic controllerServiceMechanic = new ControllerServiceMechanic();
        assertThrows(IdStatusException.class, () -> controllerServiceMechanic.addServiceMechanic(new ServiceMechanic(1, 3, 2, 4, 10, "good", 6)));
    }


    @Test
    public void eraseTest() throws  IdStatusException{
        ControllerServiceMechanic controllerServiceMechanic=new ControllerServiceMechanic();
        controllerServiceMechanic.eraseServiceMechanic(4);
        assertEquals(null,controllerServiceMechanic.findById(4));
    }

    @Test
    public void erase2Test() throws IdStatusException{
        ControllerServiceMechanic controllerServiceMechanic=new ControllerServiceMechanic();
        assertThrows(IdStatusException.class,()->controllerServiceMechanic.eraseServiceMechanic(100));
    }


    @Test
    public void updateTest()throws IdStatusException{
        ControllerServiceMechanic controllerServiceMechanic=new ControllerServiceMechanic();
        controllerServiceMechanic.updateServiceMechanic(1,100);
        assertEquals(100,controllerServiceMechanic.findById(1).getHours());
    }

    @Test
    public void update2Test()throws IdStatusException{
        ControllerServiceMechanic controllerServiceMechanic=new ControllerServiceMechanic();
        assertThrows(IdStatusException.class,()->controllerServiceMechanic.updateServiceMechanic(100,1001));
    }

}