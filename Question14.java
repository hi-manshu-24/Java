package assignment2;

import java.util.Scanner;

public class Question14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Employee ID: ");
        int empId = scanner.nextInt();
        scanner.nextLine(); 
        System.out.print("Enter Employee Name: ");
        String empName = scanner.nextLine();
        System.out.print("Enter Basic Salary: ");
        double basicSalary = scanner.nextDouble();

        Worker worker = new Worker(empId, empName, basicSalary);
        worker.showGrossSalary();
        scanner.close();
    }
}

class Worker {
    int id;
    String name;
    double basicSalary;

    Worker(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.basicSalary = salary;
    }

    void showGrossSalary() {
        double grossSalary = basicSalary + (basicSalary * 0.15) + (basicSalary * 0.12);
        System.out.println("Total Gross Salary: " + grossSalary);
    }
}

