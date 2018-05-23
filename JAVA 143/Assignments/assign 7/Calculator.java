import java.util.*;

/**
 * TODO: Javadoc comment here about Calculator class
 * This class allows a user to enter 2 operands and one operator and perform a math calculation.
 * The class contains all of the code for functionality and does not reference any other sources.
 * @author Ken M
 * @author for the try catch and java doc comments Robert M. Wood Jr
 * @version 1.1 ( May 23 2018)
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
            
            // added try/catch block here
            try{
  	             firstOperand = Integer.parseInt( tokens[ 0 ] );
            }
            catch(NumberFormatException e){
            	 System.out.println("Number format exception on first operand");
                 isValid = false;
            }
            // commented out to test with      firstOperand = Integer.parseInt( tokens[ 0 ] );
            // previous line was original code commented and left for testing sake.
            
            // we set value of isValid to false
            // whenever we get invalid input.
            operator = tokens[ 1 ].charAt( 0 );
            if ( !LEGAL_OPERATORS.contains( String.valueOf( operator ) ) ) {
                System.out.println( "operator " + operator 
                                  + " not supported.");
                isValid = false;
            }
            
            // added try/catch block here
            try{
                secondOperand = Integer.parseInt( tokens[ 2 ] );
            }
            catch(NumberFormatException e){
            	 System.out.println("Number format exception on second operand");
                 isValid = false;
            }

            
            //secondOperand = Integer.parseInt( tokens[ 2 ] );
            
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
     * Java doc comment inserted here
     * The following code displayInstructions when called will display the instructions for the class.
     * In this case it will print 6 lines explaining how to use the calculator correctly.
     */
    public static void displayInstructions() {
        System.out.println( "This program evaluates binary arithmetic" );
        System.out.println( "operations. Type an expression using two" );
        System.out.println( "integers and one of the operators + - * /");
        System.out.println( "Put one space between each item in the" );
        System.out.println( "expression. Example: 2 + 3" );
        System.out.println( "To end the calculations, type " +  STOP_STRING );
    }
}
