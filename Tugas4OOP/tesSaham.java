package Tugas4OOP;

public class tesSaham {
    public static void main(String[] args) {
        Saham x = new Saham("HKN", "Harta Ku");
        x.setpriorClosingPrice(34.50);
        x.setcurrentPrice(34.35);
        System.out.println("persentase perubahan harga = "+x.getChangePercent()+" %");
    }
}
