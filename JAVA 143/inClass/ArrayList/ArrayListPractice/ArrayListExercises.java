
/* 
    R.Wood 5/7/2018
    Write a method reverse that reverses the order of the elemens in an ArrayList of strings.
*/

/*

*/
import java.util.*;

public class ArrayListExercises{
    public static void main (String[] args ){
        ArrayList<String> list = new ArrayList<>();
        list.add("Mopar");
        list.add("Dodge");
        list.add("Chrysler");
        list.add("Plymouth");
        list.add("cars");
        list.add("car");
        list.add("this");
            
        System.out.println(list);
        reverse(list);
        System.out.println(list);
        reverse(list);
        System.out.println(list);
        
        capitalizePlurals(list);
        System.out.println(list);
        
        list.add(3, "OH NOES");
        list.add(4, "OH NOES");
        System.out.println(list);
        
        removePlurals(list);
        System.out.println(list);
        
        addStars(list);
        System.out.println(list);
        
        removeStars(list);
        System.out.println(list);
    }
    
    public static void removeStars(ArrayList<String> list){
    // increment by one because remove shifted elements
        for ( int i = 1; i < list.size(); i++){
            list.remove(i);
        }
    }
    
    public static void addStars(ArrayList<String> list){
        for ( int i = 1; i < list.size(); i+=2){
            list.add(i, "*");
        }
    }
    
    public static void removePlurals(ArrayList<String> list){
        for ( int i = list.size()- 1; i >= 0 ; i--){
            if (list.get(i).toLowerCase().endsWith("s")){
                list.remove(i);
            }
        }
    }
    
    public static void capitalizePlurals(ArrayList<String> list){
        for ( int i = 0; i < list.size(); i++){
            if (list.get(i).endsWith("s")){
                list.set(i, list.get(i).substring(0, 1).toUpperCase()+ list.get(i).substring(1));
            }
        }
    }
    
    
    
    public static void reverse(ArrayList<String> list){
        for ( int i = 0; i < list.size() / 2; i++){
            String temp = list.get(i);
            list.set(i, list.get(list.size() - 1 - i));
            list.set((list.size() - 1 - i), temp);
        }
    }
}