import java.util.Scanner;

public class DistanceBetweenTwoPoints {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input the latitude of coordinate 1: ");
        double lat1 = Math.toRadians(scanner.nextDouble());
        System.out.print("Input the longitude of coordinate 1: ");
        double lon1 = Math.toRadians(scanner.nextDouble());
        System.out.print("Input the latitude of coordinate 2: ");
        double lat2 = Math.toRadians(scanner.nextDouble());
        System.out.print("Input the longitude of coordinate 2: ");
        double lon2 = Math.toRadians(scanner.nextDouble());
        final double R = 6371.01; // Radius of the earth in km
        double d = R * Math.acos(Math.sin(lat1) * Math.sin(lat2) + Math.cos(lat1) * Math.cos(lat2) * Math.cos(lon1 - lon2));
        System.out.println("The distance between those points is: " + d + " km");
    }
}

