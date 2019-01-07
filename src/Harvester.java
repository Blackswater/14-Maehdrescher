import java.util.HashSet;

public class Harvester implements IHarvester{
    private Engine engine;
    private CuttingName cutting;
    private int storage;
    private LightName lights;
    private int numberOfWheel;
    private WheelType typeOfWheel;
    private int numberOfSeats;
    private BoardComputer boardComputer;


    public Harvester(CuttingName cutting, int storage,
                     LightName lights, int numberOfWheel,
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
