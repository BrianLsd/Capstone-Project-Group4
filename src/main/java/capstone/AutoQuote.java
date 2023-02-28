package capstone;

public class AutoQuote extends Quote{
    private final Driver driver;
    private final Vehicle vehicle;
    private final double liabilityLimit;
    private final double deductible;
    private final double basePremium;
    private final double tax;

    public AutoQuote(Builder builder) {
        super(builder.driver, builder.totalPremium);
        this.driver = builder.driver;
        this.vehicle = builder.vehicle;
        this.liabilityLimit = builder.liabilityLimit;
        this.deductible = builder.deductible;
        this.basePremium = builder.basePremium;
        this.tax = builder.tax;
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

    @Override
    public Driver getDriver() {
        return driver;
    }

    public double getBasePremium() {
        return basePremium;
    }

    public double getTax() {
        return tax;
    }

    public static class Builder {
        private final Driver driver;
        private final Vehicle vehicle;
        private final double liabilityLimit;
        private final double deductible;
        private final double basePremium;
        private final double tax;
        private final double totalPremium;

        public Builder(Driver driver, Vehicle vehicle, double liabilityLimit, double deductible,
                       double basePremium, double tax, double totalPremium) {
            this.driver = driver;
            this.vehicle = vehicle;
            this.liabilityLimit = liabilityLimit;
            this.deductible = deductible;
            this.basePremium = basePremium;
            this.tax = tax;
            this.totalPremium = totalPremium;
        }

        public AutoQuote build(){
            return new AutoQuote(this);
        }
    }
}

