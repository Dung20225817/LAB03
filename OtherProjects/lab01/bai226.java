import java.util.Scanner;
public class bai226 {
public static void bacnhat1an() {
    Scanner sc=new Scanner(System.in);
    System.out.println("Nhập cac he so: ");
    double a = sc.nextDouble();
    double b = sc.nextDouble();
    if(a==0){
        if(b==0){
            System.out.println("vo so nghiem");
        }
        else{
            System.out.println("vo nghiem");
        }
        
    }
    else{
        System.out.println("x :" +(-b/a));
    }
}
public static void bacnhat2an(){
    System.out.println("Nhap he so: ");
    Scanner sc= new Scanner(System.in);
    double a11=sc.nextDouble();
    double a12=sc.nextDouble();
    double a21=sc.nextDouble();
    double a22=sc.nextDouble();
    double b1=sc.nextDouble();
    double b2=sc.nextDouble();
    double D=a11*a22-a12*a21;
    double D1=b1*a22-b2*a12;
    double D2=a11*b2-a21*b1;
    System.out.println("gia tri x1: "+D1/D);
    System.out.println("gia tri x2: "+D2/D);
}
public static void bachai1an() {
    System.out.println("Nhap he so: ");
    Scanner sc= new Scanner(System.in);
    double a=sc.nextDouble();
    double b=sc.nextDouble();
    double c=sc.nextDouble();
    double dent=b*b-4*a*c;
    if(dent<0){
        System.out.println("pt vo nghiem");
    }else if(dent==0){
        System.out.println("pt co 1 nghiem"+(-b/(2*a)));
    }else{
        System.out.println("pt co 2 nghiem: "+(-b+Math.sqrt(dent))/(2*a));
        System.out.println("x2: "+(-b-Math.sqrt(dent))/(2*a));
    }
    

}
public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    int trues=1;
    while(trues==1){
    System.out.println("hay chon loai phuong trinh");
    System.out.println("1.Bac nhat 1 an");
    System.out.println("2.Bac nhat 2 an");   
    System.out.println("3.Bac hai 1 an");
    int x=sc.nextInt();
    switch ((x)) {
        case 1:
            bacnhat1an();
            break;
        case 2:
            bacnhat2an();
            break;
        case 3:
            bachai1an();
            break;
        default:
            System.out.println("khong co pt can tim");
            trues=0;
            break;
    }
    }
    sc.close();
}
}
