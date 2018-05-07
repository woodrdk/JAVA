
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