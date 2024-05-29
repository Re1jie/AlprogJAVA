package TugasRei;

public class Bapak1 extends Kakek{
    private String jenisService;
    
    public Bapak1(String objek, String jenisService) {
        super(objek);
        this.jenisService=jenisService;
        
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Jenis service : "+jenisService);
    }
}
