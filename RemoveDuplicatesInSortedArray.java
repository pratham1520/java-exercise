public class RemoveDuplicatesInSortedArray {
    public static void main(String[] args) {
        int[] array = {1, 1, 2, 3, 3, 3, 4, 5, 6, 7, 7};
        int length = removeDuplicates(array);
        System.out.println("New length of the array is: " + length);
    }

    public static int removeDuplicates(int[] array) {
        if (array.length == 0) {
            return 0;
        }
        int index = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] != array[index]) {
                index++;
                array[index] = array[i];
            }
        }
        return index + 1;
    }
}
