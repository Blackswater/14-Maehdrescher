public class main {
    public static void main (String... args) {
        Harvester harvester = new Harvester(CuttingName.Weizen,
                10000, LightName.Breaklight, 4, WheelType.Wheel, 1);

        System.out.print("wheatHashSet size: " + harvester.getWheatHashSet());
    }
}
