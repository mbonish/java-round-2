import java.util.ArrayList;
import java.util.List;

public class ListExamples {
    public static void main(String[] args) {
        // instantiate the list---make an instance of the list
        // always will be zero at first
        List<String> stringList =  new ArrayList<>();

        System.out.println("List size is:" + stringList.size());

        //Adding to the list
        stringList.add("The first String");

        System.out.println(stringList.size());

        stringList.add(("The second String"));

        System.out.println(stringList.size());

        //Removing things from the list-- starts from zero
        stringList.remove(1);

        System.out.println(stringList.size());

        stringList.remove(0);

        System.out.println(stringList.size());

        //when you tried to remove an object that is not there--the array list is empty so the index is out of bounds.

//        stringList.remove(0);
//
//        System.out.println(stringList.size());
    }
}
