import java.util.Scanner;
public class InputFromKeyboard {
    public static void main(String[] args) {
        Scanner keybroad=new Scanner(System.in);
        System.out.println("What is your name: ");
        String name=keybroad.nextLine();
        System.out.println("How old are you: ");
        int iAge=keybroad.nextInt();
        System.out.println("How tall(m) are you: ");
        double dHeight=keybroad.nextDouble();
        System.out.println("Mrs/Mss "+name+","+iAge+" year old. "+"Your height is "+dHeight+".");
    }
}
