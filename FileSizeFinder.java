import java.io.File;

public class FileSizeFinder {
    public static void main(String[] args) {
        File file = new File("/home/students/abc.txt");
        if (file.exists()) {
            System.out.println(file.getAbsolutePath() + " : " + file.length() + " bytes");
        } else {
            System.out.println("File does not exist.");
        }
    }
}
