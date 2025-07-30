package practice;

import java.util.Scanner; // Import Scanner class to take user input

public class third {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Create Scanner object to read input

        // ------------------- 1. Print First n Fibonacci Numbers -------------------
        System.out.println("Enter how many Fibonacci numbers you want:");
        int count = input.nextInt(); // Read how many numbers user wants

        int first = 0, second = 1; // First two numbers of the Fibonacci series
        System.out.println("Fibonacci Series:");
        
        for (int i = 1; i <= count; i++) {
            System.out.print(first + " ");  // Print the current Fibonacci number
            int next = first + second;      // Calculate next number in the series
            first = second;                 // Move 'second' to 'first' position
            second = next;                  // Move 'next' to 'second' position
        }

        // ------------------- 2. Swap Two Numbers Using a Third Variable -------------------
        System.out.println("\nEnter two numbers to swap (with 3rd variable):");
        int num1 = input.nextInt(); // Read first number
        int num2 = input.nextInt(); // Read second number

        int temp = num1; // Store num1 in a temporary variable
        num1 = num2;     // Assign num2 to num1
        num2 = temp;     // Assign original num1 (from temp) to num2

        System.out.println("After swap: num1 = " + num1 + ", num2 = " + num2);

        // ------------------- 3. Swap Two Numbers Without Using Third Variable -------------------
        System.out.println("Enter two numbers to swap (without 3rd variable):");
        int a = input.nextInt(); // Read first number
        int b = input.nextInt(); // Read second number

        a = a + b; // Step 1: Add both numbers and store in 'a'
        b = a - b; // Step 2: Subtract 'b' from new 'a' to get original 'a' into 'b'
        a = a - b; // Step 3: Subtract new 'b' from new 'a' to get original 'b' into 'a'

        System.out.println("After swap: a = " + a + ", b = " + b);

        // ------------------- 4. Total Marks and Percentage Calculation -------------------
        System.out.println("Enter marks of 3 subjects:");
        int marks1 = input.nextInt(); // Read marks for subject 1
        int marks2 = input.nextInt(); // Read marks for subject 2
        int marks3 = input.nextInt(); // Read marks for subject 3

        int totalMarks = marks1 + marks2 + marks3; // Calculate total of all three subjects
        double percent = totalMarks / 3.0;         // Calculate percentage (average marks)

        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Percentage: " + percent + "%");

        // ------------------- 5. Multiplication Table -------------------
        System.out.print("Enter a number to print its multiplication table: ");
        int tableNum = input.nextInt(); // Read number from user

        System.out.println("Multiplication Table of " + tableNum + ":");
        for (int i = 1; i <= 10; i++) {
            // Print the multiplication table from 1 to 10
            System.out.println(tableNum + " x " + i + " = " + (tableNum * i));
        }

        // ------------------- 6. Factorial Calculation -------------------
        System.out.println("----- Factorial Calculator -----");
        System.out.print("Enter a number: ");
        int factInput = input.nextInt(); // Read number for which factorial is to be calculated

        long factResult = 1;             // Variable to store factorial result
        int factCounter = 1;             // Start counter from 1

        while (factCounter <= factInput) {
            factResult = factResult * factCounter; // Multiply current result with counter
            factCounter++;                         // Move to next number
        }

        System.out.println("Factorial of " + factInput + " is: " + factResult);

        // ------------------- 7. String Length Checker -------------------
        input.nextLine(); // Consume the leftover newline character after previous input
        System.out.println("Enter a string:");
        String text = input.nextLine();  // Read full line of text from user

        int textLength = text.length();  // Calculate the number of characters in the string

        System.out.println("The length of the string is: " + textLength);
    }
}
