package model;

public class Car implements Comparable<Car> {
    private int carId;
    private String serialNumber;
    private String make;
    private String model;
    private String colour;
    private int year;
    private String statusSale;

    public Car(int carId, String serialNumber, String make, String model, String colour, int year, String statusSale) {
        this.carId = carId;
        this.serialNumber = serialNumber;
        this.make = make;
        this.model = model;
        this.colour = colour;
        this.year = year;
        this.statusSale = statusSale;
    }

    public Car(String text) {
        String[] path = text.split(",");
        this.carId = Integer.parseInt(path[0]);
        this.serialNumber = path[1];
        this.make = path[2];
        this.model = path[3];
        this.colour = path[4];
        this.year = Integer.parseInt(path[5]);
        this.statusSale = path[6];
    }

    public int getCarId() {
        return carId;
    }

    public void setCarId(int carId) {
        this.carId = carId;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getStatusSale() {
        return statusSale;
    }

    public void setStatusSale(String statusSale) {
        this.statusSale = statusSale;
    }

    @Override
    public String toString() {
        String text = "Car Id : " + this.carId + "\n";
        text += "Serial Number : " + this.serialNumber + "\n";
        text += "Make : " + this.make + "\n";
        text += "Model : " + this.model + "\n";
        text += "Colour : " + this.colour + "\n";
        text += "Year : " + this.year + "\n";
        text += "Car for Sale Y or N : " + this.statusSale + "\n";

        return text;
    }

    @Override
    public boolean equals(Object o) {
        Car x = (Car) o;
        return this.carId == x.getCarId();
    }

    @Override
    public int compareTo(Car o) {
        if (this.year > o.getYear()) {
            return 1;
        } else if (this.year < o.getYear()) {
            return -1;
        } else {
            return 0;
        }
    }
}
