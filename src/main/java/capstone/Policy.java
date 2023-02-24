package src.main.java.capstone;

import java.time.LocalDate;
public abstract class Policy {
    private final Person insuredPerson;
    private final LocalDate startDate;
    private final LocalDate endDate;
    private final double totalPremium;

    public Policy(Person insuredPerson, double totalPremium) {
        this.insuredPerson = insuredPerson;
        this.startDate = LocalDate.now();
        this.endDate = LocalDate.now().plusYears(1);
        this.totalPremium = totalPremium;
    }

    public Person getInsuredPerson() {
        return insuredPerson;
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
}
