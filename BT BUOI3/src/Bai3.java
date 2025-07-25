import java.util.Scanner;

public class Bai3 {
    public static void main( String[] args ) {
        Scanner sc = new Scanner (System.in);
        int a = (int) (Math.random() * 100);
        int b = (int) (Math.random() * 100);
        int c = (int) (Math.random() * 200);
        System.out.println(" Phep toan cua ban la : ");
        System.out.println(a + " + " + b + " = " + c);
        System.out.println("Dự đoán kết quả của phép toán (dung/sai) : ");
        String type = sc.nextLine();
        if (type.equalsIgnoreCase("dung") || type.equalsIgnoreCase("sai")){
            if(a+b == c) {
                if (type.equalsIgnoreCase("dung")) {
                    System.out.println("Bạn đã dự đoán đúng . ");
                } else {
                    System.out.println(" Bạn đã dự đoán sai .");
                }
            }
            else if  (a+b != c) {
                if(type.equalsIgnoreCase("sai")){
                    System.out.println("Bạn đã dự đoán đúng ");
                }
                else {
                    System.out.println(" Bạn đã dự đoán sai .");
                }
            }
        }
        else {
            System.out.println(" Bạn sự đoán không hợp lệ : ");
        }
    }
}
