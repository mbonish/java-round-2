import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class reading {
    public static void main(String[] args) throws FileNotFoundException {
        //Scanner use to it taking System.in
        //This time it takes a buffer reader of file reader type -- requires the name of the file
        Scanner sc = new Scanner ( new BufferedReader(new FileReader("OutFile.txt")));
        //we have no idea ahead of time to know how many lines there are in the file
        //great for a while loop b/c there may actually be no lines in the file
        while (sc.hasNextLine()) {
            String currentLine = sc.nextLine();
            System.out.println(currentLine);
        }
        }
}
