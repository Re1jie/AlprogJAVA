package tugasPraktikum7;

public class kendaraan_laut extends kendaraan{
    private String jenisjangkar;

    public kendaraan_laut(String wn, String bb, int km, String jj) {
        super(wn, bb, km);
        jenisjangkar = jj;
    }

    @Override
    public void inpo() {
    super.inpo();
    System.out.println("Infokan jenis jangkar = "+jenisjangkar);
    }

}
