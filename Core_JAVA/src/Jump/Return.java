package Jump;

import java.util.Scanner;

public class Return {
    // The main method is the entry point of the program
    public static void main(String[] args) {
        // Declaring and initializing two variables
         int num1,num2;
        // Creating an instance of Scanner to read user input
        Scanner scanner = new Scanner(System.in);

        // Prompting the user to enter two numbers
        System.out.println("Enter two numbers: ");
        // Reading the first number entered by the user
        num1 = scanner.nextInt();
        // Reading the second number entered by the user
        num2 = scanner.nextInt();

        // Creating an instance of the Return class
        Return obj = new Return();
        // Calling the sum method of the Return class and passing the two numbers entered by the user
        int result = obj.sum(num1, num2);
        // Printing the result of the sum
        System.out.println("Sum of " + num1 + " and " + num2 + " is: " + result);
    }

    // The sum method calculates the sum of two numbers and returns the result
    public int sum(int a, int b) {
        // Adding the two numbers and returning the result
        return a + b;
    }
}
