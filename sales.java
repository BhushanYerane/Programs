package newbasicjava;

public class sales extends Employee {
    private double salesTarget;

    // Constructor
    public sales(String name, int age, String employeeId, double salesTarget) {
        super(name, age, employeeId); // Call the constructor of the base class
        this.salesTarget = salesTarget;
    }

    // Getter and Setter for salesTarget
    public double getSalesTarget() {
        return salesTarget;
    }

    public void setSalesTarget(double salesTarget) {
        this.salesTarget = salesTarget;
    }

    // Overriding the display method to include sales person details
    @Override
    public void display() {
        super.display(); // Call the display method of the base class
        System.out.println("Sales Target: " + salesTarget);
    }
}
