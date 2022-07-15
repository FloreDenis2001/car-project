package controller;

import Exceptii.IdStatusException;
import model.ServiceTicket;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class ControllerServiceTicket {
    private ArrayList<ServiceTicket> serviceTickets;

    public ControllerServiceTicket() {
        serviceTickets = new ArrayList<>();
        this.load();
    }

    public void load() {
        try {
            File f = new File("C:\\Users\\flore\\Desktop\\mycode\\carDealership\\src\\res\\serviceticket");
            Scanner scanner = new Scanner(f);
            while (scanner.hasNextLine()) {
                String t = scanner.nextLine();
                this.serviceTickets.add(new ServiceTicket(t));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void afisare() {
        for (ServiceTicket x : serviceTickets) {
            System.out.println(x);
        }
    }

    public ServiceTicket findServiceTicketById(int id) {
        for (ServiceTicket x : serviceTickets) {
            if (x.getServiceTicketId() == id) {
                return x;
            }
        }
        return null;
    }

    public void addServiceTicket(ServiceTicket t) throws IdStatusException {
        ServiceTicket p = findServiceTicketById(t.getServiceTicketId());
        if (p == null) {
            this.serviceTickets.add(t);
        } else {
            throw new IdStatusException("This service ticket exist!");
        }
    }

    public void eraseServiceTicket(int id) throws IdStatusException {
        ServiceTicket x = findServiceTicketById(id);
        if (x != null) {
            this.serviceTickets.remove(x);
        } else {
            throw new IdStatusException("This service ticket doesn't exist !");
        }
    }

    public void updateServiceTicketNumber(int id, int newservicenumber) throws IdStatusException {
        ServiceTicket x = findServiceTicketById(id);
        if (x != null) {
            x.setServiceTicketNumber(newservicenumber);
        } else {
            throw new IdStatusException("This service ticket doesn't exist! ");
        }
    }

}
