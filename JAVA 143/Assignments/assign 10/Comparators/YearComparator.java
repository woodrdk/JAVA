import java.util.*;

public class YearComparator implements Comparator<Vehicle> {
    public int compare( Vehicle first, Vehicle second ) {
        return first.getYear() - second.getYear();
    }
}