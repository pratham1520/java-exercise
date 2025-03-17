import java.util.Scanner;

public class HighestAndLowestScores {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input number of students: ");
        int n = scanner.nextInt();

        String highestName = "";
        String highestID = "";
        int highestScore = Integer.MIN_VALUE;

        String lowestName = "";
        String lowestID = "";
        int lowestScore = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            System.out.print("Input Student Name, ID, Score: ");
            String name = scanner.next();
            String id = scanner.next();
            int score = scanner.nextInt();

            if (score > highestScore) {
                highestScore = score;
                highestName = name;
                highestID = id;
            }
            if (score < lowestScore) {
                lowestScore = score;
                lowestName = name;
                lowestID = id;
            }
        }

        System.out.println("name, ID of the highest score and the lowest score:");
        System.out.println(highestName + " " + highestID);
        System.out.println(lowestName + " " + lowestID);
    }
}
