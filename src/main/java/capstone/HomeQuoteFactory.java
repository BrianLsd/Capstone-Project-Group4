package capstone;
public class HomeQuoteFactory{
    private HomeQuoteFactory(){}

    public static HomeQuote createHomeQuote(Home home, HomeOwner homeOwner){
        double totalPremium = (HomeRiskRates.getPremium() + HomeRiskRates.getHomeValueFactor(home.getValue())) *  HomeRiskRates.getHomeAgeFactor(home.getAge())
                * HomeRiskRates.getHeatingFactor(home.getHeatingType()) * HomeRiskRates.getLocationFactor(home.getLocation()) * HomeRiskRates.getTax();
        return new HomeQuote.Builder(homeOwner, home, 2000000, 1000, 50000, 500,
                HomeRiskRates.getPremium(), HomeRiskRates.getTax(), totalPremium).build();
    }
}