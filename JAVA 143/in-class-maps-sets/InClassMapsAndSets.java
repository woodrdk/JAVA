/*
1.	Write a method named sortAndRemoveDuplicates that 
takes a List of Integers as its parameter and rearranges 
its elements into sorted ascending order, as well as removing 
all duplicate values from the list. For example, 
the list [7, 4, -9, 4, 15, 8, 27, 7, 11, -5, 32, -9, -9] 
would become [-9, -5, 4, 7, 8, 11, 15, 27, 32] after a 
call to your method. 
Use a Set as a part of your solution.

2.	Write a method named is1to1 that takes a Map, 
whose keys and values are Strings, as a parameter 
and returns true if no two keys map to the same value. 
For example, {Marty=206, Hawking=123, Smith=929, Newton=123} 
should return false, but  
{Marty=206, Hawking=123, Smith=929, Newton=456} should return true. 
The empty map is considered 1-1, so return true.

3.	Write a method named subMap that takes two Maps from 
String to String as its parameters and return true if 
every key in the first Map is also a key in the second Map 
and maps to the same value in the second Map. 
For example, {Marty=206, Smith=929, Newton=123} is a submap 
of {Hawking=123, Newton=123, Marty=206, Smith=929}. 
The empty map is a submap of every map.

*/
import java.util.*;

public class InClassMapsAndSets {
    public static void main( String[] args ) {
        // exercise 1
        Integer[] values = {7, 4, -9, 4, 15, 8, 27, 7, 11, -5, 32, -9, -9};
        List<Integer> list = new ArrayList<Integer>( Arrays.asList(values) );
        
        System.out.println("Before:");
        System.out.println(list);
        
        sortAndRemoveDuplicates( list );
        
        System.out.println("After:");
       System.out.println(list);
        
        // exercise 2
        Map<String, String> map = new HashMap<String, String>();
        map.put("Marty", "206");
        map.put("Hawking", "123");
        map.put("Smith", "929");
        map.put("Newton", "123");
        System.out.println( "is1to1: " + is1to1( map ) ); // expect false
        
        map.put("Newton", "456");
        System.out.println( "is1to1: " + is1to1( map ) ); // expect true
        
        // exercise 3
        Map<String, String> submap = new HashMap<String, String>( map );
        submap.remove( "Hawking" );
        System.out.println( "subMap: " + subMap( map, submap ) ); // expect true
        submap.put("Marty", "253");
        System.out.println( "subMap: " + subMap( map, submap ) ); // expect false
    }
    // exercise 3
    public static boolean subMap( Map<String, String> map, 
                                  Map<String, String> submap ) {
        // did: implement the body of this method.
        for (String key : submap.keySet()){
            if( !map.containsKey( key ) || map.get( key)!= submap.get(key )){
                return false;
            }
        }        
    return true;
    }
    
    // exercise 2
    public static boolean is1to1( Map<String, String> map ) {
        // did: implement the body of this method.
        return map.keySet().size() == (new HashSet<>(map.values())).size();
    }
    
    // exercise 1
    public static void sortAndRemoveDuplicates( List<Integer> list ) {
        // did: implement the body of this method.
        TreeSet<Integer> t = new TreeSet<>(list);
        list.clear();
        list.addAll(t);
    }
}