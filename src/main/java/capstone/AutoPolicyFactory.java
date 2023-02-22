package capstone;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public record AutoPolicyFactory(AutoQuote autoQuote) {
    public AutoPolicy createAutoPolicy(){
        return new AutoPolicy(autoQuote.getDriver(), autoQuote.getTotalPremium(), autoQuote.getVehicle(),
                autoQuote.getLiabilityLimit(), autoQuote.getDeductible());
    }

    public AutoPolicy renewAutoPolicy(AutoPolicy autoPolicy){
        if (ChronoUnit.DAYS.between(autoPolicy.getEndDate(), LocalDate.now()) <= 60){
            return new AutoPolicy(autoPolicy.getDriver(), autoPolicy.getTotalPremium(), autoPolicy.getVehicle(),
                    autoPolicy.getLiabilityLimit(), autoPolicy.getDeductible());
        } else {
            System.out.println("Your policy is not available for renewal.");
            return autoPolicy;
        }
    }
}

