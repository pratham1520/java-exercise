import java.io.*;

public class ByteStreamDemo{
    public static void main(String[] args) throws IOException {
        FileInputStream inStream = null;
        FileOutputStream outStream = null;
        try{
            inStream = new FileInputStream("C:\\Users\\prath\\IdeaProjects\\pratham\\Source.txt");
            outStream = new FileOutputStream("C:\\Users\\prath\\IdeaProjects\\pratham\\pratham.txt");
            //reading the source file and writing the content to target file character by character
            int content;
            while((content = inStream.read()) != -1){
                outStream.write((byte) content);
            }
        } finally {
            if(inStream != null){
                inStream.close();
            }
            if(outStream != null){
                outStream.close();
            }
        }
    }
}