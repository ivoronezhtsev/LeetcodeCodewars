package t1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FirstUniqueChar {
    static void main() {
        System.out.println(isPalindrom("A man a plan a canal Panama"));
    }

    public static char doTask(String input) {
        for (char c : input.toCharArray()) {
            if (input.lastIndexOf(c) == input.indexOf(c)) {
                return c;
            }
        }
        throw new RuntimeException("No unique char");

    }

    public static int[] dublicates(int[] input) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i : input) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        List<Integer> result = new ArrayList<>();
        for (int i : map.keySet()) {
            if (map.get(i) > 1) {
                result.add(i);
            }
        }
        return result.stream().mapToInt(i -> i).toArray();
    }

    public static boolean isPalindrom(String input) {
        String ignoreCaseAndSpaces = input.toLowerCase().replace(" ", "");
        for(int i = 0,j = ignoreCaseAndSpaces.length() - 1; i < ignoreCaseAndSpaces.length() / 2 && j > ignoreCaseAndSpaces.length() /2; i++, j--) {
            if(ignoreCaseAndSpaces.charAt(i) != ignoreCaseAndSpaces.charAt(j)) {
                return false;
            }
        }
        return true;
    }
    /*public static int[] targetIndexes(int[] input, int target) {
        *//*int[] result = new int[2];
        for(int i  = 0; i < input.length; i++) {

        }*//*
    }*/
}
