public class EnvironmentVariables {
    public static void main(String[] args) {
        System.out.println("PATH: " + System.getenv("PATH"));
        System.out.println("TEMP: " + System.getenv("TEMP"));
        System.out.println("USERNAME: " + System.getenv("USERNAME"));
    }
}
