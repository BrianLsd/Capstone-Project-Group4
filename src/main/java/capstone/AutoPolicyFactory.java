package capstone;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class AutoPolicyFactory {
    private AutoPolicyFactory(){}
    public static AutoPolicy createAutoPolicy(AutoQuote autoQuote){
        return new AutoPolicy.Builder(autoQuote.getDriver(), autoQuote.getVehicle(), autoQuote.getLiabilityLimit(),
                autoQuote.getDeductible(), autoQuote.getBasePremium(), autoQuote.getTax(), autoQuote.getTotalPremium()).build();
    }

    public static AutoPolicy renewAutoPolicy(AutoPolicy autoPolicy){
        if (ChronoUnit.DAYS.between(autoPolicy.getEndDate(), LocalDate.now()) <= 60){
            return new AutoPolicy.Builder(autoPolicy.getDriver(), autoPolicy.getVehicle(), autoPolicy.getLiabilityLimit(),
                    autoPolicy.getDeductible(), autoPolicy.getBasePremium(), autoPolicy.getTax(), autoPolicy.getTotalPremium()).build();
        } else {
            System.out.println("Your policy is not available for renewal.");
            return autoPolicy;
        }
    }
}

