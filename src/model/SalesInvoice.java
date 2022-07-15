package model;

public class SalesInvoice implements Comparable<SalesInvoice> {
    private int invoiceId;
    private int invoiceNumber;
    private String date;
    private int carId;
    private int customerId;
    private int salePersonId;

    public SalesInvoice(int invoiceId, int invoiceNumber, String date, int carId, int customerId, int salePersonId) {
        this.invoiceId = invoiceId;
        this.invoiceNumber = invoiceNumber;
        this.date = date;
        this.carId = carId;
        this.customerId = customerId;
        this.salePersonId = salePersonId;
    }

    public SalesInvoice(String text) {


        String[] path = text.split(",");
        this.invoiceId = Integer.parseInt(path[0]);
        this.invoiceNumber = Integer.parseInt(path[1]);
        this.date = path[2];
        this.carId = Integer.parseInt(path[3]);
        this.customerId = Integer.parseInt(path[4]);
        this.salePersonId = Integer.parseInt(path[5]);
    }

    public int getInvoiceId() {
        return invoiceId;
    }

    public void setInvoiceId(int invoiceId) {
        this.invoiceId = invoiceId;
    }

    public int getInvoiceNumber() {
        return invoiceNumber;
    }

    public void setInvoiceNumber(int invoiceNumber) {
        this.invoiceNumber = invoiceNumber;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
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

    public int getSalePersonId() {
        return salePersonId;
    }

    public void setSalePersonId(int salePersonId) {
        this.salePersonId = salePersonId;
    }

    @Override
    public String toString() {
        String text = "Invoice Id : " + this.invoiceId + "\n";
        text += "Invoice Number : " + this.invoiceNumber + "\n";
        text += "Date : " + this.date + "\n";
        text += "Car Id :" + this.carId + "\n";
        text += "Customer Id : " + this.customerId + "\n";
        text += "Sales Person Id :" + this.salePersonId + "\n";
        return text;
    }


    @Override
    public boolean equals(Object o) {
        return this.invoiceId == ((SalesInvoice) o).getInvoiceId();
    }

    @Override
    public int compareTo(SalesInvoice o) {
        if (this.invoiceNumber > o.getInvoiceNumber()) {
            return 1;
        } else if (this.invoiceNumber < o.getInvoiceNumber()) {
            return -1;
        } else {
            return 0;
        }
    }
}
