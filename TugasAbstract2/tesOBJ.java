package TugasAbstract2;

public class tesOBJ {
    public static void main(String[] args) {
        System.out.println("-----------tes mobil pribadi-----------");
        MobilPribadi a = new MobilPribadi();
        a.MatikanMesin();
        a.NyalakanAC();
        a.NyalakanMesin();
        a.NyalakanTV();
        a.NyalakanTape();
        a.TambahkanGerigi();
        a.TekanGas();
        a.TekanRem();
        a.TurunkanGerigi();

        System.out.println("-----------tes bus-----------");
        Bus b = new Bus();
        b.MatikanMesin();
        b.NyalakanAC();
        b.NyalakanMesin();
        b.NyalakanTV();
        b.NyalakanTape();
        b.TambahPenumpang();
        b.TambahkanGerigi();
        b.TekanGas();
        b.TekanRem();
        b.TurunkanGerigi();

        System.out.println("-----------tes ambulan-----------");
        Ambulance c = new Ambulance();
        c.GantiSuaraSirine(2);
        c.MatikanMesin();
        c.MatikanSirine();
        c.NyalakanAC();
        c.NyalakanMesin();
        c.NyalakanSirine();
        c.NyalakanTV();
        c.NyalakanTape();
        c.TambahkanGerigi();
        c.TekanGas();
        c.TekanRem();
        c.TurunkanGerigi();

        System.out.println("-----------tes mobil polisi-----------");
        MobilPolisi d = new MobilPolisi();
        d.GantiSuaraSirine(4);
        d.MatikanMesin();
        d.MatikanSirine();
        d.NyalakanAC();
        d.NyalakanMesin();
        d.NyalakanSirine();
        d.NyalakanTV();
        d.NyalakanTape();
        d.TambahkanGerigi();
        d.TekanGas();
        d.TekanRem();
        d.TurunkanGerigi();
    }
}
