package ControllerCarTest;

import Exceptii.IdStatusException;
import controller.ControllerCar;
import model.Car;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ControllerCarTest {
    @Test
    public void afisareTest() {
        ControllerCar car = new ControllerCar();
        car.afisare();
    }

    @Test
    public void findTest() {
        ControllerCar controllerCar = new ControllerCar();
        assertEquals("SM 88 KAR", controllerCar.findCarById(1).getSerialNumber());
    }

    @Test
    public void addTest() throws IdStatusException {
        ControllerCar controllerCar = new ControllerCar();
        controllerCar.addCar(new Car(8, "B 10 TEST", "Skoda", "Octavia", "rosu", 2009, "true"));
        assertEquals("B 10 TEST", controllerCar.findCarById(8).getSerialNumber());
    }

    @Test
    public void add2Test() throws IdStatusException {
        ControllerCar controllerCar = new ControllerCar();
        assertThrows(IdStatusException.class, () -> controllerCar.addCar(new Car(1, "B 10 TEST", "Skoda", "Octavia", "rosu", 2009, "true")));
    }

    @Test
    public void eraseTest() throws IdStatusException{
        ControllerCar controllerCar=new ControllerCar();
        controllerCar.eraseCar(1);
        assertEquals(null,controllerCar.findCarById(1));
    }

    @Test
    public void erase2Test()throws IdStatusException{
        ControllerCar controllerCar=new ControllerCar();
        assertThrows(IdStatusException.class,()->controllerCar.eraseCar(10));
    }

    @Test
    public void updateTest() throws IdStatusException{
        ControllerCar controllerCar=new ControllerCar();
        controllerCar.updateCar(1,"gold");
        assertEquals("gold",controllerCar.findCarById(1).getColour());
    }

    @Test
    public void update2Test() throws  IdStatusException{
        ControllerCar controllerCar=new ControllerCar();
        assertThrows(IdStatusException.class,()->controllerCar.updateCar(19,"verde"));
    }

}