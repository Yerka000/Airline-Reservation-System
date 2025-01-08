package Entities;

public class Passenger extends Entity {

    // Constructor
    public Passenger(int id, String name, int age, String passportNumber) {
        super(id);
        this.name = name;
        this.age = age;
        this.passportNumber = passportNumber;
    }

    // Attributes
    private String name;
    private int age;
    private String passportNumber;

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPassportNumber() {
        return passportNumber;
    }

    public void setPassportNumber(String passportNumber) {
        this.passportNumber = passportNumber;
    }

    @Override
    public String toString() {
        return "Passenger[ID: " + getId() + ", Name: " + name + ", Age: " + age + ", Passport: " + passportNumber + "]";
    }
}