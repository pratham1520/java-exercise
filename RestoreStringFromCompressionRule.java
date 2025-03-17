import java.util.Scanner;

public class RestoreStringFromCompressionRule {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input the text: ");
        String input = scanner.nextLine();

        StringBuilder result = new StringBuilder();
        int i = 0;

        while (i < input.length()) {
            if (input.charAt(i) == '#') {
                int count = 0;
                i++;
                while (Character.isDigit(input.charAt(i))) {
                    count = count * 10 + Character.getNumericValue(input.charAt(i));
                    i++;
                }
                char c = input.charAt(i);
                for (int j = 0; j < count; j++) {
                    result.append(c);
                }
            } else {
                result.append(input.charAt(i));
            }
            i++;
        }

        System.out.println("Restored string: " + result.toString());
    }
}
