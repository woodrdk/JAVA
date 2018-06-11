import java.util.*;

public class ModelComparator implements Comparator<Vehicle> {
    public int compare( Vehicle first, Vehicle second ) {
        return first.getModel().compareTo( second.getModel() );
    }
}