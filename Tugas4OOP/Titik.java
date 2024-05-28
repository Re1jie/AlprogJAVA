package Tugas4OOP;

public class Titik {
    private int x;
    private int y;

    public Titik(){
        x=0;
        y=0;
    }
    public Titik(int x1, int y1){
        x1=x;
        y1=y;
    }
    public void titikGeser(int p){
        x=x+p;
        y=y+p;
    }
    public void infoKuadran(){

    }
    public double jarak(int p){
        return p;
    }
}
