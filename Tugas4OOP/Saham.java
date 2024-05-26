package Tugas4OOP;

public class Saham {
    private String simbol;
    private String nama;
    private double priorClosingPrice;
    private double currentPrice;
    public double setpriorClosingPrice;
    
    public Saham(String simbol, String nama){
        this.simbol=simbol;
        this.nama=nama;
    }
    
    public double getChangePercent(){
        return ((currentPrice - priorClosingPrice) / priorClosingPrice) * 100;
    }

    public void setSimbol(String simbol){
        this.simbol=simbol;
    }

    public String getSimbol(){
        return simbol;
    }
    
    public void setNama(String nama){
        this.nama=nama;
    }

    public String getNama(){
        return nama;
    }

    public void setpriorClosingPrice(double priorClosingPrice){
        this.priorClosingPrice=priorClosingPrice;
    }

    public double getpriorClosingPrice(){
        return priorClosingPrice;
    }

    public void setcurrentPrice(double currentPrice){
        this.currentPrice=currentPrice;
    }

    public double getcurrentPrice(){
        return currentPrice;
    }
}
