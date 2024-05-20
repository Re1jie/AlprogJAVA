
import java.util.Scanner;
public class nomor3 {
    static double deret(int x) {
        double nilai = 0;
        for (int i = 1; i <= x; i++) {
            nilai += Math.pow(-1, i + 1) / (2 * i - 1);
        }
        return nilai;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input banyaknya elemen (i) : ");
        int elemen = in.nextInt();
        
        System.out.println("i            m(i)");
        System.out.println("______________________");
        
        for (int i = 1; i <= elemen; i += 100) {
            double hasil = deret(i);
            System.out.printf("%d            %.5f\n", i, 4 * hasil);
        }
    }
}
