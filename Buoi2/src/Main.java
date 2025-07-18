import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void chienancuc(int a, int b){
        System.out.println((a+b));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        System.out.print("Hay nhap ho ten cua ban: ");
//        String name = sc.nextLine();
//        System.out.println("Xin Chao " + name);
//        System.out.print("Hay nhap tuoi cua ban: ");
//        int tuoi = sc.nextInt();
//        System.out.println(name + tuoi);
//        System.out.println(" Nhap 2 so nguyen a , b = ");
//                int a = sc.nextInt();
//                int b = sc.nextInt();
//                int t= a + b;
//                int h = a-b;
//                int tc=a*b ;
//                double th = a/b;
//
//        System.out.println(" a + b = " + t);
//        System.out.println(" a - b = " + h);
//        System.out.println(" a * b = " + tc);
//        System.out.println(" a / b = " + th);
        System.out.print(" Nhap 1 so n: ");
        int n = sc.nextInt();
        int[] arr= new int[n];
        int tong =0;
        for(int i=0; i<n; i++){
            System.out.print(" Nhap phan tu thu : "+ (i+1) + " : ");
            arr[i] = sc.nextInt();
            tong += arr[i];
        }
        System.out.println(" Tong bang :  " + tong);
        chienancuc();
    }

}