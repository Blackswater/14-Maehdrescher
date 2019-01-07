import java.util.Comparator;

public class XPositionSorter implements Comparator<Wheat> {
    @Override
    public int compare(Wheat wheat01, Wheat wheat02) {
        return wheat01.getX()-(wheat02.getX());
    }
}
