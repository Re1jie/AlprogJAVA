package TugasRei;

public class Bapak2 extends Kakek{
    private String jenisService2;

    public Bapak2(String objek, String jenisService2) {
        super(objek);
        this.jenisService2=jenisService2;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Jenis service : "+jenisService2);
    }
}
