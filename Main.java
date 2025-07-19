import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AccountManager manager = new AccountManager();

        while (true) {
            System.out.println("\n======= 🏦 Account Management System =======");
            System.out.println("1️⃣ Create New Account");
            System.out.println("2️⃣ Access Existing Account");
            System.out.println("3️⃣ Exit");
            System.out.print("🔸 Select an option: ");

            int choice;
            try {
                choice = Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("❌ Please enter a valid number.");
                continue;
            }

            switch (choice) {
                case 1:
                    manager.createAccount();
                    break;

                case 2:
                    manager.performOperations();
                    break;

                case 3:
                    System.out.println("👋 Thank you for using the system. Goodbye!");
                    return;

                default:
                    System.out.println("⚠️ Invalid option. Try again.");
            }
        }
    }
}
