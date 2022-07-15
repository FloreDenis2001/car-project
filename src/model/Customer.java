package model;

public class Customer implements Comparable<Customer> {
    private int customerId;
    private String lastname;
    private String firstname;
    private String phoneNumber;
    private String address;
    private String city;
    private String state;
    private String country;
    private String postalCode;

    public Customer(int customerId, String lastname, String firstname, String phoneNumber, String address, String city, String state, String country, String postalCode) {
        this.customerId = customerId;
        this.lastname = lastname;
        this.firstname = firstname;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.city = city;
        this.state = state;
        this.country = country;
        this.postalCode = postalCode;
    }


    public Customer(String text){
        String []path=text.split(",");
        this.customerId=Integer.parseInt(path[0]);
        this.lastname=path[1];
        this.firstname=path[2];
        this.phoneNumber=path[3];
        this.address=path[4];
        this.city=path[5];
        this.state=path[6];
        this.country=path[7];
        this.postalCode=path[8];
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    @Override
    public String toString() {
        String text = "Id:" + this.customerId + "\n";
        text += "Last Name :" + this.lastname + "\n";
        text += "First Name :" + this.firstname + "\n";
        text += "Phone :" + this.phoneNumber + "\n";
        text += "Address :" + this.address + "\n";
        text += "City :" + this.city + "\n";
        text += "State :" + this.state + "\n";
        text += "Country :" + this.country + "\n";
        text += "Postal Code :" + this.postalCode + "\n";
        return text;
    }

    @Override
    public boolean equals(Object o) {
        Customer x = (Customer) o;
        return this.customerId == x.getCustomerId();
    }


    @Override
    public int compareTo(Customer o) {
        if (this.customerId > o.getCustomerId()) {
            return 1;
        } else if (this.customerId < o.getCustomerId()) {
            return -1;
        }else {
            return 0;
        }
    }


}
