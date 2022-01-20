package javaChapter2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArraymMaxTest {
    @Test
    public void arraysAverageCanBeCalculated(){
        int[] numbers = {1,2,3,4,5};
        int result = ArrayMaxAndMin.calculateMaximum(numbers);

        assertEquals(14, result);
    }

    @Test
    public void arraysCanCalculateMinimum(){
        int[] numbers = {1,2,3,4,5};
        int result = ArrayMaxAndMin.calculateMinimum(numbers);

        assertEquals(10, result);
    }

//    @Test
//    public void arraysAverageCanBeCalculated(){
//        int[] numbers = {1,2,3,4,5};
//        double result = Kata.calculateAverageOf(numbers);
//        assertEquals(3.0, result);
//    }
//
//    @Test
//    public void arraysAverageCanBeCalculated(){
//        int[] numbers = {1,2,3,4,5};
//        double result = Kata.calculateAverageOf(numbers);
//        assertEquals(3.0, result);
//    }
}
