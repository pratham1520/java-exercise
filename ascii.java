import java.io.IOException;
public class ascii {
    public static void main(String[] args) {
        try {
            int i = System.in.read();
            System.out.println((char)i);
        } catch (IOException e) {
            System.err.println(("Error reading from input: "));
        }
    }
}


