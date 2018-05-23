import java.awt.*;
import java.util.*;

/**
 *
 * This class keeps track of the z-order of the rectangles in
 * a graphics window. The class is able to reorder the rectangles
 * as needed when one is clicked to bring it to the front.
 * It has a method to draw itself in the graphics window.
 *
 * @author Ken Meerdink
 * @author Robert Wood Jr
 * @version CPW 143 Fall 2016 Programming Assignment 6 
 *
 */

public class OverLappedRectangles {
    /**
     * rects is a container for all the rectangles in the graphics window.
     * The objects contained are rectangles, each with its own color.
     */
    ArrayList<Rectangle143> rects;
   
    /**
     * Code provided for Programming Assignment 5
     * The default constructor is the only constructor.
     * It allocates an ArrayList to hold all the rectangles.
     */
    public OverLappedRectangles() {
        rects = new ArrayList<Rectangle143>();
    }
   
    /**
     *
     * Point p was clicked, move the correct rectangle to the top.
     * Note that, in order to tell which rectangle was clicked,
     * we must examine all the rectangles from highest index to lowest index
     * to find the rectangle clicked. That's because of the z-order in the 
     * ArrayList rects.
     *
     * @param p the point clicked by the mouse. Move the clicked rectangle to the top.
     
     */
    public void moveToTop( Point p ) {
        // TODO: YOUR CODE GOES HERE.

       for (int i = rects.size()-1; i > -1 ; i--){
         if(contains(p, rects.get(i)))
         {
            addRect(deleteRect( i ));
            break;
         }
        
       }
    }
   
   public boolean contains(Point p, Rectangle143 r){
       if( r.getX() < p.getX() && p.getX() < r.getX() + r.getWidth()
         && r.getY() < p.getY() && p.getY() < r.getY() + r.getHeight())
       {
          return true;
       }
       return false;
   }
    /**
     * Add r to top of z-list.
     * Code provided for Programming Assignment 3
     *
     * @param r The rectangle to be added to the z-list.
     */
    public void addRect( Rectangle143 r ) {
        rects.add( r );
    }
    
    /**
     * Delete rectangle at index i from list.
     * Code provided for Programming Assignment 3
     *
     * @param i The index of the rectangle to be deleted from the z-list.
     * @return r The rectangle that was removed from the z-list.
     *
     */
    public Rectangle143 deleteRect( int i ) {
        return rects.remove( i );
    }
   
    /**
     * Draw the rectangles.
     * Code provided for Programming Assignment 3
     *
     * @param g The graphics object in the client code.
     *
     */
    public void drawOn( Graphics g ) {
        for( int i = 0; i < rects.size(); i++ ) {
            g.setColor( rects.get( i ).getColor() );
            g.fillRect( rects.get( i ).getX(),  
                        rects.get( i ).getY(),
                        rects.get( i ).getWidth(),
                        rects.get( i ).getHeight() );
            g.setColor( Color.BLACK );
            g.drawRect( rects.get( i ).getX(),  
                        rects.get( i ).getY(),
                        rects.get( i ).getWidth(),
                        rects.get( i ).getHeight() );
        }
    }
}