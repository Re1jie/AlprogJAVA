package kelas_28Mei2024;

public class implementasiPolimor {
    public static void main(String[] args) {
        Anak a = new Anak();
        a.metode1(1);
        a.metode1(1, 2, 3);
        a.metode1(1, 2);
        a.metode2("aaa");
        a.metodeAnak();

        Induk i = new Anak();
        i.metode1(1);
        i.metode1(1, 2);
        i.metode2("aaa");
    }
}
