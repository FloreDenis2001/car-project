package model;

public abstract class Person implements Comparable<Person> {
    private int id;
    private String lastName;
    private String firstName;


    public Person(int id, String lastName, String firstName) {
        this.id = id;
        this.lastName = lastName;
        this.firstName = firstName;
    }

    public Person(String text) {
        String[] path = text.split(",");
        this.id = Integer.parseInt(path[0]);
        this.lastName = path[1];
        this.firstName = path[2];
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @Override
    public String toString() {
        String text = "Id :" + this.id + "\n";
        text += "Last Name : " + this.lastName + "\n";
        text += "First Name : " + this.firstName + "\n";
        return text;
    }

    @Override
    public boolean equals(Object o) {
        Person x = (Person) o;
        return this.lastName.equals(x.getLastName()) && this.firstName.equals(x.getFirstName());
    }

    @Override
    public int compareTo(Person o) {
        if (this.id > o.getId()) {
            return 1;
        } else if (this.id < o.getId()) {
            return -1;
        } else {
            return 0;
        }
    }
}
