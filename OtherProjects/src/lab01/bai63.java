import java.util.Scanner;
public class bai63 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
        for(int j=n-i;j>0;j--){
            System.out.print(" ");
        }
        for(int k=2*i-1;k>0;k--){
            System.out.print("*");
        }
        System.out.println("");
    }
    }
}
