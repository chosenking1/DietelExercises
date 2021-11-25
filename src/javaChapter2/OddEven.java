package javaChapter2;//2.25
import java.util.Scanner;
public class OddEven{
public static void main(String[] args){
Scanner write = new Scanner(System.in);
System.out.print("Type a number");
int number = write.nextInt();

if (number % 2 == 0) {
System.out.print("It is an Even Number"); 
}


if (number % 2 != 0) {
System.out.print("It is an Odd Number"); 
}


}
}