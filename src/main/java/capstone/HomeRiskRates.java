package capstone;

public record HomeRiskRates(Home home) {
    public double getPremium(){
        return 500;
    }

    public double getTax(){
        return 1.15;
    }

    public double getHomeValueFactor(){ // not sure
        if (home.getValue() > 250000){
            return 0.002 * (home.getValue() - 250000);
        } else {
            return 0;
        }
    }

    public double getHomeAgeFactor(){
        if (home.getAge() > 50){
            return 1.5;
        } else if (home.getAge() > 25){
            return 1.25;
        } else {
            return 1;
        }
    }

    public double getHeatingFactor(){
        switch (home.getHeatingType()) {
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
        switch (home.getLocation()){
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
