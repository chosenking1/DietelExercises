package javaChapter2.Exercises;
//2.30
import java.util.Scanner;

public class Separate {
public static void main(String[] args) {
 Scanner input = new Scanner(System.in);
 System.out.print("Please Input five digit");
 int number = input.nextInt();
 int first = number / 10000;
 int num1 = number % 10000;
 int second = num1 / 1000;
 int num2 = num1 % 1000;
 int third = num2 / 100;
 int num3 = num2 % 100;
 int fourth = num3 / 10;
 int five = num3 % 10;

 System.out.printf("%d %d %d %d %d ", first, second, third, fourth, five );
}
}