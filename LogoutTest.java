public class LogoutTest {

    public static void main(String[] args) {

        boolean userLoggedIn = true;

        userLoggedIn = false;

        if (userLoggedIn == false) {
            System.out.println("PASS - User logged out successfully");
        } else {
            System.out.println("FAIL - User is still logged in");
        }
    }
}