import Model.Student;

import java.util.ArrayList;
import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        ArrayList < Student> stt = new ArrayList<>();
        stt.add (new Student("Anh",2006,"HA TINH",10,9.5,10,0));
        stt.add(new Student("Binh",2006,"Ha Tinh",2,3,7,100))  ;
        System.out.printf("%-9s%-13s%-13s%-13s%-13s%-13s%-13s%-13s\n","Tên","Tuổi","Địa chỉ","Điểm TX1","Điểm TX2","Điểm KTHP","Điểm GPA","Số tiết nghỉ");
        for(Student c : stt){
            System.out.printf("%-9s%-13d%-13s%-13.2f%-13.2f%-13.2f%-13.2f%-13d\n",c.getName(),c.getAge(),c.getAddress(),c.getPointtx1(),c.getPointtx2(),c.getPointkthp(),c.getGPA(),c.getSotietnghi());
        }
    }
}
