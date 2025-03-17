import java.util.Scanner;

public class StaircaseCoins {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows for the staircase: ");
        int n = scanner.nextInt();
        int coins = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
                coins++;
            }
            System.out.println();
        }
        System.out.println("Total coins used: " + coins);
    }
}

