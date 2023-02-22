package capstone;

import java.time.LocalDate;

public abstract class Quote {
    private Person driver;
    private LocalDate startDate;
    private LocalDate endDate;
    private double BasePremium;
    private double tax;
    private final double totalPremium;

    public Quote(Person driver, double totalPremium) {
        this.driver = driver;
        this.startDate = LocalDate.now();
        this.endDate = LocalDate.now().plusDays(30);
        this.totalPremium = totalPremium;
    }

    public Person getInsuredPerson() {
        return driver;
    }

    public LocalDate getStartDate() {
        return startDate;
    }
    public LocalDate getEndDate() {
        return endDate;
    }
    public double getTotalPremium() {
        return totalPremium;
    }

    public Person getDriver() {
        return driver;
    }

    public void setDriver(Person driver) {
        this.driver = driver;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    public double getBasePremium() {
        return BasePremium;
    }

    public void setBasePremium(double basePremium) {
        BasePremium = basePremium;
    }

    public double getTax() {
        return tax;
    }

    public void setTax(double tax) {
        this.tax = tax;
    }
}
