import java.math.BigInteger;
import java.util.Scanner;

public class SumOfTwoLargeIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input the first integer: ");
        String num1 = scanner.nextLine();
        System.out.print("Input the second integer: ");
        String num2 = scanner.nextLine();

        BigInteger bigInt1 = new BigInteger(num1);
        BigInteger bigInt2 = new BigInteger(num2);

        BigInteger sum = bigInt1.add(bigInt2);

        if (sum.toString().length() > 80) {
            System.out.println("overflow");
        } else {
            System.out.println("Sum of the said two integers: " + sum);
        }
    }
}
