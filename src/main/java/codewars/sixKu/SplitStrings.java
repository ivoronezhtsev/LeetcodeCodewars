package codewars.sixKu;

import java.util.ArrayList;
import java.util.List;

/*
Complete the solution so that it splits the string into strings of two characters
in a list/array (depending on the language you use). If the string contains an odd
number of characters then it should replace the missing second character of the final pair with an underscore ('_').
 * 'abc' =>  ['ab', 'c_']
 * 'abcdef' => ['ab', 'cd', 'ef']
 */
public class SplitStrings {
    public static void main(String[] args) {
        String[] result = solution("abcdef");
        System.out.println("Solution for abcdef");
        for (String s : result) {
            System.out.println(s);
        }
        System.out.println("solution for abc");
        String[] result1 = solution("abc");
        for (String s : result1) {
            System.out.println(s);
        }
    }

    public static String[] solution(String input) {
        List<String> temp = new ArrayList<>();
        if (input.length() % 2 != 0) {
            for(int i = 0; i < input.length(); i+=2) {
                if( i + 2 < input.length()) {
                    temp.add(input.substring(i, i + 2));
                } else {
                    temp.add("_");
                }
            }
        } else {
            for (int i = 0; i < input.length(); i += 2) {
                temp.add(input.substring(i, i + 2));
            }
        }
        String[] result = new String[temp.size()];
        for (int i = 0; i < temp.size(); i++) {
            result[i] = temp.get(i);
        }
        return result;
    }
}
