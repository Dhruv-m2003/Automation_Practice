package first;

import java.util.*;

public class one {

	public static void main(String[] args) {
//		 Enter your your name from the user input and display Hello <Name> How are you ? 
		 Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter your name: ");
	        String name = scanner.nextLine();
	        System.out.println("Hello " + name + " How are you?");
//	        Enter number  using user input and display sum , subtract, multiply and division

	        System.out.print("Enter the first number: ");
	        double num1 = scanner.nextDouble();

	        System.out.print("Enter the second number: ");
	        double num2 = scanner.nextDouble();

	        double sum = num1 + num2;
	        double subtract = num1 - num2;
	        double multiply = num1 * num2;
	        double division = 0;

	 
	        if (num2 != 0) {
	            division = num1 / num2;
	        } else {
	            System.out.println("Division by zero is not allowed.");
	        }

	        System.out.println("\nResults:");
	        System.out.println("Sum: " + sum);
	        System.out.println("Subtraction: " + subtract);
	        System.out.println("Multiplication: " + multiply);
	        if (num2 != 0) {
	            System.out.println("Division: " + division);
	        }

	}

}
