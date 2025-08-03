import Model.Student;


import java.lang.classfile.instruction.SwitchCase;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Bai2 {
    public static final ArrayList < Student> stt = new ArrayList<>();
    public static final Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        stt.add (new Student("Anh",2006,"HA TINH",10,9.5,10,0));
        stt.add(new Student("Binh",2006,"Ha Tinh",2,3,7,100))  ;
        System.out.println("----------Quản lÝ Sinh viên--------------");
        System.out.println("Hãy chọn chức năng : ");
        System.out.println("1 : Thêm sinh viên mới");
        System.out.println("2 : Sửa thông tin sinh viên");
        System.out.println("3 : Sắp xếp sinh viên theo tuổi  ");
        System.out.println("4 : Sắp xếp sinh viên theo GPA");
        System.out.println("5 : Sắp xếp sinh viên theo số tiết nghỉ");
        System.out.println("6 : Xóa sinh viên khỏi danh sách ");
        System.out.println("7 : In ra danh sách sinh viên : ");
        System.out.println("0 : KÊT THÚC");
        System.out.println(" chọn : ");
        int type = sc.nextInt();
        sc.nextLine();
        switch(type){
            case 1 :
                AddStudent();
                Print();
                break;
            case 2 :
                FixStudent();
                Print();
                break;
            case 3 :
                sortbyAge();
                Print();
                break;
            case 4 :
                sortbyGPA();
                Print();
                break;
            case 5 :
                sortSotietnghi();
                Print();
                break;
            case 6 :
                DeleteStudent();
                Print();
                break;
            case 7 :
                Print();
                break;
            case 0 :
                System.out.println(" Dừng chương trình ");
            default :
                System.out.println("Không hợp lệ . ");
                break;

        }
    }

    public static void AddStudent(){
        System.out.println(" Nhập Tên : ");
        String name = sc.nextLine();
        System.out.println(" Nhập năm sinh  ");
        int Birthday = sc.nextInt();
        sc.nextLine();
        System.out.println("Nhập địa chỉ : ");
        String Address= sc.nextLine();
        System.out.println(" Nhập điểm TX1 : ");
        double pointtx1 = sc.nextDouble();
        sc.nextLine();
        System.out.println(" Nhập điểm TX 2 ");
        double pointtx2 = sc.nextDouble();
        sc.nextLine();
        System.out.println(" Nhập điểmt kthp : ");
        double pointkthp = sc.nextDouble();
        sc.nextLine();
        System.out.println(" Nhập số tiết nghỉ : ");
        int sotietnghi = sc.nextInt();
        sc.nextLine();
        stt.add(new Student(name,Birthday,Address,pointtx1,pointtx2,pointkthp,sotietnghi));
        System.out.println(" Đã thêm student : ");
    }

    public static void FixStudent(){
        System.out.println(" Nhập tên Student cần sửa : ");
        String name = sc.nextLine();
        for(Student c : stt){
            if(c.getName().equalsIgnoreCase(name)){
                System.out.println(" Nhập tên mới : ");
                c.setName(sc.nextLine());
                System.out.println(" Sửa ngày sinh : ");
                c.setBirthday(sc.nextInt());
                System.out.println(" Sửa địa chỉ : ");
                c.setAddress(sc.nextLine());
                System.out.println(" Sửa điểm TX1 : ");
                c.setPointtx1(sc.nextDouble());
                System.out.println(" Sửa điểm TX2 : ");
                c.setPointtx2(sc.nextDouble());
                System.out.println(" Sửa điểm KTHP : ");
                c.setPointkthp(sc.nextDouble());
                System.out.println("Nhập Số Tiết nghỉ : " );
                c.setSotietnghi(sc.nextInt());
                System.out.println(" Đã sửa thông tin sc . ");
                return;
            }
        }
        System.out.println("Không có tên student trong danh sách :  ");
    }

    public static void sortbyAge (){
        stt.sort(Comparator.comparingInt(Student::getAge) );
        System.out.println(" Đã sắp xếp tuổi : ");
    }

    public static void sortbyGPA(){
        stt.sort(Comparator.comparingDouble(Student::getGPA));
        System.out.println(" Đã sắp xếp theo GPA : ");
    }
    public static void sortSotietnghi(){
        stt.sort(Comparator.comparingInt(Student :: getSotietnghi));
        System.out.println(" Đã sắp xếp theo số tiết nghỉ : ");
    }

    public static void DeleteStudent(){
        System.out.println(" Nhập tên sinh viên cần xóa : ");
        String name = sc.nextLine();
        stt.removeIf(s -> s.getName().equalsIgnoreCase(name));
        System.out.println(" Đã xóa sinh viên : ");
    }

    public static void Print(){
        System.out.println(" ----DANH SACH SINH VIEN ----");
        System.out.printf("%-9s%-13s%-13s%-13s%-13s%-13s%-13s%-13s\n","Tên","Tuổi","Địa chỉ","Điểm TX1","Điểm TX2","Điểm KTHP","Điểm GPA","Số tiết nghỉ");
        for(Student c : stt){
            System.out.printf("%-9s%-13d%-13s%-13.2f%-13.2f%-13.2f%-13.2f%-13d\n",c.getName(),c.getAge(),c.getAddress(),c.getPointtx1(),c.getPointtx2(),c.getPointkthp(),c.getGPA(),c.getSotietnghi());
        }
    }
}
