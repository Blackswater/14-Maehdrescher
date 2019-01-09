import java.util.ArrayList;

public class main {

    public static void main (String... args) {
        long starttime = System.nanoTime();
        ArrayList<LightName> lightnameArray = new ArrayList<>();
        lightnameArray.add(LightName.Breaklight);
        lightnameArray.add(LightName.Warninglight);
        lightnameArray.add(LightName.Normallight);
        Harvester harvester = new Harvester(new WeizenCutting(CuttingName.Weizen, 3),
                10000,lightnameArray, 4, WheelType.Wheel, 1);
        long searchtime = System.nanoTime();

        harvester.getBoardComputer().findWheatOnPosition(0,25);

        long finishtime = System.nanoTime();

        System.out.println("Start Time: " + (starttime));
        System.out.println("Search Time: " + (finishtime-searchtime));
        System.out.println("Finish Time: " + (finishtime-starttime));
    }
}
