package capstone;

import java.time.LocalDate;

public abstract class Quote {
    private final Person driver;
    private final LocalDate startDate;
    private final LocalDate endDate;
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
}
