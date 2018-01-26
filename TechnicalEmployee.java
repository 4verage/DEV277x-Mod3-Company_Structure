public class TechnicalEmployee extends Employee {
    private int checkIns = 0;

    // Has a default base salary of 75000.
    public TechnicalEmployee(String name) {
        super(name, 75000.00);
    }

    // Should return a String representation of this TechnicalEmployee that includes their ID, name and how many
    // successful check ins they have had. Example: "1 Kasey has 10 successful check ins"
    public String employeeStatus() {
        return super.employeeStatus() + " has " + this.checkIns + " successful check ins";
    }

}
