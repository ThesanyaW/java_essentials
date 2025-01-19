package textProcessing;
import java.util.Scanner;

class PasswordValidator{

    // Current credentials
    static String username = "jane_doe";
    static String currentPassword = "passw0rd";

    static boolean validatePassword(String newPassword) {
        // Track if there are any violations
        boolean isValid = true;

        // Check if the password is at least 8 characters long
        if (newPassword.length() < 8) {
            System.out.println("Password must be at least 8 characters long.");
            isValid = false;
        }

        // Check if the password contains at least one uppercase letter
        if (!newPassword.matches(".*[A-Z].*")) {
            System.out.println("Password must contain at least one uppercase letter.");
            isValid = false;
        }

        // Check if the password contains at least one digit
        if (!newPassword.matches(".*[0-9].*")) {
            System.out.println("Password must contain at least one digit.");
            isValid = false;
        }

        // Check if the password contains at least one special character
        if (!newPassword.matches(".*[!@#$%^&*(),.?\":{}|<>].*")) {
            System.out.println("Password must contain at least one special character.");
            isValid = false;
        }

        // Check if the password does not contain the username
        if (newPassword.contains(username)) {
            System.out.println("Password must not contain the username.");
            isValid = false;
        }

        // Check if the password is not the same as the old password
        if (newPassword.equals(currentPassword)) {
            System.out.println("Password must not be the same as the old password.");
            isValid = false;
        }

        // Return whether the password is valid
        return isValid;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean isValidPassword = false;

        // Keep prompting the user until they enter a valid password
        while (!isValidPassword) {
            System.out.print("Enter your new password: ");
            String newPassword = scanner.nextLine();

            // Validate the new password
            isValidPassword = validatePassword(newPassword);

            if (isValidPassword) {
                System.out.println("The password is valid!");
            } else {
                System.out.println("Please try again.\n");
            }
        }


        scanner.close();
    }
}
