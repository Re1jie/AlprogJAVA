package Alpro2OOP;

public class manajer1 extends pegawai1 {
    public String departemen;
    public manajer1(){
        System.out.println("Konstruktor manajer running");
    }
    public manajer1(String n,double hr, String d){
        super(n, hr);
        System.out.println("Konstruktor manajer running");
        departemen=d;
    }
    public void isiData(String n, double hr, String d){
        super.isiData(n, hr);
        departemen=d;
    }
    public void display(){
        System.out.println("Nama = "+nama+" Gaji = "+gaji+" Departemen = "+departemen);
    }
}
