import java.util.HashMap;
import java.util.Map;

public class MapExample {
    public static void main(String[] args) {
        //map is a generic type
        //will need to specify 2 types to show what the key value pair in the map will be
        //Keys in a map are unique
        Map<String, Integer> populations = new HashMap<>();
        populations.put("USA", 200000000);
        populations.put("Canada", 34000000);
        populations.put("United Kingsom", 6300000);
        populations.put("Japan", 127000000);

        System.out.println("Map size is: " +populations.size());

        Integer usaPopulation = populations.get("USA");
        System.out.println(" The population of the USA to start is :" + usaPopulation);

        //PUT will add the entry if it does not exist
        //PUT will replace the value if the key already exists
        populations.put("USA", 313000000);

        usaPopulation = populations.get("USA");

        System.out.println("After we changed the value using the put method, the population if the USA is:" + usaPopulation);
    }
}
