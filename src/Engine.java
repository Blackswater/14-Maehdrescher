public class Engine {
    private int numberOfCylinder;
    private String type;
    private int power;
    private Harvester harvester;

    public Engine(int numberOfCylinder, String type, int power, Harvester harvester) {
        this.numberOfCylinder = numberOfCylinder;
        this.type = type;
        this.power = power;
        this.harvester = harvester;
    }

    public int getNumberOfCylinder() {
        return numberOfCylinder;
    }

    public String getType() {
        return type;
    }

    public int getPower() {
        return power;
    }

    public Harvester getHarvester() {
        return harvester;
    }
/*
    public String toString {
        StringBuilder string = new StringBuilder();
        string.append("type: ")
    }
 */
}
