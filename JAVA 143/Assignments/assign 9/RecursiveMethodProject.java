public class RecursiveMethodProject {

    public static void main( String[] args ) {
    
        int[] testCases = {0, 123, 98765, -2104, -1};
        String[] testAnswers = { "zero",
                                 "one two three",
                                 "nine eight seven six five",
                                 "negative two one zero four",
                                 "negative one" };
        
        for ( int i = 0; i < testCases.length; i++ ) {
            System.out.println( "printEnglish( " + testCases[ i ] + " )" );
            printEnglish( testCases[ i ] );
            System.out.println();
        }
        System.out.println();
        
        for ( int i = 0; i < testCases.length; i++ ) {
            System.out.println( "toEnglish( " + testCases[ i ] + " )" );
            if ( testAnswers[ i ].equals( toEnglish( testCases[ i ] ) ) ) {
                System.out.println( "success for toEnglish( " + testCases[ i ] + " )" );
            }
            else {
                System.out.println( "fail for toEnglish( " + testCases[ i ] + " )" );
                System.out.println( "toEnglish( " + testCases[ i ] + " ) returns:" );
                String str = toEnglish( testCases[ i ] );
                System.out.println( "'" + str + "'" );
            }
            System.out.println();
            System.out.println();
        }
    }
    public static void printEnglish( int n ) {
        
        if( n < 10 && n > -10 ){
            if ( n < 0){
                System.out.print("negative " + digitToEnglish(n) + " ");
            }
            else{
                System.out.print(digitToEnglish(n) + " ");
            }
        }
        else{
            printEnglish(n / 10); 
            System.out.print(digitToEnglish(n % 10) + " ");
        }
    }

    public static String toEnglish( int n ) {
        if( n < 10 && n > -10){
            if (n < 0){
                return "negative " + digitToEnglish(n) + "";
            }
            else{
                return digitToEnglish(n);
            }
        }
        else{
            return toEnglish(n / 10) +" " + digitToEnglish(n % 10)  ;
        }        
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