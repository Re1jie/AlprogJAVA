package Tugas4OOP;

public class tesTitik {
    public static void main(String[] args) {
        Titik point1 = new Titik(5, 5);
        Titik point2 = new Titik(-9, 3);
    
        //menggeser titik
        point1.titikGeser(5);
        //melihat titik sekarang
        point1.printInfo();

        //cek dia di kuadran mana
        point1.infoKuadran();
        point2.infoKuadran();

        // Menghitung jarak antara dua titik
        double distance = point1.jarak(point2);
        System.out.println("Jarak antara point1 dan point2: " + distance);
    }
}
