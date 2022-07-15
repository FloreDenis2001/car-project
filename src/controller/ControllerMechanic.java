package controller;

import Exceptii.IdStatusException;
import model.Mechanic;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class ControllerMechanic {
    private ArrayList<Mechanic> mechanics;

    public ControllerMechanic() {
        mechanics = new ArrayList<>();
        this.load();
    }

    public void load() {
        try {
            File f = new File("C:\\Users\\flore\\Desktop\\mycode\\carDealership\\src\\res\\mechanic");
            Scanner scanner = new Scanner(f);
            while (scanner.hasNextLine()) {
                this.mechanics.add(new Mechanic(scanner.nextLine()));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void afisare() {
        for (Mechanic x : mechanics) {
            System.out.println(x);
        }
    }

    public Mechanic findById(int id) {
        for (Mechanic c : mechanics) {
            if (c.getId() == id) {
                return c;
            }
        }
        return null;
    }

    public void addMechanic(Mechanic x) throws IdStatusException{
        Mechanic t = findById(x.getId());
        if (t == null) {
            this.mechanics.add(x);
        } else {
            throw new IdStatusException("This Mechanic exist!");
        }
    }

    public void eraaseMechanic(int id) throws IdStatusException {
        Mechanic t = findById(id);
        if (t != null) {
            this.mechanics.remove(t);
        } else {
            throw new IdStatusException("This Mechanic doesn't exist!");
        }
    }

    public void updateMechanic(int id,String firstName) throws IdStatusException {
        Mechanic t = findById(id);
        if (t != null) {
            t.setFirstName(firstName);
        } else {
            throw new IdStatusException("This Mechanic doesn't exist!");
        }
    }


}
