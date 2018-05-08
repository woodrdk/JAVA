/*
  file: Shape.java
  author: Ken Meerdink
  Starter code for CPW 143 homework assignment 5
  Description:   A Shape is 2-D and must have
                 toString, getArea, getPerimeter, and 
                 equals methods for clients to use.
*/
public interface Shape {
    public String toString();
    public double getArea();
    public double getPerimeter();
    public boolean equals( Object other );
}