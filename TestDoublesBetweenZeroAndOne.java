import java.util.Scanner;

public class TestDoublesBetweenZeroAndOne {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input first number: ");
        double num1 = scanner.nextDouble();
        System.out.print("Input second number: ");
        double num2 = scanner.nextDouble();

        if (num1 > 0 && num1 < 1 && num2 > 0 && num2 < 1) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}

