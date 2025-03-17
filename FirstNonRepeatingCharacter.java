public class FirstNonRepeatingCharacter {
    public static void main(String[] args) {
        String str = "google";
        System.out.println("Index of first non-repeating character in '" + str + "' is: " + firstNonRepeatingChar(str));
    }

    public static int firstNonRepeatingChar(String s) {
        int[] charCount = new int[256];

        for (char c : s.toCharArray()) {
            charCount[c]++;
        }

        for (int i = 0; i < s.length(); i++) {
            if (charCount[s.charAt(i)] == 1) {
                return i;
            }
        }

        return -1;
    }
}
