package src.main.java.capstone;

public record HomeRiskRates(double homeValue, int homeAge, HeatingType homeHeatingType, Location homelocation) {
    public double getPremium(){
        return 500;
    }

    public double getTax(){
        return 1.15;
    }

    public double getHomeValueFactor(){ // not sure
        if (homeValue > 250000){
            return 0.002 * (homeValue - 250000);
        } else {
            return 0;
        }
    }

    public double getHomeAgeFactor(){
        if (homeAge > 50){
            return 1.5;
        } else if (homeAge > 25){
            return 1.25;
        } else {
            return 1;
        }
    }

    public double getHeatingFactor(){
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

    public double getLocationFactor(){
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
