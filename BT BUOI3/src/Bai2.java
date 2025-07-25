import java.util.Scanner;

public class Bai2 {
    public static boolean TEXT (String type){
        String text1 = type.trim();
        String text2 = new StringBuilder(text1).reverse().toString();
        return text1.equalsIgnoreCase(text2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println(" Hãy nhập chuỗi cần kiểm tra : ");
        String type = sc.nextLine();
        if (TEXT(type)){
            type = type.toUpperCase();
            System.out.printf(" Chuỗi %s đối xứng ",type);
        }
        else {
            type = type.toLowerCase();
            System.out.printf(" Chuỗi %s không đối xứng ." , type);
        }
    }
}
