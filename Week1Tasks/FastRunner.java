package Week1Tasks;
import java.util.Scanner;
public class FastRunner{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int time1=sc.nextInt();
        int time2=sc.nextInt();
        if(time1>time2)
            System.out.println("Arjun");
        else if(time1<time2)
            System.out.println("Varun");
        else
            System.out.println("tie");
    }
}