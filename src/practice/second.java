package practice;

import java.util.Scanner;

public class second {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        // 1. Simple Interest
        System.out.println("---- Simple Interest ----");
        System.out.println("Enter principal, rate and time:");
        double principal = input.nextDouble();
        double rate = input.nextDouble();
        double time = input.nextDouble();
        double si = (principal * rate * time) / 100;
        System.out.println("Simple Interest: " + si);

        // 2. Check if number is positive or negative
        System.out.println("\n---- Positive or Negative ----");
        System.out.println("Enter a number to check positive or negative:");
        int number = input.nextInt();
        if (number > 0)
            System.out.println("Positive number.");
        else if (number < 0)
            System.out.println("Negative number.");
        else
            System.out.println("Number is zero.");
        
        // 3. Check even or odd
        System.out.println("\n---- Even or Odd ----");
        System.out.print("Enter a number: ");
        int num = input.nextInt();

        if (num % 2 == 0) {
            System.out.println("The number is even.");
        } else {
            System.out.println("The number is odd.");
        }

        // 4. Largest of 3 numbers
        System.out.println("\n---- Largest Number ----");
        System.out.println("Enter three numbers again to find largest:");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int num3 = input.nextInt();

        	if (num1 >= num2 && num1 >= num3) {
                System.out.println(num1 + " is the largest");
            } else if (num2 >= num1 && num2 >= num3) {
                System.out.println(num2 + " is the largest");
            } else {
                System.out.println(num3 + " is the largest");
            }

       

        // 5. Vowel or Consonant or special character or number
            System.out.println("\n---- Character Type Checker ----");
            System.out.println("Enter a single character:");

            char ch = input.next().charAt(0); // Read first character

            if (Character.isLetter(ch)) {
                // Convert to lowercase
                ch = Character.toLowerCase(ch);

                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    System.out.println("Vowel");
                } else {
                    System.out.println("Consonant");
                }
            } else if (Character.isDigit(ch)) {//Here Character	is Java built-in class and isDigit(char) isStatic method
                System.out.println("Number");
            } else {
                System.out.println("Special Character");
            }

        
        // 6. Compare two strings
        System.out.println("\n---- Compare Strings ----");
        System.out.println("Enter two strings to compare:");
        String str1 = input.next();
        String str2 = input.next();
        if (str1.equals(str2))// .equals() checks if the content of the two strings is exactly the same
            System.out.println("Strings are equal.");
        else
            System.out.println("Strings are not equal.");
}
}
