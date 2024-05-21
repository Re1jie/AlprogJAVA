package kelas_21Mei2024;

public class tesRasional {
    public static void main(String[] args) {
        Rasional Bil1 = new Rasional(2, 4);
        Rasional Bil2 = new Rasional(6, 12);
        Bil1.info();

        Rasional Bil3 = new Rasional();

        Bil3 = Bil1.kaliKonstanta(10);
        Bil3.info();

        Rasional Bil4 = new Rasional();
        Bil4 = Bil1.Tambah(Bil2);
        Bil4.info();

        //ngecek bil sama atau nggak
        if(Bil1.IsSama(Bil4)){
            System.out.println("Sama");
        } else {
            System.out.println("Tidak Sama");
        }

        System.out.println("Nilai Desimal : "+Bil1.ToDesimal());
        Bil1.IsEqual(Bil2);
    }
}
