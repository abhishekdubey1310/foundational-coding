import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;

public class FileHandling {
    public static void main(String[] args) {
        try {
            FileWriter writer = new FileWriter("output.txt");
            writer.write("Writing to a file using Java!");
            writer.close();

            FileReader reader = new FileReader("output.txt");
            int ch;
            while ((ch = reader.read()) != -1) {
                System.out.print((char) ch);
            }
            reader.close();
        } catch (IOException e) {
            System.out.println("File error: " + e);
        }
    }
}