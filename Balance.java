import java.util.Scanner;

public class Balance {
    // how to deposit the balance while taking the input from the user

    static int balance = 1000;

    static void deposit(int amount) {
        balance = balance + amount;
    }

    static void withdraw(int amount) {
        balance = balance - amount;
    }

    static void display() {
        System.out.println("The Current Balance is: " + balance);
    }

    public static void main(String[] args) {
        deposit(200);
        withdraw(400);
        display();
    }
}

// how to deposit the balance while taking the input from the user

class Plunk {
    static int balance = 0;

    static void deposit(int deposit) {
        balance = balance + deposit;
    }

    static void withdraw(int withdraw) {
        balance = balance - withdraw;

    }

    static void check(int deposit, int withdraw) {
        if (deposit < withdraw) {
            System.out.println("Insufficient Balance");
        }
    }

    static void display() {
        System.out.println("The Remaining Balance is :" + balance);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the deposit amount: ");
        int deposit = sc.nextInt();
        System.out.println("Enter the Withdraw amount: ");
        int withdraw = sc.nextInt();
        deposit(deposit);
        withdraw(withdraw);
        check(deposit, withdraw);
        display();
        sc.close();

    }
}