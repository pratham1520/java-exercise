import java.util.Scanner;

public class MaximumPathSumFromHilltopData {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input the numbers (ctrl+c to exit):");

        int[][] hill = new int[100][];
        int row = 0;

        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            String[] numbers = line.split(",");
            hill[row] = new int[numbers.length];
            for (int i = 0; i < numbers.length; i++) {
                hill[row][i] = Integer.parseInt(numbers[i]);
            }
            row++;
        }

        System.out.println("Maximum value of the sum of integers passing according to the rule on one line: " + maxPathSum(hill, row));
    }

    public static int maxPathSum(int[][] hill, int rows) {
        for (int i = rows - 2; i >= 0; i--) {
            for (int j = 0; j <= i; j++) {
                hill[i][j] += Math.max(hill[i + 1][j], hill[i + 1][j + 1]);
            }
        }
        return hill[0][0];
    }
}
