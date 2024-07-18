package Lab01_22H4060068;

public class BasePlusCommissionEmployee extends CommissionEmployee {
    private double baseSalary; // base salary per week

    // constructor
    public BasePlusCommissionEmployee(String firstName, String lastName, String socialSecurityNumber, double grossSales,
            double commissionRate, double baseSalary) {
        super(firstName, lastName, socialSecurityNumber, grossSales, commissionRate);
        if (baseSalary < 0.0) {
            throw new IllegalArgumentException("Base salary must be >= 0.0");
        }
        this.baseSalary = baseSalary;
    }

    // get base salary
    public double getBaseSalary() {
        return baseSalary;
    }

    // set base salary
    public void setBaseSalary(double baseSalary) {
        if (baseSalary < 0.0) {
            throw new IllegalArgumentException("Base salary must be >= 0.0");
        }
        this.baseSalary = baseSalary;
    }

    // calculate earnings
    @Override
    public double earnings() {
        return getBaseSalary() + super.earnings();
    }

    // return String representation
    @Override
    public String toString() {
        return String.format("%s %s\n%s: $%,.2f", "base-salaried", super.toString(), "base salary", getBaseSalary());
    }
}
