package Week4Tasks;
abstract class BankAccount {
    double balance;
    public BankAccount(double balance) {
        this.balance = balance;
    }
    abstract void deposit(double amount);
    abstract void withdraw(double amount);
}
class SavingsAccount extends BankAccount {
    final double MIN_BALANCE = 500;
    public SavingsAccount(double balance) {
        super(balance);
    }
    void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
    }
    void withdraw(double amount) {
        if (balance - amount >= MIN_BALANCE) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Cannot withdraw! Maintain minimum balance of " + MIN_BALANCE);
        }
    }
}

class CurrentAccount extends BankAccount {
    final double OVERDRAFT_LIMIT = -1000;
    public CurrentAccount(double balance) {
        super(balance);
    }
    void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
    }
    void withdraw(double amount) {
        if (balance - amount >= OVERDRAFT_LIMIT) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Overdraft limit reached! Cannot withdraw.");
        }
    }
}

public class BankDemo {
    public static void main(String[] args) {
        BankAccount sa = new SavingsAccount(1000);
        sa.deposit(500);
        sa.withdraw(800);
        System.out.println("Savings Balance: " + sa.balance);
        System.out.println();
        BankAccount ca = new CurrentAccount(200);
        ca.deposit(300);
        ca.withdraw(600);
        ca.withdraw(1000);
        System.out.println("Current Balance: " + ca.balance);
    }
}
