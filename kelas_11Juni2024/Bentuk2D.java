package kelas_11Juni2024;

public abstract class Bentuk2D{
    private String warna;

    protected Bentuk2D(){
        warna="putih";
    }

    protected Bentuk2D(String w){
        warna = w;
    }

    public void setWarna(String w){
        warna = w;
    }

    public String getWarna(){
        return warna;
    }
    public abstract double hitungLuas();
    public abstract double hitungKeliling();

    public void info(){
        System.out.println("Warna benda : "+getWarna());
        System.out.println("Luas benda : "+hitungLuas());
        System.out.println("Keliling Benda : "+hitungKeliling());
    }
}

class lingkaran extends Bentuk2D{
    private double jari;

    public lingkaran(){
        super();
        jari=0;
    }
    public lingkaran(double r, String w){
        super(w);
        jari=r;
    }
    public double hitungLuas(){
        return Math.PI*jari*jari;
    }
    public double hitungKeliling(){
        return 2*Math.PI*jari;
    }
}
