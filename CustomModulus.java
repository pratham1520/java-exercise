import java.util.Scanner;

public class CustomModulus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input the first number: ");
        int dividend = scanner.nextInt();
        System.out.print("Input the second number: ");
        int divisor = scanner.nextInt();
        int quotient = dividend / divisor;
        int remainder = dividend - (quotient * divisor);
        System.out.println(remainder);
    }
}

