package src.main.java.capstone;

public class Tester {
    public static void main(String[] args) {

        // example persons
        Driver person1 = new Driver(19, "1 A St., St.John's", 0);
        Driver person2 = new Driver(26, "1 B St., St.John's", 3);

        // example cars
        Vehicle car1 = new Vehicle(2020, "Model S", "Tesla");
        Vehicle car2 = new Vehicle(2010, "Model S", "Tesla");

        // Auto Quotes and Policies
        System.out.println("1. Auto");

        // create autoQuote1
        AutoQuoteFactory auto1 = new AutoQuoteFactory(car1, person1);
        AutoQuote autoQuote1 = auto1.createAutoQuote();
        // print
        System.out.println("\n\tQuote 1");
        System.out.println("Total Premium: " + autoQuote1.getTotalPremium());
        System.out.println("Start Date: " + autoQuote1.getStartDate());
        System.out.println("End Date: " + autoQuote1.getEndDate());
        System.out.println("Tax: " + autoQuote1.getTax());
        System.out.println("Base Premium: " + autoQuote1.getBasePremium());

        // create autoPolicy1
        AutoPolicyFactory autoPolicyFactory1 = new AutoPolicyFactory(autoQuote1);
        AutoPolicy autoPolicy1 = autoPolicyFactory1.createAutoPolicy();
        // print
        System.out.println("\tPolicy 1");
        System.out.println("Start Date: " + autoPolicy1.getStartDate());
        System.out.println("End Date: " + autoPolicy1.getEndDate());

        // create autoQuote2
        AutoQuoteFactory auto2 = new AutoQuoteFactory(car1, person2);
        AutoQuote autoQuote2 = auto2.createAutoQuote();
        // print
        System.out.println("\n\tQuote 2");
        System.out.println("Total Premium: " + autoQuote2.getTotalPremium());
        System.out.println("Start Date: " + autoQuote2.getStartDate());
        System.out.println("End Date: " + autoQuote2.getEndDate());
        System.out.println("Tax: " + autoQuote2.getTax());
        System.out.println("Base Premium: " + autoQuote2.getBasePremium());

        // create autoPolicy2
        AutoPolicyFactory autoPolicyFactory2 = new AutoPolicyFactory(autoQuote2);
        AutoPolicy autoPolicy2 = autoPolicyFactory2.createAutoPolicy();
        // print
        System.out.println("\tPolicy 2");
        System.out.println("Start Date: " + autoPolicy2.getStartDate());
        System.out.println("End Date: " + autoPolicy2.getEndDate());

        // create autoQuote3
        AutoQuoteFactory auto3 = new AutoQuoteFactory(car2, person1);
        AutoQuote autoQuote3 = auto3.createAutoQuote();
        // print
        System.out.println("\n\tQuote 3");
        System.out.println("Total Premium: " + autoQuote3.getTotalPremium());
        System.out.println("Start Date: " + autoQuote3.getStartDate());
        System.out.println("End Date: " + autoQuote3.getEndDate());
        System.out.println("Tax: " + autoQuote3.getTax());
        System.out.println("Base Premium: " + autoQuote3.getBasePremium());

        // create autoPolicy3
        AutoPolicyFactory autoPolicyFactory3 = new AutoPolicyFactory(autoQuote3);
        AutoPolicy autoPolicy3 = autoPolicyFactory3.createAutoPolicy();
        // print
        System.out.println("\tPolicy 3");
        System.out.println("Start Date: " + autoPolicy3.getStartDate());
        System.out.println("End Date: " + autoPolicy3.getEndDate());

        // create autoQuote4
        AutoQuoteFactory auto4 = new AutoQuoteFactory(car2, person2);
        AutoQuote autoQuote4 = auto4.createAutoQuote();
        // print
        System.out.println("\n\tQuote 4");
        System.out.println("Total Premium: " + autoQuote4.getTotalPremium());
        System.out.println("Start Date: " + autoQuote4.getStartDate());
        System.out.println("End Date: " + autoQuote4.getEndDate());
        System.out.println("Tax: " + autoQuote4.getTax());
        System.out.println("Base Premium: " + autoQuote4.getBasePremium());

        // create autoPolicy4
        AutoPolicyFactory autoPolicyFactory4 = new AutoPolicyFactory(autoQuote4);
        AutoPolicy autoPolicy4 = autoPolicyFactory4.createAutoPolicy();
        // print
        System.out.println("\tPolicy 4");
        System.out.println("Start Date: " + autoPolicy4.getStartDate());
        System.out.println("End Date: " + autoPolicy4.getEndDate());

        // Home Quotes and Policies
        System.out.println("\n2. Home");

        // example homeowner
        HomeOwner homeOwner = new HomeOwner(23, "2 B st, Toronto");

        // example homes
        Home home1 = new Home(20, DwellingType.SINGLE, HeatingType.ELECTRIC, Location.URBAN, 200000);
        Home home2 = new Home(30, DwellingType.APARTMENT, HeatingType.WOOD, Location.RURAL, 200000);
        Home home3 = new Home(60, DwellingType.SEMI_ATTACHED, HeatingType.OIL, Location.RURAL, 500000);

        // create homeQuote1
        HomeQuoteFactory homeQuoteFactory1 = new HomeQuoteFactory(home1, homeOwner);
        HomeQuote homeQuote1 = homeQuoteFactory1.createHomeQuote();
        // print
        System.out.println("\n\tQuote 1");
        System.out.println("Total Premium: " + homeQuote1.getTotalPremium());

        // create homePolicy1
        HomePolicyFactory homePolicyFactory1 = new HomePolicyFactory(homeQuote1);
        HomePolicy homePolicy1 = homePolicyFactory1.createHomePolicy();
        // print
        System.out.println("\tPolicy 1");
        System.out.println("Start Date: " + homePolicy1.getStartDate());
        System.out.println("End Date: " + homePolicy1.getEndDate());

        // create homeQuote2
        HomeQuoteFactory homeQuoteFactory2 = new HomeQuoteFactory(home2, homeOwner);
        HomeQuote homeQuote2 = homeQuoteFactory2.createHomeQuote();
        // print
        System.out.println("\n\tQuote 2");
        System.out.println("Total Premium: " + homeQuote2.getTotalPremium());

        // create homePolicy2
        HomePolicyFactory homePolicyFactory2 = new HomePolicyFactory(homeQuote2);
        HomePolicy homePolicy2 = homePolicyFactory2.createHomePolicy();
        // print
        System.out.println("\tPolicy 2");
        System.out.println("Start Date: " + homePolicy2.getStartDate());
        System.out.println("End Date: " + homePolicy2.getEndDate());

        // create homeQuote3
        HomeQuoteFactory homeQuoteFactory3 = new HomeQuoteFactory(home3, homeOwner);
        HomeQuote homeQuote3 = homeQuoteFactory3.createHomeQuote();
        // print
        System.out.println("\n\tQuote 3");
        System.out.println("Total Premium: " + homeQuote3.getTotalPremium());

        // create homePolicy3
        HomePolicyFactory homePolicyFactory3 = new HomePolicyFactory(homeQuote3);
        HomePolicy homePolicy3 = homePolicyFactory3.createHomePolicy();
        // print
        System.out.println("\tPolicy 3");
        System.out.println("Start Date: " + homePolicy3.getStartDate());
        System.out.println("End Date: " + homePolicy3.getEndDate());
    }
}
