package kelas_28Mei2024;

public class Anak extends Induk{
    public void metode1(int x){
        System.out.println("ini dari anak1"+x);
    }

    public void metode1(int x, int y, int z){
        super.metode1(x, y);
        System.out.println("ini dari anak1"+x);
    }

    public void metodeAnak(){
        super.metode2("anton");
        System.out.println("metode anak");
    }
}
