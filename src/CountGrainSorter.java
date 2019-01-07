import java.util.Comparator;

public class CountGrainSorter implements Comparator<Wheat> {
    public int compare(Wheat wheat01, Wheat wheat02) {
        return wheat02.getNumberOfGrain()-(wheat01.getNumberOfGrain());
    }
}
