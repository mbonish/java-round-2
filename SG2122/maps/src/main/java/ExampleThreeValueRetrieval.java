import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class ExampleThreeValueRetrieval {
    public static void main(String[] args) {
        Map<String, Integer> populations = new HashMap<>();
        populations.put("USA", 200000000);
        populations.put("Canada", 34000000);
        populations.put("United Kingsom", 6300000);
        populations.put("Japan", 127000000);

       //Collections can have duplicates, is not guaranteed to be ordered

        Collection<Integer> populationValues = populations.values();

        for(Integer currentPopulation:populationValues){
            System.out.println(currentPopulation);
        }
    }
}
