/*Write a program that creates a class Account that have members customer name, account number. Account has constructor to initialize its members and method display() to show the result. Create a child class Savings_Account that is derived from Account class. Savings_Account have members min_bal and saving_bal. Use show() to display its details. Then create another child class Account_details from Savings_Account class have members deposit, withdrawl and a method show1() to show its details. Child classes have constructors of their own. Create a driver class that creates a record of customer and display all its details.*/
import java.util.*;

class Account {
    String customerName;
    int accountNumber;
    Account(String name, int accNumber) {
        customerName = name;
        accountNumber = accNumber;
    }
    void display() {
        System.out.println("Customer Name: " + customerName);
        System.out.println("Account Number: " + accountNumber);
    }
}
class Savings_Account extends Account {
    double minBalance;
    double savingBalance;
    Savings_Account(String name, int accNumber, double minBal, double savingBal) {
        super(name, accNumber);
        minBalance = minBal;
        savingBalance = savingBal;
    }
    void show() {
        super.display();
        System.out.println("Minimum Balance: " + minBalance);
        System.out.println("Savings Balance: " + savingBalance);
    }
}
class Account_Details extends Savings_Account {
    double deposit;
    double withdrawal;
    Account_Details(String name, int accNumber, double minBal, double savingBal, double dep, double with) {
        super(name, accNumber, minBal, savingBal);
        deposit = dep;
        withdrawal = with;
    }
    void show1() {
        super.show();
        System.out.println("Deposit: " + deposit);
        System.out.println("Withdrawal: " + withdrawal);
    }
}
class Asgmt5_5 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter customer name:");
        String name = sc.nextLine();
        System.out.println("Enter account number:");
        int accNumber = sc.nextInt();
        System.out.println("Enter minimum balance:");
        double minBal = sc.nextDouble();
        System.out.println("Enter savings balance:");
        double savingBal = sc.nextDouble();
        System.out.println("Enter deposit amount:");
        double deposit = sc.nextDouble();
        System.out.println("Enter withdrawal amount:");
        double withdrawal = sc.nextDouble();
        Account_Details accountDetails = new Account_Details(name, accNumber, minBal, savingBal, deposit, withdrawal);
        accountDetails.show1();
    }
}