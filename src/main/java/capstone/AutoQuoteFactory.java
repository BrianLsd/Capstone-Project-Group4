package src.main.java.capstone;

public record AutoQuoteFactory(Vehicle vehicle, Driver driver) {

    public AutoQuote createAutoQuote() {
        double liabilityLimit = 200000;
        double deductible = 500;

        AutoRiskRates autoRiskRates = new AutoRiskRates(vehicle.getYear(), driver.getAge(), driver.getNumberAccidents());
        // Driver driver, Vehicle vehicle, double liabilityLimit,double deductible, double totalPremium
        double totalPremium = autoRiskRates.getPremium() * autoRiskRates.getDriverAgeFactor()
                * autoRiskRates.getAccidentsFactor() * autoRiskRates.getVehicleAgeFactor() * autoRiskRates.getTax();
        return new AutoQuote(driver, vehicle, liabilityLimit, deductible, totalPremium);
    }
}
