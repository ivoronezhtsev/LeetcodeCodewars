package t1;

import java.util.HashSet;
import java.util.Set;

/*
    input: "abcabcbb"
    output: 3  // "abc"
 */
public class LongestCommonPrefixRepeat {

    static void main() {
        String input = "abcabcbb";
        System.out.println(solution(input));
    }
    static int solution(String input) {
        Set<Character> bag = new HashSet<>();
        int left = 0;
        int max = 0;
        for (int right = 0; right < input.length(); right++) {
            if(bag.contains(input.charAt(right))) {
                bag.remove(input.charAt(left));
                left++;
            }
            bag.add(input.charAt(right));
            max = Math.max(max, right - left + 1);
        }
        return max;
    }
}
