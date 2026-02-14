package org.linkedIn.course.chapter.encapsulation.challenge;

public class Main
{
    public static void main(String[] args)
    {
        BankAccount myBankAccount = new BankAccount("Vanessa", 1000);
        myBankAccount.withdraw(500.00);
        myBankAccount.deposit(5000.00);
        myBankAccount.withdraw(2000.00);

        System.out.println(myBankAccount.getOwner());
        System.out.println(myBankAccount.getBalance());
    }
}