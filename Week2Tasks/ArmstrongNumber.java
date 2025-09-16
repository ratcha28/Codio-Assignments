public class ArmstrongNumber {
    public static void main(String[] args) {
        int n=153;
        int val=n;
        int sum=0;
        while(n!=0) {
            int digit = n % 10;
            sum += digit * digit * digit;
            n /= 10;
        }
        if(sum==val){
            System.out.println(val+" is an Armstrong Number");
        }
        else{
            System.out.println(val+" is not an Armstrong Number");
        }
    }
}
