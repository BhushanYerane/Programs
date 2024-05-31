package newbasicjava;

import java.util.Scanner;

public class AreaCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose shape: ");
        System.out.println("1. Triangle");
        System.out.println("2. Circle");
        System.out.println("3. Rectangle");
        System.out.print("Enter your choice (1/2/3): ");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.print("Enter base length of the triangle: ");
                double base = scanner.nextDouble();
                System.out.print("Enter height of the triangle: ");
                double height = scanner.nextDouble();
                double triangleArea = calculateTriangleArea(base, height);
                System.out.println("Area of the triangle: " + triangleArea);
                break;
            case 2:
                System.out.print("Enter radius of the circle: ");
                double radius = scanner.nextDouble();
                double circleArea = calculateCircleArea(radius);
                System.out.println("Area of the circle: " + circleArea);
                break;
            case 3:
                System.out.print("Enter length of the rectangle: ");
                double length = scanner.nextDouble();
                System.out.print("Enter breadth of the rectangle: ");
                double breadth = scanner.nextDouble();
                double rectangleArea = calculateRectangleArea(length, breadth);
                System.out.println("Area of the rectangle: " + rectangleArea);
                break;
            default:
                System.out.println("Invalid choice!");
        }
        System.out.println("Enter base and height of the triangle:");
        double baseTriangle = scanner.nextDouble();
        double heightTriangle = scanner.nextDouble();

        // Input for circle
        System.out.println("Enter radius of the circle:");
        double radiusCircle = scanner.nextDouble();

        // Input for rectangle
        System.out.println("Enter length and width of the rectangle:");
        double lengthRectangle = scanner.nextDouble();
        double widthRectangle = scanner.nextDouble();

        // Calculate areas using respective methods
        double areaTriangle = calculateTriangleArea(baseTriangle, heightTriangle);
        double areaCircle = calculateCircleArea(radiusCircle);
        double areaRectangle = calculateRectangleArea(lengthRectangle, widthRectangle);

        // Output the results
        System.out.println("Area of the triangle: " + areaTriangle);
        System.out.println("Area of the circle: " + areaCircle);
        System.out.println("Area of the rectangle: " + areaRectangle);

        scanner.close();
    }

    public static double calculateTriangleArea(double base, double height) {
        return 0.5 * base * height;
    }

    public static double calculateCircleArea(double radius) {
        return Math.PI * radius * radius;
    }

    public static double calculateRectangleArea(double length, double breadth) {
        return length * breadth;
    }
    
    // Method to calculate area of a triangle
    public static double calculateTriangleArea1(double base, double height) {
        return 0.5 * base * height;
    }

    // Method to calculate area of a circle
    public static double calculateCircleArea1(double radius) {
        return Math.PI * radius * radius;
    }

    // Method to calculate area of a rectangle
    public static double calculateRectangleArea1(double length, double width) {
        return length * width;
    }
}
