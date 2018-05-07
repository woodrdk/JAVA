public class CreatureTester {
    public static void main( String[] args ) {
        SeaCreature[] creatures = { new SeaCreature(),
                                    new Mammal(),
                                    new Whale(),
                                    new Squid()
                                  };
        for ( int i = 0; i < creatures.length; i++ ) {
            System.out.println( creatures[ i ] );
            creatures[ i ].method1();
            creatures[ i ].method2();
        }
    }
}
