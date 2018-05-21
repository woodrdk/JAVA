import java.util.*;

/**
 * TODO: Javadoc comment here about Calculator class
 */
public class Calculator {

    // supported Calculator operations
    public static String LEGAL_OPERATORS = "+-*/";
    
    // sentinel value to stop processing loop
    public static final String STOP_STRING = "stop";

    public static void main( String[] args ) {
        Scanner scanner = new Scanner( System.in );
        
        // tell user what to do.
        displayInstructions();
        
        // get first expression or stop command.
        System.out.print( "Enter expression: " );
        String str = scanner.nextLine();
        
        // process input till user types value of STOP_STRING.
        while( !str.toLowerCase().equals( STOP_STRING ) ) {

            String[] tokens = str.split( " " );
            
            // make sure user inputs three tokens
            while ( tokens.length != 3 ) {
                System.out.println( "Put one space between each item in the" );
                System.out.println( "expression. Example: 2 + 3" );
                
                System.out.print( "Enter expression: " );
                str = scanner.nextLine();
                tokens = str.split( " ");
            }
            
            // declare variables here so they are not
            // local to try blocks.
            int firstOperand = 0;
            int secondOperand = 0;
            char operator = '&';
            boolean isValid = true;
            
            // TODO: needs try/catch block
            firstOperand = Integer.parseInt( tokens[ 0 ] );
            
            // we set value of isValid to false
            // whenever we get invalid input.
            operator = tokens[ 1 ].charAt( 0 );
            if ( !LEGAL_OPERATORS.contains( String.valueOf( operator ) ) ) {
                System.out.println( "operator " + operator 
                                  + " not supported.");
                isValid = false;
            }
            
            // TODO:needs try/catch block
            secondOperand = Integer.parseInt( tokens[ 2 ] );
            
            // isValid == true: we have two integers and a legal operator.
            if ( isValid ) {
                int result = calculate( firstOperand, 
                                        secondOperand, 
                                        operator );
            
                System.out.println( firstOperand + " " + operator + " "
                                  + secondOperand + " = " + result );
            }
            
            System.out.print( "Enter expression: " );
            str = scanner.nextLine();
        }
        
    }
    
    /**
     * TODO: Java doc comment here
     */
    public static int calculate( int firstOperand, 
                                 int secondOperand, 
                                 char operator ) {
        if ( operator == '+' ) {
            return firstOperand + secondOperand;
        }
        else if ( operator == '-' ) {
            return firstOperand - secondOperand;
        }
        else if ( operator == '*' ) {
            return firstOperand * secondOperand;
        }
        else {
            return firstOperand / secondOperand;
        }
    }
    
    /**
     * TODO: Java doc comment here
     */
    public static void displayInstructions() {
        System.out.println( "This program evaluates binary arithmetic" );
        System.out.println( "operations. Type an expression using two" );
        System.out.println( "integers and one of the operators + - * /");
        System.out.println( "Put one space between each item in the" );
        System.out.println( "expression. Example: 2 + 3" );
        System.out.println( "To end the calculations, type "
                          +  STOP_STRING );
    }
}