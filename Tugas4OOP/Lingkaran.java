package Tugas4OOP;

public class Lingkaran {
    private double radius;
    protected String warna;
    
    public Lingkaran(double radius, String warna){
        this.radius=radius;
        this.warna=warna;
    }

    public void setRadius(double radius){
        this.radius=radius;
    }

    public double getRadius(){
        return radius;
    }

    public double hitungLuas(){
        return 3.14*radius*radius;
    }

    public void printInfo(){
        System.out.println("Lingkaran "+warna+" luas : "+hitungLuas());
    }
}
