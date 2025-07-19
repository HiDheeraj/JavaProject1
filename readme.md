## 🏦 Account Management System

A **Java-based console application** built using **Object-Oriented Programming (OOP)** principles. This project simulates a simple bank account management system, allowing users to:

- Create new accounts
- Access existing accounts
- Perform basic operations (e.g., deposits, withdrawals, balance check)
- Exit the system gracefully

  <img width="869" height="517" alt="image" src="https://github.com/user-attachments/assets/719b3355-8c35-4792-bc1e-7e88379c34cc" />

---

### 📂 Project Structure

```
📁 AccountManagementSystem
🔚� Main.java              // Entry point of the application
🔚� AccountManager.java    // Handles operations like account creation, access
🔚� Account.java           // Defines account properties and data model
```

---

### ⚙️ Features

- 🆕 **Create New Account**\
  Prompts the user for full name, email, phone number, and bank name. Generates a unique account number.

- 🔓 **Access Existing Account**\
  Allows account holders to access their accounts and perform operations (implementation assumed in `AccountManager.java`).

- ❌ **Exit System**\
  Gracefully closes resources and ends the application.

---

### 🖼️ Sample Output

```
======= 🏦 Account Management System =======
1️⃣ Create New Account
2️⃣ Access Existing Account
3️⃣ Exit
🔸 Select an option: 1

--- 🆕 Create New Account ---
🔹 Enter Full Name: Dheeraj Gummadi
🔹 Enter Email: gummadidheeraj23@gmail.com
🔹 Enter Phone Number: 6300764870
🔹 Enter Bank Name: SBI
✅ Account created successfully!
🏷️  Account Number: E8EB3FE5
```

---

### 🛠️ Tech Stack

- **Language:** Java
- **Concepts Used:**
  - Object-Oriented Programming (OOP)
  - Exception Handling
  - Scanner for user input
  - UUID/random generation for account numbers

---

### ✅ How to Run

1. **Clone the Repository:**

   ```bash
   git clone https://github.com/your-username/AccountManagementSystem.git
   cd AccountManagementSystem
   ```

2. **Compile the Code:**

   ```bash
   javac Main.java AccountManager.java Account.java
   ```

3. **Run the Program:**

   ```bash
   java Main
   ```

---

### 📌 Notes

- Ensure all `.java` files are in the **same directory** when compiling.
- The scanner resource is **properly closed** to avoid memory leaks.
- Future improvements may include file storage or database integration.

---

### 👨‍💻 Author

**Dheeraj Gummadi**\
Feel free to connect or contribute improvements via pull requests or issues!

