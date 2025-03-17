import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CharaterStreamDemo{
    public static void main(String[] args) throws IOException {
        FileReader reader = null;
        FileWriter writer = null;
        try{
            reader = new FileReader("C:\\Users\\prath\\IdeaProjects\\pratham\\Source1.txt");
            writer = new FileWriter("C:\\Users\\prath\\IdeaProjects\\pratham\\output1.txt");
            //reading the source file and writing the content to target file character by character
            int content;
            while((content = reader.read()) != -1){
                writer.append((char) content);
            }
        } finally {
            if(reader != null){
                reader.close();
            }
            if(writer != null){
                writer.close();
            }
        }
    }
}