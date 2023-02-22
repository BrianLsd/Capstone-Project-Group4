package capstone;

public class AutoQuote extends Quote{
    private Driver driver;
    private Vehicle vehicle;
    private double liabilityLimit;
    private double deductible;
    private double basePremium;
    private double tax;

    public AutoQuote(Driver driver, Vehicle vehicle, double liabilityLimit,
                     double deductible, double totalPremium) {
        super(driver, totalPremium);
        this.driver = driver;
        this.vehicle = vehicle;
        this.liabilityLimit = liabilityLimit;
        this.deductible = deductible;
        this.basePremium = 750;
        this.tax = 1.15;
    }

    @Override
    public Driver getInsuredPerson() {
        return driver;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public double getLiabilityLimit() {
        return liabilityLimit;
    }

    public double getDeductible() {
        return deductible;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public void setLiabilityLimit(double liabilityLimit) {
        this.liabilityLimit = liabilityLimit;
    }

    public void setDeductible(double deductible) {
        this.deductible = deductible;
    }

    @Override
    public Driver getDriver() {
        return driver;
    }

    @Override
    public double getBasePremium() {
        return basePremium;
    }

    @Override
    public void setBasePremium(double basePremium) {
        this.basePremium = basePremium;
    }

    @Override
    public double getTax() {
        return tax;
    }

    public void setTax(double tax) {
        this.tax = tax;
    }
}

