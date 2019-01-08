import java.util.*;

public class BoardComputer {
    private Map<String, Wheat> wheatHashSet;
    private Drone drone;

    public BoardComputer() {
        this.drone = new Drone();
        this.wheatHashSet = drone.scanField();
        sorter();

    }
    /*
    Sorter for the ArrayList, first Grain, xPosition, YPosition
     */
    public void sorter() {
        List<Wheat> sortedList = new ArrayList<>(wheatHashSet.values());
        Collections.sort(sortedList, new CountGrainSorter()
                .thenComparing(new XPositionSorter())
                .thenComparing(new YPositionSorter()));
        System.out.println(sortedList);
    }

    /*
    Searching for Grain in X,Y Position
     */
    public void findWheatOnPosition(int x, int y) {
        System.out.println(wheatHashSet.get(String.valueOf(x)+String.valueOf(y)));
    }
}
