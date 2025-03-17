import java.util.Scanner;

public class HexagonArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input the length of a side of the hexagon: ");
        double side = scanner.nextDouble();
        double area = (6 * side * side) / (4 * Math.tan(Math.PI / 6));
        System.out.println("The area of the hexagon is: " + area);
    }
}
