public class Employee {
    public String name = "";
    public double salary = 0.00;
    public static int employeeID = 0;
    public int ID = 0;
    public Employee boss;
    public String status = "";

    // Should construct a new employee object and take in two parameters, one for the name of the user and one for
    // their base salary.
    public Employee(String name, double baseSalary) {
        this.name = name;
        this.salary = baseSalary;
        employeeID++;
        this.ID = employeeID;
    }

    // Should return the employee's current salary.
    public double getBaseSalary() {
        return salary;
    }

    // Should return the employee's current name.
    public String getName() {
        return name;
    }

    // Should return the employee's ID. The ID should be issued on behalf of the employee at the time they are
    // constructed. The first ever employee should have an ID of "1", the second "2" and so on.
    public int getEmployeeID() {
        return this.ID;
    }

    // Should return a reference to the Employee object that represents this employee's manager.
    public Employee getManager() {
        return this.boss;
    }

    // Custom mutator installed so we can actually give the employee a manager...
    public void setManager(Employee name) {
        this.boss = name;
    }

    // Should return true if the two employee IDs are the same, false otherwise.
    public boolean equals(Employee other) {
        if (this.ID == other.ID) {
            return true;
        } else {
            return false;
        }
    }

    // Should return a String representation of the employee that is a combination of their id followed by their
    // name. Example: "1 Kasey".
    public String toString() {
        return this.ID + " " + this.name;
    }

    // Should return a String representation of that Employee's current status. This will be different for every
    // subclass of Employee.
    public String employeeStatus() {
        return this.status;
    }

}
