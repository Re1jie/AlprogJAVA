package TugasAbstract;

public class Radio implements interfaceElektronik, interfaceChannelRadio{
    private Boolean mesin;
    private int volume;

    public Boolean on(){
        return mesin=true;   
    }
    public Boolean off(){
        return mesin=false;
    }
    public void gantiChannel(int c){
        System.out.println("Channel diganti!");
    }
    public int perbesarVolume(){
        return volume++;
    }
    public int perkecilVolume(){
        return volume--;
    }
}
