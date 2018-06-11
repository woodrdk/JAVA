import java.io.*;
import java.util.*;

public class TestComparators {
    public static void main( String[] args ) 
        throws FileNotFoundException {
        Scanner inFile = new Scanner( new File( "VehicleFile.txt" ) );
        List<Vehicle> theVehicles = new ArrayList<Vehicle>(); 
        
        while( inFile.hasNextLine() ) {
            theVehicles.add( new Vehicle( inFile.nextLine() ) );
        }
        
        System.out.println( "Unsorted data" );
        for( int i = 0; i < theVehicles.size(); i++ ) {
            System.out.println( theVehicles.get( i ) );
        }
        
                
        Collections.sort( theVehicles, new MakeComparator() );
        System.out.println();
        System.out.println( "Sorted by Make." );
        for( int i = 0; i < theVehicles.size(); i++ ) {
            System.out.println( theVehicles.get( i ) );
        }
        
        Collections.sort( theVehicles, new ModelComparator() );
        System.out.println();
        System.out.println( "Sorted by Model." );
        for( int i = 0; i < theVehicles.size(); i++ ) {
            System.out.println( theVehicles.get( i ) );
        }

        
        Collections.sort( theVehicles, new YearComparator() );
        System.out.println();
        System.out.println( "Sorted by Year." );
        for( int i = 0; i < theVehicles.size(); i++ ) {
            System.out.println( theVehicles.get( i ) );
        }
        
        Collections.sort( theVehicles, new MileageComparator() );
        System.out.println();
        System.out.println( "Sorted by Mileage." );
        for( int i = 0; i < theVehicles.size(); i++ ) {
            System.out.println( theVehicles.get( i ) );
        }
        
        Collections.sort( theVehicles, new ConditionComparator() );
        System.out.println();
        System.out.println( "Sorted by Condition." );
        for( int i = 0; i < theVehicles.size(); i++ ) {
            System.out.println( theVehicles.get( i ) );
        }

    }
}