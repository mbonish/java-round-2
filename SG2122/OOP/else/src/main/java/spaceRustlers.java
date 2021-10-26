public class spaceRustlers {
    public static void main(String[] args) {

        int spaceships = 10;
        int aliens = 25;
        int cows = 100;

        if(aliens > spaceships){
            System.out.println("VVRoom, vroom! Let's get going!");
        }else{
            System.out.println("There aren't enough green guys to drive these ships!");
        }
        if(cows == spaceships ){
            System.out.println("Wow, way to plan ahead! JUST enough room for all these walking hamburgers!");
        } else if (cows > spaceships){
            System.out.println("Dangit, how are we going to fit all of these cows in here.");
        } else {
            System.out.println("too many ships and not enough cows");
        }
    }
}
