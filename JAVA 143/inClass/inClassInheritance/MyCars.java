public class MyCars {
    public static void main( String[] args ) {

        Dashboard myDiablo = new Ferrari( 190, 6500, 260, 90);
        Dashboard myCalifornia = new Ferrari( 60, 3000, 180, 30 );
        
        Dashboard myBike = new Bicycle( 25, 90 );
    
        Dashboard[] myDashes = { myDiablo, myCalifornia, myBike };
        
        for ( Dashboard b : myDashes ) {
            System.out.println( "speed = " + b.speed() );
            System.out.println( "rpms = " + b.rpms() );
            System.out.println( "temp too hot = " + b.tooHot() );
            System.out.println( "oil too low = " + b.lowOil() );     
        }
    }
}
