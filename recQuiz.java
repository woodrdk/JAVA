
public class recQuiz {
    public static void main( String[] args ) {
        System.out.println(mystery5(5,7));
        System.out.println(mystery5(-23,-48));
    }
    public static int mystery5(int x, int y) {
        if (x < 0) {
            return -mystery5(-x, y);
        } else if (y < 0) {
            return -mystery5(x, -y);
        } else if (x == 0 && y == 0) {
            return 0;
        } else {
            return 100 * mystery5(x / 10, y / 10) + 10 * (x % 10) + y % 10;
        }
    }
    
    
    
    if (n < 9 && n > -9){
        if (n < 0){
            return "negative " + digitToEnglish(n);
        }
        else{
            return digitToEnglish(n);
        }
    }
    if ( n < 0 ) {
        return "negative " + digitToEnglish (n / 10 % 10) + " " + digitToEnglish( n % 10);
    }
    else{
        return digitToEnglish( n /10 % 10) + " " + digitToEnglish(n % 10);
    }
}