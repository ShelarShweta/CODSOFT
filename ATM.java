import java.util.ArrayList;
import java.util.Scanner;

public class ATM {
    private static double balance = 1500.0;
    private static ArrayList<String> transactionhistory = new ArrayList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int option;
        do {
            System.out.println("Welcome");
            System.out.println("1.check balance");
            System.out.println("2.withdraw");
            System.out.println("3.check transactionhistory");
            System.out.println("4.deposit");
            System.out.println("5.exit");
            System.out.print(" Select the option:");
            option = sc.nextInt();

            switch (option) {
                case 1:
                    viewBalance();
                    break;
                case 2:
                    withdraw(sc);
                    break;
                case 3:
                    viewTransactionHistory();
                    break;
                case 4:
                    deposit(sc);
                    break;
                case 5:
                    System.out.println("Thank you for using the ATM.");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (option != 5);
    }

    public static void viewBalance() {
        System.out.println("Your total balance is: $" + balance);
    }

    public static void withdraw(Scanner sc) {
        System.out.print("Enter the amount to withdraw: $");
        int amount = sc.nextInt();

        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("You have withdrawn $" + amount);
            System.out.println("New balance: $" + balance);
            addToTransactionHistory("Withdraw", amount);
        } else if (amount <= 0) {
            System.out.println("Invalid amount. Please enter a positive value.");
        } else {
            System.out.println("Insufficient funds. Your balance is $" + balance);
        }
    }

    public static void deposit(Scanner sc) {
        System.out.print("Enter the amount to deposit: $");
        int amount = sc.nextInt();

        if (amount > 0) {
            balance += amount;
            System.out.println("You have deposited $" + amount);
            System.out.println("New balance: $" + balance);
            addToTransactionHistory("Deposit", amount);
        } else {
            System.out.println("Invalid amount. Please enter a positive value.");
        }
    }

    public static void addToTransactionHistory(String type, int amount) {
        String transaction = type + " of $" + amount;
        transactionhistory.add(transaction);
    }

    public static void viewTransactionHistory() {
        System.out.println("Transaction History:");
        for (String transaction : transactionhistory) {
            System.out.println(transaction);
        }
    }
}
