/*
 * Class ConditionComparator
 * Author Ken Meerdink
*/
import java.util.*;

/**
 * This class provides a comparator for the Vehicle class.
 * The purpose is to compare on the condition of the 
 * vehicle. The high to low sort order is E G F P.
 *
 * @author Ken Meerdink
 * @version TCSS 143 Spring 2012
 */

public class ConditionComparator implements Comparator<Vehicle> {
    
    // Conditions in sorted order.
    private final String conditions = "EGFP";
    
    /**
     * This method is the only one in the class.
     * It implements the comparator for the condition field 
     * of the class Vehicle. 
     *
     * @param first vehicle on the left of comparison
     * @param second vehicle on the right of comparison
     * @return comparison of first and second accoring to 
     *         condition: E G F P
     */    
    public int compare( Vehicle first, Vehicle second ) {
        
        return conditions.indexOf( first.getCondition() )
             - conditions.indexOf( second.getCondition() );
    }
}