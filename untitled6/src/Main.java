import Service.Account;

import java.util.ArrayList;
import java.util.Scanner;

public class Main  {
    private  static  Account currrentAccount;
    private static Account currentAccount;


    private static boolean authenticate(String username, String password, Account account) {
        return username.equals(account.getUsername()) && password.equals(account.getPassword());
    }

    public static void main(String[] args) {
        Account account = new Account("John", "Doe", "123456", "JohnD", 1000.00);

        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the ATM!");
        System.out.print("Enter username: ");
        String username = scanner.nextLine();
        System.out.print("Enter password: ");
        String password = scanner.nextLine();
        if (authenticate(username, password, account)) {
            Account currentAccount = account;
            System.out.println("Authentication successful.");
            displayMenu();
            int choice = scanner.nextInt();
            performAction(choice, scanner);
        }
    }
    private static void displayMenu() {
        System.out.println("1. Check Balance");
        System.out.println("2. Withdraw Funds");
        System.out.println("3. Deposit Funds");
        System.out.println("4. Exit");
        System.out.print("Enter your choice: ");
    }

    // Method to perform actions based on user choice
    private static void performAction(int choice, Scanner scanner) {
        switch (choice) {
            case 1:
                currentAccount.checkBalance();
                break;
            case 2:
                System.out.print("Enter withdrawal amount: ");
                double withdrawAmount = scanner.nextDouble();
                currentAccount.withdraw(withdrawAmount);
                break;
            case 3:
                System.out.print("Enter deposit amount: ");
                double depositAmount = scanner.nextDouble();
                currentAccount.deposit(depositAmount);
                break;
            case 4:
                System.out.println("Exiting...");
                System.exit(0);
            default:
                System.out.println("Invalid choice.");
        }
    }
}
