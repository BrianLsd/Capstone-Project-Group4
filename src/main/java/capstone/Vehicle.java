package capstone;

/**
 * Create Vehicle objects having a year, model and make of the vehicle
 */
public class Vehicle {

    private int year;
    private String model;
    private String make;

    /**
     * A Constructor to create vehicle objects
     * @param year The vehicle year
     * @param model The vehicle model
     * @param make The vehicle make
     */
    public Vehicle(int year, String model, String make) {
        this.year = year;
        this.model = model;
        this.make = make;
    }

    /**
     * Gets the year of a vehicle object
     * @return year
     */
    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }
}