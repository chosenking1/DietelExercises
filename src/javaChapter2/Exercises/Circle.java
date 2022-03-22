package javaChapter2.Exercises;//2.28
import java.util.Scanner;
public class Circle
{
        public static void main(String[] args){
        Scanner accept = new Scanner(System.in);
        
        System.out.print("Input the Radius here: ");
        float radius = accept.nextFloat();
        
        
        
        
        System.out.printf("The Diameter is %.2f%n The Circumference is %.2f%n The Area is %.2f", (2 * radius), (2 * 3.14159 * radius), (3.14159 * radius * radius) );
          }
}