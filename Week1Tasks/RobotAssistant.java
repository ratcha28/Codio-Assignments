import java.util.Scanner;
public class RobotAssistant{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int op=sc.nextInt();
        if(op==1){
            System.out.println(a+b);
        }
        else if(op==2){
            System.out.println(a-b);
        }
        else if(op==3){
            System.out.println(a*b);
        }
        else if(op==4){
            if(b!=0){
                System.out.println(a/b);
            }
            else{
                System.out.println("Division by zero is not possible");
            }
        }
        else{
            System.out.println("Invalid Operation");
        }
        sc.close();
    }
}