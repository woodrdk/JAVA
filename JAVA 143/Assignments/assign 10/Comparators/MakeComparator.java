import java.util.*;

public class MakeComparator implements Comparator<Vehicle> {
    public int compare( Vehicle first, Vehicle second ) {
        return first.getMake().compareTo( second.getMake() );
    }
}