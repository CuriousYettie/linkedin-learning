package org.linkedIn.course.chapter.classandobjects.challenge;

public class Main
{
    public static void main(String[] args)
    {
        Employee employee1 = new Employee("John", 47, 12000.00, "Equestria");
        employee1.welcomeMessage();
        employee1.raiseSalary(0.00);

        Employee employee2 = new Employee("Sarah", 23, 5000.00, "Benoni");
        employee2.welcomeMessage();
        employee2.raiseSalary(5.00);

        //Solution
        Employee employeeOne = new Employee("Sally Roberts", 34, 70000, "Los Angeles");
        Employee employeeTwo = new Employee("Matt Johnson",32, 65000, "New York");

        employeeTwo.raiseSalary();
        System.out.println(employeeOne.salary);
        System.out.println(employeeTwo.salary);
    }
}
