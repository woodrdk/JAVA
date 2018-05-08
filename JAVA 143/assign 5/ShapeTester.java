/*
  file: ShapeTester.java
  author: Ken Meerdink
  Used in CPW 143 homework assignment 5
  Description: This code tests whether
               other classes properly
               implement the Shape interface.
*/
public class ShapeTester {
    public static void main( String[] args ) {
        // Points used to make triangles, circles, and rectangles.
        Point cornerOne = new Point( 1, 1 );
        Point cornerTwo = new Point( 1, 6 );
        Point cornerThree = new Point( 14, 6 );
        Point cornerFour = new Point( 14, 1 );
        
        // make a Triangle.
        Triangle triangleOne = new Triangle( cornerOne,
                                             cornerTwo,
                                             cornerThree );
        
        
        // make a Circle.
        Point center = cornerThree;
        int radius = 5;                             
        Circle circleOne = new Circle( center, radius );
        
        
     
        // make a Rectangle.
        Rectangle rectangleOne = new Rectangle( cornerOne,
                                                cornerTwo,
                                                cornerThree,
                                                cornerFour );
       
                                                                               
        // array of Shapes to demonstrate using a interface.
        Shape[] shapes = { triangleOne, 
                          circleOne,
                           rectangleOne };
        
        // test methods that are common to all Shapes.
        System.out.println( "testing Shape methods:" );
        for ( int i = 0; i < shapes.length; i++ ) {
            System.out.println( "toString: " + shapes[ i ] );
            System.out.println( "getArea: " + shapes[ i ].getArea() );
            System.out.println( "getPerimeter: " + shapes[ i ].getPerimeter() );
            System.out.println();
        }
    
        // test equals method with other shapes.
        System.out.println( "testing equals methods:" );
        System.out.println( "1. testing Triangle equals:" );
        Triangle triangleTwo = new Triangle( cornerOne,
                                             cornerTwo,
                                             cornerThree );
        System.out.println( "testing two equal triangles:");
        System.out.println( triangleOne.equals( triangleTwo ) );
        System.out.println( "testing two unequal triangles:");
        triangleTwo = new Triangle( cornerOne,
                                    cornerFour,
                                    cornerThree );
        System.out.println( triangleOne.equals( triangleTwo ) );
        System.out.println();
        
        
        System.out.println( "2. testing Circle equals:" );
        Circle circleTwo = new Circle( center, radius );
        System.out.println( "testing two equal circles:");
        System.out.println( circleOne.equals( circleTwo ) );
        
        System.out.println( "testing two unequal circles:");
        circleTwo = new Circle( center, radius + 1 );
        System.out.println( circleOne.equals( circleTwo ) );
        
        System.out.println( "testing two unequal circles:");
        Point newCenter = new Point( center.getX() + 1, center.getY() );
        circleTwo = new Circle( newCenter, radius );
        System.out.println( circleOne.equals( circleTwo ) );
        System.out.println();
        
        
        
        System.out.println( "3. testing Rectangle equals:" );
        Rectangle rectangleTwo = new Rectangle( cornerOne,
                                                cornerTwo,
                                                cornerThree,
                                                cornerFour );
        System.out.println( "testing two equal rectangles:");
        System.out.println( rectangleOne.equals( rectangleTwo ) );
        System.out.println( "testing two unequal rectangles:");
        Point cornerFive = new Point( 7, 6 );
        Point cornerSix = new Point( 7, 1 );
        rectangleTwo = new Rectangle( cornerOne,
                                      cornerTwo,
                                      cornerFive,
                                      cornerSix );
        System.out.println( rectangleOne.equals( rectangleTwo ) );
        System.out.println();
        
    }
}