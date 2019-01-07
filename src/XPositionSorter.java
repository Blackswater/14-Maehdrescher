import java.util.Comparator;

public class XPositionSorter implements Comparator<Wheat> {
    public int compare(Wheat wheat01, Wheat wheat02) {
        return wheat01.getX().compareTo(wheat02.getY());
    }
}
