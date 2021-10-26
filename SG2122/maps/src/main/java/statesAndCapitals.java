import java.util.HashMap;
import java.util.Set;

public class statesAndCapitals {
    public static void main(String[] args) {
        HashMap<String,String> SCMap = new HashMap<>();

        SCMap.put("Alabama","Montgomery");
        SCMap.put("Arizona","Phoenix");
        SCMap.put("Arkansas", "Little Rock");
        SCMap.put("Alaska", "Juno");

        Set<String> states = SCMap.keySet();

        for (String s:states) {
            String c = SCMap.get(s);
            System.out.println(s +", " + c );


        }
    }
}
