package capstone;

public class Accidents {

    private String date;
    private Driver atFaultDriver;
    public Accidents(String date) {
        this.date = date;
    }
    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Driver getAtFaultDriver() {
        return atFaultDriver;
    }

    public void setAtFaultDriver(Driver atFaultDriver) {
        this.atFaultDriver = atFaultDriver;
    }
}