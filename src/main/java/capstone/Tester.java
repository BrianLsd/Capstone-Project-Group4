package capstone;

import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Vehicle car = new Vehicle(2019, "Model S", "Tesla");
        Driver person = new Driver(19, "1 A st, St.johns", 0);
        AutoQuoteFactory auto = new AutoQuoteFactory(car, person);
        AutoQuote autoQuote = auto.createAutoQuote(input);
        System.out.println(autoQuote.getTotalPremium());
        System.out.println(autoQuote.getStartDate());
        System.out.println(autoQuote.getEndDate());
        System.out.println(autoQuote.getTax());
        System.out.println(autoQuote.getBasePremium());
        AutoPolicyFactory autoPolicyFactory = new AutoPolicyFactory(autoQuote);
        AutoPolicy autoPolicy = autoPolicyFactory.createAutoPolicy();
        System.out.println(autoPolicy.getStartDate());
        System.out.println(autoPolicy.getEndDate());

        HomeOwner homeOwner = new HomeOwner(23, "2 B st, Toronto");
        Home home = new Home(30, DwellingType.SEMI_ATTACHED, HeatingType.OIL, Location.URBAN, 500000);
        HomeQuoteFactory homeQuoteFactory = new HomeQuoteFactory(home, homeOwner);
        HomeQuote homeQuote = homeQuoteFactory.createHomeQuote(input);
        HomePolicyFactory homePolicyFactory = new HomePolicyFactory(homeQuote);
        HomePolicy homePolicy = homePolicyFactory.createHomePolicy();
        System.out.println(homeQuote.getTotalPremium());
        System.out.println(homePolicy.getStartDate());
        System.out.println(homePolicy.getEndDate());
    }
}
