/*
package codewars.sixKu.seven_ku;


import java.util.Arrays;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;


*/
/*
"Dermatoglyphics" --> true
"aba" --> false
"moOse" --> false (ignore letter case)
 *//*

public class Isogram {
    public static boolean  isIsogram(String str) {
        */
/*String toUpperCase = str.toUpperCase();
        for(char c : str.toUpperCase().toCharArray()) {
            if(toUpperCase.lastIndexOf(c) > toUpperCase.indexOf(c)) {
                return false;
            }
        }
        return true;*//*

        return str.toUpperCase().chars().distinct().count() == str.length();
    }

    static void main() {
        assertTrue(isIsogram("Dermatoglyphics"));
        assertFalse(isIsogram("aba"));
        assertFalse(isIsogram("moOse"));
    }
}*/
