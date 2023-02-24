package src.main.java.capstone;

import java.time.Year;

public record AutoRiskRates(int vehicleYear, int driverAge, int driverAccidents) {
    public double getPremium(){
        return 750;
    }

    public double getTax(){
        return 1.15;
    }

    public double getDriverAgeFactor(){
        if (driverAge >= 25){
            return 1;
        } else {
            return 2;
        }
    }

    public double getAccidentsFactor(){
        if (driverAccidents > 2){
            return 2;
        } else if (driverAccidents > 1){
            return 1.25;
        } else {
            return 1;
        }
    }

    public double getVehicleAgeFactor(){
        if (Year.now().minusYears(vehicleYear).getValue() > 10 ){
            return 2;
        } else if (Year.now().minusYears(vehicleYear).getValue() > 5){
            return 1.5;
        } else {
            return 1;
        }
    }
}
