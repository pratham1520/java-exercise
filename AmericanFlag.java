public class AmericanFlag {
    public static void main(String[] args) {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 46; j++) {
                if (i % 2 == 0 && j < 12) {
                    System.out.print("* ");
                } else if (j < 12) {
                    System.out.print("  ");
                } else {
                    System.out.print("=");
                }
            }
            System.out.println();
        }
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 46; j++) {
                System.out.print("=");
            }
            System.out.println();
        }
    }
}
