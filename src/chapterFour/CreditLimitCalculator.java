package chapterFour;

import java.util.Scanner;

//4.18
public class CreditLimitCalculator {
    private int accountNumber;
    private int balance;
    private int charges;
    private int credit;
    private int creditLimit;



    public void creditLimitCall(){

        int newAccountNumber = inputMethod("Please Type the AccountNumber: ");
        int accountBalance = inputMethod("Please Type the Account Balance: ");
        int charge = inputMethod("Please Type the charges: ");
        int credits = inputMethod("Please Type the credit: ");
        int limitOfCredit= inputMethod("Please Type the Credit Limit: ");
        new CreditLimitCalculator(newAccountNumber,accountBalance,charge,credits,limitOfCredit);

    }
    public CreditLimitCalculator(int newAccountNumber, int accountBalance, int charge, int credits, int limitOfCredit){
        
        accountNumber = newAccountNumber;
        balance = accountBalance;
        charges = charge;
        credit = credits;
        creditLimit = limitOfCredit;
        display(creditCheck(balance, charges, credit));
//        if (accountBalance > 0.0) {
//            balance = accountBalance;
//        }
    }
    public String creditCheck( int accountBalance, int charge, int credits){
        String message;
        int newBalance = accountBalance + charge - credits;
        if (newBalance > creditLimit){
           message = "Your Credit is over the limit";
        }
        else message = "You Haven't used up your Limit";

        return message;
    }


    public int  inputMethod(String message) {
        System.out.println(message);
        Scanner scanner = new Scanner(System.in);
        //int input = scanner.nextInt();
        return scanner.nextInt();
    }
    private void display(String accountName) {

        System.out.println(accountName );
    }
}
