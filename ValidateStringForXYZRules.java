import java.util.Scanner;

public class ValidateStringForXYZRules {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input a string: ");
        String input = scanner.nextLine();

        if (isValidXYZString(input)) {
            System.out.println("Correct format..");
        } else {
            System.out.println("Incorrect format..");
        }
    }

    public static boolean isValidXYZString(String str) {
        if (!str.matches("[XYZ]+")) {
            return false;
        }
        if (str.contains("XZ") || str.contains("ZX")) {
            return false;
        }
        int xCount = 0;
        for (char c : str.toCharArray()) {
            if (c == 'X') {
                xCount++;
            } else if (c == 'Y') {
                if (xCount == 0) return false;
                xCount--;
            }
        }
        return xCount == 0;
    }
}
