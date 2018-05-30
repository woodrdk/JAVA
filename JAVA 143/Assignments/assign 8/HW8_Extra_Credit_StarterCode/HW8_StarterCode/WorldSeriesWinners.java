import java.io.*;
import java.util.*;

public class WorldSeriesWinners {

    public static void main( String[] args ) 
        throws FileNotFoundException {
        
        Scanner input = new Scanner( 
                        new File("ListofWorldSeriesChampions.txt") );
        
        ArrayList<WorldSeriesGame> allGames = new ArrayList<WorldSeriesGame>();
        
        input.nextLine(); // Skip title line in file.
        input.nextLine(); // Skip column heading line.
        
        // read all the remaining lines from file
        while ( input.hasNextLine() ) {
            String oneLine = input.nextLine();
            // there was no World Series in 1904 or 1994
            if ( !oneLine.contains("No World Series was played") ) {
                allGames.add( makeGame( oneLine ) );
            }
        }
        // System.out.println(allGames);// currently whats in  the arraylist
        // Here's every World Series from 1903 to 2014.
        //  for ( WorldSeriesGame game : allGames ) {
        //     System.out.println( game );
        // }
        
        // Your code goes here.
         System.out.println("Team's winning years");
         Map< Integer, List< String > > namesInOrder = new TreeMap< Integer, List< String > >();
          for (int i = 0; i < allGames.size(); i++){
            namesInOrder.put(77, "v");
        }
         int year = namesInOrder.get(teamName);
         for( int i : namesInOrder.keySet() ) {
            System.out.println(teamName + "wins: " + year);
         }
         
    // from slides for reference   
      /* String[] teamNames = { "d", "jim", "f", "r" }; // team names go here
        int[] yearsWon = { 1, 55, 3 }; // years won goes here

         Map< Integer, List< String > > namesInOrder = new TreeMap< Integer, List< String > >();
         
         for( int i = 0; i < yearsWon.length; i++ ) {
             if( !namesInOrder.containsKey( yearsWon[ i ] ) ) {
                 namesInOrder.put( yearsWon[ i ], new ArrayList< String >() );
             }
             namesInOrder.get( yearsWon[ i ] ).add( teamNames[ i ] );
         }

         for( int i : namesInOrder.keySet() ) {
             System.out.println( namesInOrder.get( i ) + " wins: " + i );
         }
         */
    }
    // before here is from slide to play with
    
    
    public static WorldSeriesGame makeGame( String oneLine ) {

        int year = Integer.parseInt( oneLine.substring( 0, 4 ) );
        String winner = 
             oneLine.substring( 4, 1 + oneLine.indexOf( ")" ) ).trim();
        String games = 
             oneLine.substring( 1 + oneLine.indexOf( ")" ), 
                                6 + oneLine.indexOf( ")" ) ).trim();
        String runnerUp = 
             oneLine.substring( 6 + oneLine.indexOf( ")" ) ).trim();
        
        return new WorldSeriesGame( year, winner, games, runnerUp );
    }
}