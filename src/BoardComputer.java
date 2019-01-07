import java.util.Collections;
import java.util.HashSet;

public class BoardComputer {
    private HashSet<Wheat> wheatHashSet;
    private Drone drone;

    public BoardComputer() {
        this.drone = new Drone();
        this.wheatHashSet = drone.scanField();

    }

    public HashSet<Wheat> sorter() {
        Collections.sort(wheatHashSet, new CountGrainSorter()
                .thenComparing(new XPositionSorter())
                .thenComparing(new YPositionSorter()));
        return wheatHashSet;
    }
}
