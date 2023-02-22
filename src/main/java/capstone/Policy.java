package capstone;

import java.time.LocalDate;
public abstract class Policy {
    private final Driver driver;
    private final LocalDate startDate;
    private final LocalDate endDate;
    private final double totalPremium;

    public Policy(Person driver, double totalPremium) {
        this.driver = (Driver) driver;
        this.startDate = LocalDate.now();
        this.endDate = LocalDate.now().plusYears(1);
        this.totalPremium = totalPremium;
    }

    public Driver getInsuredPerson() {
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

    public Driver getDriver() {
        return driver;
    }
}
