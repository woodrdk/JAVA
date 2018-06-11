import java.util.*;

// file: AnagramComparator.java
// author: Robert Wood Jr
// purpose: Write a class that discovers all anagrams 
// of all words listed in a file

public class AnagramComparator implements Comparator<String>{
        
    public int compare( String first, String second ) {

        char[] firstChar = first.toCharArray();
        char[] secondChar = second.toCharArray();
                
        Arrays.sort(firstChar);
        Arrays.sort(secondChar);
        
        first = new String(firstChar);
        second = new String(secondChar); 
        
        return first.compareTo(second);
    }

}