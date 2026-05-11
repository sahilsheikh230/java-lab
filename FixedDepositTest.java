/*
Question 9:
Create a class “BankAccount”.
Create a subclass “SavingsAccount”.
Create a subclass “FixedDepositAccount”.
*/

class BankAccount {
    double balance = 5000;

    void deposit(double amount) {
        balance += amount;
        System.out.println("Balance: " + balance);
    }
}

class SavingsAccount extends BankAccount {

    void withdraw(double amount) {
        balance -= amount;
        System.out.println("Balance after withdrawal: " + balance);
    }
}

class FixedDepositAccount extends SavingsAccount {
    int term = 2;

    double getInterest() {
        return balance * 0.08 * term;
    }
}

public class FixedDepositTest {
    public static void main(String[] args) {

        BankAccount b = new BankAccount();
        b.deposit(1000);

        SavingsAccount s = new SavingsAccount();
        s.deposit(500);
        s.withdraw(300);

        FixedDepositAccount f = new FixedDepositAccount();
        f.deposit(1000);
        System.out.println("Interest: " + f.getInterest());
    }
}