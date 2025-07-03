package practice;
 class Employee {
    int empId;         // to store employee ID
    String empName;    // to store employee  name
    double empSalary;  // to store employee salary
}

public class fourth {

	    public static void main(String[] args) {

	        // Creating an object of Employee
	        Employee emp1 = new Employee();

	        // Setting values to employee object
	        emp1.empId = 762;
	        emp1.empName = "Dhruv Mahajan";
	        emp1.empSalary = 50000000000.0;

	        // Displaying employee details
	        System.out.println("------ Employee Details ------");
	        System.out.println("Employee ID: " + emp1.empId);
	        System.out.println("Employee Name: " + emp1.empName);
	        System.out.println("Employee Salary: Rs" + emp1.empSalary);
	    }
	}




