public class First3CharsOrHash {
    public static void main(String[] args) {
        String str = " ";
        String result = (str.length() >= 3) ? str.substring(0, 3) : "###";
        System.out.println(result);
    }
}
