// file: Point.java
// author: Ken Meerdink
// purpose: represents a point on a screen

public class Point {
    private int x;
    private int y;
    
    public Point( int x, int y ) {
        this.x = x;
        this.y = y;
    }
    public Point() {
        this( 0, 0 );
    }
    
    public int getX() {
        return x;
    }
    
    public int getY() {
        return y;
    }
    
    public void setX( int x ) {
        this.x = x;
    }
    
    public void setY( int y ) {
        this.y = y;
    }
    
    public String toString() {
        return "(" + x + "," + y + ")";
    }
}