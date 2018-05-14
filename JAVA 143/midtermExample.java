
public class midtermExample{
    public static void main( String [] args ){
    int [] a = {1,3,5,7,8};
    
    doubleElements(a);
    allPositive(a);
    
    }
    // 2
    public static void doubleElements( int [] a ) {
        for (int i = 0; i < a.length; i++ ){
            a[i] *= 2;
        }
    }
    
    // 3
    
    public static boolean allPositive ( int [] a ) {
        for (int i = 0; i < a.length; i++ ){
            if (a[i] <= 0 ){
                return false;
            }       
        }
        return true; 
    }
    
    // or use this slopppy mess
    /*
        int i = 0;
        while ( i < a.length && a[i] > 0){
            i++;
        }
        if( i < a.length ){
            return false;
        }
        else{
            return true;
        }
    */
    // 4
    public static boolean hasDuplicate ( int [] a ) {
        for (int i = 0; i < a.length; i++ ){
            for(int j = i+1; j < a.length; j++){
                if( a[ i ] == a[j]){
                    return true;
                }
            }  
        }
        return false; 
        
    }
    
    // 5
/*    
    public static void mystery( int[][] a) {
        for ( int i = 0; i < a.length; i++ ) {
            for ( int j = 0; j < a[ 0 ].length-1; j++ ) {
                if ( a[ i ][ j + 1 ] > a[ i ][ j ] ) {
                    a[ i ][ j ] = a[ i ][ j + 1 ];
                }
            }
        }
    }
    
    int[][] b = { {1, 2}, {3, 3}, {5, 4} };
    mystery( b);
    
    for ( int i = 0; i < b.length; i++ ) {
        for ( int j = 0; j < b[ 0 ].length; j++ ) {
            System.out.print( b[ i ][ j ] + " " );
        }
        System.out.println();
    }
    */
    
    
    // number 8 of example test
    
    // import java.util.Arrays;  option
    public class Polygon {
        private Point [] pts;
    
        public Polygon( Point[] pts ){
           // this.pts = arrays.copyOf (pts, pts.length);
           this.pts = pts;  
        }
        
        public String toString(){
            return Arrays.toString( pts );
        }
        
        public double size(){
            return pts.length;
        }
    }
}