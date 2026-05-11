/*
Question 4:
Create a class “BankAccount” with fields “accountNumber”, “balance”,
and “interestRate” and a method “deposit()” that adds an amount to the balance.
Create a subclass “SavingsAccount” that extends “BankAccount” and adds a field
“minimumBalance” and a method “withdraw()” that subtracts an amount from the balance.
Create an object of the “BankAccount” class and call the “deposit()” method.
Create an object of the “SavingsAccount” class and call the “deposit()”
and “withdraw()” methods.
*/

class BankAccount {
    int accountNumber = 101;
    double balance = 1000;
    double interestRate = 5;

    void deposit(double amount) {
        balance += amount;
        System.out.println("Balance after deposit: " + balance);
    }
}

class SavingsAccount extends BankAccount {
    double minimumBalance = 500;

    void withdraw(double amount) {
        balance -= amount;
        System.out.println("Balance after withdrawal: " + balance);
    }
}

public class BankAccountTest {
    public static void main(String[] args) {

        BankAccount b = new BankAccount();
        b.deposit(500);

        SavingsAccount s = new SavingsAccount();
        s.deposit(1000);
        s.withdraw(700);
    }
}