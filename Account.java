import java.util.UUID;

public class Account {
    private String accountHolderName;
    private String email;
    private String phone;
    private String bankName;
    private String accountNumber;
    private String accountId;
    private double balance;

    // Constructor
    public Account(String name, String email, String phone, String bankName) {
        this.accountHolderName = name;
        this.email = email;
        this.phone = phone;
        this.bankName = bankName;
        this.accountNumber = generateAccountNumber();
        this.accountId = UUID.randomUUID().toString().substring(0, 8).toUpperCase();
        this.balance = 0.0;
    }

    // Generate unique 10-digit account number
    private String generateAccountNumber() {
        return "AC" + (long) (Math.random() * 1_000_000_000L + 1_000_000_000L);
    }

    // Credit method
    public void creditAmount(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("✅ Amount credited successfully.");
        } else {
            System.out.println("⚠️ Enter a valid amount to credit.");
        }
    }

    // Debit method
    public void debitAmount(double amount) {
        if (amount <= 0) {
            System.out.println("⚠️ Enter a valid amount to debit.");
        } else if (amount > balance) {
            System.out.println("❌ Insufficient balance.");
        } else {
            balance -= amount;
            System.out.println("✅ Amount debited successfully.");
        }
    }

    // View balance
    public void viewBalance() {
        System.out.printf("📊 Current Balance: ₹%.2f\n", balance);
    }

    // Display account details
    public void displayDetails() {
        System.out.println("\n--- 🧾 Account Details ---");
        System.out.println("👤 Account Holder: " + accountHolderName);
        System.out.println("📧 Email: " + email);
        System.out.println("📞 Phone: " + phone);
        System.out.println("🏦 Bank Name: " + bankName);
        System.out.println("🔢 Account Number: " + accountNumber);
        System.out.println("🆔 Account ID: " + accountId);
        System.out.printf("💰 Balance: ₹%.2f\n", balance);
        System.out.println("------------------------------\n");
    }

    // Getters
    public String getAccountId() {
        return accountId;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }
}
