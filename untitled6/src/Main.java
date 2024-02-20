import Service.Account;

import java.util.ArrayList;

public class Main extends Account {
    private double balance;

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            String transaction = "Withdrawal of $" + amount;
            transaction.add(transaction);
            System.out.println("Withdrawal of $" + amount + " successful.");
        } else {
            System.out.println("Invalid amount or insufficient balance for withdrawal.");
        }
    }

    public static void main(String[] args) {
        ArrayList<String> transcation = new ArrayList<>();

    }
}
