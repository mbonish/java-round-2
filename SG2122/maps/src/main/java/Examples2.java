import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Examples2 {
    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();

        stringList.add("String one");
        stringList.add("String two");
        stringList.add("String three");
        stringList.add("String four");

        System.out.println("My Array list size is: " + stringList.size());

        //enhanced for loop
        for(String currentString : stringList){
            System.out.println(currentString);
        }

        //iterator: job is to visit each item in a collection
        // Iterator is a generic type
        Iterator<String> iterator = stringList.iterator();

        //while loop since we really are sure how long the list is

        while(iterator.hasNext()){
            String currentString = iterator.next();
            System.out.println(currentString);
        }
    }
}
