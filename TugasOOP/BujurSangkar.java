package TugasOOP;

public class BujurSangkar extends Bentuk {
    private double sisi;
    public BujurSangkar(String warna, double sisi) {
        super(warna);
        this.sisi=sisi;
        System.out.println("Konstruktor BujurSangkar triggered!");
    }
    public void setSisi(double sisi){
        this.sisi=sisi;
    }
    public double getSisi(){
        return sisi;
    }
    public double hitungLuas(double sisi){
        return sisi*sisi;
    }
    public void printInfo(){
        super.printInfo();
        System.out.println("Luas = "+hitungLuas(sisi));
    }

}
