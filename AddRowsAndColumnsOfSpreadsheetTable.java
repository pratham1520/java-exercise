import java.util.Scanner;

public class AddRowsAndColumnsOfSpreadsheetTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input number of rows/columns (0 to exit): ");
        int n = scanner.nextInt();

        if (n == 0) return;

        int[][] table = new int[n][n];
        int[] rowSum = new int[n];
        int[] colSum = new int[n];

        System.out.println("Input the table:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                table[i][j] = scanner.nextInt();
                rowSum[i] += table[i][j];
                colSum[j] += table[i][j];
            }
        }

        System.out.println("Result:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(table[i][j] + " ");
            }
            System.out.println(rowSum[i]);
        }

        for (int sum : colSum) {
            System.out.print(sum + " ");
        }
    }
}
