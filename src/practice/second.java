// This program is in the package named 'practice'
package practice;

// Import Scanner class to take input from user
import java.util.Scanner;

public class second {
    public static void main(String[] args) {
        
        // Create Scanner object to read input from keyboard
        Scanner input = new Scanner(System.in);

        // -----------------------------------------------
        // 1. Simple Interest Calculation
        // Formula: (Principal * Rate * Time) / 100
        // -----------------------------------------------
        System.out.println("---- Simple Interest ----");
        System.out.println("Enter principal, rate and time:");
        double principal = input.nextDouble(); // Take principal amount
        double rate = input.nextDouble();      // Take rate of interest
        double time = input.nextDouble();      // Take time in years

        // Calculate simple interest
        double si = (principal * rate * time) / 100;
        System.out.println("Simple Interest: " + si);

        // -----------------------------------------------
        // 2. Check if a number is Positive, Negative or Zero
        // -----------------------------------------------
        System.out.println("\n---- Positive or Negative ----");
        System.out.println("Enter a number to check positive or negative:");
        int number = input.nextInt();

        // Use if-else to check sign of number
        if (number > 0)
            System.out.println("Positive number.");
        else if (number < 0)
            System.out.println("Negative number.");
        else
            System.out.println("Number is zero.");

        // -----------------------------------------------
        // 3. Check if the number is Even or Odd
        // -----------------------------------------------
        System.out.println("\n---- Even or Odd ----");
        System.out.print("Enter a number: ");
        int num = input.nextInt();

        // Use modulus (%) to check if divisible by 2
        if (num % 2 == 0) {
            System.out.println("The number is even.");
        } else {
            System.out.println("The number is odd.");
        }

        // -----------------------------------------------
        // 4. Find the Largest of 3 Numbers
        // -----------------------------------------------
        System.out.println("\n---- Largest Number ----");
        System.out.println("Enter three numbers again to find largest:");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int num3 = input.nextInt();

        // Compare all 3 numbers using if-else
        if (num1 >= num2 && num1 >= num3) {
            System.out.println(num1 + " is the largest");
        } else if (num2 >= num1 && num2 >= num3) {
            System.out.println(num2 + " is the largest");
        } else {
            System.out.println(num3 + " is the largest");
        }

        // -----------------------------------------------
        // 5. Character Type Checker
        // Checks: Vowel, Consonant, Number, Special Character
        // -----------------------------------------------
        System.out.println("\n---- Character Type Checker ----");
        System.out.println("Enter a single character:");
        char ch = input.next().charAt(0); // Read first character of input

        // Check if input is a letter (a-z or A-Z)
        if (Character.isLetter(ch)) {
            ch = Character.toLowerCase(ch); // Convert to lowercase to simplify

            // Check if character is a vowel
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                System.out.println("Vowel");
            } else {
                System.out.println("Consonant");
            }
        } 
        // Check if it's a digit (0-9)
        else if (Character.isDigit(ch)) {
            System.out.println("Number");
        } 
        // If not letter or digit, it's a special character
        else {
            System.out.println("Special Character");
        }

        // -----------------------------------------------
        // 6. Compare Two Strings
        // -----------------------------------------------
        System.out.println("\n---- Compare Strings ----");
        System.out.println("Enter two strings to compare:");

        // Read two words from user
        String str1 = input.next();
        String str2 = input.next();

        // Use .equals() method to compare contents of two strings
        if (str1.equals(str2)) {
            System.out.println("Strings are equal.");
        } else {
            System.out.println("Strings are not equal.");
        }
    }
}
