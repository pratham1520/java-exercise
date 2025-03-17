import java.util.Scanner;

public class CheckSubtractionDifference {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input the first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Input the second number: ");
        int num2 = scanner.nextInt();
        System.out.print("Input the third number: ");
        int num3 = scanner.nextInt();
        boolean result = (Math.abs(num1 - num2) >= 20 || Math.abs(num1 - num3) >= 20 || Math.abs(num2 - num3) >= 20);
        System.out.println(result);
    }
}
