public class ClimbStairs {

    // change STEPS to make new test case
    public static final int STEPS = 6;
    
    public static void main( String[] args ) {
        waysToClimb( STEPS ); 
    }
    public static void waysToClimb( int n ) {
        if ( n > 0 ) {
            System.out.println( waysToClimb( n , "" ) );
        }
    }
    private static String waysToClimb( int n, String paths ) {
        // base case n = 0
        if ( n < 1 ) {
            return paths;
        }
        // base case n = 1
        else if ( paths.length() == 0 && n == 1 ) {
            return "[1]";
        }
        // base case n = 2
        else if ( paths.length() == 0 && n == 2 ) {
            return "[1, 1]\n[2]";
        }
        else if ( n == 1 ) {
            // backtrack by removing first comma
            return "[" + paths.substring(2) + ", 1]\n";
        }
        else if ( n == 2 ) {
            // backtrack by removing first comma
            return "[" + paths.substring(2) + ", 1, 1]\n"
                 + "[" + paths.substring(2) + ", 2]\n";
        }
        else { // recurse
            return waysToClimb( n - 1, paths + ", 1" ) 
                 + waysToClimb( n - 2, paths + ", 2" );
        }
    }
}