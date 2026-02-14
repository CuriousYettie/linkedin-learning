package org.linkedIn.course.chapter.inheritance;

public class Analyst extends Employee
{
    public Analyst(String name, double salary, int age)
    {
        super(name, salary, age);
    }

    public double getAnnualBonus()
    {
        return this.salary * .05;
    }

    // Or instead of making the Employee salary property protected and using keyword this,
    // you can implement the getAnnualBonus with super.salary
    /*
         public double getAnnualBonus()
         {
             return super.salary * .05;
         }
     */
}
