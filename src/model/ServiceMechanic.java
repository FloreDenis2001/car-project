package model;

public class ServiceMechanic implements Comparable<ServiceMechanic> {
    private int serviceMechanicId;
    private int serviceTicketId;
    private int serviceId;
    private int mechanicId;
    private int hours;
    private String comment;
    private int rate;

    public ServiceMechanic(int serviceMechanicId, int serviceTicketId, int serviceId, int mechanicId, int hours, String comment, int rate) {
        this.serviceMechanicId = serviceMechanicId;
        this.serviceTicketId = serviceTicketId;
        this.serviceId = serviceId;
        this.mechanicId = mechanicId;
        this.hours = hours;
        this.comment = comment;
        this.rate = rate;
    }

    public ServiceMechanic(String text) {
        String[] path = text.split(",");
        this.serviceMechanicId = Integer.parseInt(path[0]);
        this.serviceTicketId = Integer.parseInt(path[1]);
        this.serviceId = Integer.parseInt(path[2]);
        this.mechanicId = Integer.parseInt(path[3]);
        this.hours = Integer.parseInt(path[4]);
        this.comment = path[5];
        this.rate = Integer.parseInt(path[6]);
    }

    public int getServiceMechanicId() {
        return serviceMechanicId;
    }

    public void setServiceMechanicId(int serviceMechanicId) {
        this.serviceMechanicId = serviceMechanicId;
    }

    public int getServiceTicketId() {
        return serviceTicketId;
    }

    public void setServiceTicketId(int serviceTicketId) {
        this.serviceTicketId = serviceTicketId;
    }

    public int getServiceId() {
        return serviceId;
    }

    public void setServiceId(int serviceId) {
        this.serviceId = serviceId;
    }

    public int getMechanicId() {
        return mechanicId;
    }

    public void setMechanicId(int mechanicId) {
        this.mechanicId = mechanicId;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public int getRate() {
        return rate;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }


    @Override
    public String toString() {
        String text = "Service Mechanic Id : " + this.serviceMechanicId + "\n";
        text += "Service Ticket Id : " + this.serviceTicketId + "\n";
        text += "Service Id : " + this.serviceId + "\n";
        text += "Mechanic Id : " + this.mechanicId + "\n";
        text += "Hours : " + this.hours + "\n";
        text += "Comment : " + this.comment + "\n";
        text += "Rate : " + this.rate + "\n";
        return text;
    }


    @Override
    public boolean equals(Object o) {
        return this.serviceMechanicId == ((ServiceMechanic) o).getServiceMechanicId();
    }


    @Override
    public int compareTo(ServiceMechanic o) {
        if(this.serviceMechanicId>o.getServiceMechanicId()){
            return 1;
        }else if (this.serviceMechanicId<o.getServiceMechanicId()){
            return -1;
        }else {
            return 0;
        }
    }
}
