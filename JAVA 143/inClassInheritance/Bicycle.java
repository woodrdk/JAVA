
public class Bicycle implements Dashboard{
    private int speed;
    private int rpms;
    
    public Bicycle(int speed, int rpms){
        this.speed = speed;
        this.rpms = rpms;
    }
    public int speed(){
        return speed;
    }
    public int rpms(){
        return rpms;
    }
    public boolean tooHot(){
        return false;
    }
    public boolean lowOil(){
        return false;
    }
}