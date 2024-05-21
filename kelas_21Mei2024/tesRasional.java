package kelas_21Mei2024;

public class tesRasional {
    public static void main(String[] args) {
        //deklarasi
        Rasional Bil1 = new Rasional(2, 4);
        Rasional Bil2 = new Rasional(6, 12);
        Rasional Bil3 = new Rasional();
        Rasional Bil4 = new Rasional();

        //print info pre
        System.out.println("Sebelum : ");
        Bil1.info();
        Bil2.info();

        //operasi-operasi
        Bil3 = Bil1.Tambah(Bil2);
        Bil4 = Bil1.kaliKonstanta(10);
        System.out.println("Bil 1 + Bil 2 :");
        Bil3.info();
        System.out.println("Bil 1 * c :");
        Bil4.info();

        //cek fakta
        System.out.println("apakah bilangan 1 sama dengan bilangan 4? : ");
        if(Bil1.IsSama(Bil4)){
            System.out.println("Sama");
        } else {
            System.out.println("Tidak Sama");
        }

        System.out.println("Konversi Bil1 ke bentuk desimal : ");
        System.out.println("Nilai Desimal : "+Bil1.ToDesimal());
        Bil1.IsEqual(Bil2);
    }
}
