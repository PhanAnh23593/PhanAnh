import java.util.Scanner;
public class Bai1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print(" Nhap ten cua ban : ");
        String name = sc.nextLine();
        System.out.print(" Nhap tuoi cua ban : ");
        int tuoi = sc.nextInt();
        System.out.print(" Nhap chieu cao cua ban (cm) : ");
        double tall = sc.nextDouble();
        System.out.println("  ten cua ban : " + name);
        System.out.println(" tuoi cua ban : " + tuoi);
        System.out.println(" chieu cao cua ban la : " + tall);

    }
}
