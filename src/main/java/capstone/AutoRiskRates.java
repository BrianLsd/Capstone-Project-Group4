package capstone;

import java.time.Year;

public class AutoRiskRates {
    private AutoRiskRates(){}
    public static double getPremium(){
        return 750;
    }

    public static double getTax(){
        return 1.15;
    }

    public static double getDriverAgeFactor(double driverAge){
        if (driverAge >= 25){
            return 1;
        } else {
            return 2;
        }
    }

    public static double getAccidentsFactor(int driverAccidents){
        if (driverAccidents > 2){
            return 2.5;
        } else if (driverAccidents > 1){
            return 1.25;
        } else {
            return 1;
        }
    }

    public static double getVehicleAgeFactor(int vehicleYear){
        if (Year.now().minusYears(vehicleYear).getValue() > 10 ){
            return 2;
        } else if (Year.now().minusYears(vehicleYear).getValue() > 5){
            return 1.5;
        } else {
            return 1;
        }
    }
}
