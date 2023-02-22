package capstone;

public class HomeOwner extends Person{
    private int age;
    private String address;
    public HomeOwner(int age, String address) {
        super(age, address);
    }

    @Override
    public int getAge() {
        return age;
    }

    @Override
    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String getAddress() {
        return address;
    }

    @Override
    public void setAddress(String address) {
        this.address = address;
    }
}
