import java.util.Comparator;

public class YPositionSorter implements Comparator<Wheat> {
    public int compare(Wheat wheat01, Wheat wheat02) {
        return wheat01.getY()-(wheat02.getY());
    }
}
