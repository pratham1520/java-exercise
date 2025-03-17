public class SpecifiedNumberInAdjacentPairs {
    public static void main(String[] args) {
        int[] array = {2, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        int number = 2;
        boolean result = true;
        for (int i = 0; i < array.length - 1; i += 2) {
            if (!(array[i] == number || array[i + 1] == number)) {
                result = false;
                break;
            }
        }
        System.out.println(result);
    }
}
