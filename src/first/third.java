package first;

import java.util.Scanner;

public class third {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // 1. Print first n Fibonacci numbers
        System.out.println("Enter how many Fibonacci numbers you want:");
        int count = input.nextInt();
        int first = 0, second = 1;
        System.out.println("Fibonacci Series:");
        for (int i = 1; i <= count; i++) {
            System.out.print(first + " ");
            int next = first + second;
            
            first = second;
            second = next;
        }

        // 2. Swap two numbers using third variable
        
        System.out.println("\nEnter two numbers to swap (with 3rd variable):");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int temp = num1;
        num1 = num2;
        num2 = temp;
        System.out.println("After swap: num1 = " + num1 + ", num2 = " + num2);

        // 3. Swap two numbers without using third variable
        System.out.println("Enter two numbers to swap (without 3rd variable):");
        int a = input.nextInt();
        int b = input.nextInt();
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("After swap: a = " + a + ", b = " + b);

        // 4. Enter marks and calculate total and percentage
        System.out.println("Enter marks of 3 subjects:");
        int marks1 = input.nextInt();
        int marks2 = input.nextInt();
        int marks3 = input.nextInt();
        int totalMarks = marks1 + marks2 + marks3;
        double percent = totalMarks / 3.0;
        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Percentage: " + percent + "%");

        // 5. Multiplication Table
        System.out.print("Enter a number to print its multiplication table: ");
        int tableNum = input.nextInt();
        System.out.println("Multiplication Table of " + tableNum + ":");

        for (int i = 1; i <= 10; i++) {
            System.out.println(tableNum + " x " + i + " = " + (tableNum * i));
        }

        // 6. Find Factorial of a Number
        System.out.println("----- Factorial Calculator -----");
        System.out.print("Enter a number: ");
        int factInput = input.nextInt();

        long factResult = 1;
        int factCounter = 1;
        while (factCounter <= factInput) {
            factResult = factResult * factCounter;
            factCounter++;
        }
        System.out.println("Factorial of " + factInput + " is: " + factResult);

        // 7. Check the length of the String 
        input.nextLine(); // Clear leftover newline
        System.out.println("Enter a string:");
        String text = input.nextLine();
        int textLength = text.length();
        System.out.println("The length of the string is: " + textLength);
    }
}
