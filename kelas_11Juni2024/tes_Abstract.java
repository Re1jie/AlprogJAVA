package kelas_11Juni2024;

public class tes_Abstract {
    public static void main(String[] args) {
        lingkaran L = new lingkaran(4, "red");
        L.info();

        persegi P = new persegi(3, 4, "blue");
        P.info();

        //gk bisa mendeklarasikan, karena ini adalah class abstract
        //Bentuk2d D = new Bentuk2D();
    }
}
