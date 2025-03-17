public class CheckSecurityManager {
    public static void main(String[] args) {
        SecurityManager securityManager = System.getSecurityManager();
        if (securityManager != null) {
            System.out.println("Security manager is already established.");
        } else {
            System.out.println("Security manager is not established.");
        }
    }
}
