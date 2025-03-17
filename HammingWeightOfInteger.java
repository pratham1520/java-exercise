import java.util.Scanner;

public class HammingWeightOfInteger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input a number: ");
        int number = scanner.nextInt();

        int count = 0;
        while (number != 0) {
            count += (number & 1);
            number >>= 1;
        }

        System.out.println("Hamming weight: " + count);
    }
}
