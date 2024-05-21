package kelas_21Mei2024;

public class Rasional{
    private int pemb;
    private int peny;

    public Rasional(){
        peny=1;
        pemb=0;
    }

    Rasional(int pemb, int peny){
        this.pemb=pemb;
        this.peny=peny;
    }

    public void SetPemb(int pemb){
        this.pemb=pemb;
    }

    public int GetPemb(){
        return pemb;
    }

    public void SetPeny(int peny){
        this.peny=peny;
    }
    public int GetPeny(){
        return peny;
    }

    public void info(){
        System.out.println("Bilangan rasional dengan Pembilang = "+pemb+" dan penyebut "+peny);
    }

    public Rasional kaliKonstanta(int c){
        Rasional hasil = new Rasional();

        hasil.pemb = pemb*c;
        hasil.peny = peny;
        return hasil;
    }
    
    public boolean IsSama(Rasional A){
        boolean hasil;

        hasil = A.GetPemb()*this.GetPeny()==A.GetPeny()*this.GetPemb();
        return hasil;
    }
    
    public Rasional Tambah(Rasional A){
        Rasional hasil = new Rasional();

        hasil.pemb = this.GetPemb()*A.GetPeny()+A.GetPemb()*this.GetPeny();
        hasil.peny = this.GetPeny()*A.GetPeny();
        return (hasil);
    }

    public double ToDesimal(){
        return ((double)pemb/(double)peny);
    }

    public void IsEqual(Rasional A){
        if(A.GetPemb()*this.GetPeny()==A.GetPeny()*this.GetPemb()){
            System.out.println("Bilangan A sama dengan B ");
        } else {
            System.out.println("Bilangan A tidak sama B ");
        }
    }
}