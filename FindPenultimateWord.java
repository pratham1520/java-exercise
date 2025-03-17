import java.util.Scanner;

public class FindPenultimateWord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input a String: ");
        String input = scanner.nextLine();
        String[] words = input.split(" ");
        if (words.length > 1) {
            System.out.println("Penultimate word: " + words[words.length - 2]);
        } else {
            System.out.println("The sentence does not have a penultimate word.");
        }
    }
}
