public class Contains10Or30 {
    public static void main(String[] args) {
        int[] array = {10, 20, 30, 40, 50};
        boolean result = false;
        for (int num : array) {
            if (num == 10 || num == 30) {
                result = true;
                break;
            }
        }
        System.out.println(result);
    }
}
