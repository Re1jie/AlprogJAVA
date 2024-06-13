package TugasAbstract;

public class Radio implements interfaceElektronik, interfaceChannelTV{
    private Boolean mesin;
    private int volume;

    public Boolean on(){
        return mesin=true;   
    }
    public Boolean off(){
        return mesin=false;
    }
    public void gantiChannel(int c){
    }
    public int perbesarVolume(){
        return volume++;
    }
    public int perkecilVolume(){
        return volume--;
    }
}
