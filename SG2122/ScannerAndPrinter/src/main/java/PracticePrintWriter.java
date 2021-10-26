import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;


public class PracticePrintWriter {
    public static void main(String[] args) throws IOException {
        //creating a new Print Writer of the file writer type( which take in a file)
        PrintWriter out = new PrintWriter(new FileWriter("OutFile.txt"));
        out.println("this is my file..");
        out.println("second line");
        out.println("third line");
        //You need to do a flush that forces pending items to be written to the file
        out.flush();
        //need to close the file IMPORTANT step
        out.close();
    }
}