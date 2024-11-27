import java.util.Scanner;
public class bai64 {
    public static void leapyear(String month) {
        // Sử dụng equals() để so sánh chuỗi
        if (month.equals("January") || month.equals("Jan") || month.equals("Jan.") ||
        month.equals("March") || month.equals("Mar") || month.equals("Mar.") ||
        month.equals("May") || month.equals("July") || month.equals("Jul") ||
        month.equals("August") || month.equals("Aug") || month.equals("Aug.") ||
        month.equals("October") || month.equals("Oct") || month.equals("Oct.") ||
        month.equals("December") || month.equals("Dec") || month.equals("Dec.") ||
        month.equals("1") || month.equals("3") || month.equals("5") || 
        month.equals("7") || month.equals("8") || month.equals("10") || month.equals("12")) {
            System.out.println("Thang co 31 ngay.");
        } else if (month.equals("February") || month.equals("Feb") || month.equals("Feb.") || month.equals("2")) {
            System.out.println("Thang co 29 ngay (nam nhuan).");
        } else {
            System.out.println("Thang co 30 ngay.");
        }
    }

    public static void commonyear(String month) {
        if (month.equals("January") || month.equals("Jan") || month.equals("Jan.") ||
        month.equals("March") || month.equals("Mar") || month.equals("Mar.") ||
        month.equals("May") || month.equals("July") || month.equals("Jul") ||
        month.equals("August") || month.equals("Aug") || month.equals("Aug.") ||
        month.equals("October") || month.equals("Oct") || month.equals("Oct.") ||
        month.equals("December") || month.equals("Dec") || month.equals("Dec.") ||
        month.equals("1") || month.equals("3") || month.equals("5") || 
        month.equals("7") || month.equals("8") || month.equals("10") || month.equals("12")) {
            System.out.println("Tháng có 31 ngay.");
        } else if (month.equals("February") || month.equals("Feb") || month.equals("Feb.") || month.equals("2")) {
            System.out.println("Thang co 28 ngay.");
        } else {
            System.out.println("Thang co 30 ngay.");
        }
    }
    public static void main(String[] args) {
        int count=0;
        Scanner sc= new Scanner(System.in);
        while(count<5){
            System.out.println("nhap nam/thang: ");
            int year=sc.nextInt();
            sc.nextLine();
            String month=sc.nextLine();
            if(year % 4 == 0 && year>0 && (year % 100 != 0 || year % 400 == 0)){
                leapyear(month);
                count=0;
            }else if(year>0){
                commonyear(month);
                count=0;
            }else{
                System.out.println("year is invalue,check again: "); 
                count+=1;
            }
        }
        System.out.println("end of program");
    }
}
