/*
package codewars.sixKu.seven_ku;

import java.util.Arrays;
import java.util.IntSummaryStatistics;

import static org.junit.jupiter.api.Assertions.assertEquals;

*/
/**
 * Find max(abs(length(x) − length(y))), где x - строка из а1, а y - строка из a2
 *//*

public class MaxDiffLength {

    public static int mxdiflg(String[] a1, String[] a2) {
        if(a1.length == 0 || a2.length == 0) {
            return -1;
        }
        //max(x) - min(y) и min(x) - max(y)
        IntSummaryStatistics statX = Arrays.stream(a1).mapToInt(String::length).summaryStatistics();
        IntSummaryStatistics statY = Arrays.stream(a2).mapToInt(String::length).summaryStatistics();
        return Math.max(Math.abs(statX.getMin() - statY.getMax()), Math.abs(statX.getMax() - statY.getMin()));
        */
/*int max = Math.abs(a1[0].length() - a2[0].length());
        for (String s : a1) {
            for (String string : a2) {
                if (Math.abs(s.length() - string.length()) > max) {
                    max = Math.abs(s.length() - string.length());
                }
            }
        }
        return max;*//*

        //a1: abc, cd, a
        //a2: abc, gd, e
        //max(length
    }

    static void main() {
        System.out.println("mxdiflg Fixed Tests");
        String[] s1 = new String[]{"hoqq", "bbllkw", "oox", "ejjuyyy", "plmiis", "xxxzgpsssa", "xxwwkktt", "znnnnfqknaz", "qqquuhii", "dvvvwz"};
        String[] s2 = new String[]{"cccooommaaqqoxii", "gggqaffhhh", "tttoowwwmmww"};
        assertEquals(13, MaxDiffLength.mxdiflg(s1, s2)); // 13
    }
}
*/
