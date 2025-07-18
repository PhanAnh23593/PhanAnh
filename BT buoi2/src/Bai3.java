

import java.util.Scanner;
public class Bai3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Nhap số cặp cần kiểm tra tối thiểu lớn hơn 4 :  ");

        int n;
        n = sc.nextInt();
        if (n <5 ){
            do {
                System.out.println(" Nhap lai n lon hon 4 : ");
                n = sc.nextInt();
            }while(n < 5);
        }
        for (int i=0;i< n ; i++) {
            System.out.println(" Nhap 2 so nguyen a , b = ");
            int a = sc.nextInt();
            int b = sc.nextInt();
            int t = a + b;
            int h = a - b;
            int tc = a * b;
            double th = a / b;
            System.out.println(" a + b = " + t);
            System.out.println(" a - b = " + h);
            System.out.println(" a * b = " + tc);
            System.out.println(" a / b = " + th);
            if(a==b){
                System.out.println(" a == b");
            }
            else System.out.println(" a khac b");
        }
    }
}
