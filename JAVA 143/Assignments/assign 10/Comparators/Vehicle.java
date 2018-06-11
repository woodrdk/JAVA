public class Vehicle {

    private String make;          // manufacturer, e.g. Ford, Toyota.
    private String model;         // product, e.g., Camry, Corolla.
    private int year;             // integer from 1880 to 9999.
    private int mileage;          // integer from 0 up to infinity.
    private char condition;       // E, G, F, P which stand for 
                                  // Excellent, Good, Fair, Poor
                                  // We must sort in that order.
    
    public Vehicle( String str ) {
        String[] tokens = str.split("\\t");
        make = tokens[ 0 ];
        model = tokens[ 1 ];
        year = Integer.parseInt( tokens[ 2 ] );
        mileage = Integer.parseInt( tokens[ 3 ] );
        condition = tokens[ 4 ].charAt( 0 );
    }
    
    public String getModel() {
        return model;
    }
    
    public String getMake() {
        return make;
    }
    
    public int getYear() {
        return year;
    }
    
    public int getMileage() {
        return mileage;
    }
    
    public char getCondition() {
        return condition;
    }
    
    public String toString() {
        return "Make:" + make + "\tModel:" + model + "\tYear:" + year 
             + "\tMileage:" + mileage + "\tCondition: " + condition;
    }
}