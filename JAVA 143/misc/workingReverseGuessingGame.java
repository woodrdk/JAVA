// Robert M. Wood Jr
// 4/2/18
// CPW 143
// Assignment #1
//
// This program will guess the number the user is thinking and count
// how many guesses it takes to get the correct one and then
// display the correct awnser and the amount of times it took to guess for assignment #1

import java.util.Random;    // imports random
import java.util.Scanner;   // imports the scanner utility

public class ReverseGuessingGame{                  // creates the class
   public static void main ( String[] args){       // creates the main method
      Scanner console = new Scanner( System.in );  // defines the scanner as console
      Random rand = new Random();                  // defined the random as rand   
      showInstructions();                          // calls method showInstructions
      playGame(console,rand);                      // calls method playGame & send scanner & random
   }
   
   public static void showInstructions(){          // creates the showInstructions method
      System.out.println("This program has you, the user,");      // next 4 lines prints instructions
      System.out.println("choose a number between 1 and 10.");
      System.out.println("Then I, the computer, will try");
      System.out.println("my best to guess it.");
   }
   
   public static void playGame(Scanner console, Random rand){  // creates the playGame method& accepts the scanner & random
      int count = 0;                   // sets up the counter for the count
      String right = "n";              // defines right for the loop
      int guess = 0;                   // defines the guess as int
      while (right.equals("n")){       // sets up while loop for when awnser wrong it continues
         guess = rand.nextInt(10) + 1; // makes guess the random guess number 10 is the maximum and the 1 is our minimum 
         count++;                      // adds to the count each time guessed
         System.out.print("Is it " + guess + "? (y/n) ");  // asks if its right y/n
         right = console.next();       // determines for the sake of the while loop if yes or no
      }
      System.out.println("I got your number of " + guess + " correct in " + count + " guesses.");
      // previous line prints out the results
   }
}


