import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;

public class TriviaNight {
    public static void main(String[] args) {
        Scanner answer = new Scanner(System.in);

        System.out.println("What is the lowest level programming language?");
        System.out.println( "1,2,3,4????");
        int questionOne = answer.nextInt();
        answer.nextLine();

        if(questionOne == 4  ){
            System.out.println("You are correct!!");
        }
        else
            System.out.println("try again");

        System.out.println("Website security CAPTCHA forms are descended from the work of ???");
        String questionTwo = answer.nextLine();

        if (questionTwo.equals("turing")) {
            System.out.println("YESSS");
        }else{
            System.out.println("NOOOOOOOO!");
        }
    }
}
