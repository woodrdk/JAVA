

/*
  file: Circle.java
  author: Robert Wood
  CPW 143 homework assignment 5
  Description: This code returns the information requested from the shapetester class
  
*/

import java.util.*;

public class Rectangle implements Shape{
    Point p1;  // a rectangle
    Point p2;  // has 
    Point p3;  // four
    Point p4;  // corners.
    // no arg constructor
   public Rectangle(){
        this( new Point(0, 0),
              new Point(1, 1),
              new Point(2, 5),
              new Point(3, 6) );
   }
       // general constructor
   public Rectangle (Point p1, Point p2, Point p3,  Point p4){
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;  
        this.p4 = p4;
   }   
   // gets and calculates area
   public double getArea(){
      double sideA = p1.distance( p2 );
      double sideB = p2.distance( p3 );
      double area = sideA * sideB;
      return area;
   }
   
   /**
   * caclulate the distance around the rect.
   * @return the perimeter of the rect.
   */
   public double getPerimeter(){
      return ((p1.distance( p2 ) + p2.distance( p3 ) ) * 2 );
   }
   
   /*
   * Java standard toString() method
   */
   public String toString(){
      return "{" + p1 + ", " + p2 + ", " + p3 + ", " + p4 + "}" ;
   }
   
   /**
   * Java standard equals( Object ) method
   */
   public boolean equals( Object other ){
       if ( other == null ) {
          return false;
       }
       if ( other instanceof Rectangle ) {
            Rectangle line = (Rectangle) other;
            return line.p1.equals( p1 ) && line.p2.equals( p2 ) && line.p3.equals( p3 ) && line.p4.equals( p4 )
                || line.p1.equals( p1 ) && line.p2.equals( p3 ) && line.p3.equals( p2 ) && line.p4.equals( p4 )
                || line.p1.equals( p4 ) && line.p2.equals( p2 ) && line.p3.equals( p3 ) && line.p4.equals( p1 )
                || line.p1.equals( p4 ) && line.p2.equals( p3 ) && line.p3.equals( p2 ) && line.p4.equals( p1 )
                
                || line.p1.equals( p2 ) && line.p2.equals( p1 ) && line.p3.equals( p3 ) && line.p4.equals( p4 )
                || line.p1.equals( p2 ) && line.p2.equals( p1 ) && line.p3.equals( p4 ) && line.p4.equals( p3 )
                || line.p1.equals( p3 ) && line.p2.equals( p2 ) && line.p3.equals( p1 ) && line.p4.equals( p4 )
                || line.p1.equals( p3 ) && line.p2.equals( p4 ) && line.p3.equals( p1 ) && line.p4.equals( p2 );
        }
        return false;
   }
}

