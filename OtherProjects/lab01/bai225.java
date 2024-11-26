import javax.swing.JOptionPane;
import java.util.Scanner;
public class bai225{
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
double num1= sc.nextDouble();
double num2= sc.nextDouble();
System.out.println("Tong "+num1+num2);
System.out.println("Hieu "+Math.abs(num1-num2));
System.out.println("Thuong "+num1/num2);
System.out.println("Tich "+num1*num2);
}
}
