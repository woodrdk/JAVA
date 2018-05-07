public class InClassApril9{
    public static void main (String[] args ){
        print4(new int[] {1, 2, 3, 4, 5, 6});
    }
    // print the sum of every sequence of 4 numbers
    // int[] a = {1, 2, 3, 4, 5, 6}
    // 10, 14, 18
    
    public static void print4(int[] a){ 
        for (int i = 0; i < a.length - 3; i++){
            System.out.println(a[i] + a[i + 1] + a[i + 2] + a[i + 3]);
        }
    }
}