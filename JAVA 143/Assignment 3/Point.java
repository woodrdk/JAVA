/**
 * @author Reges and Stepp. Modified by Ken Meerdink.
 * A Point object represents a pair of (x, y) coordinates.
 */
public class Point {
    private int x; // x coordinate of the point.
    private int y; // y coordinate of the point.

    /**
     * Constructs a new point at the origin, (0, 0).
     */
    public Point() {
        this(0, 0);    // calls Point(int, int) constructor.
    }

    /**
     * Constructs a new point with the given (x, y) location.
     * @param x the x coordinate of the new Point.
     * @param y the y coordinate of the new Point.

     */
    public Point(int x, int y) {
        if (x < 0 || y < 0) {
            throw new IllegalArgumentException();
        }

        this.x = x;
        this.y = y;
    }

    /**
     * Returns the distance between this Point and (0, 0).
     * @return distance between this Point and (0, 0).
     */
    public double distanceFromOrigin() {
        return distance( new Point() );
    }
    
    /**
     * Calculate distance to another point.
     *
     * @param other A Point object.
     * @return distance between this and other.
     *
     */
    public double distance( Point other ) {
        int dx = x - other.x;
        int dy = y - other.y;
        return Math.sqrt( dx * dx + dy * dy );
    }

    /**
     * Returns whether o refers to a point with the same (x, y)
     * coordinates as this point.
     *
     * @param o is an object that will be compared to this.
     * @return true if o has the same x and y coords as this,
     *         false otherwise.
     */
    public boolean equals(Object o) {
        if (o instanceof Point) {
            Point other = (Point) o;
            return x == other.x && y == other.y;
        } else {  // not a Point object.
            return false;
        }
    }

    /**
     * Returns the x-coordinate of this point.
     * @return the x-coordinate of this point.
     *
     */
    public int getX() {
        return x;
    }

    /**
     * Returns the y-coordinate of this point.
     * @return the y-coordinate of this point.
     */
    public int getY() {
        return y;
    }

    /**
     * Returns a String representation of this point.
     * @return string representation of this point.
     */
    public String toString() {
        return "(" + x + ", " + y + ")";
    }

    /**
     * Shifts this point's location by the given amount.
     * @param dx the amount of shift in the x direction.
     * @param dy the amount of shift in the y direction.
     * @return Point which is a copy of new location.
     * @throws IllegalArgumentException when x + dx < 0 || y + dy < 0
     */
    public Point translate(int dx, int dy) {
        if ( x + dx < 0 || y + dy < 0 ) {
            throw new IllegalArgumentException();
        }
        x += dx;
        y += dy;
        return new Point(x, y);
    }
}