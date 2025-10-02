package Week1Tasks;
public class LightBulbTest {
    public static void main(String[] args) {
        int[] numbers={4,7,0};

        for(int i=0;i<numbers.length;i++ ) {
            int n = numbers[i];
            System.out.println("n=" + n);
            if (n % 2 == 0)
                System.out.println("ON");
            else
                System.out.println("OFF");
        }
    }
}