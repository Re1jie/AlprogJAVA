package TugasAbstract;

public class testes {
    public static void main(String[] args) {
        System.out.println("-----------tes radio-----------");
        Radio a = new Radio();
        a.gantiChannel(6);
        System.out.println("-----------tes televisi-----------");
        Televisi b = new Televisi();
        System.out.println(b.MatikanMesin());
        System.out.println(b.NyalakanMesin());
    }
}
