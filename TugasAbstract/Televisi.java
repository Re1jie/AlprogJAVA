package TugasAbstract;

public class Televisi implements interfaceElektronik, interfaceChannelRadio{
    private Boolean mesin;
    private String merk;
    private Boolean listrik;
    public Boolean on(){
        return mesin=true;
    }
    public Boolean off() {
        return mesin=false;
    }
    public void gantiChannel(int c){

    }
    
}
