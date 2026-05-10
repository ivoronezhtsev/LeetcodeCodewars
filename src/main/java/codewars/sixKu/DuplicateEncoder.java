/*
package codewars.sixKu;

import org.junit.jupiter.api.Assertions;

*/
/*
The goal of this exercise is to convert a string to a new string where each character in the new string
is "(" if that character appears only once in the original string, or ")"
if that character appears more than once in the original string. Ignore capitalization when determining if a character is a duplicate.

Examples
"din"      =>  "((("
"recede"   =>  "()()()"
"Success"  =>  ")())())"
"(( @"     =>  "))(("
 *//*

public class DuplicateEncoder {
    static String encode(String word){
        StringBuilder stringBuilder = new StringBuilder();
        String upperCased = word.toUpperCase();
        for(char c: upperCased.toCharArray()) {
            if(upperCased.indexOf(c) != upperCased.lastIndexOf(c)) {
                stringBuilder.append(")");
            } else {
                stringBuilder.append("(");
            }
        }
        return stringBuilder.toString();
    }

    static void main() {
        Assertions.assertEquals("(((", encode("din"));
        Assertions.assertEquals("()()()", encode("recede"));
        Assertions.assertEquals(")())())", encode("Success"));
        Assertions.assertEquals("))((", encode("(( @"));
    }
}
*/
