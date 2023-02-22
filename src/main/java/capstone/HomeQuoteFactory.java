package capstone;

import java.util.Scanner;

public record HomeQuoteFactory(Home home, HomeOwner homeOwner) {
    public HomeQuote createHomeQuote (Scanner input){
        System.out.println("Please provide your liability limit here: ");
        double liabilityLimit = input.nextDouble();
        System.out.println("Please provide your deductible here: ");
        double deductible = input.nextDouble();
        System.out.println("Please provide your contents insurance limit here: ");
        double contentsInsuranceLimit = input.nextDouble();
        System.out.println("Please provide your contents deductible here: ");
        double contentsDeductible = input.nextDouble();

        HomeRiskRates homeRiskRates = new HomeRiskRates(home);
        double totalPremium = homeRiskRates.getPremium()
                * homeRiskRates.getHomeAgeFactor() * homeRiskRates.getHeatingFactor() *
                homeRiskRates.getLocationFactor() * homeRiskRates.getTax() + homeRiskRates.getHomeValueFactor();
        return new HomeQuote(homeOwner, home, totalPremium, liabilityLimit, deductible, contentsInsuranceLimit, contentsDeductible);
    }
}

