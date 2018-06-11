import java.io.*;
import java.util.*;

// file: AnagramFinder.java
// author: Ken Meerdink
// purpose: sort a collection according to the 
//          order specified by a Comparator

public class AnagramFinder {
    public static void main( String [ ] args ) 
           throws FileNotFoundException {
        Scanner input = new Scanner( new File( "wordList.txt" ) );
        
        List<String> myWordList = new ArrayList< String >();
        while( input.hasNext() ) {
            String oneWord = input.next();
            myWordList.add( oneWord );
        }
        
        AnagramComparator myCompare = new AnagramComparator();
        
        Collections.sort( myWordList, myCompare );
        
        // For development purposes, you may want to limit the size
        // of the output. To be sure you can process the entire list,
        // use the full range of indexes.
        //for( int i = 0; i < 100; i++ ) {
        for( int i = 0; i < myWordList.size() - 1; i++ ) {
            if( myCompare.compare( myWordList.get(i), myWordList.get(i+1)) == 0 ) {
                System.out.println( myWordList.get(i) + " and " 
                                +   myWordList.get(i+1 ) + " are anagrams.");
            }
        }
    }
}