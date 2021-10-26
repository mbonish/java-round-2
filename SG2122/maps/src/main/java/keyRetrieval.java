import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class keyRetrieval {
    public static void main(String[] args) {

        Map<String, Integer> populations = new HashMap<>();
        populations.put("USA", 200000000);
        populations.put("Canada", 34000000);
        populations.put("United Kingsom", 6300000);
        populations.put("Japan", 127000000);

        System.out.println("Map size is: " +populations.size());

        //A Set (generic type is a collection of objects that is unordered, but does not allow for duplicates
        //.keySet was a method/class that is built in as part of the hash map
        Set<String> key = populations.keySet();

        for(String currentKey : key){
            //this gets the current key
            Integer currentPopulation = populations.get(currentKey);
            System.out.println("The population of " + currentKey + " is " + currentPopulation);
        }
    }
}
