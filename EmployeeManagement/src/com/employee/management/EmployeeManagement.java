package com.employee.management;

class Employee {
    int employeeId;
    String name;
    String position;
    double salary;

    public Employee(int employeeId, String name, String position, double salary) {
        this.employeeId = employeeId;
        this.name = name;
        this.position = position;
        this.salary = salary;
    }

    public String toString() {
        return "ID: " + employeeId + ", Name: " + name + ", Position: " + position + ", Salary: $" + salary;
    }
}

public class EmployeeManagement {

    static final int MAX_EMPLOYEES = 100;
    Employee[] employees = new Employee[MAX_EMPLOYEES];
    int count = 0;

    public void addEmployee(Employee emp) {
        if (count < MAX_EMPLOYEES) {
            employees[count++] = emp;
            System.out.println("Employee added.");
        } else {
            System.out.println("Employee array is full!");
        }
    }

    public Employee searchEmployee(int empId) {
        for (int i = 0; i < count; i++) {
            if (employees[i].employeeId == empId) {
                return employees[i];
            }
        }
        return null;
    }

    public void traverseEmployees() {
        if (count == 0) {
            System.out.println("No employees to display.");
            return;
        }
        for (int i = 0; i < count; i++) {
            System.out.println(employees[i]);
        }
    }

    public void deleteEmployee(int empId) {
        boolean found = false;
        for (int i = 0; i < count; i++) {
            if (employees[i].employeeId == empId) {

                for (int j = i; j < count - 1; j++) {
                    employees[j] = employees[j + 1];
                }
                employees[--count] = null; 
                found = true;
                System.out.println("Employee deleted.");
                break;
            }
        }
        if (!found) {
            System.out.println("Employee not found.");
        }
    }

    public static void main(String[] args) {
        EmployeeManagement ems = new EmployeeManagement();

        ems.addEmployee(new Employee(101, "Alice", "Manager", 80000));
        ems.addEmployee(new Employee(102, "Bob", "Engineer", 60000));
        ems.addEmployee(new Employee(103, "Charlie", "HR", 50000));

        System.out.println("\nAll Employees:");
        ems.traverseEmployees();

        System.out.println("\nSearch Employee with ID 102:");
        Employee result = ems.searchEmployee(102);
        System.out.println(result != null ? result : "Employee not found");

        System.out.println("\nDeleting Employee with ID 101:");
        ems.deleteEmployee(101);

        System.out.println("\nAll Employees after Deletion:");
        ems.traverseEmployees();
    }
}
