/*
  file: Triangle.java
  author: Ken Meerdink
  description: Used in CPW 143 homework assignment 5
               as example code.
*/

public class Triangle implements Shape {
    Point p1;  // a triangle
    Point p2;  // has three
    Point p3;  // corners.
    
    // no arg constructor
    public Triangle() {
        this( new Point(0, 0),
              new Point(1, 1),
              new Point(2, 5) );
    }
    
    // general constructor
    public Triangle( Point p1, Point p2, Point p3 ) {
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
    }
    
    /**
     * calculate and return area of triangle
     * using Heron's formula.
     * @return the area of the triangle.
     */
    public double getArea() {
        double sideA = p1.distance( p2 );
        double sideB = p2.distance( p3 );
        double sideC = p3.distance( p1 );
        double s = ( sideA + sideB + sideC ) / 2.0;
        return Math.sqrt( s * (s - sideA) * (s - sideB) * (s - sideC) );
    }
    
    /**
     * caclulate the distance around the triangle.
     * @return the perimeter of the triangle.
     */
    public double getPerimeter() {
        return p1.distance( p2 ) + p2.distance( p3 ) + p3.distance( p1 );
    }
    
    /**
     * determine if parameter is contained
     * inside triangle
     * @param t the triangle that may or may not be inside this
     * @return true if parameter is contained
     *         inside triangle, false otherwise.
     */
    public boolean contains( Triangle t ) {
        return contains( t.p1 )
            && contains( t.p2 )
            && contains( t.p3 );
    }
    
    /**
     * determines if a Point is inside a triangle
     * @param p the point that may or may not be inside this
     * @return true if parameter is contained
     *         inside triangle, false otherwise.
     */
    public boolean contains( Point p ) {
        boolean b1 = sign(p, p1, p2) < 0.0;
        boolean b2 = sign(p, p2, p3) < 0.0;
        boolean b3 = sign(p, p3, p1) < 0.0;

        return ( ( b1 == b2 ) && ( b2 == b3 ) );
    }
    
    // private helper method for contains( Point )
    private float sign( Point p1,  Point p2,  Point p3 ) {
        return ( p1.getX() - p3.getX() ) * ( p2.getY() - p3.getY() ) 
             - ( p2.getX() - p3.getX() ) * ( p1.getY() - p3.getY() );
    }
    
    /**
     * Java standard equals( Object ) method
     */
    public boolean equals( Object other ) {
        if ( other == null ) {
            return false;
        }
        if ( other instanceof Triangle ) {
            Triangle line = (Triangle) other;
            return line.p1.equals( p1 ) && line.p2.equals( p2 ) && line.p3.equals( p3 )
                || line.p1.equals( p1 ) && line.p2.equals( p3 ) && line.p3.equals( p2 )
                || line.p1.equals( p2 ) && line.p2.equals( p1 ) && line.p3.equals( p3 )
                || line.p1.equals( p2 ) && line.p2.equals( p3 ) && line.p3.equals( p1 )
                || line.p1.equals( p3 ) && line.p2.equals( p1 ) && line.p3.equals( p3 )
                || line.p1.equals( p3 ) && line.p2.equals( p2 ) && line.p3.equals( p1 );
        }
        return false;
    }
    
    /**
     * Java standard toString() method
     */
    public String toString() {
        return "{" + p1 + ", " + p2 + ", " + p3 + "}";
    }
}