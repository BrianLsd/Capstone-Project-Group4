package src.main.java.capstone;

public record HomeQuoteFactory(Home home, HomeOwner homeOwner) {
    public HomeQuote createHomeQuote (){
        double liabilityLimit = 2000000;
        double deductible = 1000;
        double contentsInsuranceLimit = 50000;
        double contentsDeductible = 500;

        HomeRiskRates homeRiskRates = new HomeRiskRates(home.getValue(), home.getAge(), home.getHeatingType(), home.getLocation());
        double totalPremium = homeRiskRates.getPremium()
                * homeRiskRates.getHomeAgeFactor() * homeRiskRates.getHeatingFactor() *
                homeRiskRates.getLocationFactor() * homeRiskRates.getTax() + homeRiskRates.getHomeValueFactor();
        return new HomeQuote(homeOwner, home, totalPremium, liabilityLimit, deductible, contentsInsuranceLimit, contentsDeductible);
    }
}

