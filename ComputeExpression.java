import java.util.Scanner;

public class ComputeExpression {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input number: ");
        int n = scanner.nextInt();
        int result = n + n * 11 + n * 111;
        System.out.println(n + " + " + n * 11 + " + " + n * 111 + " = " + result);
    }
}
