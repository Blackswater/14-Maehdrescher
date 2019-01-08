import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Drone implements IDrone {

    /*
    Scanning Field and fills the HashMap
     */

    @Override
    public Map<String, Wheat> scanField() {
        Map<String, Wheat> wheatHashSet = new HashMap<>();
        for (int i = 0; i <= Field.getField().length; i++) {
            for (int j = 0; j <= Field.getField().length; j++) {

                wheatHashSet.put(String.valueOf(i)+String.valueOf(j),new Wheat(i,j));
            }
        }

        return wheatHashSet;
    }
}
