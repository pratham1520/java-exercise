public class TwentyAppearsThriceNonConsecutively {
    public static void main(String[] args) {
        int[] array = {20, 10, 20, 30, 20, 40};
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 20) {
                count++;
                if (i > 0 && array[i - 1] == 20) {
                    count--;
                }
            }
        }
        System.out.println(count == 3);
    }
}