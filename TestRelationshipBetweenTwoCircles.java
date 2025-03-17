import java.util.Scanner;

public class TestRelationshipBetweenTwoCircles {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input x1, y1, r1: ");
        double x1 = scanner.nextDouble();
        double y1 = scanner.nextDouble();
        double r1 = scanner.nextDouble();
        System.out.print("Input x2, y2, r2: ");
        double x2 = scanner.nextDouble();
        double y2 = scanner.nextDouble();
        double r2 = scanner.nextDouble();

        double distance = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));

        if (distance < Math.abs(r1 - r2)) {
            System.out.println("C1 is in C2 or C2 is in C1");
        } else if (distance < (r1 + r2)) {
            System.out.println("Circumference of C1 and C2 intersect");
        } else {
            System.out.println("C1 and C2 do not overlap");
        }
    }
}
