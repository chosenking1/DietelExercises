package chapterThree;
//
import java.util.Scanner;
public class BankAccountDriver {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        BankAccount myAccount = new BankAccount("Hope Michealson", 7000.0);
        BankAccount mySecondAccount = new BankAccount("Makinwa Samuel", 40000.0);


        System.out.printf("Initial name is, %s Balance is: $%.2f%n", myAccount.getName(), myAccount.getBalance());
        System.out.printf("Second Account name is, %s Balance is: $%.2f%n", mySecondAccount.getName(), mySecondAccount.getBalance());
        System.out.println("Please enter the deposit amount for " + myAccount.getName());
        double accountDepositAmount = scanner.nextDouble();
        System.out.printf("%n adding %.2f to %s balance %n%n",accountDepositAmount, myAccount.getName());
        myAccount.deposit(accountDepositAmount);

        System.out.printf("%s balance: $%.2f%n", myAccount.getName(), myAccount.getBalance());
//
        System.out.printf("%s balance: $%.2f%n", mySecondAccount.getName(), mySecondAccount.getBalance());

        System.out.println("Please enter the amount you want to withdraw " + myAccount.getName());
        int accountWithdrawalAmount = scanner.nextInt();

        myAccount.withdraw(accountWithdrawalAmount);

        System.out.printf("%s balance: $%.2f%n", myAccount.getName(), myAccount.getBalance());

    }
}
