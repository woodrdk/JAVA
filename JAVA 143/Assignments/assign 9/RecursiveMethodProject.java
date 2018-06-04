// file: RecursiveMethodProject.java
// author: Ken Meerdink - main method
// author: Robert Wood Jr. - printEnglish & toEnglish

public class RecursiveMethodProject {

    public static void main( String[] args ) {
        printEnglish( 153 );
        System.out.println();
        
        printEnglish( 98765 );
        System.out.println();
        
        printEnglish( -2104 );
        System.out.println();
        System.out.println();
        
        System.out.println( toEnglish( 153 ) );
        System.out.println( toEnglish( 98765 ) );
        System.out.println( toEnglish( -2104 ) );
        
    }
    public static void printEnglish( int n ) {
        // REPLACE THIS CODE

        System.out.print( "printEnglish( " + n + ")" );
        
    }

    public static String toEnglish( int n ) {
        // REPLACE THIS CODE
        return "toEnglish( " + n + ")" ;
    }
    
    private static String digitToEnglish( int n ) {
        n = Math.abs( n );
        if ( n > 9 ) {
            return null;
        }
        else {
            return new String[]
                { "zero", "one", "two", "three", "four", 
                  "five", "six", "seven", "eight", "nine" }[ n ];
        }
    }
}