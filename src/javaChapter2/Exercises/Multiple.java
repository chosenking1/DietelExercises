package javaChapter2.Exercises;//2.26
import java.util.Scanner;
public class Multiple{
public static void main(String[] args){
Scanner write = new Scanner(System.in);
System.out.print("Type First number");
int number = write.nextInt();
System.out.print("Type Second number");
int number1 = write.nextInt();

if (number1 % number == 0) {
System.out.printf("%d Is a Multiple of %d", number, number1); 
}


if (number1 % number != 0) {
System.out.printf("%d Is not a Multiple of %d", number, number1); 
}


}
}