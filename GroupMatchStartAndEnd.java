public class GroupMatchStartAndEnd {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 1, 2, 3};
        int l = 3;
        boolean result = true;
        for (int i = 0; i < l; i++) {
            if (array[i] != array[array.length - l + i]) {
                result = false;
                break;
            }
        }
        System.out.println(result);
    }
}
