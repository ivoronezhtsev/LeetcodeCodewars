package easy_strings;

import java.util.HashMap;
import java.util.Map;

public class FirstUniqChar {

    public static int firstUniqChar(String s) {
        Map<Character, Integer> charToCountMap = new HashMap<>();
        for(char c: s.toCharArray()) {
            charToCountMap.put(c, charToCountMap.getOrDefault(c, 0) + 1);
        }
        for(int i = 0; i < s.length(); i++) {
            if(charToCountMap.get(s.charAt(i)) == 1) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(firstUniqChar("leetcode"));
    }
}
