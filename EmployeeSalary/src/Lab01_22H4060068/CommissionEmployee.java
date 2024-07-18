package Lab01_22H4060068;

public class CommissionEmployee extends Employee {
    private double grossSales; // gross weekly sales
    private double commissionRate; // commission percentage

    // constructor
    public CommissionEmployee(String firstName, String lastName, String socialSecurityNumber, double grossSales,
            double commissionRate) {
        super(firstName, lastName, socialSecurityNumber);
        if (grossSales < 0.0) {
            throw new IllegalArgumentException("Gross sales must be >= 0.0");
        }
        if (commissionRate <= 0.0 || commissionRate >= 1.0) {
            throw new IllegalArgumentException("Commission rate must be > 0.0 and < 1.0");
        }
        this.grossSales = grossSales;
        this.commissionRate = commissionRate;
    }

    // get gross sales amount
    public double getGrossSales() {
        return grossSales;
    }

    // set gross sales amount
    public void setGrossSales(double grossSales) {
        if (grossSales < 0.0) {
            throw new IllegalArgumentException("Gross sales must be >= 0.0");
        }
        this.grossSales = grossSales;
    }

    // get commission rate
    public double getCommissionRate() {
        return commissionRate;
    }

    // set commission rate
    public void setCommissionRate(double commissionRate) {
        if (commissionRate <= 0.0 || commissionRate >= 1.0) {
            throw new IllegalArgumentException("Commission rate must be > 0.0 and < 1.0");
        }
        this.commissionRate = commissionRate;
    }

    // calculate earnings
    @Override
    public double earnings() {
        return getCommissionRate() * getGrossSales();
    }

    // return String representation
    @Override
    public String toString() {
        return String.format("%s: %s\n%s: $%,.2f; %s: %.2f", "commission employee", super.toString(), "gross sales",
                getGrossSales(), "commission rate", getCommissionRate());
    }
}
