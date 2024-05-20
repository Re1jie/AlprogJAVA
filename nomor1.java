
import java.util.Scanner;
public class nomor1 {
    public static boolean ValidasiUtama(String Sandi){
        return Sandi.length() >= 8 && ValidasiAdaDigit(Sandi) && ValidasiAdaChar(Sandi) && ValidasiJumlahDigit(Sandi) >= 2;
    }
    public static boolean ValidasiAdaDigit(String str){
        for (char c : str.toCharArray()){
            if (Character.isDigit(c)){
                return true;
            }
        }
        return false;
    }
    public static boolean ValidasiAdaChar(String str){
        for (char c : str.toCharArray()){
            if (Character.isLetter(c)){
                return true;
            }
        }
        return false;
    }
    public static int ValidasiJumlahDigit(String str){
        int hitung = 0;
        for (char c : str.toCharArray()){
            if (Character.isDigit(c)){
                hitung++;
            }
        }
        return hitung;
    }
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.print("Masukkan Sandi : ");
        String Sandi = x.nextLine();

        String hasil = ValidasiUtama(Sandi) ? "Kata sandi Valid" : "Kata Sandi Tidak Valid";
        System.out.println(hasil);
    }
}
