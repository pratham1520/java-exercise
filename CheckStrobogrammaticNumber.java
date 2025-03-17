public class CheckStrobogrammaticNumber {
    public static void main(String[] args) {
        String number = "9006";
        System.out.println("Is " + number + " Strobogrammatic? " + isStrobogrammatic(number));
    }

    public static boolean isStrobogrammatic(String num) {
        int left = 0;
        int right = num.length() - 1;

        while (left <= right) {
            char leftChar = num.charAt(left);
            char rightChar = num.charAt(right);

            if (!((leftChar == '0' && rightChar == '0') ||
                    (leftChar == '1' && rightChar == '1') ||
                    (leftChar == '8' && rightChar == '8') ||
                    (leftChar == '6' && rightChar == '9') ||
                    (leftChar == '9' && rightChar == '6'))) {
                return false;
            }

            left++;
            right--;
        }

        return true;
    }
}
