package src.main.java;

public class Accidents {

    public String date;

    enum DriverAtFault {
        YES,
        NO
    }
    public Accidents(String date) {
        this.date = date;
    }
}