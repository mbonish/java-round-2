import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class projectTwo {
    public static void main(String[] args) {

        Capitals Alaska = new Capitals();
        Alaska.setArea(10000.00);
        Alaska.setSquareMilage(100000.12);
        Alaska.setName("Juno");

        Capitals Alabama = new Capitals();
        Alabama.setName("Montgomery");
        Alabama.setArea(20000.00);
        Alabama.setSquareMilage(200000.12);

        Capitals Arkansas = new Capitals();
        Arkansas.setName("Little Rock");
        Arkansas.setArea(300000.00);
        Arkansas.setSquareMilage(300000.12);

        Capitals Arizona = new Capitals();
        Arizona.setName("Phoenix");
        Arizona.setArea(400000.00);
        Arizona.setSquareMilage(400000.12);

        HashMap<String,Capitals> statesAndCapitals = new HashMap<>();
        statesAndCapitals.put("Alaska",Alaska);
        statesAndCapitals.put("Alabama",Alabama);
        statesAndCapitals.put("Arkansas",Arkansas);
        statesAndCapitals.put("Arizona",Arizona);

        Set<String> keys = statesAndCapitals.keySet();
        for (String k: keys){
            System.out.println(k);
            Capitals newCapital = statesAndCapitals.get(k);
            System.out.println(newCapital.getName() + " :: " + newCapital.getSquareMilage() + " :: " + newCapital.getArea());
        }




        }








}
