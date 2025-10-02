package Week3Tasks;
class BankAccount{

    String accountNumber;
    double balance;
    BankAccount(){
        balance=0.0;
    }
    BankAccount(double initialBalance){
        balance=initialBalance;
    }
    void deposit(double amount){
        balance+=amount;
    }
    void withdraw(double amount){
        if(amount<=balance) {
            balance -= amount;
        }
        else {
            System.out.println("Insufficient balance");
        }
    }
    void display(){
        System.out.println("Account Number:"+ accountNumber);
        System.out.println("Balance:" +balance);
        System.out.println("----------------------------");
    }
}

public class BankAccountDetails {
    public static void main(String[] args) {
        BankAccount acc1=new BankAccount();
        acc1.accountNumber="ACC1001";
        acc1.deposit(2000);
        acc1.withdraw(500);
        BankAccount acc2=new BankAccount(5000);
        acc2.accountNumber="ACC1002";
        acc2.deposit(1500);
        acc2.withdraw(2000);
        acc1.display();
        acc2.display();
    }
}
