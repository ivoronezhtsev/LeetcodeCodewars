/*
package codewars.sixKu;

import org.junit.jupiter.api.Assertions;

public class LongestConsec {
    public static String longestConsec(String[] strarr, int k) {
        if (strarr.length == 0 || k > strarr.length) {
            return "";
        }
        String result = concatStrings(strarr, 0, k);
        int windowLength = result.length();
        for (int i = 1; i < strarr.length - k + 1; i++) {
            String window = concatStrings(strarr, i, k);
            if (window.length() > windowLength) {
                result = window;
                windowLength = result.length();
            }
        }
        return result;
        */
/*List<String> sortedList =Arrays.stream(strarr).sorted((o1, o2) -> {
            if(o2.length() > o1.length()) {
                return 1;
            } else if (o2.length() == o1.length()) {
                return 0;
            }
            return -1;
        }
        ).peek(System.out::println).distinct().toList();
        StringBuilder result = new StringBuilder();
        for(int i = 0; i < k; i++) {
            result.append(sortedList.get(i));
        }
        return result.toString();*//*

    }

    private static String concatStrings(String[] strings, int startIdx, int k) {
        StringBuilder result = new StringBuilder();
        for (int i = startIdx; i < k + startIdx; i++) {
            result.append(strings[i]);
        }
        return result.toString();
    }

    static void main() {
        System.out.println("longestConsec Fixed Tests");
        Assertions.assertEquals("abigailtheta", LongestConsec.longestConsec(new String[]{"zone", "abigail", "theta", "form", "libe", "zas", "theta", "abigail"}, 2));
        Assertions.assertEquals("oocccffuucccjjjkkkjyyyeehh", LongestConsec.longestConsec(new String[]{"ejjjjmmtthh", "zxxuueeg", "aanlljrrrxx", "dqqqaaabbb", "oocccffuucccjjjkkkjyyyeehh"}, 1));
        Assertions.assertEquals("", LongestConsec.longestConsec(new String[]{}, 3));
        Assertions.assertEquals("wkppqsztdkmvcuwvereiupccauycnjutlvvweqilsfytihvrzlaodfixoyxvyuyvgpck", LongestConsec.longestConsec(new String[]{"itvayloxrp", "wkppqsztdkmvcuwvereiupccauycnjutlv", "vweqilsfytihvrzlaodfixoyxvyuyvgpck"}, 2));
        Assertions.assertEquals("wlwsasphmxxowiaxujylentrklctozmymu", LongestConsec.longestConsec(new String[]{"wlwsasphmxx", "owiaxujylentrklctozmymu", "wpgozvxxiu"}, 2));
        Assertions.assertEquals("", LongestConsec.longestConsec(new String[]{"zone", "abigail", "theta", "form", "libe", "zas"}, -2), "");
        Assertions.assertEquals("ixoyx3452zzzzzzzzzzzz", LongestConsec.longestConsec(new String[]{"it", "wkppv", "ixoyx", "3452", "zzzzzzzzzzzz"}, 3));
        Assertions.assertEquals("", LongestConsec.longestConsec(new String[]{"it", "wkppv", "ixoyx", "3452", "zzzzzzzzzzzz"}, 15));
        Assertions.assertEquals("", LongestConsec.longestConsec(new String[]{"it", "wkppv", "ixoyx", "3452", "zzzzzzzzzzzz"}, 0));
    }
}
*/
