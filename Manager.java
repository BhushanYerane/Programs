package newbasicjava;

public class Manager extends Employee {
    private String department;

    // Constructor
    public Manager(String name, int age, String employeeId, String department) {
        super(name, age, employeeId); // Call the constructor of the base class
        this.department = department;
    }

    // Getter and Setter for department
    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    // Overriding the display method to include manager details
    @Override
    public void display() {
        super.display(); // Call the display method of the base class
        System.out.println("Department: " + department);
    }
}
