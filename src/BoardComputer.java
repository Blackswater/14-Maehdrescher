import java.util.*;

public class BoardComputer {
    private HashSet<Wheat> wheatHashSet;
    private Drone drone;

    public BoardComputer() {
        this.drone = new Drone();
        this.wheatHashSet = drone.scanField();
        sorter();

    }

    public void sorter() {
        List<Wheat> sortedList = new ArrayList<>(wheatHashSet);
        Collections.sort(sortedList, new CountGrainSorter()
                .thenComparing(new XPositionSorter())
                .thenComparing(new YPositionSorter()));
        System.out.println(sortedList);
    }
}
