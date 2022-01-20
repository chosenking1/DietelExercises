package chapterFour;
//4.18
public class CreditLimitCalculator {
    private int accountNumber;
    private int balance;
    private int charges;
    private int credit;
    private int creditLimit;


    public CreditLimitCalculator(int newAccountNumber, int accountBalance, int charge, int credits, int limitOfCredit){
        accountNumber = newAccountNumber;
        if (accountBalance > 0.0) {
            balance = accountBalance;
        }
    }


    private void display(String accountName, int accountBalance) {

        System.out.println(accountName + " " + " " + accountBalance);
    }
}
