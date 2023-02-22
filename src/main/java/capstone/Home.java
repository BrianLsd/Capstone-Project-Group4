package capstone;

public class Home {

    private int age;
    private DwellingType dwellingType;
    private HeatingType heatingType;
    private Location location;
    private double value;

    public Home(int age, DwellingType dwellingType, HeatingType heatingType,
                Location location, double value) {
        this.age = age;
        this.dwellingType = dwellingType;
        this.heatingType = heatingType;
        this.location = location;
        this.value = value;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public DwellingType getDwellingType() {
        return dwellingType;
    }

    public void setDwellingType(DwellingType dwellingType) {
        this.dwellingType = dwellingType;
    }

    public HeatingType getHeatingType() {
        return heatingType;
    }

    public void setHeatingType(HeatingType heatingType) {
        this.heatingType = heatingType;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }
}
