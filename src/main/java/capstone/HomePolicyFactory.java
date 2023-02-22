package capstone;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public record HomePolicyFactory(HomeQuote homeQuote) {
    public HomePolicy createHomePolicy(){
        return new HomePolicy(homeQuote.getHomeOwner(), homeQuote.getHome(), homeQuote.getTotalPremium()
                , homeQuote.getLiabilityLimit(), homeQuote.getDeductible(), homeQuote.getContentsInsuranceLimit()
                , homeQuote.getContentsDeductible());
    }

    public HomePolicy renewHomePolicy(HomePolicy homePolicy){
        if (ChronoUnit.DAYS.between(homePolicy.getEndDate(), LocalDate.now()) <= 60){
            return new HomePolicy(homePolicy.getHomeOwner(), homePolicy.getHome(), homePolicy.getTotalPremium(), homePolicy.getLiabilityLimit(),
                    homePolicy.getDeductible(), homePolicy.getContentsInsuranceLimit(), homePolicy.getContentsDeductible());
        } else {
            System.out.println("Your policy is not available for renewal.");
            return homePolicy;
        }
    }
}

