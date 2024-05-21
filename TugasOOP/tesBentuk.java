package TugasOOP;

public class tesBentuk {
    public static void main(String[] args) {
        BujurSangkar buj1 = new BujurSangkar("Hijau FSAD", 4);
        buj1.printInfo();

        System.out.println("");

        lingkaran ling1 = new lingkaran("Merah Berani", 7);
        ling1.printInfo();

        System.out.println("");

        Silinder sil1 = new Silinder("Hitam Legam", 7, 4);
        sil1.printInfo();
    }   
}
