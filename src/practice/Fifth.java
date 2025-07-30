package practice;

//MAIN class to run everything
//This is the main class that runs all parts of the program
public class Fifth {
 public static void main(String[] args) {
     // 1. Display static employee data
     EmployeeData.displayEmployeeDetails();

     // 2. Send welcome message using static method
     WelcomeMessages.sendStaticWelcome("Amit");

     // 3. Send welcome message using instance (non-static) method
     WelcomeMessages welcome = new WelcomeMessages();
     welcome.sendInstanceWelcome("Priya");

     // 4. Add two numbers using a parameterized method
     int result = MathOperations.calculateSum(15, 25);
     System.out.println("Sum of 15 and 25 is: " + result);
     System.out.println("----------------------------------");

     // 5. Create food orders using constructors and static variables
     MenuItem[] order1Items = {
         new MenuItem("Paneer Pizza", 250),
         new MenuItem("Cold Drink", 40)
     };

     MenuItem[] order2Items = {
         new MenuItem("Veg Burger", 120),
         new MenuItem("French Fries", 60)
     };

     // Create and display two food orders
     FoodOrder order1 = new FoodOrder(order1Items);
     order1.printOrder();

     FoodOrder order2 = new FoodOrder(order2Items);
     order2.printOrder();

     // 6. Create HR employees using constructor, inheritance, and display their details
     HREmployee emp1 = new HREmployee(201, "Ravi Kumar", "1990-03-12", "HR Executive", 55000);
     HREmployee emp2 = new HREmployee(202, "Sneha Joshi", "1992-06-25", "HR Manager", 75000);

     emp1.showDetails();
     emp2.showDetails();
 }
}

//-----------------------------------------------
//1. Employee Data using static variables
//This class holds and displays company employee info
//-----------------------------------------------
class EmployeeData {
 // Static variables shared by all employees
 static String companyName = "Techmatrix";
 static String departmentName = "QA";

 // Arrays to store data of 5 employees
 static String[] employeeNames = {"Rahul", "Sonia", "Meena", "Arjun", "Kavita"};
 static int[] employeeIds = {101, 102, 103, 104, 105};
 static String[] designations = {"Tester", "Tester", "Tester", "Tester", "Tester"};
 static double[] salaries = {40000, 42000, 43000, 45000, 46000};
 static String[] dateOfBirths = {"1990-01-10", "1991-02-15", "1992-03-20", "1993-04-25", "1994-05-30"};

 // Static method to print all employee data
 static void displayEmployeeDetails() {
     System.out.println("Company Name : " + companyName);
     System.out.println("Department   : " + departmentName);
     System.out.println("----------------------------------");

     // Loop through each employee and print their data
     for (int i = 0; i < employeeNames.length; i++) {
         System.out.println("Name         : " + employeeNames[i]);
         System.out.println("Employee ID  : " + employeeIds[i]);
         System.out.println("Designation  : " + designations[i]);
         System.out.println("Salary       : ₹" + salaries[i]);
         System.out.println("Date of Birth: " + dateOfBirths[i]);
         System.out.println("----------------------------------");
     }
 }
}

//-----------------------------------------------
//2. Welcome Message using Static and Instance Methods
//-----------------------------------------------
class WelcomeMessages {
 // Static method: can be called without creating an object
 static void sendStaticWelcome(String name) {
     System.out.println("Hello " + name + ", welcome to the company!");
 }

 // Instance method: requires object to call
 void sendInstanceWelcome(String name) {
     System.out.println("Hello " + name + ", welcome to the company!");
 }
}

//-----------------------------------------------
//3. MathOperations class for parameterized method
//This shows how to use parameters to perform calculations
//-----------------------------------------------
class MathOperations {
 // Static method to calculate the sum of two numbers
 static int calculateSum(int number1, int number2) {
     return number1 + number2;
 }
}

//-----------------------------------------------
//4. Food Order System with constructors and static variable
//-----------------------------------------------

//Class to represent each menu item
class MenuItem {
 String itemName;
 double itemPrice;

 // Constructor to initialize the menu item
 MenuItem(String itemName, double itemPrice) {
     this.itemName = itemName;
     this.itemPrice = itemPrice;
 }
}

//Class to represent a food order
class FoodOrder {
 static int totalOrders = 0;  // static variable to count total orders
 MenuItem[] items;            // array to hold items in the order

 // Constructor to initialize the order and increase order count
 FoodOrder(MenuItem[] items) {
     this.items = items;
     totalOrders++;
 }

 // Method to print the order and calculate total price
 void printOrder() {
     System.out.println("Order #" + totalOrders);
     double totalAmount = 0;

     // Loop through each item and print
     for (MenuItem item : items) {
         System.out.println(item.itemName + " - ₹" + item.itemPrice);
         totalAmount += item.itemPrice;
     }

     // Print total amount
     System.out.println("Total Amount: ₹" + totalAmount);
     System.out.println("----------------------------------");
 }
}

//-----------------------------------------------
//5. HR Employee System using constructor, inheritance, static, this
//-----------------------------------------------

//Parent class for person details
class Person {
 protected String fullName;
 protected String birthDate;

 // Constructor for Person class
 Person(String fullName, String birthDate) {
     this.fullName = fullName;
     this.birthDate = birthDate;
 }
}

//Child class that extends Person and represents an employee
class HREmployee extends Person {
 private int employeeId;
 private String role;
 private double monthlySalary;
 static String companyName = "Techmatrix"; // shared by all HR employees

 // Constructor to initialize employee details using "this" and "super"
 HREmployee(int employeeId, String fullName, String birthDate, String role, double monthlySalary) {
     super(fullName, birthDate); // call parent constructor
     this.employeeId = employeeId;
     this.role = role;
     this.monthlySalary = monthlySalary;
 }

 // Method to display employee information
 void showDetails() {
     System.out.println("Company       : " + companyName);
     System.out.println("Employee ID   : " + employeeId);
     System.out.println("Name          : " + fullName);
     System.out.println("Date of Birth : " + birthDate);
     System.out.println("Role          : " + role);
     System.out.println("Salary        : ₹" + monthlySalary);
     System.out.println("----------------------------------");
 }
}
