package controller;

import Exceptii.IdStatusException;
import model.Car;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class ControllerCar {
    ArrayList<Car> cars;

    public ControllerCar() {
        cars = new ArrayList<>();
        this.load();
    }

    public void load() {
        try {
            File f = new File("C:\\Users\\flore\\Desktop\\mycode\\carDealership\\src\\res\\car");
            Scanner scanner = new Scanner(f);
            while (scanner.hasNextLine()) {
                String t = scanner.nextLine();
                this.cars.add(new Car(t));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void afisare() {
        for (Car x : cars) {
            System.out.println(x);
        }
    }

    public Car findCarById(int id) {
        for (Car x : cars) {
            if (x.getCarId() == id) {
                return x;
            }
        }
        return null;
    }


    public void addCar(Car x) throws IdStatusException {
        Car f = findCarById(x.getCarId());
        if (f == null) {
            this.cars.add(x);
        } else {
            throw new IdStatusException("This car exist!");
        }
    }


    public void eraseCar(int id) throws IdStatusException {
        Car p = findCarById(id);
        if (p != null) {
            this.cars.remove(p);
        } else {
            throw new IdStatusException("This car doesn't exist!");
        }
    }

    public void updateCar(int id, String newcolour) throws IdStatusException {
        Car x = findCarById(id);
        if (x != null) {
            x.setColour(newcolour);
        } else {
            throw new IdStatusException("This car doesn't exist");
        }
    }
}
