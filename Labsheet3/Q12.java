package Labsheet3;

// Q12.java
class Employee {
    String name;
    double salary;
}

class SalaryUpdater {
    void updateSalary(Employee e, double newSalary) {
        e.salary = newSalary;
    }
}

public class Q12 {
    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.name = "Shahvez";
        emp.salary = 40000;

        SalaryUpdater su = new SalaryUpdater();
        su.updateSalary(emp, 50000);

        System.out.println("Updated Salary: " + emp.salary);
    }
}
