import java.util.*;

public class ExceptionExample {

    public static final int ARRAY_SIZE = 100;
    public static final int RANGE = 200;
    
    public static final String KEEP_GOING = "y";

    public static void main( String[] args ) {
        int[] a = new int[ ARRAY_SIZE ];
        
        Random rand = new Random();
        
        for ( int i = 0; i < a.length; i++ ) {
            a[ i ] = rand.nextInt( RANGE );
        }
        
        Scanner keyboard = new Scanner( System.in );
        
        String keepGoing = KEEP_GOING;
        while ( keepGoing.toLowerCase().substring( 0, 1 ).equals( KEEP_GOING ) ) {
            try {
                System.out.print( "Enter an index: " );
                int index = Integer.parseInt( keyboard.nextLine() );
                System.out.println( "array value at " + index
                                  + " is " + a[ index ] );
                
            }
            catch( ArrayIndexOutOfBoundsException aie ) {
                System.out.println( "ArrayIndexOutOfBoundsException at"
                                  + " index " + aie.getMessage() );
            }
            System.out.print( "Another one? (y/n): " );
            keepGoing = keyboard.nextLine();
        }
    
    }
}