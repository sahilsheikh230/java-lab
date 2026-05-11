/*
Question 5:
Create a class “BankAccount” with fields “accountNumber”, “balance”,
and “interestRate” and a method “deposit()” that adds an amount to the balance.
Create a subclass “SavingsAccount” that extends “BankAccount” and adds a field
“minimumBalance” and a method “withdraw()” that subtracts an amount from the balance.
Create an object of the “BankAccount” class and call the “deposit()” method.
Create an object of the “SavingsAccount” class and call the “deposit()”
and “withdraw()” methods.
*/

class BankAccount {
    double balance = 2000;

    void deposit(double amount) {
        balance += amount;
        System.out.println("Balance after deposit: " + balance);
    }
}

class SavingsAccount extends BankAccount {

    void withdraw(double amount) {
        balance -= amount;
        System.out.println("Balance after withdrawal: " + balance);
    }
}

public class SavingsAccountTest {
    public static void main(String[] args) {

        BankAccount b = new BankAccount();
        b.deposit(300);

        SavingsAccount s = new SavingsAccount();
        s.deposit(500);
        s.withdraw(200);
    }
}