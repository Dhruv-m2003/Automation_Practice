// This program is inside the package named 'practice'
package practice;

// We import Scanner from java.util package to take user input.We can also do import java.util.Scanner
import java.util.*;

public class one {

	public static void main(String[] args) {
		
        // -------------------------------
        // Part 1: Greeting the User
        // -------------------------------
        // Create a Scanner object to take input from the keyboard
		Scanner scanner = new Scanner(System.in);
		
        // Ask the user to enter their name
        System.out.print("Enter your name: ");
        
        // Store the user’s input (name) in the 'name' variable
        String name = scanner.nextLine();
        
        // Display a message with the user's name
        System.out.println("Hello " + name + " How are you?");
        
        
        // -------------------------------
        // Part 2: Simple Calculator
        // -------------------------------
        // Ask user to enter the first number
        System.out.print("Enter the first number: ");
        
        // Store the first number in variable num1
        double num1 = scanner.nextDouble();

        // Ask user to enter the second number
        System.out.print("Enter the second number: ");
        
        // Store the second number in variable num2
        double num2 = scanner.nextDouble();

        // Perform addition and store result in 'sum'
        double sum = num1 + num2;
        
        // Perform subtraction and store result in 'subtract'
        double subtract = num1 - num2;
        
        // Perform multiplication and store result in 'multiply'
        double multiply = num1 * num2;
        
        // Create a variable to store division result (set to 0 initially)
        double division = 0;

        // Check if the second number is not zero (to avoid division error)
        if (num2 != 0) {
            // Perform division and store result
            division = num1 / num2;
        } else {
            // Show a message if the second number is 0
            System.out.println("Division by zero is not allowed.");
        }

        // Print all the results
        System.out.println("\nResults:");
        System.out.println("Sum: " + sum); // Display sum
        System.out.println("Subtraction: " + subtract); // Display difference
        System.out.println("Multiplication: " + multiply); // Display product
        System.out.println("Division: " + division); // Display quotient if valid
	}
}
