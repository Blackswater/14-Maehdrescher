import java.util.*;

public class BoardComputer {
    private Map<String, Wheat> wheatHashSet;
    private Drone drone;

    public BoardComputer() {
        this.drone = new Drone();
        this.wheatHashSet = drone.scanField();
        sorter();

    }

    public void sorter() {
        List<Wheat> sortedList = new ArrayList<>(wheatHashSet.values());
        Collections.sort(sortedList, new CountGrainSorter()
                .thenComparing(new XPositionSorter())
                .thenComparing(new YPositionSorter()));
        System.out.println(sortedList);
    }

    public void findWheatOnPosition(int x, int y) {
        String xs = String.valueOf(x);
        String ys = String.valueOf(y);
        String os = String.valueOf(0);
       System.out.println(wheatHashSet.get(os+xs+ys));
    }
}
