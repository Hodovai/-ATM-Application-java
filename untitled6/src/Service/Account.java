package Service;

public class Account {
    private String firsName;
    private String lastName;
    private String Username;
    private String password;
    private String accountNumber;
    private String accountHolderName;
    private double balance;






    public Account(String firsName, String lastName , String password, String Username, double balance) {
        this.firsName = firsName;
        this.lastName = lastName;
        this.Username =  Username;
        this.password = password;;
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;

    }

    public String getFirsName() {
        return  firsName;
    }
    public void setFirsName(String firsName) {
        this.firsName = firsName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String getUsername() {
        return getUsername();
    }
    public void setUsername(String username) {
        this.Username = username;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
    public void checkBalance() {
        System.out.println("Current Balance: $" + balance);
    }
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawal successful. Remaining Balance: $" + balance);
        } else {
            System.out.println("Invalid amount or insufficient funds.");
        }
    }
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposit successful. Updated Balance: $" + balance);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }


}
