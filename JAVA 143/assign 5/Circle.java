

/*
  file: Circle.java
  author: Robert Wood
  CPW 143 homework assignment 5
  Description: This code ---------------------------------------------------------
  ******************************************************
  *
  **
  *
  
  *
  
  *
  --------------------------------------------------------
  .
*/
import java.util.*;


public class Circle implements Shape{
      
   Point center;
   int radius;                             


   public Circle(){
      this.center = center;
      this.radius = radius;
   }
   
   public Circle (Point center, int radius){
      this.center = center;
      this.radius = radius;   
   }   
   
   public double getArea(){
      return (Math.PI * (radius * radius));
   }
   
   public double getPerimeter(){
      return ((radius * 2) * Math.PI);
   }
   
   public String toString(){
      return "{" + center + ", " + radius + "}" ;
   }
   
   public boolean equals( Object other ){
       if ( other == null ) {
          return false;
       }
       if ( other instanceof Circle ) {
           Circle c = (Circle) other;
           if(c.center == this.center && c.radius == this.radius){
                return true;
           }
                 
                                      
       }
       return false;


                    
       
   }
   
   
}

