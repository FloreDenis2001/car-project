package model;

public class Parts implements Comparable<Parts> {
    private int partId;
    private int partNumber;
    private String description;
    private Double purchasePrice;
    private Double retailPrice;

    public Parts(int partId, int partNumber, String description, Double purchasePrice, Double retailPrice) {
        this.partId = partId;
        this.partNumber = partNumber;
        this.description = description;
        this.purchasePrice = purchasePrice;
        this.retailPrice = retailPrice;
    }

    public Parts(String text) {
        String[] path = text.split(",");
        this.partId = Integer.parseInt(path[0]);
        this.partNumber = Integer.parseInt(path[1]);
        this.description = path[2];
        this.purchasePrice = Double.parseDouble(path[3]);
        this.retailPrice = Double.parseDouble(path[4]);
    }

    public int getPartId() {
        return partId;
    }

    public void setPartId(int partId) {
        this.partId = partId;
    }

    public int getPartNumber() {
        return partNumber;
    }

    public void setPartNumber(int partNumber) {
        this.partNumber = partNumber;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Double getPurchasePrice() {
        return purchasePrice;
    }

    public void setPurchasePrice(Double purchasePrice) {
        this.purchasePrice = purchasePrice;
    }

    public Double getRetailPrice() {
        return retailPrice;
    }

    public void setRetailPrice(Double retailPrice) {
        this.retailPrice = retailPrice;
    }

    @Override
    public String toString() {
        String text = "Parts Id " + this.partId + "\n";
        text += "Part Number : " + this.partNumber + "\n";
        text += "Description : " + this.description + "\n";
        text += "Purchase Price : " + this.purchasePrice + "\n";
        text += "Retail Price : " + this.retailPrice + "\n";
        return text;
    }

    @Override
    public int compareTo(Parts o) {
        if (this.partId > o.getPartId()) {
            return 1;
        } else if (this.partId < o.getPartId()) {
            return -1;
        } else {
            return 0;
        }
    }


    @Override
    public boolean equals(Object o) {
        Parts x = (Parts) o;
        return this.partId == x.getPartId();
    }
}
