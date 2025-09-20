public class PyramidOfStars{
    public static void main(String[] args){
        int n=5;
        int star=1;
        for(int i=1;i<=n;i++){
            for(int j=n;j>i;j--){
                System.out.print(" ");
            }
            for(int k=1; k<=star;k++){
                System.out.print("*");
            }
            star+=2;
            System.out.println();
        }
    }
}
