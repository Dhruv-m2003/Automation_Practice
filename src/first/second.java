package first;

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
        System.out.println("Enter three numbers again to find largest (if-else):");
        int l1 = input.nextInt();
        int l2 = input.nextInt();
        int l3 = input.nextInt();
        if (l1 > l2) {
            if (l1 > l3)
                System.out.println(l1 + " is largest");
            else
                System.out.println(l3 + " is largest");
        } else {
            if (l2 > l3)
                System.out.println(l2 + " is largest");
            else
                System.out.println(l3 + " is largest");
        }


        // 5. Swap two numbers
        System.out.println("\n---- Swap Numbers ----");
        System.out.print("Enter first number: ");
        int a = input.nextInt();

        System.out.print("Enter second number: ");
        int b = input.nextInt();

        System.out.println("Before swap: a = " + a + ", b = " + b);

        int temp = a;
        a = b;
        b = temp;

        System.out.println("After swap: a = " + a + ", b = " + b);

        // 6. Vowel or Consonant
        System.out.println("\n---- Vowel or Consonant ----");
        System.out.println("Enter an alphabet:");
        char ch = input.next().toLowerCase().charAt(0);
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
            System.out.println("Vowel");
        else
            System.out.println("Consonant");
        // 7. Compare two strings
        System.out.println("\n---- Compare Strings ----");
        System.out.println("Enter two strings to compare:");
        String str1 = input.next();
        String str2 = input.next();
        if (str1.equals(str2))
            System.out.println("Strings are equal.");
        else
            System.out.println("Strings are not equal.");
}
}
