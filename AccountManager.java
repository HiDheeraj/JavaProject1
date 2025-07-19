import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AccountManager {
    private final List<Account> accounts = new ArrayList<>();
    private final Scanner sc = new Scanner(System.in);

    // Create new account
    public void createAccount() {
        System.out.println("\n--- 🆕 Create New Account ---");
        System.out.print("👤 Enter Full Name: ");
        String name = sc.nextLine();
        System.out.print("📧 Enter Email: ");
        String email = sc.nextLine();
        System.out.print("📞 Enter Phone Number: ");
        String phone = sc.nextLine();
        System.out.print("🏦 Enter Bank Name: ");
        String bankName = sc.nextLine();

        Account acc = new Account(name, email, phone, bankName);
        accounts.add(acc);
        System.out.println("✅ Account created successfully!");
        System.out.println("🔢 Account Number: " + acc.getAccountId());
    }

    // Find account by ID
    private Account searchAccount(String id) {
        for (Account acc : accounts) {
            if (acc.getAccountId().equalsIgnoreCase(id)) {
                return acc;
            }
        }
        return null;
    }

    // Perform operations on a selected account
    public void performOperations() {
        System.out.print("\n🔍 Enter Account ID: ");
        String id = sc.nextLine();
        Account acc = searchAccount(id);

        if (acc == null) {
            System.out.println("❌ Account not found.");
            return;
        }

        while (true) {
            System.out.println("\n--- 🧰 Account Menu ---");
            System.out.println("1️⃣ Credit Amount");
            System.out.println("2️⃣ Debit Amount");
            System.out.println("3️⃣ Check Balance");
            System.out.println("4️⃣ View Account Details");
            System.out.println("5️⃣ Back to Main Menu");
            System.out.print("🔸 Choose an option: ");
            int choice = sc.nextInt();
            sc.nextLine(); // clear buffer

            switch (choice) {
                case 1:
                    System.out.print("💵 Enter amount to credit: ₹");
                    double credit = sc.nextDouble();
                    acc.creditAmount(credit);
                    break;

                case 2:
                    System.out.print("💸 Enter amount to debit: ₹");
                    double debit = sc.nextDouble();
                    acc.debitAmount(debit);
                    break;

                case 3:
                    acc.viewBalance();
                    break;

                case 4:
                    acc.displayDetails();
                    break;

                case 5:
                    return;

                default:
                    System.out.println("⚠️ Invalid option. Please try again.");
            }
        }
    }
}
