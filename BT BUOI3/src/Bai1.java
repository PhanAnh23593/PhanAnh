import java.util.Scanner;


public class Bai1 {
    public static final String Square = "Square";
    public static final String Triangle = "Triangle";
    public static final String Circle = "Circle";

    public static double Squares(double side ) {
        return side * side;
    }
     public static double Triangles (double height , double base){
         return 0.5 * height * base;
        }
    public static double Circles (double r) {
        return Math.PI * r * r;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
       System.out.println(" Hay nhap hinh dang cua vien gach (Circle,Triangle,Square) : ");
       String type = sc.nextLine();
       double area;
       switch(type){
           case Square :
               System.out.println(" Nhap gia tri cua canh hinh vuong : ");
               double side = sc.nextDouble();
               area = Squares(side);
               System.out.printf(" Dien tich cua vien gach hinh %s la : %.2f",type , area);
               break;
           case Triangle :
               System.out.println(" Nhap chieu cao cua hinh tam giac : ");
               double height = sc.nextDouble();
               System.out.println("Nhap do dai canh day cua hinh tam giac : ");
               double base = sc.nextDouble();
               area = Triangles(height, base);
               System.out.printf(" Dien tich cua vien gach hinh %s la : %.2f",type , area);
               break;
           case Circle :
               System.out.println(" Nhap do dai ban kinh cua hinh tron : ");
               double r = sc.nextDouble();
               area = Circles(r);
               System.out.printf(" Dien tich cua vien gach hinh %s la : %.2f",type , area);
               break;
           default :
               System.out.println(" Hinh dang khong hop le : ");
               break;
           }
        }
    }
