public class Wheat {
    private int numberOfGrain;
    private int x;
    private int y;


    public Wheat(int x, int y) {
        this.numberOfGrain = (int)(Math.random() *400) +100;
        this.x = x;
        this.y = y;
    }

    public String toString () {
        return "X: " + x + " Y: " + y + " Anzahl: " + numberOfGrain + "\n";
    }

    public int getNumberOfGrain() {
        return numberOfGrain;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}
