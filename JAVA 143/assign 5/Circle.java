
/*
  file: Circle.java
  author: Robert Wood
  CPW 143 homework assignment 5
  Description: This code returns the information requested from the shapetester class
  
*/
import java.util.*;
public class Circle implements Shape{
      
   Point center;
   int radius;                             
    // no arg constructor
   public Circle(){
      this.center = center;
      this.radius = radius;
   }
       // general constructor
   public Circle (Point center, int radius){
      this.center = center;
      this.radius = radius;   
   }   

   // gets and calculates area
   public double getArea(){
      return (Math.PI * (radius * radius));
   }
  
   /**
   * caclulate the distance around the circle.
   * @return the perimeter of the circle.
   */
   public double getPerimeter(){
      return ((radius * 2) * Math.PI);
   }
   
   /*
   * Java standard toString() method
   */
   public String toString(){
      return "{" + center + ", " + radius + "}" ;
   }
   
   /**
   * Java standard equals( Object ) method
   */
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

