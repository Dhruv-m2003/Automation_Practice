package first;

import java.util.Scanner;

public class third {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // 1. Print first n Fibonacci numbers
        System.out.println("Enter how many Fibonacci numbers you want:");
        int n = input.nextInt();
        int a = 0, b = 1;
        System.out.println("Fibonacci Series:");
        for (int i = 1; i <= n; i++) {
            System.out.print(a + " ");
            int sum = a + b;
            a = b;
            b = sum;
        }
        System.out.println();

        // 2. Swap two numbers using third variable
        System.out.println("Enter two numbers to swap (with 3rd variable):");
        int x = input.nextInt();
        int y = input.nextInt();
        int temp = x;
        x = y;
        y = temp;
        System.out.println("After swap: x = " + x + ", y = " + y);

        // 3. Swap two numbers without using third variable
        System.out.println("Enter two numbers to swap (without 3rd variable):");
        int p = input.nextInt();
        int q = input.nextInt();
        p = p + q;
        q = p - q;
        p = p - q;
        System.out.println("After swap: p = " + p + ", q = " + q);

        // 4. Find largest among three numbers
        System.out.println("Enter three numbers to find the largest:");
        int a1 = input.nextInt();
        int b1 = input.nextInt();
        int c1 = input.nextInt();
        if (a1 >= b1 && a1 >= c1)
            System.out.println(a1 + " is the largest.");
        else if (b1 >= a1 && b1 >= c1)
            System.out.println(b1 + " is the largest.");
        else
            System.out.println(c1 + " is the largest.");

   

        // 5. Enter marks and calculate total and percentage
        System.out.println("Enter marks of 3 subjects:");
        int m1 = input.nextInt();
        int m2 = input.nextInt();
        int m3 = input.nextInt();
        int total = m1 + m2 + m3;
        double percentage = total / 3.0;
        System.out.println("Total Marks: " + total);
        System.out.println("Percentage: " + percentage + "%");



        // 6. Check even or odd
        System.out.println("Enter a number to check even or odd:");
        int evenOdd = input.nextInt();
        if (evenOdd % 2 == 0)
            System.out.println("Even number.");
        else
            System.out.println("Odd number.");
        
        //7.  Multiplication Table	Take a number as input and print its multiplication table (1 to 10).
        System.out.print("Enter a number to print its multiplication table: ");
        int number = input.nextInt();

        // Print multiplication table from 1 to 10
        System.out.println("Multiplication Table of " + number + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " x " + i + " = " + (number * i));
            //  8: Find Factorial of a Number
       
            System.out.println("----- Factorial Calculator -----");
            System.out.print("Enter a number: ");
            int num = input.nextInt(); // Take number from user

            long factorial = 1; // Variable to store result

            // Loop from 1 to the entered number
            int j = 1;
            while (i <= num) {
                factorial = factorial * i; // Multiply each number
                i = i + 1; // Go to next number
            }

            // Show the result
            System.out.println("Factorial of " + num + " is: " + factorial);

        }

   
      


    }}
