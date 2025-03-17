import java.util.Arrays;
import java.util.Scanner;

public class SortSixNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input six integers: ");
        int[] numbers = new int[6];
        for (int i = 0; i < 6; i++) {
            numbers[i] = scanner.nextInt();
        }

        Arrays.sort(numbers);
        System.out.print("After sorting the said integers: ");
        for (int i = 5; i >= 0; i--) {
            System.out.print(numbers[i] + " ");
        }
    }
}
