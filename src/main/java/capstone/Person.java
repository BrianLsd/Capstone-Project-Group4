package src.main.java.capstone;

public abstract class Person {
    private int age;
    private String address;

    public Person(int age, String address) {
        this.age = age;
        this.address = address;
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
