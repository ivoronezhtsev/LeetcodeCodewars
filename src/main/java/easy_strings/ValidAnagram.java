package easy_strings;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class ValidAnagram {
    public static boolean isAnagram(String s, String t) {
        if( s.length() != t.length()) {
            return false;
        }
        Map<Character, Integer> sCounts = new HashMap<>();
        for(char c: s.toCharArray()) {
            sCounts.put(c, sCounts.getOrDefault(c, 0) + 1);
        }
        Map<Character, Integer> tCounts = new HashMap<>();
        for(char c: t.toCharArray()) {
            tCounts.put(c, tCounts.getOrDefault(c, 0) + 1);
        }
        for(char c: sCounts.keySet()) {
            if(!Objects.equals(sCounts.get(c), tCounts.get(c))) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isAnagram("anagram", "nagaram"));
    }
}
