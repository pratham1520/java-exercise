import java.util.Scanner;

public class TestIfTwoLinesAreParallel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input P(x1, y1), separated by a space: ");
        double x1 = scanner.nextDouble();
        double y1 = scanner.nextDouble();
        System.out.print("Input Q(x2, y2), separated by a space: ");
        double x2 = scanner.nextDouble();
        double y2 = scanner.nextDouble();
        System.out.print("Input R(x3, y3), separated by a space: ");
        double x3 = scanner.nextDouble();
        double y3 = scanner.nextDouble();
        System.out.print("Input S(x4, y4), separated by a space: ");
        double x4 = scanner.nextDouble();
        double y4 = scanner.nextDouble();

        double slope1 = (y2 - y1) / (x2 - x1);
        double slope2 = (y4 - y3) / (x4 - x3);

        if (slope1 == slope2) {
            System.out.println("Two lines are parallel.");
        } else {
            System.out.println("Two lines are not parallel.");
        }
    }
}
