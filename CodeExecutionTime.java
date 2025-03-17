public class CodeExecutionTime {
    public static void main(String[] args) {
        long startTime = System.nanoTime();
        // Code to measure
        long endTime = System.nanoTime();
        long duration = endTime - startTime;
        System.out.println("Execution time: " + duration + " nanoseconds");
    }
}
