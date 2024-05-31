package newbasicjava;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class checkException {
    public static void main(String[] args) {
        // Specify the file path
        String filePath = "example.txt"; // Ensure this file exists in the same directory
        //String filepath = "C:/Users/byerane/Downloads/";

        try {
            // Attempt to read the file
            readFile(filePath);
        } catch (FileNotFoundException e) {
            // Handle the checked exception
            System.out.println("The file was not found: " + e.getMessage());
        }
    }

    // Method to read a file
    public static void readFile(String filePath) throws FileNotFoundException {
        // Create a File object
        File file = new File("C:\\Users\\byerane\\Downloads\\");

        // Create a Scanner object to read the file
        Scanner scanner = new Scanner(file);

        // Read and print the content of the file
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            System.out.println(line);
        }

        // Close the scanner
        scanner.close();
    }
}
