// program to calculate the bonus for an employee
/* 
  *Ferdinand Roche
  *K63-11550-2024
  *Program to calculate the bonus for an employee
*/


import java.util.Scanner;
class Employee {
     String name;
     double salary;

     Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

     void displayDetails() {
        System.out.println("-------------------------------");
        System.out.println("Employee Details:");
        System.out.println("Name:   " + name);
        System.out.println("Salary: Ksh. " + salary);
        System.out.println("-------------------------------");
    }
}


class SalaryCalculator {
    double calculateBonus(double salary) {
        return salary * 0.1;
    }
}


 class MainApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter employee name and salary: ");
        String name = scanner.nextLine().trim();
        double salary = scanner.nextDouble();

        Employee emp = new Employee(name, salary);
        emp.displayDetails();
        SalaryCalculator calc = new SalaryCalculator();
        double bonus = calc.calculateBonus(salary);
        System.out.println("Bonus: " + bonus);

        scanner.close();
    }
}
