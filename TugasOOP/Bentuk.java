package TugasOOP;

public class Bentuk {
    private String warna;

    public Bentuk(String warna){
        this.warna=warna;
        System.out.println("Konstruktor Bentuk triggered!");
    }
    public void serWarna(String warna){
        this.warna=warna;
    }
    public String getWarna(){
        return warna;
    }
    public void printInfo(){
        System.out.println("Bentuk berwarna = "+warna);
    }
}
