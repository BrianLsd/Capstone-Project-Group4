package src.main.java.capstone;

public class Driver extends Person {

    private int age;

    private String address;

    private int numberAccidents;

    public Driver(int age, String address, int numberAccidents) {
        super(age, address);
        this.age = age;
        this.address = address;
        this.numberAccidents = numberAccidents;
    }

    public int getNumberAccidents() {
        return numberAccidents;
    }

    public void setNumberAccidents(int numberAccidents) {
        this.numberAccidents = numberAccidents;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}