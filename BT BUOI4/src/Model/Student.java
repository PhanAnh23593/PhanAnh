package Model;

public class Student {
    protected int birthday;
    protected String name;
    protected String address;
    protected double pointtx1;
    protected double pointtx2;
    protected double pointkthp;
    protected int sotietnghi;

    public Student(String name, int birthday, String address,
                   double pointtx1, double pointtx2, double pointkthp, int sotietnghi) {
        this.name = name;
        this.birthday = birthday;
        this.address = address;
        this.pointtx1 = pointtx1;
        this.pointtx2 = pointtx2;
        this.pointkthp = pointkthp;
        this.sotietnghi = sotietnghi;
    }

    public double getGPA() {
        return pointtx1 * 0.2 + pointtx2 * 0.3 + pointkthp * 0.5;
    }

    public void setBirthday(int birthday) {
        this.birthday = birthday;
    }

    public double getPointkthp() {
        return pointkthp;
    }
    public void setPointkthp(double pointkthp) {
        this.pointkthp = pointkthp;
    }

    public double getPointtx2() {
        return pointtx2;
    }

    public void setPointtx2(double pointtx2) {
        this.pointtx2 = pointtx2;
    }

    public double getPointtx1() {
        return pointtx1;
    }

    public void setPointtx1(double pointtx1) {
        this.pointtx1 = pointtx1;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getSotietnghi() {
        return sotietnghi;
    }

    public void setSotietnghi(int sotietnghi) {
        this.sotietnghi = sotietnghi;
    }

    public int getAge() {
            return 2025 - birthday;
        }
    }
