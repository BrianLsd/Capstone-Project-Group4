package src.main.java;

public class Home {

    public int age;
    public int value;
    public enum DwellingType {
        HOUSE,
        APARTMENT
    }
    public enum HeatingType {
        OIL,
        ELECTRIC,
        FURNACE
    }
    public enum Location {
        DENSEURBAN,
        URBAN,
        RURAL
    }
    public Home(int age, int value) {
        this.age = age;
        this.value = value;
    }
}
