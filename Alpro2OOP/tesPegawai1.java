package Alpro2OOP;

public class tesPegawai1 {
    public static void main(String[] args) {
        pegawai1 dinda = new pegawai1();
        dinda.isiData("dinda", 5000000);
        dinda.display();

        manajer1 daus = new manajer1();
        daus.isiData("daus", 7000000, "tegnik");
        daus.display();

        manajer1 fina = new manajer1("fina", 4000000, "HRD");
        fina.display();
    }
}
