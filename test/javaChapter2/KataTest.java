package javaChapter2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class KataTest {
    @Test

    public void gradeTestA() {
        Kata kata = new Kata();
       char result = kata.calculateGradeFor(98);
       assertEquals('A',result);
    }
    @Test
    public void gradeTestB(){
        Kata kata = new Kata();
        char result = kata.calculateGradeFor(89);
        assertEquals('B', result);
    }

    @Test
    public void gradeTestC(){
        Kata bata = new Kata();
        char iresult = bata.calculateGradeFor(79);
        assertEquals('C', iresult);
    }

    @Test
    public void gradeTestD(){
        Kata bata = new Kata();
        char iresult = bata.calculateGradeFor(65);
        assertEquals('D', iresult);
    }
    @Test
    public void gradeTestF(){
        Kata bata = new Kata();
        char iresult = bata.calculateGradeFor(59);
        assertEquals('F', iresult);
    }

    @Test
    public void testDrillerBelowFour(){
        Kata banta = new Kata();
        int price = banta.getPrice(3);
        assertEquals(6000, price);
    }

    @Test
    public void testDrillerBelowNine(){
        Kata danta = new Kata();
        int price = danta.getPrice(7);
        assertEquals(7 * 1800, price);
    }
    @Test
    public void testDrillerBelowTwentyNine(){
        Kata banta = new Kata();
        int price = banta.getPrice(11);
        assertEquals(17600, price);
    }
    @Test
    public void testDrillerAboveThirty(){
        Kata banta = new Kata();
        int price = banta.getPrice(46);
        assertEquals(46 * 1500, price);
    }
    @Test
    public void testDrillerBelowNintynine(){
        Kata banta = new Kata();
        int price = banta.getPrice(97);
        assertEquals(97 * 1300, price);
    }
    @Test
    public void testDrillerAboveHundred(){
        Kata banta = new Kata();
        int price = banta.getPrice(102);
        assertEquals(102 * 1200, price);
    }
    @Test
    public void testDrillerAboveTwoHundred(){
        Kata banta = new Kata();
        int price = banta.getPrice(205);
        assertEquals(205 * 1100, price);
    }
    @Test
    public void testDrillerAboveFiveHundred(){
        Kata banta = new Kata();
        int price = banta.getPrice(1000);
        assertEquals(1000 * 1000, price);
    }
    @Test
    public void arraysTotalCanBeCalculated(){
        int[] numbers = {1,2,3,4,5};
        int result = Kata.calculateTotalOf(numbers);
        assertEquals(15, result);
    }

    @Test
    public void arraysMinimumCanBeCalculated(){
        int[] numbers = {1,2,3,4,5};
        int result = Kata.calculateMinimumOf(numbers);
        assertEquals(1, result);
    }

    @Test
    public void arraysMaximumCanBeCalculated(){
        int[] numbers = {1,2,3,4,5};
        int result = Kata.calculateMaximumOf(numbers);
        assertEquals(5, result);
    }
    @Test
    public void arraysAverageCanBeCalculated(){
        int[] numbers = {1,2,3,4,5};
        double result = Kata.calculateAverageOf(numbers);
        assertEquals(3.0, result);
    }
}

