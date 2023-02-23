package capstone;

public class HomeQuote extends Quote {
    private final HomeOwner homeOwner;
    private final Home home;
    private final double liabilityLimit;
    private final double deductible;
    private final double contentsInsuranceLimit;
    private final double contentsDeductible;
    private final double basePremium;
    private final double tax;

    public HomeQuote(HomeOwner homeOwner, Home home,double totalPremium, double liabilityLimit,
                     double deductible, double contentsInsuranceLimit, double contentsDeductible) {
        super(homeOwner, totalPremium);
        this.homeOwner = homeOwner;
        this.home = home;
        this.contentsInsuranceLimit = contentsInsuranceLimit;
        this.contentsDeductible = contentsDeductible;
        this.liabilityLimit = liabilityLimit;
        this.deductible = deductible;
        this.basePremium = 500;
        this.tax = 1.15;
    }

    public Home getHome() {
        return home;
    }

    public double getLiabilityLimit() {
        return liabilityLimit;
    }

    public double getDeductible() {
        return deductible;
    }

    public double getContentsInsuranceLimit() {
        return contentsInsuranceLimit;
    }

    public double getContentsDeductible() {
        return contentsDeductible;
    }

    public double getBasePremium() {
        return basePremium;
    }

    public double getTax() {
        return tax;
    }

    public HomeOwner getHomeOwner() {
        return homeOwner;
    }
}

