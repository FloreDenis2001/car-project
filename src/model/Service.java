package model;

public class Service implements Comparable<Service> {
    private int serviceId;
    private String serviceName;
    private int hourlyRate;

    public Service(int serviceId, String serviceName, int hourlyRate) {
        this.serviceId = serviceId;
        this.serviceName = serviceName;
        this.hourlyRate = hourlyRate;
    }

    public Service(String text) {
        String[] path = text.split(",");
        this.serviceId = Integer.parseInt(path[0]);
        this.serviceName = path[1];
        this.hourlyRate = Integer.parseInt(path[2]);
    }

    public int getServiceId() {
        return serviceId;
    }

    public void setServiceId(int serviceId) {
        this.serviceId = serviceId;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public int getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(int hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    @Override
    public String toString() {
        String text = "Service Id: " + this.serviceId + "\n";
        text += "Service Name : " + this.serviceName + "\n";
        text += "Hourly Rate : " + this.hourlyRate + "\n";
        return text;
    }

    @Override
    public boolean equals(Object o) {
        Service x = (Service) o;
        return this.serviceId == x.getServiceId();
    }


    @Override
    public int compareTo(Service o) {
        if (this.serviceId > o.getServiceId()) {
            return 1;
        } else if (this.serviceId < o.getServiceId()) {
            return -1;
        } else {
            return 0;
        }
    }
}
