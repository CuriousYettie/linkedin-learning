package org.linkedIn.course.chapter.classandobjects.challenge;

public class Employee
{
    //Attributes
    String name;
    int age;
    double salary;
    String location;

    public Employee(String name, int age, double salary, String location)
    {
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.location = location;
    }

    void welcomeMessage()
    {
        System.out.println("Lets all give a warm welcome to " + this.name);
    }

    //Behavior
    void raiseSalary(double rate)
    {
        double raiseAmount = this.salary * (rate / 100);
        this.salary += raiseAmount;
        System.out.println(this.name + " received a raised of " + (double) 5 + "%. New salary " + this.salary);
    }

    //Solution
    void raiseSalary()
    {
        this.salary = this.salary * 1.2;
    }
}
