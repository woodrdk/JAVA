import java.util.*;

public class MileageComparator implements Comparator<Vehicle> {
    public int compare( Vehicle first, Vehicle second ) {
        return first.getMileage() - second.getMileage();
    }
}