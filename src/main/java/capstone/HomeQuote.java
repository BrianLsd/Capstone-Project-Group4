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

    private HomeQuote(Builder builder) {
        super(builder.homeOwner, builder.totalPremium);
        this.homeOwner = builder.homeOwner;
        this.home = builder.home;
        this.contentsInsuranceLimit = builder.contentsInsuranceLimit;
        this.contentsDeductible = builder.contentsDeductible;
        this.liabilityLimit = builder.liabilityLimit;
        this.deductible = builder.deductible;
        this.basePremium =builder.basePremium;
        this.tax = builder.tax;
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

    public static class Builder {
        private final HomeOwner homeOwner;
        private final Home home;
        private final double liabilityLimit;
        private final double deductible;
        private final double contentsInsuranceLimit;
        private final double contentsDeductible;
        private final double totalPremium;
        private final double basePremium;
        private final double tax;

        public Builder(HomeOwner homeOwner, Home home,double liabilityLimit, double deductible,
                       double contentsInsuranceLimit, double contentsDeductible, double basePremium,
                       double tax, double totalPremium){
            this.homeOwner = homeOwner;
            this.home = home;
            this.liabilityLimit = liabilityLimit;
            this.deductible = deductible;
            this.contentsInsuranceLimit = contentsInsuranceLimit;
            this.contentsDeductible = contentsDeductible;
            this.basePremium = basePremium;
            this.tax = tax;
            this.totalPremium = totalPremium;
        }

        public HomeQuote build(){
            return new HomeQuote(this);
        }
    }
}

