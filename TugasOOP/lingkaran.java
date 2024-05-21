package TugasOOP;

public class lingkaran extends Bentuk {
    private double radius;

    public lingkaran(String warna, double radius) {
        super(warna);
        this.radius=radius;
        System.out.println("Konstruktor lingkaran triggered!");
    }
    public void setRadius(double r){
        radius=r;
    }
    public double getRadius(){
        return radius;
    }
    public double hitungLuas(){
        return 3.14*radius*radius;
    }
    public void printInfo(){
        super.printInfo();
        System.out.println("Luas = "+hitungLuas());
    }
}
