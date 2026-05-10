package codewars.sixKu.seven_ku;

//import org.junit.jupiter.api.Assertions;

import java.util.Arrays;

/*
Create a function that returns the sum of the two lowest positive numbers given an array of minimum 4 positive integers. No floats or non-positive integers will be passed.

For Java, those integers will come as double precision (long).

For example, when an array is passed like [19, 5, 42, 2, 77], the output should be 7.

[10, 343445353, 3453445, 3453545353453] should return 3453455.
 */
public class SumOfTwoLowestPositiveIntegers {
    public static long sumTwoSmallestNumbers(long[] numbers) {
        return Arrays.stream(numbers).sorted().limit(2).sum();
    }

    static void main() {
        /*Assertions.assertEquals(7, sumTwoSmallestNumbers(new long[] {19, 5, 42, 2, 77}));
        Assertions.assertEquals(3453455, sumTwoSmallestNumbers(new long[] {10, 343445353, 3453445, 3453545353453L}));*/
    }
}
