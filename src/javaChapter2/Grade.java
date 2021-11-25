package javaChapter2;

import java.util.Scanner;
public class Grade{
     public static void main(String[] args){
     Scanner write = new Scanner(System.in);
     System.out.print ("Please input First number");
      int first = write.nextInt();
System.out.print ("Please input Second number");
     int second = write.nextInt();
System.out.print ("Please input Third number");
     int third = write.nextInt();
System.out.print ("Please input Fourth number");
      int fourth = write.nextInt();

if (first > second){
if(first > third){
if(first > fourth)
System.out.println("A is the Highest " + first);
}}

if (second > first){
if(second > third){
if(second > fourth)
System.out.println("B is the Highest " + second);
}}

if (third > second){
if(third > first){
if(third > fourth)
System.out.println("C is the Highest " + third);
}}

if (fourth > second){
if(fourth > third){
if(fourth > first)
System.out.println("D is the Highest " + fourth);
}}

 if (first > second){
if(first > third){
if(first < fourth)
System.out.println("A is the Second " + first);
}}

if (first > second){
if(first < third){
if(first > fourth)
System.out.println("A is the Second " + first);
}}

if (first < second){
if(first > third){
if(first > fourth)
System.out.println("A is the Second " + first);
}}

if (second < first){
if(second > third){
if(second > fourth)
System.out.println("B is the Second " + second);
}}
if (second > first){
if(second < third){
if(second > fourth)
System.out.println("B is the Second " + second);
}}
if (second > first){
if(second > third){
if(second < fourth)
System.out.println("B is the Second " + second);
}}

if (third < second){
if(third > first){
if(third > fourth)
System.out.println("C is the Second " + third);
}}

if (third > second){
if(third < first){
if(third > fourth)
System.out.println("C is the Second " + third);
}}
if (third > second){
if(third > first){
if(third < fourth)
System.out.println("C is the Second " + third);
}}

if (fourth < second){
if(fourth > third){
if(fourth > first)
System.out.println("D is the Second " + fourth);
}}
if (fourth > second){
if(fourth < third){
if(fourth > first)
System.out.println("D is the Second " + fourth);
}}
if (fourth > second){
if(fourth > third){
if(fourth < first)
System.out.println("D is the Second " + fourth);
}}


if (first < second){
if(first < third){
if(first > fourth)
System.out.println("A is the Third " + first);
}}

if (first > second){
if(first < third){
if(first < fourth)
System.out.println("A is the Third " + first);
}}
if (first < second){
if(first > third){
if(first < fourth)
System.out.println("A is the Third " + first);
}}

if (second < first){
if(second < third){
if(second > fourth)
System.out.println("The Third is " + second);}}
if (second < first){
if(second > third){
if(second < fourth)
System.out.println("B is the Third " + second);}}
if (second > first){
if(second < third){
if(second < fourth)
System.out.println("B is the Third " + second);}}

if (third < second){
if(third > first){
if(third < fourth)
System.out.println("C is the Third " + third);
}}
if (third > second){
if(third < first){
if(third < fourth)
System.out.println("C is the Third " + third);
}}
if (third < second){
if(third < first){
if(third > fourth)
System.out.println("C is the Highest " + third);
}}

if (fourth < second){
if(fourth > third){
if(fourth < first)
System.out.print("D is the Third " + fourth);
}}
if (fourth > second){
if(fourth < third){
if(fourth < first)
System.out.println("D is the Third " + fourth);
}}
if (fourth < second){
if(fourth < third){
if(fourth > first)
System.out.println("D is the Third " + fourth);
}}

 if(first < second) 
            { if (first < third) 
            { if (first < fourth)
            
            System.out.println ("A is the Lowest" + first);}}

 if(second < first) 
            { if (second < third) 
            { if (second < fourth)
            
            System.out.println ("B is the Lowest " + second);}}

 if(third < second) 
            { if (third < first) 
            { if (third < fourth)
            
            System.out.println ("C is the Lowest " + third);}}

 if(fourth < second) 
            { if (fourth < third) 
            { if (fourth < first)
            
            System.out.println ("D is the Lowest " + fourth);}}



}
}

