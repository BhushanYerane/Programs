package newbasicjava;

public class TestInheri {
    public static void main(String[] args) {
        // Create an array of Employee objects
        Employee[] employees = new Employee[2];

        // Create a Manager object and a SalesPerson object
        employees[0] = new Manager("Alice Johnson", 45, "M12345", "IT");
        employees[1] = new sales("Bob Smith", 30, "S67890", 1000000.00);

        // Display the details of each employee
        for (Employee emp : employees) {
            if (emp instanceof Manager) {
                ((Manager) emp).display();
            } else if (emp instanceof sales) {
                ((sales) emp).display();
            }
            System.out.println("----------------");
        }
    }
}


