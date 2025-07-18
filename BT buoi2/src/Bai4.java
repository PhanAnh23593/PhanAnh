import java.util.Scanner;
public class Bai4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        long  sum =0L;
        System.out.println(" Nhap 5 so cho vao mang : ");
        for (int i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();
            sum += arr[i];
        }
        int max = arr[0];
        System.out.println( " Cac phan tu vua nhap vao mang la : ");
        for (int i = 0; i < 5; i++) {
            if(arr[i] > max) {
                max = arr[i];
            }
            System.out.println(arr[i]);
        }
        System.out.println( " Tong cua cac phan  tu trong mang la : " + sum);
        System.out.println(" Gia tri lon nhat trong mang la : " + max);
    }
}
