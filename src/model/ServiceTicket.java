package model;

public class ServiceTicket {
    private int serviceTicketId;
    private int serviceTicketNumber;
    private int carId;
    private int customerId;
    private String dataReceived;
    private String comments;
    private String dataReturn;


    public ServiceTicket(int serviceTicketId, int serviceTicketNumber, int carId, int customerId, String dataReceived, String comments, String dataReturn) {
        this.serviceTicketId = serviceTicketId;
        this.serviceTicketNumber = serviceTicketNumber;
        this.carId = carId;
        this.customerId = customerId;
        this.dataReceived = dataReceived;
        this.comments = comments;
        this.dataReturn = dataReturn;
    }

    public ServiceTicket(String text) {
        String[] path = text.split(",");
        this.serviceTicketId = Integer.parseInt(path[0]);
        this.serviceTicketNumber = Integer.parseInt(path[1]);
        this.carId = Integer.parseInt(path[2]);
        this.customerId = Integer.parseInt(path[3]);
        this.dataReceived = path[4];
        this.comments = path[5];
        this.dataReturn = path[6];
    }

    public String getDataReturn() {
        return dataReturn;
    }

    public void setDataReturn(String dataReturn) {
        this.dataReturn = dataReturn;
    }

    public int getServiceTicketId() {
        return serviceTicketId;
    }

    public void setServiceTicketId(int serviceTicketId) {
        this.serviceTicketId = serviceTicketId;
    }

    public int getServiceTicketNumber() {
        return serviceTicketNumber;
    }

    public void setServiceTicketNumber(int serviceTicketNumber) {
        this.serviceTicketNumber = serviceTicketNumber;
    }

    public int getCarId() {
        return carId;
    }

    public void setCarId(int carId) {
        this.carId = carId;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getDataReceived() {
        return dataReceived;
    }

    public void setDataReceived(String dataReceived) {
        this.dataReceived = dataReceived;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }


    @Override
    public String toString() {
        String text = "Service Ticket Id : " + this.serviceTicketId + "\n";
        text += "Service Number :" + this.serviceTicketNumber + "\n";
        text += "Car Id : " + this.carId + "\n";
        text += "Customer Id : " + this.customerId + "\n";
        text += "Data Received : " + this.dataReceived + "\n";
        text += "Comments : " + this.comments + "\n";
        text += "Data Returned : " + this.dataReturn + "\n";
        return text;
    }
}
