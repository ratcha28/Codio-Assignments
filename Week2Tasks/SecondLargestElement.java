import java.util.Arrays;
public class SecondLargestElement {
    public static void main(String[] args) {
        int arr[]={14, 28, 19, 33, 45, 12};
        Arrays.sort(arr);
        int SecondLargest=arr[arr.length-2];
        System.out.println("Second largest element is:"+SecondLargest);
    }
}
