
public class Ferrari implements Dashboard{
    private int speed;
    private int rpms; 
    private int waterTemp;
    private int oilPressure;
    
    public Ferrari(int speed, int rpms, int waterTemp, int oilPressure){
        this.speed = speed;
        this.rpms = rpms;
        this.waterTemp = waterTemp;
        this.oilPressure = oilPressure;
    }
    public int speed(){
        return speed;
    }
    public int rpms(){
        return rpms;
    }
 
    public boolean tooHot(){
        return waterTemp > 240;
    }
    public boolean lowOil(){
        return oilPressure < 40;
    }

}