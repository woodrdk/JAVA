import java.util.*;

// file: StateCapitals.java
// Author: Ken Meerdink
// Author: Robert M. Wood Jr.
// Purpose: The purpose of this assignment is to gain experiences using Maps.

public class StateCapitals {
    public static void main( String[] args ) {
        String[][] states =
            { {"Alabama", "Montgomery"},
              {"Alaska", "Juneau"},
              {"Arizona", "Phoenix"},
              {"Arkansas", "Little Rock"},
              {"California", "Sacramento"},
              {"Colorado", "Denver"},
              {"Connecticut", "Hartford"},
              {"Delaware", "Dover"},
              {"Florida", "Tallahassee"},
              {"Georgia", "Atlanta"},
              {"Hawaii", "Honolulu"},
              {"Idaho", "Boise"},
              {"Illinois", "Springfield"},
              {"Indiana", "Indianapolis"},
              {"Iowa", "Des Moines"},
              {"Kansas", "Topeka"},
              {"Kentucky", "Frankfort"},
              {"Louisiana", "Baton Rouge"},
              {"Maine", "Augusta"},
              {"Maryland", "Annapolis"},
              {"Massachusetts", "Boston"},
              {"Michigan", "Lansing"},
              {"Minnesota", "St.", "Paul"},
              {"Mississippi", "Jackson"},
              {"Missouri", "Jefferson City"},
              {"Montana", "Helena"},
              {"Nebraska", "Lincoln"},
              {"Nevada", "Carson City"},
              {"New Hampshire", "Concord"},
              {"New Jersey", "Trenton"},
              {"New Mexico", "Santa Fe"},
              {"New York", "Albany"},
              {"North Carolina", "Raleigh"},
              {"North Dakota", "Bismarck"},
              {"Ohio", "Columbus"},
              {"Oklahoma", "Oklahoma City"},
              {"Oregon", "Salem"},
              {"Pennsylvania", "Harrisburg"},
              {"Rhode Island", "Providence"},
              {"South Carolina", "Columbia"},
              {"South Dakota", "Pierre"},
              {"Tennessee", "Nashville"},
              {"Texas", "Austin"},
              {"Utah", "Salt Lake City"},
              {"Vermont", "Montpelier"},
              {"Virginia", "Richmond"},
              {"Washington", "Olympia"},
              {"West Virginia", "Charleston"},
              {"Wisconsin", "Madison"},
              {"Wyoming", "Cheyenne"}
            };
        Scanner console = new Scanner( System.in );
        System.out.println( "This program will find a state's capital" );
        System.out.print( "Which state do you want? " );
        String state = "";
        try {
            state = console.nextLine();
        }
        catch( Exception e ) {
            System.out.println( e );
        }
        
        /// this set can be replaced kinda with a map looped
            
        boolean stateFound = false;
        /*Map stateCapitolMap = ArrayUtils.toMap(states);
        System.out.println(state + "'s capitol is " + stateCapitolMap.get(state));
       */
       
        Map<String, String> stateCapitolMap = new HashMap< String, String>();
        for (int i = 0; i < states.length; i++){
            stateCapitolMap.put(states[i][0], states[i][1]);
        }
        
        
        if(stateCapitolMap.containsKey(state)){
            String capitol = stateCapitolMap.get(state).toString();// fix error here
            System.out.println(state + "'s capital is " + capitol);
            stateFound = true;
        }
        
          
       /* 
        for ( int i = 0; stateFound == false && i < states.length; i++ ) {
            if ( state.equals( states[ i ][ 0 ] ) ) {
                System.out.println( state + "'s capital is " + states[ i ] [ 1 ] );
                stateFound = true;
            }
        }
        */
        /// and above
        if ( !stateFound && !state.equals( "" ) ) {
            System.out.println( "The state of " + state + " is not in our state list." );
        }
    }
}

