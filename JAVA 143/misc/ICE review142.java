// Robert M Wood Jr

// CPW 143, In Class Exercise (review 142)
import java.util.*;

public class pin{
    public static void main ( string[] args){
        int [] pin = new int [10];
        
        int [] num;
        
        Random rand = new Radom();
        int randomNumber = rand.nextInt(0,4);
        
        for ( i = 0; i < 10; i++){
            num[i] = randomNumber;                
        }
               
        int [] userEntry;    
        System.out.print(num);       
         
    }
}


/*
store user pin
scanner
 array pin 
 array user entry
 array num
  
  loop through 0 9
  assign rand to 0 - 9 
  store num
  
 display pin
 display num
 user entry
 verify
 display correct or incorrect
 */