package TugasAbstract;

public class Televisi implements interfaceElektronik, interfaceChannelTV{
    private Boolean mesin;
    private String merk;
    private Boolean listrik;

    public Boolean on(){
        return mesin=true;
    }
    public Boolean off() {
        return mesin=false;
    }
    public Boolean NyalakanMesin(){
        return mesin=true;
    }
    public Boolean MatikanMesin(){
        return mesin=false;
    }
    public void gantiChannel(int c) {
      
    }
      
}
