import java.util.Scanner;

public class Convert3DigitNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input a positive number (max three digits): ");
        int number = scanner.nextInt();

        int hundreds = number / 100;
        int tens = (number / 10) % 10;
        int ones = number % 10;

        StringBuilder result = new StringBuilder();
        for (int i = 0; i < hundreds; i++) {
            result.append("H");
        }
        for (int i = 0; i < tens; i++) {
            result.append("T");
        }
        for (int i = 0; i < ones; i++) {
            result.append("U");
        }
        result.append(hundreds).append(tens).append(ones);

        System.out.println("Result: " + result.toString());
    }
}
