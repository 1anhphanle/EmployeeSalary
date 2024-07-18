package Lab01_22H4060068;

public abstract class Employee {
    private String firstName;
    private String lastName;
    private String socialSecurityNumber;

    // constructor
    public Employee(String firstName, String lastName, String socialSecurityNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.socialSecurityNumber = socialSecurityNumber;
    }

    // getter methods
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    // abstract method
    public abstract double earnings();

    // toString method
    @Override
    public String toString() {
        return String.format("%s %s\nsocial security number: %s", getFirstName(), getLastName(),
                getSocialSecurityNumber());
    }
}
