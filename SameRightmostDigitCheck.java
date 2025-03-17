import java.util.Scanner;

public class SameRightmostDigitCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input the first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Input the second number: ");
        int num2 = scanner.nextInt();
        System.out.print("Input the third number: ");
        int num3 = scanner.nextInt();
        boolean result = (num1 % 10 == num2 % 10 || num1 % 10 == num3 % 10 || num2 % 10 == num3 % 10);
        System.out.println("The result is: " + result);
    }
}

