package Week1Tasks;
import java.util.Scanner;
public class BankBalance{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int balance=sc.nextInt();
        if(balance>0) {
            System.out.println("Positive Balance");
        }
        else if(balance<0) {
            System.out.println("Overdraft");
        }
        else {
            System.out.println("Zero Balance");
        }
        sc.close();
    }
}