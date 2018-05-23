public class TriangleTester {
    public static void main( String[] args ) {
        Triangle ta = new Triangle();
        
        System.out.println( "no-arg construction:" );
        System.out.println( "Triangle should have points"
                           + " {(0, 0), (1, 1), (2, 5)}" );
        System.out.println( "Triangle has these points " + ta );
        System.out.println();
        
        Triangle tb = new Triangle( new Point( 1, 1 ),
                                    new Point( 14, 6 ),
                                    new Point( 1, 6 ) );
                                      
        System.out.println( "general construction: " );
        System.out.println( "Triangle should have points "
                          + "{(1, 1), (14, 6), (1, 6)}" );
        System.out.println( "Triangle has these points " + tb );
        System.out.println();
        
        System.out.println( "testing getArea, answer should be 32.5" );
        System.out.println( tb.getArea() );
        System.out.println();
        
        System.out.println( "testing getPerimeter, "
                          + "answer should be 31.92838827718412" );
        System.out.println( tb.getPerimeter() );
        System.out.println();
        
        Triangle tc = new Triangle( new Point( 1, 1 ),
                                    new Point( 14, 6 ),
                                    new Point( 1, 6 ) );                            
        System.out.println( "testing contains, answer should be true" );
        System.out.println( tb + " contains " + tc 
                          + " is " + tb.contains( tc ) );
        System.out.println();
        
        Triangle td = new Triangle( new Point( 1, 1 ),
                                    new Point( 2, 3 ),
                                    new Point( 1, 6 ) );                            
        System.out.println( "testing contains, answer should be true" );
        System.out.println( tb + " contains " + td 
                          + " is " + tb.contains( td ) );
        System.out.println();
        
        System.out.println( "testing contains, answer should be false" );
        System.out.println( tb + " contains " + ta 
                          + " is " + tb.contains( ta ) );
        System.out.println();
    }
}