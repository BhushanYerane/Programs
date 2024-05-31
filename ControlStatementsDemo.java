package newbasicjava;
import java.util.Scanner;

public class ControlStatementsDemo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int x =100;
        int a=x++;
        int b=++x;
        int c=x++;
        int d=(a<b)?(a<c)?a:(b<c)?b:c:x;
        System.out.println("val :"+d);
        // If statement
        int num = 10;
        if (num > 0) {
            System.out.println(num + " is a positive number");
        }
        
        // If-else statement
        int score = 85;
        if (score >= 60) {
            System.out.println("Passed");
        } else {
            System.out.println("Failed");
        }
        
        // Switch statement
        char grade = 'B';
        switch (grade) {
            case 'A':
                System.out.println("Excellent");
                break;
            case 'B':
                System.out.println("Good");
                break;
            case 'C':
                System.out.println("Fair");
                break;
            default:
                System.out.println("Needs Improvement");
        }
        
        // Do-while loop
        int i = 1;
        do {
            System.out.println("Value of i: " + i);
            i++;
        } while (i <= 5);
        
        // While loop
      /*  int j = 1;
        while (j <= 5) {
            System.out.println("Value of j: " + j);
            j++;
        } */
        
        int x1=5;
        while (isAvailable(x1))
        {
        	System.out.println("XX: "+x);
        	x1--;
        }
        
        // For loop
        for (int k = 1; k <= 5; k++) {
            System.out.println("Value of k: " + k);
        }
        
        // For-each loop
        int[] numbers = {1, 2, 3, 4, 5};
        for (int number : numbers) {
            System.out.println("Number: " + number);
        }
        
        // Break statement
        for (int m = 1; m <= 10; m++) {
            if (m == 6) {
                break;
            }
            System.out.println("Value of m: " + m);
        }
        
        // Continue statement
        for (int n = 1; n <= 5; n++) {
            if (n == 3) {
                continue;
            }
            System.out.println("Value of n: " + n);
        }
        
       scanner.close();
    }

	private static boolean isAvailable(int x1) {
		return x1-- >0 ? true:false;
	}
    
 /*          
    	Scanner scan = new Scanner(System.in);
            // if statement
            System.out.println("Enter a number: ");
            int number = scan.nextInt();
            if(number > 0) {
                System.out.println("Number is positive");
            }

            // if-else statement
            if(number % 2 == 0) {
                System.out.println("Number is even");
            } else {
                System.out.println("Number is odd");
            }

            // switch statement
            System.out.println("Enter a day number (1-7): ");
            int day = scan.nextInt();
            switch(day) {
                case 1:
                    System.out.println("Sunday");
                    break;
                case 2:
                    System.out.println("Monday");
                    break;
                case 3:
                    System.out.println("Tuesday");
                    break;
                case 4:
                    System.out.println("Wednesday");
                    break;
                case 5:
                    System.out.println("Thursday");
                    break;
                case 6:
                    System.out.println("Friday");
                    break;
                case 7:
                    System.out.println("Saturday");
                    break;
                default:
                    System.out.println("Invalid day");
            }

            // do-while loop
            int i = 0;
            System.out.println("Do-while loop:");
            do {
                System.out.print(i + " ");
                i++;
            } while(i < 5);
            System.out.println();

            // while loop
            i = 0;
            System.out.println("While loop:");
            while(i < 5) {
                System.out.print(i + " ");
                i++;
            }
            System.out.println();

            // for loop
            System.out.println("For loop:");
            for(int j = 0; j < 5; j++) {
                System.out.print(j + " ");
            }
            System.out.println();

            // for-each loop
            int[] numbers = {1, 2, 3, 4, 5};
            System.out.println("For-each loop:");
            for(int num : numbers) {
                System.out.print(num + " ");
            }
            System.out.println();

            // break statement
            System.out.println("Break statement:");
            for(int k = 0; k < 10; k++) {
                if(k == 5) {
                    break;
                }
                System.out.print(k + " ");
            }
            System.out.println();

            // continue statement
            System.out.println("Continue statement:");
            for(int k = 0; k < 5; k++) {
                if(k == 2) {
                    continue;
                }
                System.out.print(k + " ");
            }
            System.out.println();

            scanner.close();
        } */

}
