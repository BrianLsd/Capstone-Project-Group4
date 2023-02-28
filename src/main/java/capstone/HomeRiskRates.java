package capstone;

public class HomeRiskRates {
    private HomeRiskRates(){}
    public static double getPremium(){
        return 500;
    }

    public static double getTax(){
        return 1.15;
    }

    public static double getHomeValueFactor(double homeValue){
        if (homeValue > 250000){
            return 0.002 * (homeValue - 250000);
        } else {
            return 0;
        }
    }

    public static double getHomeAgeFactor(double homeAge){
        if (homeAge > 50){
            return 1.5;
        } else if (homeAge > 25){
            return 1.25;
        } else {
            return 1;
        }
    }

    public static double getHeatingFactor(HeatingType homeHeatingType){
        switch (homeHeatingType) {
            case ELECTRIC, GAS, OTHER -> {
                return 1;
            }
            case WOOD -> {
                return 1.25;
            }
            case OIL -> {
                return 2;
            }
            default -> throw new IllegalArgumentException("Invalid Heating Type");
        }
    }

    public static double getLocationFactor(Location homelocation){
        switch (homelocation){
            case URBAN -> {
                return 1;
            }
            case RURAL -> {
                return 1.15;
            }
            default -> throw new IllegalArgumentException("Invalid Location Type");
        }
    }
}
