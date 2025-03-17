public class CountElementsDifferBy1 {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {2, 3, 4, 5, 6};
        int count = 0;
        for (int i = 0; i < array1.length; i++) {
            if (Math.abs(array1[i] - array2[i]) <= 1) {
                count++;
            }
        }
        System.out.println(count);
    }
}
