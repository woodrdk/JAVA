// Robert M Wood Jr
// 4/4/18
// CPW 143, In Class Exercise (review 142)

import java.util.*;                         // inports the utils

public class pin{
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in); // sets up the scanner
 
        int [] storedPin = new int [4]; // sets up stored pin as 4 digits long
        for (int st = 0; st < 4; st++){ // sets stored pin set to 0, 1, 2, 3
            storedPin[st] = st;
        }
        String storedUserPin = Arrays.toString(storedPin); //makes the array stored pin a string
        
        // sets up the array pin 0 - 9 for display
        int [] pin = new int [10];
        for (int p = 0; p < 10; p++){
            pin[p] = p;                
        }
        
        // sets up the display of the code for num
        int [] num = new int [10];
        Random rand = new Random();
        for (int i = 0; i < 10; i++){
            num[i] = rand.nextInt(4) +1;                
        }
        
        // userEntry set to length 
        int [] userEntry = new int [4];
        
        // displays   

        System.out.println("Pin:  " + Arrays.toString(pin)); 
        System.out.println("Num:  " + Arrays.toString(num));          
        System.out.print("What is your pin? ");
        
        // inputs the users pin as a string
        String userPin = sc.nextLine();
        
        // for comparing the two arrays
        if (storedUserPin == userPin){
            System.out.print("Correct PIN");
        }
        
        System.out.println(userPin + " userPin");// for testing 
        System.out.println("Stored pin:  " + storedUserPin); // for testing 
 
    }
}
