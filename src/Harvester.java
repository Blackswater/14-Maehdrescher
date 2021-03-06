import java.util.ArrayList;

public class Harvester implements IHarvester{
    private IEngine engine; //Interface
    private CuttingSystem cutting; //one to one
    private int storage;
    private ArrayList<LightName> lights; //one to Many
    private int numberOfWheel;
    private WheelType typeOfWheel;
    private int numberOfSeats;
    private BoardComputer boardComputer; //one to one


    public Harvester(CuttingSystem cutting, int storage,
                     ArrayList<LightName> lights, int numberOfWheel,
                     WheelType typeOfWheel, int numberOfSeats) {
        this.engine = new Engine(4, "A100", 350, this);
        this.cutting = cutting;
        this.storage = storage;
        this.lights = lights;
        this.numberOfWheel = numberOfWheel;
        this.typeOfWheel = typeOfWheel;
        this.numberOfSeats = numberOfSeats;
        this.boardComputer = new BoardComputer();
    }

    public BoardComputer getBoardComputer() {
        return boardComputer;
    }

    /*
    @Override
    public boolean engineOn() {
        return false;
    }

    @Override
    public boolean engineOff() {
        return false;
    }

    @Override
    public boolean leftTurn() {
        return false;
    }

    @Override
    public boolean rightTurn() {
        return false;
    }

    @Override
    public boolean forward() {
        return false;
    }

    @Override
    public boolean reverse() {
        return false;
    }

    @Override
    public boolean cuttingOn() {
        return false;
    }

    @Override
    public boolean cuttingOff() {
        return false;
    }
    */
}
