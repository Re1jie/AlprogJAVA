package TugasAbstract2;

public class Ambulance extends MobilNegara{
    public void NyalakanTape(){
        System.out.println("Tape nyala!");
    }
    public void NyalakanTV(){
        System.out.println("TV nyala!");
    }
    public void NyalakanAC(){
        System.out.println("AC nyala!");
    }
    public void NyalakanSirine() {
        System.out.println("Sirine nyala!");
    }
    public void MatikanSirine() {
        System.out.println("Sirine mati!");
    }
    public void GantiSuaraSirine(int Jenis) {
        Jenis = 0;
        Jenis++;
        System.out.println("Suara sirine sekarang : "+Jenis);
    }
    public void NyalakanMesin() {
        System.out.println("Mesin nyala!");
    }
    public void MatikanMesin() {
        System.out.println("Mesin mati!");
    }
    public void TambahkanGerigi() {
        System.out.println("Gerigi ditambahkan!");
    }
    public void TurunkanGerigi() {
        System.out.println("Gerigi diturunkan!");
    }
    public void TekanGas() {
        System.out.println("Gas ditekan!");
    }
    public void TekanRem() {
        System.out.println("Rem ditekan!");
    }
}
