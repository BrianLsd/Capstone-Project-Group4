package capstone;

public class HomeQuote extends Quote {
    private HomeOwner homeOwner;
    private Home home;
    private double liabilityLimit;
    private double deductible;
    private double contentsInsuranceLimit;
    private double contentsDeductible;
    private double basePremium;
    private double tax;

    public HomeQuote(HomeOwner homeOwner, Home home,double totalPremium, double liabilityLimit,
                     double deductible, double contentsInsuranceLimit, double contentsDeductible) {
        super(homeOwner, totalPremium);
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

    public void setHome(Home home) {
        this.home = home;
    }

    public double getLiabilityLimit() {
        return liabilityLimit;
    }

    public void setLiabilityLimit(double liabilityLimit) {
        this.liabilityLimit = liabilityLimit;
    }

    public double getDeductible() {
        return deductible;
    }

    public void setDeductible(double deductible) {
        this.deductible = deductible;
    }

    public double getContentsInsuranceLimit() {
        return contentsInsuranceLimit;
    }

    public void setContentsInsuranceLimit(double contentsInsuranceLimit) {
        this.contentsInsuranceLimit = contentsInsuranceLimit;
    }

    public double getContentsDeductible() {
        return contentsDeductible;
    }

    public void setContentsDeductible(double contentsDeductible) {
        this.contentsDeductible = contentsDeductible;
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

    @Override
    public void setTax(double tax) {
        this.tax = tax;
    }

    public HomeOwner getHomeOwner() {
        return homeOwner;
    }

    public void setHomeOwner(HomeOwner homeOwner) {
        this.homeOwner = homeOwner;
    }
}

