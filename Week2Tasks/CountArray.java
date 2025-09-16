public class CountArray{
    public static void main(String[] args) {
        int arr[]={5, -3, 0, 12, -9, 0, 7};
        int countPos=0;
        int countNeg=0;
        int countZero=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>0){
                countPos++;
            }
            else if(arr[i]<0){
                countNeg++;
            }
            else{
                countZero++;
            }
        }
        System.out.println("Number of positive numbers:"+countPos);
        System.out.println("Number of Negative numbers:"+countNeg);
        System.out.println("Number of zeros:"+countZero);
    }
}