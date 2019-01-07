import java.util.HashSet;

public class Drone implements IDrone {

    @Override
    public HashSet<Wheat> scanField() {
        HashSet<Wheat> wheatHashSet = new HashSet<>();
        for (int i = 0; i <= Field.getField().length; i++) {
            for (int j = 0; j <= Field.getField().length; j++) {
                wheatHashSet.add(new Wheat(i,j));
            }
        }

        return wheatHashSet;
    }
}
