package chapterFour;

import java.util.Scanner;

//4.20
public class TaxCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Citizen Name: ");
        String citizenName = scanner.nextLine();
        System.out.print("Citizen Annual Salary: ");
        int earningForTheYear = scanner.nextInt();
    double tax;
        if (earningForTheYear <= 30000){
           tax = earningForTheYear * (15.0/100);
        }
        else{
            tax = earningForTheYear * (20.0/100);
        }

        System.out.println(citizenName + " Total tax for the year is: " + tax);
    }
}
