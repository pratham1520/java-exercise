import java.util.Arrays;

public class CheckStringPermutation {
    public static void main(String[] args) {
        String str1 = "xxyz";
        String str2 = "yxzx";
        System.out.println(isPermutation(str1, str2));
    }

    public static boolean isPermutation(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }
        char[] charArray1 = str1.toCharArray();
        char[] charArray2 = str2.toCharArray();
        Arrays.sort(charArray1);
        Arrays.sort(charArray2);
        return Arrays.equals(charArray1, charArray2);
    }
}

