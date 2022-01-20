package chapterThree;
//3.11

public class BankAccount {
    private String name;
    private double balance;

    public BankAccount(String newAccountName, double accountBalance){
        name = newAccountName;
        if (accountBalance > 0.0) {
             balance = accountBalance;
        }
    }

    public void deposit (double depositAmount){
        if(depositAmount >0.0){
            balance = balance + depositAmount;
        }
    }

    public double getBalance() {
        return balance;
    }

    public void setName(String newAccountName){
        name = newAccountName;
    }
    public void withdraw(int withdrawal){
        if(withdrawal > balance){
            System.out.println("The You dont Have enough in your balance");
        }
        else {
            balance = balance - withdrawal;
        }
    }
    public String getName(){
        return name;
    }

    private void display(String accountName, int accountBalance) {

        System.out.println(accountName + " " + " " + accountBalance);
    }
}
