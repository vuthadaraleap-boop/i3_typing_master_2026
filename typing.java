import java.util.Scanner;

public class  typing{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("------------ Welcome to I3 Typing Master v2026 ------------");
        System.out.println("To begin, please select one of the following options:");
        System.out.println("1. Login");
        System.out.println("2. Register");
        System.out.println("3. Exit");
        System.out.print("Choose an option: ");

        int choice = input.nextInt();
        input.nextLine(); // Consume the newline character left by nextInt()

        switch (choice) {
            case 1:
                System.out.println("You selected Login.");
                break;
            case 2:
                System.out.println("\n--- User Registration ---");
                handleRegistration(input);
                break;
            case 3:
                System.out.println("Exiting program...");
                break;
            default:
                System.out.println("Invalid option.");
        }

        input.close();
    }

    private static void handleRegistration(Scanner input) {
        System.out.print("Enter a new username: ");
        String newUsername = input.nextLine();
        
        System.out.print("Enter a new password: ");
        String newPassword = input.nextLine();
        
        System.out.print("Confirm your password: ");
        String confirmPassword = input.nextLine();
        
        if (newPassword.equals(confirmPassword)) {
            // Future implementation: Save newUsername and newPassword to a database here
            System.out.println("\nRegistration successful! Welcome to I3 Typing Master, " + newUsername + ".");
            System.out.println("You can now use your credentials to login.");
        } else {
            System.out.println("\nError: Passwords do not match. Registration failed.");
        }
        System.out.println("-------------------------\n");
    }
}