package org.linkedIn.course.chapter.encapsulation.challenge;

public class BankAccount
{
    private String owner;
    private double balance;

    public BankAccount(String owner, double balance)
    {
        this.owner = owner;
        this.balance = balance;
    }

    //Solution
    public BankAccount(String owner, int startingBalance)
    {
        this.owner = owner;
        // To take care of negative values, use Maths class
        this.balance = Math.max(startingBalance, 0);
    }

    public String getOwner()
    {
        return owner;
    }

    public double getBalance()
    {
        return balance;
    }

    public double withdraw(double amount)
    {
        if (amount <= this.balance) {
            this.balance = this.balance - amount;
            return amount;
        }
        return 0;
    }

    public double deposit(double amount)
    {
        if (amount > 0) {
            this.balance = this.balance + amount;
            return amount;
        }

        return 0;

    }
}
