package tugasPraktikum7;

public class tesKendaraan {
    public static void main(String[] args) {
        System.out.println("MOTOR IDAMAN");
        sepeda_motor mantab = new sepeda_motor("Pink", "avtur", 69, 2, "Smasnug");
        mantab.inpo();
        System.out.println("");
        System.out.println("KAPAL KARAM");
        perahu_layar keren = new perahu_layar("hitam legam", "pertamax", 420, "jangkar bawaan", 1);
        keren.inpo();
    }
}
