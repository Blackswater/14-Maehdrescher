public class Wheat {
    private int numberOfGrain;
    private int x;
    private int y;


    public Wheat(int x, int y) {
        this.numberOfGrain = (int)Math.random() *401 +100;
        this.x = x;
        this.y = y;
    }
}
