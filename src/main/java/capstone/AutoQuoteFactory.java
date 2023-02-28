package capstone;
public class AutoQuoteFactory{
    private AutoQuoteFactory(){}

    public static AutoQuote createAutoQuote(Vehicle vehicle, Driver driver){
        double totalPremium = AutoRiskRates.getPremium() * AutoRiskRates.getDriverAgeFactor(driver.getAge()) *
                AutoRiskRates.getAccidentsFactor(driver.getNumberAccidents()) * AutoRiskRates.getVehicleAgeFactor(vehicle.getYear())
                * AutoRiskRates.getTax();
        return new AutoQuote.Builder(driver, vehicle, 1000000, 500, AutoRiskRates.getPremium(),
                AutoRiskRates.getTax(), totalPremium).build();
    }
}