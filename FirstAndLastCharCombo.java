public class FirstAndLastCharCombo {
    public static void main(String[] args) {
        String str1 = "Python";
        String str2 = " ";
        String result = (str1.isEmpty() ? "#" : str1.charAt(0)) + "" + (str2.isEmpty() ? "#" : str2.charAt(str2.length() - 1));
        System.out.println(result);
    }
}
