package TugasOOP;

public class Silinder extends lingkaran{
    private double tinggi;

    public Silinder(String warna, double radius, double tinggi) {
        super(warna, radius);
        this.tinggi=tinggi;
        System.out.println("Konstruktor Silinder triggered!");
    }
    public void setTinggi(double t){
        tinggi=t;
    }
    public double getTinggi(){
        return tinggi;
    }
    public double hitungVolume(){
        return super.hitungLuas()*tinggi;
    }
    public void printInfo(){
        super.printInfo();
        System.out.println("Volume = "+hitungVolume());
    }

}
