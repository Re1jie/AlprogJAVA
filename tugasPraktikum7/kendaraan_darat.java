package tugasPraktikum7;

public class kendaraan_darat extends kendaraan {
    private int roda;

    //kontruktor punyanya si kendaraan darat
    public kendaraan_darat(String wn, String bb, int km, int rd) {
        super(wn, bb, km);
        roda = rd;
    }

    @Override
    public void inpo() {
        super.inpo();
        System.out.println("Infokan roda ada = "+roda);
    }

}
