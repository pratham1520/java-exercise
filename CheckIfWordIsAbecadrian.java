import java.util.Scanner;

public class CheckIfWordIsAbecadrian {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input a word: ");
        String word = scanner.nextLine();

        boolean isAbecadrian = true;
        for (int i = 1; i < word.length(); i++) {
            if (word.charAt(i) <= word.charAt(i - 1)) {
                isAbecadrian = false;
                break;
            }
        }

        System.out.println("Is Abecadrian word? " + isAbecadrian);
    }
}
