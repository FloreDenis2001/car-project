package controller;

import Exceptii.IdStatusException;
import model.Service;
import model.ServiceMechanic;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class ControllerServiceMechanic {
    ArrayList<ServiceMechanic> serviceMechanics;

    public ControllerServiceMechanic() {
        serviceMechanics = new ArrayList<>();
        this.load();
    }

    public void load() {
        try {
            File f = new File("C:\\Users\\flore\\Desktop\\mycode\\carDealership\\src\\res\\serviceMechanic");
            Scanner scanner = new Scanner(f);
            while (scanner.hasNextLine()) {
                this.serviceMechanics.add(new ServiceMechanic(scanner.nextLine()));
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    public void afisare() {
        for (ServiceMechanic x : serviceMechanics) {
            System.out.println(x);
        }
    }


    public ServiceMechanic findById(int id) {
        for (ServiceMechanic x : serviceMechanics) {
            if (x.getServiceMechanicId() == id) {
                return x;
            }
        }
        return null;
    }

    public void addServiceMechanic(ServiceMechanic x) throws IdStatusException {
        ServiceMechanic t = findById(x.getServiceMechanicId());
        if (t == null) {
            this.serviceMechanics.add(x);
        } else {
            throw new IdStatusException("This Service Machanic exist!");
        }
    }

    public void eraseServiceMechanic(int id) throws IdStatusException {
        ServiceMechanic t = findById(id);
        if (t != null) {
            this.serviceMechanics.remove(t);
        } else {
            throw new IdStatusException("This Service Machanic doesn't exist!");
        }

    }

    public void updateServiceMechanic(int id, int hours) throws IdStatusException {
        ServiceMechanic t = findById(id);
        if (t != null) {
            t.setHours(hours);
        } else {
            throw new IdStatusException("This Service Machanic doesn't exist!");
        }

    }
}
