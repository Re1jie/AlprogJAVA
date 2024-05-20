package Alpro2OOP;

public class pegawai1 {
    protected String nama;
    protected double gaji;

    public pegawai1(){
        System.out.println("Konstruktor pegawai running");
    }
    public pegawai1(String n, double hr){
        System.out.println("Konstruktor pegawai running");
        nama=n;
        gaji=hr;
    }
    public void isiData(String n, double hr){
        nama=n;
        gaji=hr;
    }
    public void display(){
        System.out.println("Nama = "+nama+"Gaji = "+gaji);
    }
}
