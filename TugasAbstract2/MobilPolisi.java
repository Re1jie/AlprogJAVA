package TugasAbstract2;

public class MobilPolisi extends MobilNegara {
    public void NyalakanTape(){
        System.out.println("Tape menyala!");
    }
    public void NyalakanTV(){
        System.out.println("TV Menyala");
    }
    public void NyalakanAC(){
        System.out.println("AC menyala");
    }
    public void NyalakanSirine() {
        System.out.println("Sirine menyala!");
    }
    public void MatikanSirine() {
        System.out.println("Sirine mati!");
    }
    public void GantiSuaraSirine(int Jenis) {
        System.out.println("Suara sirine diubah!");
    }
    public void NyalakanMesin() {
        System.out.println("Mesin menyala!");
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
