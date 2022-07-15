package model;

public class PartUsed implements Comparable<PartUsed> {
    private int partsUsedId;
    private int partId;
    private int serviceTicketId;
    private int numberUsed;
    private double price;

    public PartUsed(int partsUsedId, int partId, int serviceTicketId, int numberUsed, double price) {
        this.partsUsedId = partsUsedId;
        this.partId = partId;
        this.serviceTicketId = serviceTicketId;
        this.numberUsed = numberUsed;
        this.price = price;
    }

    public PartUsed(String text){
        String [] path =text.split(",");
        this.partsUsedId = Integer.parseInt(path[0]);
        this.partId = Integer.parseInt(path[1]);
        this.serviceTicketId = Integer.parseInt(path[2]);
        this.numberUsed = Integer.parseInt(path[3]);
        this.price = Double.parseDouble(path[4]);
    }


    public int getPartsUsedId() {
        return partsUsedId;
    }

    public void setPartsUsedId(int partsUsedId) {
        this.partsUsedId = partsUsedId;
    }

    public int getPartId() {
        return partId;
    }

    public void setPartId(int partId) {
        this.partId = partId;
    }

    public int getServiceTicketId() {
        return serviceTicketId;
    }

    public void setServiceTicketId(int serviceTicketId) {
        this.serviceTicketId = serviceTicketId;
    }

    public int getNumberUsed() {
        return numberUsed;
    }

    public void setNumberUsed(int numberUsed) {
        this.numberUsed = numberUsed;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }


    @Override
    public String toString() {
        String text = "Parts Used Id : " + this.partsUsedId + "\n";
        text += "Parts Id : " + this.partId + "\n";
        text += "ServiceTicketId : " + this.serviceTicketId + "\n";
        text += "Number Used : " + this.numberUsed + "\n";
        text += "Price :" + this.price + "\n";
        return text;
    }


    @Override
    public boolean equals(Object o) {
        PartUsed x = (PartUsed) o;
        return this.partsUsedId == x.getPartsUsedId();
    }

    @Override
    public int compareTo(PartUsed x) {
        if (this.partId > x.getPartId()) {
            return 1;
        } else if (this.partId < x.getPartId()) {
            return -1;
        } else {
            return 0;
        }
    }

}
