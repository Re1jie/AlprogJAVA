
import java.util.Scanner;
public class nomor2 {
    public static int numberOfDaysInAYear(int tahun){
        if(tahun % 4 == 0){
            int jumlah_hari = 366;
            return jumlah_hari;
        }
        else {
            int jumlah_hari = 365;
            return jumlah_hari;
        }
    }
    public static void main(String[] args) {
        Scanner input1 = new Scanner(System.in);
        System.out.print("Input tahun awal : ");
        int tahun_awal = input1.nextInt();

        Scanner input2 = new Scanner(System.in);
        System.out.print("Input tahun akhir : ");
        int tahun_akhir = input2.nextInt();
        
        int totalHari = 0;
        for(int tahun = tahun_awal; tahun <= tahun_akhir; tahun++){
            totalHari += numberOfDaysInAYear(tahun);
        }
        System.out.println("Jumlah hari dari tahun "+tahun_awal+" hingga tahun "+tahun_akhir+" adalah : "+totalHari); 
        }
    }

