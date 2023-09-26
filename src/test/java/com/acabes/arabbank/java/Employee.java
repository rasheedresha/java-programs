package com.acabes.arabbank.java;

import java.util.*;
public class Employee {
    private String employeeId;
    private String employeeName;
    private  static double salary;

    public Employee(String employeeId, String employeeName, double salary)
    {
        this.employeeId=employeeId;
        this.employeeName=employeeName;
        this.salary=salary;
    }

    public static double calculateAnnualSalary()
    {
        return salary*12;
    }

    public void displayEmployeeInfo()
    {
        System.out.println("Employee's Id is: "+employeeId);
        System.out.println("Employee's Name is: "+employeeName);
        System.out.println("Employee's monthly salary is: "+salary);
    }
}
class EmployeeManager {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter number of employees");
        int numEmployee = s.nextInt();
        s.nextLine();
        Employee[] employee = new Employee[numEmployee];
        for (int i = 0; i < numEmployee; i++) {
            System.out.println("Enter details for Employee #" + (i + 1));
            System.out.print("Employee ID: ");
            String employeeId = s.nextLine();
            System.out.print("Employee Name: ");
            String employeeName = s.nextLine();
            System.out.print("Salary: ");
            double salary = s.nextDouble();
            s.nextLine(); // Consume the newline character
            employee[i] = new Employee(employeeId, employeeName, salary);
        }

        System.out.println("Annual Salaries:");
        for (Employee employe : employee) {
            employe.displayEmployeeInfo();
            System.out.println("Annual Salary: " + employe.calculateAnnualSalary());
        }
    }
}
