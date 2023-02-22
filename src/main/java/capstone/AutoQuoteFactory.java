package capstone;

import java.util.Scanner;

public record AutoQuoteFactory(Vehicle vehicle, Driver driver) {

    public AutoQuote createAutoQuote(Scanner input) {
        // these might be omitted
        System.out.println("Please provide your liability limit here: ");
        double liabilityLimit = input.nextDouble();
        System.out.println("Please provide your deductible here: ");
        double deductible = input.nextDouble();

        AutoRiskRates autoRiskRates = new AutoRiskRates(vehicle, driver);
        // Driver driver, Vehicle vehicle, double liabilityLimit,double deductible, double totalPremium
        double totalPremium = autoRiskRates.getPremium() * autoRiskRates.getDriverAgeFactor()
                * autoRiskRates.getAccidentsFactor() * autoRiskRates.getVehicleAgeFactor() * autoRiskRates.getTax();
        return new AutoQuote(driver, vehicle, liabilityLimit, deductible, totalPremium);
    }
}
