package codewars.sixKu;

import java.util.ArrayDeque;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/*
Assume "#" is like a backspace in string. This means that string "a#bc#d" actually is "bd"
Your task is to process a string with "#" symbols.

"abc#d##c"      ==>  "ac"
"abc##d######"  ==>  ""
"#######"       ==>  ""
""              ==>  ""
 */
public class BackspacesInString {
    public static String cleanString(String s) {
        ArrayDeque<Character> characterStack = new ArrayDeque<>();

        for(Character c: s.toCharArray()) {
            if(c == '#') {
                characterStack.pollLast();
            } else {
                characterStack.offerLast(c);
            }
        }
        StringBuilder result = new StringBuilder();
        for (Character c: characterStack) {
            result.insert(0,c);
        }
        return result.toString();
    }

    /*static void main() {
        IO.println(cleanString("abc#d##c"));
        String test = Stream.of("a","b","c").collect(Collectors.joining(" "));
        IO.println(test);
    }*/
}