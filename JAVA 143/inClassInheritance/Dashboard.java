/**
 * Dashboard interface is a standardized way of
 * looking at vehicle and engine operating measures
 */
public interface Dashboard {
    public int speed(); // returns the speed of the vehicle
    public int rpms();  // returns the revolutions per minute of the engine
    public boolean tooHot(); // returns true if the engine is beyond its 
                             // upper limit of engine temperature
    public boolean lowOil(); // returns true if the engine is below its
                             // lower limit of engine oil pressure 
}