import java.util.Scanner;
public class exercise1 {
    public static void main (String[]String) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input a degree in Fahrenheit:");
        double fahrenheit = input.nextDouble();
        double celsius = (( 5 *(fahrenheit-32.0)/9.0));
        System.out.println(fahrenheit+"degree fahrenheit is equal to "+ celsius +"in celsius");
    }
}
