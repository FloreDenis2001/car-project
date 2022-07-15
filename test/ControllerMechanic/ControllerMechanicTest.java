package ControllerMechanic;

import Exceptii.IdStatusException;
import controller.ControllerMechanic;
import model.Mechanic;
import org.junit.jupiter.api.Test;

import java.util.concurrent.Callable;

import static org.junit.jupiter.api.Assertions.*;

class ControllerMechanicTest {
    @Test
    public void afisare() {
        ControllerMechanic controllerMechanic = new ControllerMechanic();
        controllerMechanic.afisare();
    }

    @Test
    public void findById() {
        ControllerMechanic controllerMechanic = new ControllerMechanic();
        assertEquals("Alex", controllerMechanic.findById(1).getFirstName());
    }

    @Test
    public void addTest() throws IdStatusException {
        ControllerMechanic controllerMechanic = new ControllerMechanic();
        controllerMechanic.addMechanic(new Mechanic(7, "Flore", "Denis"));
        assertEquals("Flore", controllerMechanic.findById(7).getLastName());
    }

    @Test
    public void add2Test() throws IdStatusException {
        ControllerMechanic controllerMechanic = new ControllerMechanic();
        assertThrows(IdStatusException.class, () -> controllerMechanic.addMechanic(new Mechanic(1, "Flore", "Denis")));
    }

    @Test
    public void eraseTest() throws IdStatusException {
        ControllerMechanic controllerMechanic = new ControllerMechanic();
        controllerMechanic.eraaseMechanic(1);
        assertEquals(null, controllerMechanic.findById(1));
    }

    @Test
    public void erase2Test() throws IdStatusException {
        ControllerMechanic controllerMechanic = new ControllerMechanic();
        assertThrows(IdStatusException.class, () -> controllerMechanic.eraaseMechanic(100));
    }

    @Test
    public void updateTest() throws IdStatusException {
        ControllerMechanic controllerMechanic = new ControllerMechanic();
        controllerMechanic.updateMechanic(1,"Gratian");
        assertEquals("Gratian", controllerMechanic.findById(1).getFirstName());
    }

    @Test
    public void update2Test() throws IdStatusException {
        ControllerMechanic controllerMechanic = new ControllerMechanic();
        assertThrows(IdStatusException.class, () -> controllerMechanic.updateMechanic(100,"Ionela"));
    }

}
