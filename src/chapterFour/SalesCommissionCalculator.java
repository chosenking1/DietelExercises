package chapterFour;
// 4.19
import java.util.Scanner;

public class SalesCommissionCalculator {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("How many of each item did He/ she sold");
        int itemSold1 = scanner.nextInt();
        int itemSold2 = scanner.nextInt();
        int itemSold3 = scanner.nextInt();
        int itemSold4 = scanner.nextInt();

        double total;

        double item1 = (239.99 * itemSold1) * (9.0/100);
        double item2 = (129.75 * itemSold2) * (9.0/100);
        double item3 = (99.95 * itemSold3) * (9.0/100);
        double item4 = (350.89 * itemSold4) * (9.0/100);

        total = 200 + item1 + item2 + item3 + item4;


        System.out.println(total);

        }
}
