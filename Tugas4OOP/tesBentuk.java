package Tugas4OOP;

public class tesBentuk {
    public static void main(String[] args) {
    //Deklarasi object
    Lingkaran ling1  = new Lingkaran(4, "biru");
    Silinder sil1 = new Silinder(4, "hitam", 5);

    //Uji Luas Lingkaran
    ling1.printInfo();

    //Uji Volume Silinder
    sil1.printInfo();
    }
}
