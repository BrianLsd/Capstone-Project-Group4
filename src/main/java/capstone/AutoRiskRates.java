package capstone;

import java.time.Year;

public record AutoRiskRates(Vehicle vehicle, Driver driver) {
    public double getPremium(){
        return 750;
    }

    public double getTax(){
        return 1.15;
    }

    public double getDriverAgeFactor(){
        if (driver.getAge() >= 25){
            return 1;
        } else {
            return 2;
        }
    }

    public double getAccidentsFactor(){
        if (driver.getNumberAccidents() > 2){
            return 2;
        } else if (driver.getNumberAccidents() > 1){
            return 1.25;
        } else {
            return 1;
        }
    }

    public double getVehicleAgeFactor(){
        if (Year.now().minusYears(vehicle.getYear()).getValue() > 10 ){
            return 2;
        } else if (Year.now().minusYears(vehicle.getYear()).getValue() > 5){
            return 1.5;
        } else {
            return 1;
        }
    }
}
