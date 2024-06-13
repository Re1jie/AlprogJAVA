package kelas_11Juni2024;

public class tes_Interface {

    public static void main(String[] args) {
        Point P = new Point();
        P.print();

        Segitiga S = new Segitiga(3, 8);
        S.print();
    }
        
}
interface Shape{
    public double area();
    public double volume();
}

class lingkaran implements Shape{
    
}

class Point implements Shape{
    static int x,y;
    public void point(){
        x=0;
        y=0;
    }

    public double area(){
        return 0;
    }

    public double volume(){
        return 0;
    }

    public void print(){
        System.out.println("point: "+x+", "+y);
    }
}

class Segitiga implements Shape {
    static int alas, tinggi;

}
