package Tugas4OOP;

public class Titik {
    private int x;
    private int y;

    public Titik(){
        x=0;
        y=0;
    }
    public Titik(int x1, int y1){
        x=x1;
        y=y1;
    }
    public void titikGeser(int p){
        x=x+p;
        y=y+p;
    }
    public void infoKuadran(){
        if(x>0 && y>0){
            System.out.println("kuadran 1");
        } else if(x<0 && y>0){
            System.out.println("kuadran 2");
        } else if(x<0 && y<0){
            System.out.println("kuadran 3");
        } else if(x>0 && y<0){
            System.out.println("kuadran 4");
        } else if (x == 0) {
            System.out.println("The point is on the Y-axis");
        } else if (y == 0) {
            System.out.println("The point is on the X-axis");
        }
    }
    public double jarak(Titik p1){
        int dx = p1.x - this.x;
        int dy = p1.y - this.y;
        return Math.sqrt(dx * dx + dy * dy);
    }
    public void printInfo(){
        System.out.println("titik x saat ini : "+x);
        System.out.println("titik y saat ini : "+y);
    }
}
