package capstone;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class HomePolicyFactory {
    private HomePolicyFactory(){}
    public static HomePolicy createHomePolicy(HomeQuote homeQuote){
        return new HomePolicy.Builder(homeQuote.getHomeOwner(), homeQuote.getHome(), homeQuote.getLiabilityLimit(),
                homeQuote.getDeductible(), homeQuote.getContentsInsuranceLimit()
                , homeQuote.getContentsDeductible(), homeQuote.getBasePremium(), homeQuote.getTax(), homeQuote.getTotalPremium()).build();
    }

    public HomePolicy renewHomePolicy(HomePolicy homePolicy){
        if (ChronoUnit.DAYS.between(homePolicy.getEndDate(), LocalDate.now()) <= 60){
            return new HomePolicy.Builder(homePolicy.getHomeOwner(), homePolicy.getHome(), homePolicy.getLiabilityLimit(),
                    homePolicy.getDeductible(), homePolicy.getContentsInsuranceLimit()
                    , homePolicy.getContentsDeductible(), homePolicy.getBasePremium(), homePolicy.getTax(), homePolicy.getTotalPremium()).build();
        } else {
            System.out.println("Your policy is not available for renewal.");
            return homePolicy;
        }
    }
}

